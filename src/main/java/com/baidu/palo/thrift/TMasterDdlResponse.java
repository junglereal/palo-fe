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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2018-05-01")
public class TMasterDdlResponse implements org.apache.thrift.TBase<TMasterDdlResponse, TMasterDdlResponse._Fields>, java.io.Serializable, Cloneable, Comparable<TMasterDdlResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TMasterDdlResponse");

  private static final org.apache.thrift.protocol.TField PROTOCOL_VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("protocol_version", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField DDL_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("ddl_type", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TMasterDdlResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TMasterDdlResponseTupleSchemeFactory());
  }

  /**
   * 
   * @see TPaloInternalServiceVersion
   */
  public TPaloInternalServiceVersion protocol_version; // required
  /**
   * 
   * @see TCommonDdlType
   */
  public TCommonDdlType ddl_type; // required
  public com.baidu.palo.thrift.TStatus status; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see TPaloInternalServiceVersion
     */
    PROTOCOL_VERSION((short)1, "protocol_version"),
    /**
     * 
     * @see TCommonDdlType
     */
    DDL_TYPE((short)2, "ddl_type"),
    STATUS((short)3, "status");

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
        case 2: // DDL_TYPE
          return DDL_TYPE;
        case 3: // STATUS
          return STATUS;
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
  private static final _Fields optionals[] = {_Fields.STATUS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PROTOCOL_VERSION, new org.apache.thrift.meta_data.FieldMetaData("protocol_version", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TPaloInternalServiceVersion.class)));
    tmpMap.put(_Fields.DDL_TYPE, new org.apache.thrift.meta_data.FieldMetaData("ddl_type", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TCommonDdlType.class)));
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.baidu.palo.thrift.TStatus.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TMasterDdlResponse.class, metaDataMap);
  }

  public TMasterDdlResponse() {
  }

  public TMasterDdlResponse(
    TPaloInternalServiceVersion protocol_version,
    TCommonDdlType ddl_type)
  {
    this();
    this.protocol_version = protocol_version;
    this.ddl_type = ddl_type;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TMasterDdlResponse(TMasterDdlResponse other) {
    if (other.isSetProtocol_version()) {
      this.protocol_version = other.protocol_version;
    }
    if (other.isSetDdl_type()) {
      this.ddl_type = other.ddl_type;
    }
    if (other.isSetStatus()) {
      this.status = new com.baidu.palo.thrift.TStatus(other.status);
    }
  }

  public TMasterDdlResponse deepCopy() {
    return new TMasterDdlResponse(this);
  }

  @Override
  public void clear() {
    this.protocol_version = null;
    this.ddl_type = null;
    this.status = null;
  }

  /**
   * 
   * @see TPaloInternalServiceVersion
   */
  public TPaloInternalServiceVersion getProtocol_version() {
    return this.protocol_version;
  }

  /**
   * 
   * @see TPaloInternalServiceVersion
   */
  public TMasterDdlResponse setProtocol_version(TPaloInternalServiceVersion protocol_version) {
    this.protocol_version = protocol_version;
    return this;
  }

  public void unsetProtocol_version() {
    this.protocol_version = null;
  }

  /** Returns true if field protocol_version is set (has been assigned a value) and false otherwise */
  public boolean isSetProtocol_version() {
    return this.protocol_version != null;
  }

  public void setProtocol_versionIsSet(boolean value) {
    if (!value) {
      this.protocol_version = null;
    }
  }

  /**
   * 
   * @see TCommonDdlType
   */
  public TCommonDdlType getDdl_type() {
    return this.ddl_type;
  }

  /**
   * 
   * @see TCommonDdlType
   */
  public TMasterDdlResponse setDdl_type(TCommonDdlType ddl_type) {
    this.ddl_type = ddl_type;
    return this;
  }

  public void unsetDdl_type() {
    this.ddl_type = null;
  }

  /** Returns true if field ddl_type is set (has been assigned a value) and false otherwise */
  public boolean isSetDdl_type() {
    return this.ddl_type != null;
  }

  public void setDdl_typeIsSet(boolean value) {
    if (!value) {
      this.ddl_type = null;
    }
  }

  public com.baidu.palo.thrift.TStatus getStatus() {
    return this.status;
  }

  public TMasterDdlResponse setStatus(com.baidu.palo.thrift.TStatus status) {
    this.status = status;
    return this;
  }

  public void unsetStatus() {
    this.status = null;
  }

  /** Returns true if field status is set (has been assigned a value) and false otherwise */
  public boolean isSetStatus() {
    return this.status != null;
  }

  public void setStatusIsSet(boolean value) {
    if (!value) {
      this.status = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PROTOCOL_VERSION:
      if (value == null) {
        unsetProtocol_version();
      } else {
        setProtocol_version((TPaloInternalServiceVersion)value);
      }
      break;

    case DDL_TYPE:
      if (value == null) {
        unsetDdl_type();
      } else {
        setDdl_type((TCommonDdlType)value);
      }
      break;

    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((com.baidu.palo.thrift.TStatus)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PROTOCOL_VERSION:
      return getProtocol_version();

    case DDL_TYPE:
      return getDdl_type();

    case STATUS:
      return getStatus();

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
      return isSetProtocol_version();
    case DDL_TYPE:
      return isSetDdl_type();
    case STATUS:
      return isSetStatus();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TMasterDdlResponse)
      return this.equals((TMasterDdlResponse)that);
    return false;
  }

  public boolean equals(TMasterDdlResponse that) {
    if (that == null)
      return false;

    boolean this_present_protocol_version = true && this.isSetProtocol_version();
    boolean that_present_protocol_version = true && that.isSetProtocol_version();
    if (this_present_protocol_version || that_present_protocol_version) {
      if (!(this_present_protocol_version && that_present_protocol_version))
        return false;
      if (!this.protocol_version.equals(that.protocol_version))
        return false;
    }

    boolean this_present_ddl_type = true && this.isSetDdl_type();
    boolean that_present_ddl_type = true && that.isSetDdl_type();
    if (this_present_ddl_type || that_present_ddl_type) {
      if (!(this_present_ddl_type && that_present_ddl_type))
        return false;
      if (!this.ddl_type.equals(that.ddl_type))
        return false;
    }

    boolean this_present_status = true && this.isSetStatus();
    boolean that_present_status = true && that.isSetStatus();
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (!this.status.equals(that.status))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_protocol_version = true && (isSetProtocol_version());
    list.add(present_protocol_version);
    if (present_protocol_version)
      list.add(protocol_version.getValue());

    boolean present_ddl_type = true && (isSetDdl_type());
    list.add(present_ddl_type);
    if (present_ddl_type)
      list.add(ddl_type.getValue());

    boolean present_status = true && (isSetStatus());
    list.add(present_status);
    if (present_status)
      list.add(status);

    return list.hashCode();
  }

  @Override
  public int compareTo(TMasterDdlResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetProtocol_version()).compareTo(other.isSetProtocol_version());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProtocol_version()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.protocol_version, other.protocol_version);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDdl_type()).compareTo(other.isSetDdl_type());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDdl_type()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ddl_type, other.ddl_type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStatus()).compareTo(other.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.status, other.status);
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
    StringBuilder sb = new StringBuilder("TMasterDdlResponse(");
    boolean first = true;

    sb.append("protocol_version:");
    if (this.protocol_version == null) {
      sb.append("null");
    } else {
      sb.append(this.protocol_version);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("ddl_type:");
    if (this.ddl_type == null) {
      sb.append("null");
    } else {
      sb.append(this.ddl_type);
    }
    first = false;
    if (isSetStatus()) {
      if (!first) sb.append(", ");
      sb.append("status:");
      if (this.status == null) {
        sb.append("null");
      } else {
        sb.append(this.status);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (protocol_version == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'protocol_version' was not present! Struct: " + toString());
    }
    if (ddl_type == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'ddl_type' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (status != null) {
      status.validate();
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

  private static class TMasterDdlResponseStandardSchemeFactory implements SchemeFactory {
    public TMasterDdlResponseStandardScheme getScheme() {
      return new TMasterDdlResponseStandardScheme();
    }
  }

  private static class TMasterDdlResponseStandardScheme extends StandardScheme<TMasterDdlResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TMasterDdlResponse struct) throws org.apache.thrift.TException {
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
              struct.protocol_version = com.baidu.palo.thrift.TPaloInternalServiceVersion.findByValue(iprot.readI32());
              struct.setProtocol_versionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DDL_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.ddl_type = com.baidu.palo.thrift.TCommonDdlType.findByValue(iprot.readI32());
              struct.setDdl_typeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.status = new com.baidu.palo.thrift.TStatus();
              struct.status.read(iprot);
              struct.setStatusIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TMasterDdlResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.protocol_version != null) {
        oprot.writeFieldBegin(PROTOCOL_VERSION_FIELD_DESC);
        oprot.writeI32(struct.protocol_version.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.ddl_type != null) {
        oprot.writeFieldBegin(DDL_TYPE_FIELD_DESC);
        oprot.writeI32(struct.ddl_type.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.status != null) {
        if (struct.isSetStatus()) {
          oprot.writeFieldBegin(STATUS_FIELD_DESC);
          struct.status.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TMasterDdlResponseTupleSchemeFactory implements SchemeFactory {
    public TMasterDdlResponseTupleScheme getScheme() {
      return new TMasterDdlResponseTupleScheme();
    }
  }

  private static class TMasterDdlResponseTupleScheme extends TupleScheme<TMasterDdlResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TMasterDdlResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.protocol_version.getValue());
      oprot.writeI32(struct.ddl_type.getValue());
      BitSet optionals = new BitSet();
      if (struct.isSetStatus()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetStatus()) {
        struct.status.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TMasterDdlResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.protocol_version = com.baidu.palo.thrift.TPaloInternalServiceVersion.findByValue(iprot.readI32());
      struct.setProtocol_versionIsSet(true);
      struct.ddl_type = com.baidu.palo.thrift.TCommonDdlType.findByValue(iprot.readI32());
      struct.setDdl_typeIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.status = new com.baidu.palo.thrift.TStatus();
        struct.status.read(iprot);
        struct.setStatusIsSet(true);
      }
    }
  }

}
