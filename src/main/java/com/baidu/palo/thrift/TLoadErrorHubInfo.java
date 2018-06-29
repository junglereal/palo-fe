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
public class TLoadErrorHubInfo implements org.apache.thrift.TBase<TLoadErrorHubInfo, TLoadErrorHubInfo._Fields>, java.io.Serializable, Cloneable, Comparable<TLoadErrorHubInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TLoadErrorHubInfo");

  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField MYSQL_INFO_FIELD_DESC = new org.apache.thrift.protocol.TField("mysql_info", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TLoadErrorHubInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TLoadErrorHubInfoTupleSchemeFactory());
  }

  /**
   * 
   * @see TErrorHubType
   */
  public TErrorHubType type; // required
  public TMysqlErrorHubInfo mysql_info; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see TErrorHubType
     */
    TYPE((short)1, "type"),
    MYSQL_INFO((short)2, "mysql_info");

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
        case 1: // TYPE
          return TYPE;
        case 2: // MYSQL_INFO
          return MYSQL_INFO;
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
  private static final _Fields optionals[] = {_Fields.MYSQL_INFO};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TErrorHubType.class)));
    tmpMap.put(_Fields.MYSQL_INFO, new org.apache.thrift.meta_data.FieldMetaData("mysql_info", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TMysqlErrorHubInfo.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TLoadErrorHubInfo.class, metaDataMap);
  }

  public TLoadErrorHubInfo() {
    this.type = com.baidu.palo.thrift.TErrorHubType.NULL_TYPE;

  }

  public TLoadErrorHubInfo(
    TErrorHubType type)
  {
    this();
    this.type = type;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TLoadErrorHubInfo(TLoadErrorHubInfo other) {
    if (other.isSetType()) {
      this.type = other.type;
    }
    if (other.isSetMysql_info()) {
      this.mysql_info = new TMysqlErrorHubInfo(other.mysql_info);
    }
  }

  public TLoadErrorHubInfo deepCopy() {
    return new TLoadErrorHubInfo(this);
  }

  @Override
  public void clear() {
    this.type = com.baidu.palo.thrift.TErrorHubType.NULL_TYPE;

    this.mysql_info = null;
  }

  /**
   * 
   * @see TErrorHubType
   */
  public TErrorHubType getType() {
    return this.type;
  }

  /**
   * 
   * @see TErrorHubType
   */
  public TLoadErrorHubInfo setType(TErrorHubType type) {
    this.type = type;
    return this;
  }

  public void unsetType() {
    this.type = null;
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return this.type != null;
  }

  public void setTypeIsSet(boolean value) {
    if (!value) {
      this.type = null;
    }
  }

  public TMysqlErrorHubInfo getMysql_info() {
    return this.mysql_info;
  }

  public TLoadErrorHubInfo setMysql_info(TMysqlErrorHubInfo mysql_info) {
    this.mysql_info = mysql_info;
    return this;
  }

  public void unsetMysql_info() {
    this.mysql_info = null;
  }

  /** Returns true if field mysql_info is set (has been assigned a value) and false otherwise */
  public boolean isSetMysql_info() {
    return this.mysql_info != null;
  }

  public void setMysql_infoIsSet(boolean value) {
    if (!value) {
      this.mysql_info = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((TErrorHubType)value);
      }
      break;

    case MYSQL_INFO:
      if (value == null) {
        unsetMysql_info();
      } else {
        setMysql_info((TMysqlErrorHubInfo)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TYPE:
      return getType();

    case MYSQL_INFO:
      return getMysql_info();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TYPE:
      return isSetType();
    case MYSQL_INFO:
      return isSetMysql_info();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TLoadErrorHubInfo)
      return this.equals((TLoadErrorHubInfo)that);
    return false;
  }

  public boolean equals(TLoadErrorHubInfo that) {
    if (that == null)
      return false;

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
        return false;
    }

    boolean this_present_mysql_info = true && this.isSetMysql_info();
    boolean that_present_mysql_info = true && that.isSetMysql_info();
    if (this_present_mysql_info || that_present_mysql_info) {
      if (!(this_present_mysql_info && that_present_mysql_info))
        return false;
      if (!this.mysql_info.equals(that.mysql_info))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_type = true && (isSetType());
    list.add(present_type);
    if (present_type)
      list.add(type.getValue());

    boolean present_mysql_info = true && (isSetMysql_info());
    list.add(present_mysql_info);
    if (present_mysql_info)
      list.add(mysql_info);

    return list.hashCode();
  }

  @Override
  public int compareTo(TLoadErrorHubInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetType()).compareTo(other.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.type, other.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMysql_info()).compareTo(other.isSetMysql_info());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMysql_info()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mysql_info, other.mysql_info);
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
    StringBuilder sb = new StringBuilder("TLoadErrorHubInfo(");
    boolean first = true;

    sb.append("type:");
    if (this.type == null) {
      sb.append("null");
    } else {
      sb.append(this.type);
    }
    first = false;
    if (isSetMysql_info()) {
      if (!first) sb.append(", ");
      sb.append("mysql_info:");
      if (this.mysql_info == null) {
        sb.append("null");
      } else {
        sb.append(this.mysql_info);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (type == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'type' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (mysql_info != null) {
      mysql_info.validate();
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

  private static class TLoadErrorHubInfoStandardSchemeFactory implements SchemeFactory {
    public TLoadErrorHubInfoStandardScheme getScheme() {
      return new TLoadErrorHubInfoStandardScheme();
    }
  }

  private static class TLoadErrorHubInfoStandardScheme extends StandardScheme<TLoadErrorHubInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TLoadErrorHubInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.type = com.baidu.palo.thrift.TErrorHubType.findByValue(iprot.readI32());
              struct.setTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MYSQL_INFO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.mysql_info = new TMysqlErrorHubInfo();
              struct.mysql_info.read(iprot);
              struct.setMysql_infoIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TLoadErrorHubInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.type != null) {
        oprot.writeFieldBegin(TYPE_FIELD_DESC);
        oprot.writeI32(struct.type.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.mysql_info != null) {
        if (struct.isSetMysql_info()) {
          oprot.writeFieldBegin(MYSQL_INFO_FIELD_DESC);
          struct.mysql_info.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TLoadErrorHubInfoTupleSchemeFactory implements SchemeFactory {
    public TLoadErrorHubInfoTupleScheme getScheme() {
      return new TLoadErrorHubInfoTupleScheme();
    }
  }

  private static class TLoadErrorHubInfoTupleScheme extends TupleScheme<TLoadErrorHubInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TLoadErrorHubInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.type.getValue());
      BitSet optionals = new BitSet();
      if (struct.isSetMysql_info()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetMysql_info()) {
        struct.mysql_info.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TLoadErrorHubInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.type = com.baidu.palo.thrift.TErrorHubType.findByValue(iprot.readI32());
      struct.setTypeIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.mysql_info = new TMysqlErrorHubInfo();
        struct.mysql_info.read(iprot);
        struct.setMysql_infoIsSet(true);
      }
    }
  }

}

