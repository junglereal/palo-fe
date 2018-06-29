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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2018-06-18")
public class TAggregateExpr implements org.apache.thrift.TBase<TAggregateExpr, TAggregateExpr._Fields>, java.io.Serializable, Cloneable, Comparable<TAggregateExpr> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TAggregateExpr");

  private static final org.apache.thrift.protocol.TField IS_MERGE_AGG_FIELD_DESC = new org.apache.thrift.protocol.TField("is_merge_agg", org.apache.thrift.protocol.TType.BOOL, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TAggregateExprStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TAggregateExprTupleSchemeFactory());
  }

  public boolean is_merge_agg; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    IS_MERGE_AGG((short)1, "is_merge_agg");

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
        case 1: // IS_MERGE_AGG
          return IS_MERGE_AGG;
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
  private static final int __IS_MERGE_AGG_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.IS_MERGE_AGG, new org.apache.thrift.meta_data.FieldMetaData("is_merge_agg", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TAggregateExpr.class, metaDataMap);
  }

  public TAggregateExpr() {
  }

  public TAggregateExpr(
    boolean is_merge_agg)
  {
    this();
    this.is_merge_agg = is_merge_agg;
    setIs_merge_aggIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TAggregateExpr(TAggregateExpr other) {
    __isset_bitfield = other.__isset_bitfield;
    this.is_merge_agg = other.is_merge_agg;
  }

  public TAggregateExpr deepCopy() {
    return new TAggregateExpr(this);
  }

  @Override
  public void clear() {
    setIs_merge_aggIsSet(false);
    this.is_merge_agg = false;
  }

  public boolean isIs_merge_agg() {
    return this.is_merge_agg;
  }

  public TAggregateExpr setIs_merge_agg(boolean is_merge_agg) {
    this.is_merge_agg = is_merge_agg;
    setIs_merge_aggIsSet(true);
    return this;
  }

  public void unsetIs_merge_agg() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __IS_MERGE_AGG_ISSET_ID);
  }

  /** Returns true if field is_merge_agg is set (has been assigned a value) and false otherwise */
  public boolean isSetIs_merge_agg() {
    return EncodingUtils.testBit(__isset_bitfield, __IS_MERGE_AGG_ISSET_ID);
  }

  public void setIs_merge_aggIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __IS_MERGE_AGG_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case IS_MERGE_AGG:
      if (value == null) {
        unsetIs_merge_agg();
      } else {
        setIs_merge_agg((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case IS_MERGE_AGG:
      return isIs_merge_agg();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case IS_MERGE_AGG:
      return isSetIs_merge_agg();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TAggregateExpr)
      return this.equals((TAggregateExpr)that);
    return false;
  }

  public boolean equals(TAggregateExpr that) {
    if (that == null)
      return false;

    boolean this_present_is_merge_agg = true;
    boolean that_present_is_merge_agg = true;
    if (this_present_is_merge_agg || that_present_is_merge_agg) {
      if (!(this_present_is_merge_agg && that_present_is_merge_agg))
        return false;
      if (this.is_merge_agg != that.is_merge_agg)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_is_merge_agg = true;
    list.add(present_is_merge_agg);
    if (present_is_merge_agg)
      list.add(is_merge_agg);

    return list.hashCode();
  }

  @Override
  public int compareTo(TAggregateExpr other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetIs_merge_agg()).compareTo(other.isSetIs_merge_agg());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIs_merge_agg()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.is_merge_agg, other.is_merge_agg);
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
    StringBuilder sb = new StringBuilder("TAggregateExpr(");
    boolean first = true;

    sb.append("is_merge_agg:");
    sb.append(this.is_merge_agg);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'is_merge_agg' because it's a primitive and you chose the non-beans generator.
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

  private static class TAggregateExprStandardSchemeFactory implements SchemeFactory {
    public TAggregateExprStandardScheme getScheme() {
      return new TAggregateExprStandardScheme();
    }
  }

  private static class TAggregateExprStandardScheme extends StandardScheme<TAggregateExpr> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TAggregateExpr struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // IS_MERGE_AGG
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.is_merge_agg = iprot.readBool();
              struct.setIs_merge_aggIsSet(true);
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
      if (!struct.isSetIs_merge_agg()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'is_merge_agg' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TAggregateExpr struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(IS_MERGE_AGG_FIELD_DESC);
      oprot.writeBool(struct.is_merge_agg);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TAggregateExprTupleSchemeFactory implements SchemeFactory {
    public TAggregateExprTupleScheme getScheme() {
      return new TAggregateExprTupleScheme();
    }
  }

  private static class TAggregateExprTupleScheme extends TupleScheme<TAggregateExpr> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TAggregateExpr struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeBool(struct.is_merge_agg);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TAggregateExpr struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.is_merge_agg = iprot.readBool();
      struct.setIs_merge_aggIsSet(true);
    }
  }

}

