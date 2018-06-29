/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.baidu.palo.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2018-06-26")
public class TUpdateExportTaskStatusRequest implements org.apache.thrift.TBase<TUpdateExportTaskStatusRequest, TUpdateExportTaskStatusRequest._Fields>, java.io.Serializable, Cloneable, Comparable<TUpdateExportTaskStatusRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TUpdateExportTaskStatusRequest");

  private static final org.apache.thrift.protocol.TField PROTOCOL_VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("protocolVersion", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField TASK_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("taskId", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField TASK_STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("taskStatus", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TUpdateExportTaskStatusRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TUpdateExportTaskStatusRequestTupleSchemeFactory());
  }

  /**
   * 
   * @see FrontendServiceVersion
   */
  public FrontendServiceVersion protocolVersion; // required
  public com.baidu.palo.thrift.TUniqueId taskId; // required
  public com.baidu.palo.thrift.TExportStatusResult taskStatus; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see FrontendServiceVersion
     */
    PROTOCOL_VERSION((short)1, "protocolVersion"),
    TASK_ID((short)2, "taskId"),
    TASK_STATUS((short)3, "taskStatus");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // PROTOCOL_VERSION
          return PROTOCOL_VERSION;
        case 2: // TASK_ID
          return TASK_ID;
        case 3: // TASK_STATUS
          return TASK_STATUS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PROTOCOL_VERSION, new org.apache.thrift.meta_data.FieldMetaData("protocolVersion", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, FrontendServiceVersion.class)));
    tmpMap.put(_Fields.TASK_ID, new org.apache.thrift.meta_data.FieldMetaData("taskId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.baidu.palo.thrift.TUniqueId.class)));
    tmpMap.put(_Fields.TASK_STATUS, new org.apache.thrift.meta_data.FieldMetaData("taskStatus", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.baidu.palo.thrift.TExportStatusResult.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TUpdateExportTaskStatusRequest.class, metaDataMap);
  }

  public TUpdateExportTaskStatusRequest() {
  }

  public TUpdateExportTaskStatusRequest(
    FrontendServiceVersion protocolVersion,
    com.baidu.palo.thrift.TUniqueId taskId,
    com.baidu.palo.thrift.TExportStatusResult taskStatus)
  {
    this();
    this.protocolVersion = protocolVersion;
    this.taskId = taskId;
    this.taskStatus = taskStatus;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TUpdateExportTaskStatusRequest(TUpdateExportTaskStatusRequest other) {
    if (other.isSetProtocolVersion()) {
      this.protocolVersion = other.protocolVersion;
    }
    if (other.isSetTaskId()) {
      this.taskId = new com.baidu.palo.thrift.TUniqueId(other.taskId);
    }
    if (other.isSetTaskStatus()) {
      this.taskStatus = new com.baidu.palo.thrift.TExportStatusResult(other.taskStatus);
    }
  }

  public TUpdateExportTaskStatusRequest deepCopy() {
    return new TUpdateExportTaskStatusRequest(this);
  }

  @Override
  public void clear() {
    this.protocolVersion = null;
    this.taskId = null;
    this.taskStatus = null;
  }

  /**
   * 
   * @see FrontendServiceVersion
   */
  public FrontendServiceVersion getProtocolVersion() {
    return this.protocolVersion;
  }

  /**
   * 
   * @see FrontendServiceVersion
   */
  public TUpdateExportTaskStatusRequest setProtocolVersion(FrontendServiceVersion protocolVersion) {
    this.protocolVersion = protocolVersion;
    return this;
  }

  public void unsetProtocolVersion() {
    this.protocolVersion = null;
  }

  /** Returns true if field protocolVersion is set (has been assigned a value) and false otherwise */
  public boolean isSetProtocolVersion() {
    return this.protocolVersion != null;
  }

  public void setProtocolVersionIsSet(boolean value) {
    if (!value) {
      this.protocolVersion = null;
    }
  }

  public com.baidu.palo.thrift.TUniqueId getTaskId() {
    return this.taskId;
  }

  public TUpdateExportTaskStatusRequest setTaskId(com.baidu.palo.thrift.TUniqueId taskId) {
    this.taskId = taskId;
    return this;
  }

  public void unsetTaskId() {
    this.taskId = null;
  }

  /** Returns true if field taskId is set (has been assigned a value) and false otherwise */
  public boolean isSetTaskId() {
    return this.taskId != null;
  }

  public void setTaskIdIsSet(boolean value) {
    if (!value) {
      this.taskId = null;
    }
  }

  public com.baidu.palo.thrift.TExportStatusResult getTaskStatus() {
    return this.taskStatus;
  }

  public TUpdateExportTaskStatusRequest setTaskStatus(com.baidu.palo.thrift.TExportStatusResult taskStatus) {
    this.taskStatus = taskStatus;
    return this;
  }

  public void unsetTaskStatus() {
    this.taskStatus = null;
  }

  /** Returns true if field taskStatus is set (has been assigned a value) and false otherwise */
  public boolean isSetTaskStatus() {
    return this.taskStatus != null;
  }

  public void setTaskStatusIsSet(boolean value) {
    if (!value) {
      this.taskStatus = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PROTOCOL_VERSION:
      if (value == null) {
        unsetProtocolVersion();
      } else {
        setProtocolVersion((FrontendServiceVersion)value);
      }
      break;

    case TASK_ID:
      if (value == null) {
        unsetTaskId();
      } else {
        setTaskId((com.baidu.palo.thrift.TUniqueId)value);
      }
      break;

    case TASK_STATUS:
      if (value == null) {
        unsetTaskStatus();
      } else {
        setTaskStatus((com.baidu.palo.thrift.TExportStatusResult)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PROTOCOL_VERSION:
      return getProtocolVersion();

    case TASK_ID:
      return getTaskId();

    case TASK_STATUS:
      return getTaskStatus();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PROTOCOL_VERSION:
      return isSetProtocolVersion();
    case TASK_ID:
      return isSetTaskId();
    case TASK_STATUS:
      return isSetTaskStatus();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TUpdateExportTaskStatusRequest)
      return this.equals((TUpdateExportTaskStatusRequest)that);
    return false;
  }

  public boolean equals(TUpdateExportTaskStatusRequest that) {
    if (that == null)
      return false;

    boolean this_present_protocolVersion = true && this.isSetProtocolVersion();
    boolean that_present_protocolVersion = true && that.isSetProtocolVersion();
    if (this_present_protocolVersion || that_present_protocolVersion) {
      if (!(this_present_protocolVersion && that_present_protocolVersion))
        return false;
      if (!this.protocolVersion.equals(that.protocolVersion))
        return false;
    }

    boolean this_present_taskId = true && this.isSetTaskId();
    boolean that_present_taskId = true && that.isSetTaskId();
    if (this_present_taskId || that_present_taskId) {
      if (!(this_present_taskId && that_present_taskId))
        return false;
      if (!this.taskId.equals(that.taskId))
        return false;
    }

    boolean this_present_taskStatus = true && this.isSetTaskStatus();
    boolean that_present_taskStatus = true && that.isSetTaskStatus();
    if (this_present_taskStatus || that_present_taskStatus) {
      if (!(this_present_taskStatus && that_present_taskStatus))
        return false;
      if (!this.taskStatus.equals(that.taskStatus))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_protocolVersion = true && (isSetProtocolVersion());
    list.add(present_protocolVersion);
    if (present_protocolVersion)
      list.add(protocolVersion.getValue());

    boolean present_taskId = true && (isSetTaskId());
    list.add(present_taskId);
    if (present_taskId)
      list.add(taskId);

    boolean present_taskStatus = true && (isSetTaskStatus());
    list.add(present_taskStatus);
    if (present_taskStatus)
      list.add(taskStatus);

    return list.hashCode();
  }

  @Override
  public int compareTo(TUpdateExportTaskStatusRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetProtocolVersion()).compareTo(other.isSetProtocolVersion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProtocolVersion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.protocolVersion, other.protocolVersion);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTaskId()).compareTo(other.isSetTaskId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTaskId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.taskId, other.taskId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTaskStatus()).compareTo(other.isSetTaskStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTaskStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.taskStatus, other.taskStatus);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TUpdateExportTaskStatusRequest(");
    boolean first = true;

    sb.append("protocolVersion:");
    if (this.protocolVersion == null) {
      sb.append("null");
    } else {
      sb.append(this.protocolVersion);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("taskId:");
    if (this.taskId == null) {
      sb.append("null");
    } else {
      sb.append(this.taskId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("taskStatus:");
    if (this.taskStatus == null) {
      sb.append("null");
    } else {
      sb.append(this.taskStatus);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (protocolVersion == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'protocolVersion' was not present! Struct: " + toString());
    }
    if (taskId == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'taskId' was not present! Struct: " + toString());
    }
    if (taskStatus == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'taskStatus' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (taskId != null) {
      taskId.validate();
    }
    if (taskStatus != null) {
      taskStatus.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TUpdateExportTaskStatusRequestStandardSchemeFactory implements SchemeFactory {
    public TUpdateExportTaskStatusRequestStandardScheme getScheme() {
      return new TUpdateExportTaskStatusRequestStandardScheme();
    }
  }

  private static class TUpdateExportTaskStatusRequestStandardScheme extends StandardScheme<TUpdateExportTaskStatusRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TUpdateExportTaskStatusRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PROTOCOL_VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.protocolVersion = com.baidu.palo.thrift.FrontendServiceVersion.findByValue(iprot.readI32());
              struct.setProtocolVersionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TASK_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.taskId = new com.baidu.palo.thrift.TUniqueId();
              struct.taskId.read(iprot);
              struct.setTaskIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TASK_STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.taskStatus = new com.baidu.palo.thrift.TExportStatusResult();
              struct.taskStatus.read(iprot);
              struct.setTaskStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TUpdateExportTaskStatusRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.protocolVersion != null) {
        oprot.writeFieldBegin(PROTOCOL_VERSION_FIELD_DESC);
        oprot.writeI32(struct.protocolVersion.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.taskId != null) {
        oprot.writeFieldBegin(TASK_ID_FIELD_DESC);
        struct.taskId.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.taskStatus != null) {
        oprot.writeFieldBegin(TASK_STATUS_FIELD_DESC);
        struct.taskStatus.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TUpdateExportTaskStatusRequestTupleSchemeFactory implements SchemeFactory {
    public TUpdateExportTaskStatusRequestTupleScheme getScheme() {
      return new TUpdateExportTaskStatusRequestTupleScheme();
    }
  }

  private static class TUpdateExportTaskStatusRequestTupleScheme extends TupleScheme<TUpdateExportTaskStatusRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TUpdateExportTaskStatusRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.protocolVersion.getValue());
      struct.taskId.write(oprot);
      struct.taskStatus.write(oprot);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TUpdateExportTaskStatusRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.protocolVersion = com.baidu.palo.thrift.FrontendServiceVersion.findByValue(iprot.readI32());
      struct.setProtocolVersionIsSet(true);
      struct.taskId = new com.baidu.palo.thrift.TUniqueId();
      struct.taskId.read(iprot);
      struct.setTaskIdIsSet(true);
      struct.taskStatus = new com.baidu.palo.thrift.TExportStatusResult();
      struct.taskStatus.read(iprot);
      struct.setTaskStatusIsSet(true);
    }
  }

}

