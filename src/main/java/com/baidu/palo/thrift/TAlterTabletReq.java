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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2018-06-25")
public class TAlterTabletReq implements org.apache.thrift.TBase<TAlterTabletReq, TAlterTabletReq._Fields>, java.io.Serializable, Cloneable, Comparable<TAlterTabletReq> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TAlterTabletReq");

  private static final org.apache.thrift.protocol.TField BASE_TABLET_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("base_tablet_id", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField BASE_SCHEMA_HASH_FIELD_DESC = new org.apache.thrift.protocol.TField("base_schema_hash", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField NEW_TABLET_REQ_FIELD_DESC = new org.apache.thrift.protocol.TField("new_tablet_req", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TAlterTabletReqStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TAlterTabletReqTupleSchemeFactory());
  }

  public long base_tablet_id; // required
  public int base_schema_hash; // required
  public TCreateTabletReq new_tablet_req; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BASE_TABLET_ID((short)1, "base_tablet_id"),
    BASE_SCHEMA_HASH((short)2, "base_schema_hash"),
    NEW_TABLET_REQ((short)3, "new_tablet_req");

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
        case 1: // BASE_TABLET_ID
          return BASE_TABLET_ID;
        case 2: // BASE_SCHEMA_HASH
          return BASE_SCHEMA_HASH;
        case 3: // NEW_TABLET_REQ
          return NEW_TABLET_REQ;
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
  private static final int __BASE_TABLET_ID_ISSET_ID = 0;
  private static final int __BASE_SCHEMA_HASH_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BASE_TABLET_ID, new org.apache.thrift.meta_data.FieldMetaData("base_tablet_id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64        , "TTabletId")));
    tmpMap.put(_Fields.BASE_SCHEMA_HASH, new org.apache.thrift.meta_data.FieldMetaData("base_schema_hash", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "TSchemaHash")));
    tmpMap.put(_Fields.NEW_TABLET_REQ, new org.apache.thrift.meta_data.FieldMetaData("new_tablet_req", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TCreateTabletReq.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TAlterTabletReq.class, metaDataMap);
  }

  public TAlterTabletReq() {
  }

  public TAlterTabletReq(
    long base_tablet_id,
    int base_schema_hash,
    TCreateTabletReq new_tablet_req)
  {
    this();
    this.base_tablet_id = base_tablet_id;
    setBase_tablet_idIsSet(true);
    this.base_schema_hash = base_schema_hash;
    setBase_schema_hashIsSet(true);
    this.new_tablet_req = new_tablet_req;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TAlterTabletReq(TAlterTabletReq other) {
    __isset_bitfield = other.__isset_bitfield;
    this.base_tablet_id = other.base_tablet_id;
    this.base_schema_hash = other.base_schema_hash;
    if (other.isSetNew_tablet_req()) {
      this.new_tablet_req = new TCreateTabletReq(other.new_tablet_req);
    }
  }

  public TAlterTabletReq deepCopy() {
    return new TAlterTabletReq(this);
  }

  @Override
  public void clear() {
    setBase_tablet_idIsSet(false);
    this.base_tablet_id = 0;
    setBase_schema_hashIsSet(false);
    this.base_schema_hash = 0;
    this.new_tablet_req = null;
  }

  public long getBase_tablet_id() {
    return this.base_tablet_id;
  }

  public TAlterTabletReq setBase_tablet_id(long base_tablet_id) {
    this.base_tablet_id = base_tablet_id;
    setBase_tablet_idIsSet(true);
    return this;
  }

  public void unsetBase_tablet_id() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __BASE_TABLET_ID_ISSET_ID);
  }

  /** Returns true if field base_tablet_id is set (has been assigned a value) and false otherwise */
  public boolean isSetBase_tablet_id() {
    return EncodingUtils.testBit(__isset_bitfield, __BASE_TABLET_ID_ISSET_ID);
  }

  public void setBase_tablet_idIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __BASE_TABLET_ID_ISSET_ID, value);
  }

  public int getBase_schema_hash() {
    return this.base_schema_hash;
  }

  public TAlterTabletReq setBase_schema_hash(int base_schema_hash) {
    this.base_schema_hash = base_schema_hash;
    setBase_schema_hashIsSet(true);
    return this;
  }

  public void unsetBase_schema_hash() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __BASE_SCHEMA_HASH_ISSET_ID);
  }

  /** Returns true if field base_schema_hash is set (has been assigned a value) and false otherwise */
  public boolean isSetBase_schema_hash() {
    return EncodingUtils.testBit(__isset_bitfield, __BASE_SCHEMA_HASH_ISSET_ID);
  }

  public void setBase_schema_hashIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __BASE_SCHEMA_HASH_ISSET_ID, value);
  }

  public TCreateTabletReq getNew_tablet_req() {
    return this.new_tablet_req;
  }

  public TAlterTabletReq setNew_tablet_req(TCreateTabletReq new_tablet_req) {
    this.new_tablet_req = new_tablet_req;
    return this;
  }

  public void unsetNew_tablet_req() {
    this.new_tablet_req = null;
  }

  /** Returns true if field new_tablet_req is set (has been assigned a value) and false otherwise */
  public boolean isSetNew_tablet_req() {
    return this.new_tablet_req != null;
  }

  public void setNew_tablet_reqIsSet(boolean value) {
    if (!value) {
      this.new_tablet_req = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case BASE_TABLET_ID:
      if (value == null) {
        unsetBase_tablet_id();
      } else {
        setBase_tablet_id((Long)value);
      }
      break;

    case BASE_SCHEMA_HASH:
      if (value == null) {
        unsetBase_schema_hash();
      } else {
        setBase_schema_hash((Integer)value);
      }
      break;

    case NEW_TABLET_REQ:
      if (value == null) {
        unsetNew_tablet_req();
      } else {
        setNew_tablet_req((TCreateTabletReq)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case BASE_TABLET_ID:
      return getBase_tablet_id();

    case BASE_SCHEMA_HASH:
      return getBase_schema_hash();

    case NEW_TABLET_REQ:
      return getNew_tablet_req();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case BASE_TABLET_ID:
      return isSetBase_tablet_id();
    case BASE_SCHEMA_HASH:
      return isSetBase_schema_hash();
    case NEW_TABLET_REQ:
      return isSetNew_tablet_req();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TAlterTabletReq)
      return this.equals((TAlterTabletReq)that);
    return false;
  }

  public boolean equals(TAlterTabletReq that) {
    if (that == null)
      return false;

    boolean this_present_base_tablet_id = true;
    boolean that_present_base_tablet_id = true;
    if (this_present_base_tablet_id || that_present_base_tablet_id) {
      if (!(this_present_base_tablet_id && that_present_base_tablet_id))
        return false;
      if (this.base_tablet_id != that.base_tablet_id)
        return false;
    }

    boolean this_present_base_schema_hash = true;
    boolean that_present_base_schema_hash = true;
    if (this_present_base_schema_hash || that_present_base_schema_hash) {
      if (!(this_present_base_schema_hash && that_present_base_schema_hash))
        return false;
      if (this.base_schema_hash != that.base_schema_hash)
        return false;
    }

    boolean this_present_new_tablet_req = true && this.isSetNew_tablet_req();
    boolean that_present_new_tablet_req = true && that.isSetNew_tablet_req();
    if (this_present_new_tablet_req || that_present_new_tablet_req) {
      if (!(this_present_new_tablet_req && that_present_new_tablet_req))
        return false;
      if (!this.new_tablet_req.equals(that.new_tablet_req))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_base_tablet_id = true;
    list.add(present_base_tablet_id);
    if (present_base_tablet_id)
      list.add(base_tablet_id);

    boolean present_base_schema_hash = true;
    list.add(present_base_schema_hash);
    if (present_base_schema_hash)
      list.add(base_schema_hash);

    boolean present_new_tablet_req = true && (isSetNew_tablet_req());
    list.add(present_new_tablet_req);
    if (present_new_tablet_req)
      list.add(new_tablet_req);

    return list.hashCode();
  }

  @Override
  public int compareTo(TAlterTabletReq other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetBase_tablet_id()).compareTo(other.isSetBase_tablet_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBase_tablet_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.base_tablet_id, other.base_tablet_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBase_schema_hash()).compareTo(other.isSetBase_schema_hash());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBase_schema_hash()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.base_schema_hash, other.base_schema_hash);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNew_tablet_req()).compareTo(other.isSetNew_tablet_req());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNew_tablet_req()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.new_tablet_req, other.new_tablet_req);
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
    StringBuilder sb = new StringBuilder("TAlterTabletReq(");
    boolean first = true;

    sb.append("base_tablet_id:");
    sb.append(this.base_tablet_id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("base_schema_hash:");
    sb.append(this.base_schema_hash);
    first = false;
    if (!first) sb.append(", ");
    sb.append("new_tablet_req:");
    if (this.new_tablet_req == null) {
      sb.append("null");
    } else {
      sb.append(this.new_tablet_req);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'base_tablet_id' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'base_schema_hash' because it's a primitive and you chose the non-beans generator.
    if (new_tablet_req == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'new_tablet_req' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (new_tablet_req != null) {
      new_tablet_req.validate();
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

  private static class TAlterTabletReqStandardSchemeFactory implements SchemeFactory {
    public TAlterTabletReqStandardScheme getScheme() {
      return new TAlterTabletReqStandardScheme();
    }
  }

  private static class TAlterTabletReqStandardScheme extends StandardScheme<TAlterTabletReq> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TAlterTabletReq struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // BASE_TABLET_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.base_tablet_id = iprot.readI64();
              struct.setBase_tablet_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // BASE_SCHEMA_HASH
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.base_schema_hash = iprot.readI32();
              struct.setBase_schema_hashIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // NEW_TABLET_REQ
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.new_tablet_req = new TCreateTabletReq();
              struct.new_tablet_req.read(iprot);
              struct.setNew_tablet_reqIsSet(true);
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
      if (!struct.isSetBase_tablet_id()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'base_tablet_id' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetBase_schema_hash()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'base_schema_hash' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TAlterTabletReq struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(BASE_TABLET_ID_FIELD_DESC);
      oprot.writeI64(struct.base_tablet_id);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(BASE_SCHEMA_HASH_FIELD_DESC);
      oprot.writeI32(struct.base_schema_hash);
      oprot.writeFieldEnd();
      if (struct.new_tablet_req != null) {
        oprot.writeFieldBegin(NEW_TABLET_REQ_FIELD_DESC);
        struct.new_tablet_req.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TAlterTabletReqTupleSchemeFactory implements SchemeFactory {
    public TAlterTabletReqTupleScheme getScheme() {
      return new TAlterTabletReqTupleScheme();
    }
  }

  private static class TAlterTabletReqTupleScheme extends TupleScheme<TAlterTabletReq> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TAlterTabletReq struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI64(struct.base_tablet_id);
      oprot.writeI32(struct.base_schema_hash);
      struct.new_tablet_req.write(oprot);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TAlterTabletReq struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.base_tablet_id = iprot.readI64();
      struct.setBase_tablet_idIsSet(true);
      struct.base_schema_hash = iprot.readI32();
      struct.setBase_schema_hashIsSet(true);
      struct.new_tablet_req = new TCreateTabletReq();
      struct.new_tablet_req.read(iprot);
      struct.setNew_tablet_reqIsSet(true);
    }
  }

}

