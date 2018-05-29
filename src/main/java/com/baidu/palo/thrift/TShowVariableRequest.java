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
public class TShowVariableRequest implements org.apache.thrift.TBase<TShowVariableRequest, TShowVariableRequest._Fields>, java.io.Serializable, Cloneable, Comparable<TShowVariableRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TShowVariableRequest");

  private static final org.apache.thrift.protocol.TField THREAD_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("threadId", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField VAR_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("varType", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TShowVariableRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TShowVariableRequestTupleSchemeFactory());
  }

  public long threadId; // required
  /**
   * 
   * @see com.baidu.palo.thrift.TVarType
   */
  public com.baidu.palo.thrift.TVarType varType; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    THREAD_ID((short)1, "threadId"),
    /**
     * 
     * @see com.baidu.palo.thrift.TVarType
     */
    VAR_TYPE((short)2, "varType");

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
        case 1: // THREAD_ID
          return THREAD_ID;
        case 2: // VAR_TYPE
          return VAR_TYPE;
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
  private static final int __THREADID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.THREAD_ID, new org.apache.thrift.meta_data.FieldMetaData("threadId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.VAR_TYPE, new org.apache.thrift.meta_data.FieldMetaData("varType", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, com.baidu.palo.thrift.TVarType.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TShowVariableRequest.class, metaDataMap);
  }

  public TShowVariableRequest() {
  }

  public TShowVariableRequest(
    long threadId,
    com.baidu.palo.thrift.TVarType varType)
  {
    this();
    this.threadId = threadId;
    setThreadIdIsSet(true);
    this.varType = varType;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TShowVariableRequest(TShowVariableRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    this.threadId = other.threadId;
    if (other.isSetVarType()) {
      this.varType = other.varType;
    }
  }

  public TShowVariableRequest deepCopy() {
    return new TShowVariableRequest(this);
  }

  @Override
  public void clear() {
    setThreadIdIsSet(false);
    this.threadId = 0;
    this.varType = null;
  }

  public long getThreadId() {
    return this.threadId;
  }

  public TShowVariableRequest setThreadId(long threadId) {
    this.threadId = threadId;
    setThreadIdIsSet(true);
    return this;
  }

  public void unsetThreadId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __THREADID_ISSET_ID);
  }

  /** Returns true if field threadId is set (has been assigned a value) and false otherwise */
  public boolean isSetThreadId() {
    return EncodingUtils.testBit(__isset_bitfield, __THREADID_ISSET_ID);
  }

  public void setThreadIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __THREADID_ISSET_ID, value);
  }

  /**
   * 
   * @see com.baidu.palo.thrift.TVarType
   */
  public com.baidu.palo.thrift.TVarType getVarType() {
    return this.varType;
  }

  /**
   * 
   * @see com.baidu.palo.thrift.TVarType
   */
  public TShowVariableRequest setVarType(com.baidu.palo.thrift.TVarType varType) {
    this.varType = varType;
    return this;
  }

  public void unsetVarType() {
    this.varType = null;
  }

  /** Returns true if field varType is set (has been assigned a value) and false otherwise */
  public boolean isSetVarType() {
    return this.varType != null;
  }

  public void setVarTypeIsSet(boolean value) {
    if (!value) {
      this.varType = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case THREAD_ID:
      if (value == null) {
        unsetThreadId();
      } else {
        setThreadId((Long)value);
      }
      break;

    case VAR_TYPE:
      if (value == null) {
        unsetVarType();
      } else {
        setVarType((com.baidu.palo.thrift.TVarType)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case THREAD_ID:
      return getThreadId();

    case VAR_TYPE:
      return getVarType();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case THREAD_ID:
      return isSetThreadId();
    case VAR_TYPE:
      return isSetVarType();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TShowVariableRequest)
      return this.equals((TShowVariableRequest)that);
    return false;
  }

  public boolean equals(TShowVariableRequest that) {
    if (that == null)
      return false;

    boolean this_present_threadId = true;
    boolean that_present_threadId = true;
    if (this_present_threadId || that_present_threadId) {
      if (!(this_present_threadId && that_present_threadId))
        return false;
      if (this.threadId != that.threadId)
        return false;
    }

    boolean this_present_varType = true && this.isSetVarType();
    boolean that_present_varType = true && that.isSetVarType();
    if (this_present_varType || that_present_varType) {
      if (!(this_present_varType && that_present_varType))
        return false;
      if (!this.varType.equals(that.varType))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_threadId = true;
    list.add(present_threadId);
    if (present_threadId)
      list.add(threadId);

    boolean present_varType = true && (isSetVarType());
    list.add(present_varType);
    if (present_varType)
      list.add(varType.getValue());

    return list.hashCode();
  }

  @Override
  public int compareTo(TShowVariableRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetThreadId()).compareTo(other.isSetThreadId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetThreadId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.threadId, other.threadId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetVarType()).compareTo(other.isSetVarType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVarType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.varType, other.varType);
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
    StringBuilder sb = new StringBuilder("TShowVariableRequest(");
    boolean first = true;

    sb.append("threadId:");
    sb.append(this.threadId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("varType:");
    if (this.varType == null) {
      sb.append("null");
    } else {
      sb.append(this.varType);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'threadId' because it's a primitive and you chose the non-beans generator.
    if (varType == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'varType' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
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

  private static class TShowVariableRequestStandardSchemeFactory implements SchemeFactory {
    public TShowVariableRequestStandardScheme getScheme() {
      return new TShowVariableRequestStandardScheme();
    }
  }

  private static class TShowVariableRequestStandardScheme extends StandardScheme<TShowVariableRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TShowVariableRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // THREAD_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.threadId = iprot.readI64();
              struct.setThreadIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // VAR_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.varType = com.baidu.palo.thrift.TVarType.findByValue(iprot.readI32());
              struct.setVarTypeIsSet(true);
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
      if (!struct.isSetThreadId()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'threadId' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TShowVariableRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(THREAD_ID_FIELD_DESC);
      oprot.writeI64(struct.threadId);
      oprot.writeFieldEnd();
      if (struct.varType != null) {
        oprot.writeFieldBegin(VAR_TYPE_FIELD_DESC);
        oprot.writeI32(struct.varType.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TShowVariableRequestTupleSchemeFactory implements SchemeFactory {
    public TShowVariableRequestTupleScheme getScheme() {
      return new TShowVariableRequestTupleScheme();
    }
  }

  private static class TShowVariableRequestTupleScheme extends TupleScheme<TShowVariableRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TShowVariableRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI64(struct.threadId);
      oprot.writeI32(struct.varType.getValue());
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TShowVariableRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.threadId = iprot.readI64();
      struct.setThreadIdIsSet(true);
      struct.varType = com.baidu.palo.thrift.TVarType.findByValue(iprot.readI32());
      struct.setVarTypeIsSet(true);
    }
  }

}
