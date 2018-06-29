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
public class TSnapshotRequest implements org.apache.thrift.TBase<TSnapshotRequest, TSnapshotRequest._Fields>, java.io.Serializable, Cloneable, Comparable<TSnapshotRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TSnapshotRequest");

  private static final org.apache.thrift.protocol.TField TABLET_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("tablet_id", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField SCHEMA_HASH_FIELD_DESC = new org.apache.thrift.protocol.TField("schema_hash", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("version", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField VERSION_HASH_FIELD_DESC = new org.apache.thrift.protocol.TField("version_hash", org.apache.thrift.protocol.TType.I64, (short)4);
  private static final org.apache.thrift.protocol.TField TIMEOUT_FIELD_DESC = new org.apache.thrift.protocol.TField("timeout", org.apache.thrift.protocol.TType.I64, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TSnapshotRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TSnapshotRequestTupleSchemeFactory());
  }

  public long tablet_id; // required
  public int schema_hash; // required
  public long version; // optional
  public long version_hash; // optional
  public long timeout; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TABLET_ID((short)1, "tablet_id"),
    SCHEMA_HASH((short)2, "schema_hash"),
    VERSION((short)3, "version"),
    VERSION_HASH((short)4, "version_hash"),
    TIMEOUT((short)5, "timeout");

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
        case 1: // TABLET_ID
          return TABLET_ID;
        case 2: // SCHEMA_HASH
          return SCHEMA_HASH;
        case 3: // VERSION
          return VERSION;
        case 4: // VERSION_HASH
          return VERSION_HASH;
        case 5: // TIMEOUT
          return TIMEOUT;
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
  private static final int __TABLET_ID_ISSET_ID = 0;
  private static final int __SCHEMA_HASH_ISSET_ID = 1;
  private static final int __VERSION_ISSET_ID = 2;
  private static final int __VERSION_HASH_ISSET_ID = 3;
  private static final int __TIMEOUT_ISSET_ID = 4;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.VERSION,_Fields.VERSION_HASH,_Fields.TIMEOUT};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TABLET_ID, new org.apache.thrift.meta_data.FieldMetaData("tablet_id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64        , "TTabletId")));
    tmpMap.put(_Fields.SCHEMA_HASH, new org.apache.thrift.meta_data.FieldMetaData("schema_hash", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "TSchemaHash")));
    tmpMap.put(_Fields.VERSION, new org.apache.thrift.meta_data.FieldMetaData("version", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64        , "TVersion")));
    tmpMap.put(_Fields.VERSION_HASH, new org.apache.thrift.meta_data.FieldMetaData("version_hash", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64        , "TVersionHash")));
    tmpMap.put(_Fields.TIMEOUT, new org.apache.thrift.meta_data.FieldMetaData("timeout", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TSnapshotRequest.class, metaDataMap);
  }

  public TSnapshotRequest() {
  }

  public TSnapshotRequest(
    long tablet_id,
    int schema_hash)
  {
    this();
    this.tablet_id = tablet_id;
    setTablet_idIsSet(true);
    this.schema_hash = schema_hash;
    setSchema_hashIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TSnapshotRequest(TSnapshotRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    this.tablet_id = other.tablet_id;
    this.schema_hash = other.schema_hash;
    this.version = other.version;
    this.version_hash = other.version_hash;
    this.timeout = other.timeout;
  }

  public TSnapshotRequest deepCopy() {
    return new TSnapshotRequest(this);
  }

  @Override
  public void clear() {
    setTablet_idIsSet(false);
    this.tablet_id = 0;
    setSchema_hashIsSet(false);
    this.schema_hash = 0;
    setVersionIsSet(false);
    this.version = 0;
    setVersion_hashIsSet(false);
    this.version_hash = 0;
    setTimeoutIsSet(false);
    this.timeout = 0;
  }

  public long getTablet_id() {
    return this.tablet_id;
  }

  public TSnapshotRequest setTablet_id(long tablet_id) {
    this.tablet_id = tablet_id;
    setTablet_idIsSet(true);
    return this;
  }

  public void unsetTablet_id() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TABLET_ID_ISSET_ID);
  }

  /** Returns true if field tablet_id is set (has been assigned a value) and false otherwise */
  public boolean isSetTablet_id() {
    return EncodingUtils.testBit(__isset_bitfield, __TABLET_ID_ISSET_ID);
  }

  public void setTablet_idIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TABLET_ID_ISSET_ID, value);
  }

  public int getSchema_hash() {
    return this.schema_hash;
  }

  public TSnapshotRequest setSchema_hash(int schema_hash) {
    this.schema_hash = schema_hash;
    setSchema_hashIsSet(true);
    return this;
  }

  public void unsetSchema_hash() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SCHEMA_HASH_ISSET_ID);
  }

  /** Returns true if field schema_hash is set (has been assigned a value) and false otherwise */
  public boolean isSetSchema_hash() {
    return EncodingUtils.testBit(__isset_bitfield, __SCHEMA_HASH_ISSET_ID);
  }

  public void setSchema_hashIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SCHEMA_HASH_ISSET_ID, value);
  }

  public long getVersion() {
    return this.version;
  }

  public TSnapshotRequest setVersion(long version) {
    this.version = version;
    setVersionIsSet(true);
    return this;
  }

  public void unsetVersion() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __VERSION_ISSET_ID);
  }

  /** Returns true if field version is set (has been assigned a value) and false otherwise */
  public boolean isSetVersion() {
    return EncodingUtils.testBit(__isset_bitfield, __VERSION_ISSET_ID);
  }

  public void setVersionIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __VERSION_ISSET_ID, value);
  }

  public long getVersion_hash() {
    return this.version_hash;
  }

  public TSnapshotRequest setVersion_hash(long version_hash) {
    this.version_hash = version_hash;
    setVersion_hashIsSet(true);
    return this;
  }

  public void unsetVersion_hash() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __VERSION_HASH_ISSET_ID);
  }

  /** Returns true if field version_hash is set (has been assigned a value) and false otherwise */
  public boolean isSetVersion_hash() {
    return EncodingUtils.testBit(__isset_bitfield, __VERSION_HASH_ISSET_ID);
  }

  public void setVersion_hashIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __VERSION_HASH_ISSET_ID, value);
  }

  public long getTimeout() {
    return this.timeout;
  }

  public TSnapshotRequest setTimeout(long timeout) {
    this.timeout = timeout;
    setTimeoutIsSet(true);
    return this;
  }

  public void unsetTimeout() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TIMEOUT_ISSET_ID);
  }

  /** Returns true if field timeout is set (has been assigned a value) and false otherwise */
  public boolean isSetTimeout() {
    return EncodingUtils.testBit(__isset_bitfield, __TIMEOUT_ISSET_ID);
  }

  public void setTimeoutIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TIMEOUT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TABLET_ID:
      if (value == null) {
        unsetTablet_id();
      } else {
        setTablet_id((Long)value);
      }
      break;

    case SCHEMA_HASH:
      if (value == null) {
        unsetSchema_hash();
      } else {
        setSchema_hash((Integer)value);
      }
      break;

    case VERSION:
      if (value == null) {
        unsetVersion();
      } else {
        setVersion((Long)value);
      }
      break;

    case VERSION_HASH:
      if (value == null) {
        unsetVersion_hash();
      } else {
        setVersion_hash((Long)value);
      }
      break;

    case TIMEOUT:
      if (value == null) {
        unsetTimeout();
      } else {
        setTimeout((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TABLET_ID:
      return getTablet_id();

    case SCHEMA_HASH:
      return getSchema_hash();

    case VERSION:
      return getVersion();

    case VERSION_HASH:
      return getVersion_hash();

    case TIMEOUT:
      return getTimeout();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TABLET_ID:
      return isSetTablet_id();
    case SCHEMA_HASH:
      return isSetSchema_hash();
    case VERSION:
      return isSetVersion();
    case VERSION_HASH:
      return isSetVersion_hash();
    case TIMEOUT:
      return isSetTimeout();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TSnapshotRequest)
      return this.equals((TSnapshotRequest)that);
    return false;
  }

  public boolean equals(TSnapshotRequest that) {
    if (that == null)
      return false;

    boolean this_present_tablet_id = true;
    boolean that_present_tablet_id = true;
    if (this_present_tablet_id || that_present_tablet_id) {
      if (!(this_present_tablet_id && that_present_tablet_id))
        return false;
      if (this.tablet_id != that.tablet_id)
        return false;
    }

    boolean this_present_schema_hash = true;
    boolean that_present_schema_hash = true;
    if (this_present_schema_hash || that_present_schema_hash) {
      if (!(this_present_schema_hash && that_present_schema_hash))
        return false;
      if (this.schema_hash != that.schema_hash)
        return false;
    }

    boolean this_present_version = true && this.isSetVersion();
    boolean that_present_version = true && that.isSetVersion();
    if (this_present_version || that_present_version) {
      if (!(this_present_version && that_present_version))
        return false;
      if (this.version != that.version)
        return false;
    }

    boolean this_present_version_hash = true && this.isSetVersion_hash();
    boolean that_present_version_hash = true && that.isSetVersion_hash();
    if (this_present_version_hash || that_present_version_hash) {
      if (!(this_present_version_hash && that_present_version_hash))
        return false;
      if (this.version_hash != that.version_hash)
        return false;
    }

    boolean this_present_timeout = true && this.isSetTimeout();
    boolean that_present_timeout = true && that.isSetTimeout();
    if (this_present_timeout || that_present_timeout) {
      if (!(this_present_timeout && that_present_timeout))
        return false;
      if (this.timeout != that.timeout)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_tablet_id = true;
    list.add(present_tablet_id);
    if (present_tablet_id)
      list.add(tablet_id);

    boolean present_schema_hash = true;
    list.add(present_schema_hash);
    if (present_schema_hash)
      list.add(schema_hash);

    boolean present_version = true && (isSetVersion());
    list.add(present_version);
    if (present_version)
      list.add(version);

    boolean present_version_hash = true && (isSetVersion_hash());
    list.add(present_version_hash);
    if (present_version_hash)
      list.add(version_hash);

    boolean present_timeout = true && (isSetTimeout());
    list.add(present_timeout);
    if (present_timeout)
      list.add(timeout);

    return list.hashCode();
  }

  @Override
  public int compareTo(TSnapshotRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTablet_id()).compareTo(other.isSetTablet_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTablet_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tablet_id, other.tablet_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSchema_hash()).compareTo(other.isSetSchema_hash());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSchema_hash()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.schema_hash, other.schema_hash);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetVersion()).compareTo(other.isSetVersion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVersion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.version, other.version);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetVersion_hash()).compareTo(other.isSetVersion_hash());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVersion_hash()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.version_hash, other.version_hash);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTimeout()).compareTo(other.isSetTimeout());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTimeout()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.timeout, other.timeout);
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
    StringBuilder sb = new StringBuilder("TSnapshotRequest(");
    boolean first = true;

    sb.append("tablet_id:");
    sb.append(this.tablet_id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("schema_hash:");
    sb.append(this.schema_hash);
    first = false;
    if (isSetVersion()) {
      if (!first) sb.append(", ");
      sb.append("version:");
      sb.append(this.version);
      first = false;
    }
    if (isSetVersion_hash()) {
      if (!first) sb.append(", ");
      sb.append("version_hash:");
      sb.append(this.version_hash);
      first = false;
    }
    if (isSetTimeout()) {
      if (!first) sb.append(", ");
      sb.append("timeout:");
      sb.append(this.timeout);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'tablet_id' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'schema_hash' because it's a primitive and you chose the non-beans generator.
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

  private static class TSnapshotRequestStandardSchemeFactory implements SchemeFactory {
    public TSnapshotRequestStandardScheme getScheme() {
      return new TSnapshotRequestStandardScheme();
    }
  }

  private static class TSnapshotRequestStandardScheme extends StandardScheme<TSnapshotRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TSnapshotRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TABLET_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.tablet_id = iprot.readI64();
              struct.setTablet_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SCHEMA_HASH
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.schema_hash = iprot.readI32();
              struct.setSchema_hashIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.version = iprot.readI64();
              struct.setVersionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // VERSION_HASH
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.version_hash = iprot.readI64();
              struct.setVersion_hashIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // TIMEOUT
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.timeout = iprot.readI64();
              struct.setTimeoutIsSet(true);
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
      if (!struct.isSetTablet_id()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'tablet_id' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetSchema_hash()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'schema_hash' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TSnapshotRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(TABLET_ID_FIELD_DESC);
      oprot.writeI64(struct.tablet_id);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(SCHEMA_HASH_FIELD_DESC);
      oprot.writeI32(struct.schema_hash);
      oprot.writeFieldEnd();
      if (struct.isSetVersion()) {
        oprot.writeFieldBegin(VERSION_FIELD_DESC);
        oprot.writeI64(struct.version);
        oprot.writeFieldEnd();
      }
      if (struct.isSetVersion_hash()) {
        oprot.writeFieldBegin(VERSION_HASH_FIELD_DESC);
        oprot.writeI64(struct.version_hash);
        oprot.writeFieldEnd();
      }
      if (struct.isSetTimeout()) {
        oprot.writeFieldBegin(TIMEOUT_FIELD_DESC);
        oprot.writeI64(struct.timeout);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TSnapshotRequestTupleSchemeFactory implements SchemeFactory {
    public TSnapshotRequestTupleScheme getScheme() {
      return new TSnapshotRequestTupleScheme();
    }
  }

  private static class TSnapshotRequestTupleScheme extends TupleScheme<TSnapshotRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TSnapshotRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI64(struct.tablet_id);
      oprot.writeI32(struct.schema_hash);
      BitSet optionals = new BitSet();
      if (struct.isSetVersion()) {
        optionals.set(0);
      }
      if (struct.isSetVersion_hash()) {
        optionals.set(1);
      }
      if (struct.isSetTimeout()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetVersion()) {
        oprot.writeI64(struct.version);
      }
      if (struct.isSetVersion_hash()) {
        oprot.writeI64(struct.version_hash);
      }
      if (struct.isSetTimeout()) {
        oprot.writeI64(struct.timeout);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TSnapshotRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.tablet_id = iprot.readI64();
      struct.setTablet_idIsSet(true);
      struct.schema_hash = iprot.readI32();
      struct.setSchema_hashIsSet(true);
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.version = iprot.readI64();
        struct.setVersionIsSet(true);
      }
      if (incoming.get(1)) {
        struct.version_hash = iprot.readI64();
        struct.setVersion_hashIsSet(true);
      }
      if (incoming.get(2)) {
        struct.timeout = iprot.readI64();
        struct.setTimeoutIsSet(true);
      }
    }
  }

}

