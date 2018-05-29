// Copyright (c) 2017, Baidu.com, Inc. All Rights Reserved

// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

package com.baidu.palo.analysis;

import com.baidu.palo.catalog.AccessPrivilege;
import com.baidu.palo.common.AnalysisException;
import com.baidu.palo.common.ErrorCode;
import com.baidu.palo.common.ErrorReport;
import com.baidu.palo.common.InternalException;

import com.google.common.base.Strings;

public class CancelBackupStmt extends CancelStmt {

    private String dbName;
    private boolean isRestore;
    
    public CancelBackupStmt(String dbName, boolean isRestore) {
        this.dbName = dbName;
        this.isRestore = isRestore;
    }

    public String getDbName() {
        return dbName;
    }

    public boolean isRestore() {
        return isRestore;
    }

    @Override
    public void analyze(Analyzer analyzer) throws AnalysisException, InternalException {
        if (Strings.isNullOrEmpty(dbName)) {
            dbName = analyzer.getDefaultDb();
            if (Strings.isNullOrEmpty(dbName)) {
                ErrorReport.reportAnalysisException(ErrorCode.ERR_NO_DB_ERROR);
            }
        }

        // check access
        if (!analyzer.getCatalog().getUserMgr().checkAccess(analyzer.getUser(), dbName, AccessPrivilege.READ_WRITE)) {
            ErrorReport.reportAnalysisException(ErrorCode.ERR_DB_ACCESS_DENIED, analyzer.getUser(), dbName);
        }
    }

    @Override
    public String toSql() {
        StringBuilder builder = new StringBuilder();
        builder.append("CANCEL");
        if (isRestore) {
            builder.append(" RESTORE");
        } else {
            builder.append(" BACKUP");
        }
        if (dbName != null) {
            builder.append(" FROM `").append(dbName).append("`");
        }
        return builder.toString();
    }

    @Override
    public String toString() {
        return toSql();
    }
}