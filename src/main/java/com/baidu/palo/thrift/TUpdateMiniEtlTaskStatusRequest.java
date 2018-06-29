/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.baidu.palo.thrift;

import org.apache.thrift.EncodingUtils;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;
import org.apache.thrift.scheme.TupleScheme;

import javax.annotation.Generated;
import java.util.*;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2018-06-26")
public class TUpdateMiniEtlTaskStatusRequest implements org.apache.thrift.TBase<TUpdateMiniEtlTaskStatusRequest, TUpdateMiniEtlTaskStatusRequest._Fields>, java.io.Serializable, Cloneable, Comparable<TUpdateMiniEtlTaskStatusRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TUpdateMiniEtlTaskStatusRequest");

  private static final org.apache.thrift.protocol.TField PROTOCOL_VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("protocolVersion", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField ETL_TASK_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("etlTaskId", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField ETL_TASK_STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("etlTaskStatus", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField ETL_TASK_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("etlTaskType", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField JOB_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("jobId", org.apache.thrift.protocol.TType.I64, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TUpdateMiniEtlTaskStatusRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TUpdateMiniEtlTaskStatusRequestTupleSchemeFactory());
  }

  /**
   * 
   * @see FrontendServiceVersion
   */
  public FrontendServiceVersion protocolVersion; // required
  public com.baidu.palo.thrift.TUniqueId etlTaskId; // required
  public com.baidu.palo.thrift.TMiniLoadEtlStatusResult etlTaskStatus; // required
  /**
   * 
   * @see com.baidu.palo.thrift.TTaskType
   */
  public com.baidu.palo.thrift.TTaskType etlTaskType; // required
  public long jobId; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see FrontendServiceVersion
     */
    PROTOCOL_VERSION((short)1, "protocolVersion"),
    ETL_TASK_ID((short)2, "etlTaskId"),
    ETL_TASK_STATUS((short)3, "etlTaskStatus"),
    /**
     * 
     * @see com.baidu.palo.thrift.TTaskType
     */
    ETL_TASK_TYPE((short)4, "etlTaskType"),
    JOB_ID((short)5, "jobId");

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
        case 2: // ETL_TASK_ID
          return ETL_TASK_ID;
        case 3: // ETL_TASK_STATUS
          return ETL_TASK_STATUS;
        case 4: // ETL_TASK_TYPE
          return ETL_TASK_TYPE;
        case 5: // JOB_ID
          return JOB_ID;
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
  private static final int __JOBID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.JOB_ID};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PROTOCOL_VERSION, new org.apache.thrift.meta_data.FieldMetaData("protocolVersion", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, FrontendServiceVersion.class)));
    tmpMap.put(_Fields.ETL_TASK_ID, new org.apache.thrift.meta_data.FieldMetaData("etlTaskId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.baidu.palo.thrift.TUniqueId.class)));
    tmpMap.put(_Fields.ETL_TASK_STATUS, new org.apache.thrift.meta_data.FieldMetaData("etlTaskStatus", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.baidu.palo.thrift.TMiniLoadEtlStatusResult.class)));
    tmpMap.put(_Fields.ETL_TASK_TYPE, new org.apache.thrift.meta_data.FieldMetaData("etlTaskType", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, com.baidu.palo.thrift.TTaskType.class)));
    tmpMap.put(_Fields.JOB_ID, new org.apache.thrift.meta_data.FieldMetaData("jobId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TUpdateMiniEtlTaskStatusRequest.class, metaDataMap);
  }

  public TUpdateMiniEtlTaskStatusRequest() {
  }

  public TUpdateMiniEtlTaskStatusRequest(
    FrontendServiceVersion protocolVersion,
    com.baidu.palo.thrift.TUniqueId etlTaskId,
    com.baidu.palo.thrift.TMiniLoadEtlStatusResult etlTaskStatus,
    com.baidu.palo.thrift.TTaskType etlTaskType)
  {
    this();
    this.protocolVersion = protocolVersion;
    this.etlTaskId = etlTaskId;
    this.etlTaskStatus = etlTaskStatus;
    this.etlTaskType = etlTaskType;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TUpdateMiniEtlTaskStatusRequest(TUpdateMiniEtlTaskStatusRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetProtocolVersion()) {
      this.protocolVersion = other.protocolVersion;
    }
    if (other.isSetEtlTaskId()) {
      this.etlTaskId = new com.baidu.palo.thrift.TUniqueId(other.etlTaskId);
    }
    if (other.isSetEtlTaskStatus()) {
      this.etlTaskStatus = new com.baidu.palo.thrift.TMiniLoadEtlStatusResult(other.etlTaskStatus);
    }
    if (other.isSetEtlTaskType()) {
      this.etlTaskType = other.etlTaskType;
    }
    this.jobId = other.jobId;
  }

  public TUpdateMiniEtlTaskStatusRequest deepCopy() {
    return new TUpdateMiniEtlTaskStatusRequest(this);
  }

  @Override
  public void clear() {
    this.protocolVersion = null;
    this.etlTaskId = null;
    this.etlTaskStatus = null;
    this.etlTaskType = null;
    setJobIdIsSet(false);
    this.jobId = 0;
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
  public TUpdateMiniEtlTaskStatusRequest setProtocolVersion(FrontendServiceVersion protocolVersion) {
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

  public com.baidu.palo.thrift.TUniqueId getEtlTaskId() {
    return this.etlTaskId;
  }

  public TUpdateMiniEtlTaskStatusRequest setEtlTaskId(com.baidu.palo.thrift.TUniqueId etlTaskId) {
    this.etlTaskId = etlTaskId;
    return this;
  }

  public void unsetEtlTaskId() {
    this.etlTaskId = null;
  }

  /** Returns true if field etlTaskId is set (has been assigned a value) and false otherwise */
  public boolean isSetEtlTaskId() {
    return this.etlTaskId != null;
  }

  public void setEtlTaskIdIsSet(boolean value) {
    if (!value) {
      this.etlTaskId = null;
    }
  }

  public com.baidu.palo.thrift.TMiniLoadEtlStatusResult getEtlTaskStatus() {
    return this.etlTaskStatus;
  }

  public TUpdateMiniEtlTaskStatusRequest setEtlTaskStatus(com.baidu.palo.thrift.TMiniLoadEtlStatusResult etlTaskStatus) {
    this.etlTaskStatus = etlTaskStatus;
    return this;
  }

  public void unsetEtlTaskStatus() {
    this.etlTaskStatus = null;
  }

  /** Returns true if field etlTaskStatus is set (has been assigned a value) and false otherwise */
  public boolean isSetEtlTaskStatus() {
    return this.etlTaskStatus != null;
  }

  public void setEtlTaskStatusIsSet(boolean value) {
    if (!value) {
      this.etlTaskStatus = null;
    }
  }

  /**
   * 
   * @see com.baidu.palo.thrift.TTaskType
   */
  public com.baidu.palo.thrift.TTaskType getEtlTaskType() {
    return this.etlTaskType;
  }

  /**
   * 
   * @see com.baidu.palo.thrift.TTaskType
   */
  public TUpdateMiniEtlTaskStatusRequest setEtlTaskType(com.baidu.palo.thrift.TTaskType etlTaskType) {
    this.etlTaskType = etlTaskType;
    return this;
  }

  public void unsetEtlTaskType() {
    this.etlTaskType = null;
  }

  /** Returns true if field etlTaskType is set (has been assigned a value) and false otherwise */
  public boolean isSetEtlTaskType() {
    return this.etlTaskType != null;
  }

  public void setEtlTaskTypeIsSet(boolean value) {
    if (!value) {
      this.etlTaskType = null;
    }
  }

  public long getJobId() {
    return this.jobId;
  }

  public TUpdateMiniEtlTaskStatusRequest setJobId(long jobId) {
    this.jobId = jobId;
    setJobIdIsSet(true);
    return this;
  }

  public void unsetJobId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __JOBID_ISSET_ID);
  }

  /** Returns true if field jobId is set (has been assigned a value) and false otherwise */
  public boolean isSetJobId() {
    return EncodingUtils.testBit(__isset_bitfield, __JOBID_ISSET_ID);
  }

  public void setJobIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __JOBID_ISSET_ID, value);
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

    case ETL_TASK_ID:
      if (value == null) {
        unsetEtlTaskId();
      } else {
        setEtlTaskId((com.baidu.palo.thrift.TUniqueId)value);
      }
      break;

    case ETL_TASK_STATUS:
      if (value == null) {
        unsetEtlTaskStatus();
      } else {
        setEtlTaskStatus((com.baidu.palo.thrift.TMiniLoadEtlStatusResult)value);
      }
      break;

    case ETL_TASK_TYPE:
      if (value == null) {
        unsetEtlTaskType();
      } else {
        setEtlTaskType((com.baidu.palo.thrift.TTaskType)value);
      }
      break;

    case JOB_ID:
      if (value == null) {
        unsetJobId();
      } else {
        setJobId((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PROTOCOL_VERSION:
      return getProtocolVersion();

    case ETL_TASK_ID:
      return getEtlTaskId();

    case ETL_TASK_STATUS:
      return getEtlTaskStatus();

    case ETL_TASK_TYPE:
      return getEtlTaskType();

    case JOB_ID:
      return getJobId();

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
    case ETL_TASK_ID:
      return isSetEtlTaskId();
    case ETL_TASK_STATUS:
      return isSetEtlTaskStatus();
    case ETL_TASK_TYPE:
      return isSetEtlTaskType();
    case JOB_ID:
      return isSetJobId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TUpdateMiniEtlTaskStatusRequest)
      return this.equals((TUpdateMiniEtlTaskStatusRequest)that);
    return false;
  }

  public boolean equals(TUpdateMiniEtlTaskStatusRequest that) {
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

    boolean this_present_etlTaskId = true && this.isSetEtlTaskId();
    boolean that_present_etlTaskId = true && that.isSetEtlTaskId();
    if (this_present_etlTaskId || that_present_etlTaskId) {
      if (!(this_present_etlTaskId && that_present_etlTaskId))
        return false;
      if (!this.etlTaskId.equals(that.etlTaskId))
        return false;
    }

    boolean this_present_etlTaskStatus = true && this.isSetEtlTaskStatus();
    boolean that_present_etlTaskStatus = true && that.isSetEtlTaskStatus();
    if (this_present_etlTaskStatus || that_present_etlTaskStatus) {
      if (!(this_present_etlTaskStatus && that_present_etlTaskStatus))
        return false;
      if (!this.etlTaskStatus.equals(that.etlTaskStatus))
        return false;
    }

    boolean this_present_etlTaskType = true && this.isSetEtlTaskType();
    boolean that_present_etlTaskType = true && that.isSetEtlTaskType();
    if (this_present_etlTaskType || that_present_etlTaskType) {
      if (!(this_present_etlTaskType && that_present_etlTaskType))
        return false;
      if (!this.etlTaskType.equals(that.etlTaskType))
        return false;
    }

    boolean this_present_jobId = true && this.isSetJobId();
    boolean that_present_jobId = true && that.isSetJobId();
    if (this_present_jobId || that_present_jobId) {
      if (!(this_present_jobId && that_present_jobId))
        return false;
      if (this.jobId != that.jobId)
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

    boolean present_etlTaskId = true && (isSetEtlTaskId());
    list.add(present_etlTaskId);
    if (present_etlTaskId)
      list.add(etlTaskId);

    boolean present_etlTaskStatus = true && (isSetEtlTaskStatus());
    list.add(present_etlTaskStatus);
    if (present_etlTaskStatus)
      list.add(etlTaskStatus);

    boolean present_etlTaskType = true && (isSetEtlTaskType());
    list.add(present_etlTaskType);
    if (present_etlTaskType)
      list.add(etlTaskType.getValue());

    boolean present_jobId = true && (isSetJobId());
    list.add(present_jobId);
    if (present_jobId)
      list.add(jobId);

    return list.hashCode();
  }

  @Override
  public int compareTo(TUpdateMiniEtlTaskStatusRequest other) {
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
    lastComparison = Boolean.valueOf(isSetEtlTaskId()).compareTo(other.isSetEtlTaskId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEtlTaskId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.etlTaskId, other.etlTaskId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEtlTaskStatus()).compareTo(other.isSetEtlTaskStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEtlTaskStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.etlTaskStatus, other.etlTaskStatus);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEtlTaskType()).compareTo(other.isSetEtlTaskType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEtlTaskType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.etlTaskType, other.etlTaskType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetJobId()).compareTo(other.isSetJobId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJobId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.jobId, other.jobId);
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
    StringBuilder sb = new StringBuilder("TUpdateMiniEtlTaskStatusRequest(");
    boolean first = true;

    sb.append("protocolVersion:");
    if (this.protocolVersion == null) {
      sb.append("null");
    } else {
      sb.append(this.protocolVersion);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("etlTaskId:");
    if (this.etlTaskId == null) {
      sb.append("null");
    } else {
      sb.append(this.etlTaskId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("etlTaskStatus:");
    if (this.etlTaskStatus == null) {
      sb.append("null");
    } else {
      sb.append(this.etlTaskStatus);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("etlTaskType:");
    if (this.etlTaskType == null) {
      sb.append("null");
    } else {
      sb.append(this.etlTaskType);
    }
    first = false;
    if (isSetJobId()) {
      if (!first) sb.append(", ");
      sb.append("jobId:");
      sb.append(this.jobId);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (protocolVersion == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'protocolVersion' was not present! Struct: " + toString());
    }
    if (etlTaskId == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'etlTaskId' was not present! Struct: " + toString());
    }
    if (etlTaskStatus == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'etlTaskStatus' was not present! Struct: " + toString());
    }
    if (etlTaskType == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'etlTaskType' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (etlTaskId != null) {
      etlTaskId.validate();
    }
    if (etlTaskStatus != null) {
      etlTaskStatus.validate();
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TUpdateMiniEtlTaskStatusRequestStandardSchemeFactory implements SchemeFactory {
    public TUpdateMiniEtlTaskStatusRequestStandardScheme getScheme() {
      return new TUpdateMiniEtlTaskStatusRequestStandardScheme();
    }
  }

  private static class TUpdateMiniEtlTaskStatusRequestStandardScheme extends StandardScheme<TUpdateMiniEtlTaskStatusRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TUpdateMiniEtlTaskStatusRequest struct) throws org.apache.thrift.TException {
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
          case 2: // ETL_TASK_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.etlTaskId = new com.baidu.palo.thrift.TUniqueId();
              struct.etlTaskId.read(iprot);
              struct.setEtlTaskIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ETL_TASK_STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.etlTaskStatus = new com.baidu.palo.thrift.TMiniLoadEtlStatusResult();
              struct.etlTaskStatus.read(iprot);
              struct.setEtlTaskStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ETL_TASK_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.etlTaskType = com.baidu.palo.thrift.TTaskType.findByValue(iprot.readI32());
              struct.setEtlTaskTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // JOB_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.jobId = iprot.readI64();
              struct.setJobIdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TUpdateMiniEtlTaskStatusRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.protocolVersion != null) {
        oprot.writeFieldBegin(PROTOCOL_VERSION_FIELD_DESC);
        oprot.writeI32(struct.protocolVersion.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.etlTaskId != null) {
        oprot.writeFieldBegin(ETL_TASK_ID_FIELD_DESC);
        struct.etlTaskId.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.etlTaskStatus != null) {
        oprot.writeFieldBegin(ETL_TASK_STATUS_FIELD_DESC);
        struct.etlTaskStatus.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.etlTaskType != null) {
        oprot.writeFieldBegin(ETL_TASK_TYPE_FIELD_DESC);
        oprot.writeI32(struct.etlTaskType.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.isSetJobId()) {
        oprot.writeFieldBegin(JOB_ID_FIELD_DESC);
        oprot.writeI64(struct.jobId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TUpdateMiniEtlTaskStatusRequestTupleSchemeFactory implements SchemeFactory {
    public TUpdateMiniEtlTaskStatusRequestTupleScheme getScheme() {
      return new TUpdateMiniEtlTaskStatusRequestTupleScheme();
    }
  }

  private static class TUpdateMiniEtlTaskStatusRequestTupleScheme extends TupleScheme<TUpdateMiniEtlTaskStatusRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TUpdateMiniEtlTaskStatusRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.protocolVersion.getValue());
      struct.etlTaskId.write(oprot);
      struct.etlTaskStatus.write(oprot);
      oprot.writeI32(struct.etlTaskType.getValue());
      BitSet optionals = new BitSet();
      if (struct.isSetJobId()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetJobId()) {
        oprot.writeI64(struct.jobId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TUpdateMiniEtlTaskStatusRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.protocolVersion = com.baidu.palo.thrift.FrontendServiceVersion.findByValue(iprot.readI32());
      struct.setProtocolVersionIsSet(true);
      struct.etlTaskId = new com.baidu.palo.thrift.TUniqueId();
      struct.etlTaskId.read(iprot);
      struct.setEtlTaskIdIsSet(true);
      struct.etlTaskStatus = new com.baidu.palo.thrift.TMiniLoadEtlStatusResult();
      struct.etlTaskStatus.read(iprot);
      struct.setEtlTaskStatusIsSet(true);
      struct.etlTaskType = com.baidu.palo.thrift.TTaskType.findByValue(iprot.readI32());
      struct.setEtlTaskTypeIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.jobId = iprot.readI64();
        struct.setJobIdIsSet(true);
      }
    }
  }

}

