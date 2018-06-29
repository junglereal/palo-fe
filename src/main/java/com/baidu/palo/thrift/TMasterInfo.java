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
public class TMasterInfo implements org.apache.thrift.TBase<TMasterInfo, TMasterInfo._Fields>, java.io.Serializable, Cloneable, Comparable<TMasterInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TMasterInfo");

  private static final org.apache.thrift.protocol.TField NETWORK_ADDRESS_FIELD_DESC = new org.apache.thrift.protocol.TField("network_address", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField CLUSTER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("cluster_id", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField EPOCH_FIELD_DESC = new org.apache.thrift.protocol.TField("epoch", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField TOKEN_FIELD_DESC = new org.apache.thrift.protocol.TField("token", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TMasterInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TMasterInfoTupleSchemeFactory());
  }

  public com.baidu.palo.thrift.TNetworkAddress network_address; // required
  public int cluster_id; // required
  public long epoch; // required
  public String token; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NETWORK_ADDRESS((short)1, "network_address"),
    CLUSTER_ID((short)2, "cluster_id"),
    EPOCH((short)3, "epoch"),
    TOKEN((short)4, "token");

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
        case 1: // NETWORK_ADDRESS
          return NETWORK_ADDRESS;
        case 2: // CLUSTER_ID
          return CLUSTER_ID;
        case 3: // EPOCH
          return EPOCH;
        case 4: // TOKEN
          return TOKEN;
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
  private static final int __CLUSTER_ID_ISSET_ID = 0;
  private static final int __EPOCH_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.TOKEN};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NETWORK_ADDRESS, new org.apache.thrift.meta_data.FieldMetaData("network_address", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.baidu.palo.thrift.TNetworkAddress.class)));
    tmpMap.put(_Fields.CLUSTER_ID, new org.apache.thrift.meta_data.FieldMetaData("cluster_id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "TClusterId")));
    tmpMap.put(_Fields.EPOCH, new org.apache.thrift.meta_data.FieldMetaData("epoch", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64        , "TEpoch")));
    tmpMap.put(_Fields.TOKEN, new org.apache.thrift.meta_data.FieldMetaData("token", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TMasterInfo.class, metaDataMap);
  }

  public TMasterInfo() {
  }

  public TMasterInfo(
    com.baidu.palo.thrift.TNetworkAddress network_address,
    int cluster_id,
    long epoch)
  {
    this();
    this.network_address = network_address;
    this.cluster_id = cluster_id;
    setCluster_idIsSet(true);
    this.epoch = epoch;
    setEpochIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TMasterInfo(TMasterInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetNetwork_address()) {
      this.network_address = new com.baidu.palo.thrift.TNetworkAddress(other.network_address);
    }
    this.cluster_id = other.cluster_id;
    this.epoch = other.epoch;
    if (other.isSetToken()) {
      this.token = other.token;
    }
  }

  public TMasterInfo deepCopy() {
    return new TMasterInfo(this);
  }

  @Override
  public void clear() {
    this.network_address = null;
    setCluster_idIsSet(false);
    this.cluster_id = 0;
    setEpochIsSet(false);
    this.epoch = 0;
    this.token = null;
  }

  public com.baidu.palo.thrift.TNetworkAddress getNetwork_address() {
    return this.network_address;
  }

  public TMasterInfo setNetwork_address(com.baidu.palo.thrift.TNetworkAddress network_address) {
    this.network_address = network_address;
    return this;
  }

  public void unsetNetwork_address() {
    this.network_address = null;
  }

  /** Returns true if field network_address is set (has been assigned a value) and false otherwise */
  public boolean isSetNetwork_address() {
    return this.network_address != null;
  }

  public void setNetwork_addressIsSet(boolean value) {
    if (!value) {
      this.network_address = null;
    }
  }

  public int getCluster_id() {
    return this.cluster_id;
  }

  public TMasterInfo setCluster_id(int cluster_id) {
    this.cluster_id = cluster_id;
    setCluster_idIsSet(true);
    return this;
  }

  public void unsetCluster_id() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CLUSTER_ID_ISSET_ID);
  }

  /** Returns true if field cluster_id is set (has been assigned a value) and false otherwise */
  public boolean isSetCluster_id() {
    return EncodingUtils.testBit(__isset_bitfield, __CLUSTER_ID_ISSET_ID);
  }

  public void setCluster_idIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CLUSTER_ID_ISSET_ID, value);
  }

  public long getEpoch() {
    return this.epoch;
  }

  public TMasterInfo setEpoch(long epoch) {
    this.epoch = epoch;
    setEpochIsSet(true);
    return this;
  }

  public void unsetEpoch() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __EPOCH_ISSET_ID);
  }

  /** Returns true if field epoch is set (has been assigned a value) and false otherwise */
  public boolean isSetEpoch() {
    return EncodingUtils.testBit(__isset_bitfield, __EPOCH_ISSET_ID);
  }

  public void setEpochIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __EPOCH_ISSET_ID, value);
  }

  public String getToken() {
    return this.token;
  }

  public TMasterInfo setToken(String token) {
    this.token = token;
    return this;
  }

  public void unsetToken() {
    this.token = null;
  }

  /** Returns true if field token is set (has been assigned a value) and false otherwise */
  public boolean isSetToken() {
    return this.token != null;
  }

  public void setTokenIsSet(boolean value) {
    if (!value) {
      this.token = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NETWORK_ADDRESS:
      if (value == null) {
        unsetNetwork_address();
      } else {
        setNetwork_address((com.baidu.palo.thrift.TNetworkAddress)value);
      }
      break;

    case CLUSTER_ID:
      if (value == null) {
        unsetCluster_id();
      } else {
        setCluster_id((Integer)value);
      }
      break;

    case EPOCH:
      if (value == null) {
        unsetEpoch();
      } else {
        setEpoch((Long)value);
      }
      break;

    case TOKEN:
      if (value == null) {
        unsetToken();
      } else {
        setToken((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NETWORK_ADDRESS:
      return getNetwork_address();

    case CLUSTER_ID:
      return getCluster_id();

    case EPOCH:
      return getEpoch();

    case TOKEN:
      return getToken();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case NETWORK_ADDRESS:
      return isSetNetwork_address();
    case CLUSTER_ID:
      return isSetCluster_id();
    case EPOCH:
      return isSetEpoch();
    case TOKEN:
      return isSetToken();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TMasterInfo)
      return this.equals((TMasterInfo)that);
    return false;
  }

  public boolean equals(TMasterInfo that) {
    if (that == null)
      return false;

    boolean this_present_network_address = true && this.isSetNetwork_address();
    boolean that_present_network_address = true && that.isSetNetwork_address();
    if (this_present_network_address || that_present_network_address) {
      if (!(this_present_network_address && that_present_network_address))
        return false;
      if (!this.network_address.equals(that.network_address))
        return false;
    }

    boolean this_present_cluster_id = true;
    boolean that_present_cluster_id = true;
    if (this_present_cluster_id || that_present_cluster_id) {
      if (!(this_present_cluster_id && that_present_cluster_id))
        return false;
      if (this.cluster_id != that.cluster_id)
        return false;
    }

    boolean this_present_epoch = true;
    boolean that_present_epoch = true;
    if (this_present_epoch || that_present_epoch) {
      if (!(this_present_epoch && that_present_epoch))
        return false;
      if (this.epoch != that.epoch)
        return false;
    }

    boolean this_present_token = true && this.isSetToken();
    boolean that_present_token = true && that.isSetToken();
    if (this_present_token || that_present_token) {
      if (!(this_present_token && that_present_token))
        return false;
      if (!this.token.equals(that.token))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_network_address = true && (isSetNetwork_address());
    list.add(present_network_address);
    if (present_network_address)
      list.add(network_address);

    boolean present_cluster_id = true;
    list.add(present_cluster_id);
    if (present_cluster_id)
      list.add(cluster_id);

    boolean present_epoch = true;
    list.add(present_epoch);
    if (present_epoch)
      list.add(epoch);

    boolean present_token = true && (isSetToken());
    list.add(present_token);
    if (present_token)
      list.add(token);

    return list.hashCode();
  }

  @Override
  public int compareTo(TMasterInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetNetwork_address()).compareTo(other.isSetNetwork_address());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNetwork_address()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.network_address, other.network_address);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCluster_id()).compareTo(other.isSetCluster_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCluster_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cluster_id, other.cluster_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEpoch()).compareTo(other.isSetEpoch());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEpoch()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.epoch, other.epoch);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetToken()).compareTo(other.isSetToken());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetToken()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.token, other.token);
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
    StringBuilder sb = new StringBuilder("TMasterInfo(");
    boolean first = true;

    sb.append("network_address:");
    if (this.network_address == null) {
      sb.append("null");
    } else {
      sb.append(this.network_address);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("cluster_id:");
    sb.append(this.cluster_id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("epoch:");
    sb.append(this.epoch);
    first = false;
    if (isSetToken()) {
      if (!first) sb.append(", ");
      sb.append("token:");
      if (this.token == null) {
        sb.append("null");
      } else {
        sb.append(this.token);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (network_address == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'network_address' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'cluster_id' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'epoch' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
    if (network_address != null) {
      network_address.validate();
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

  private static class TMasterInfoStandardSchemeFactory implements SchemeFactory {
    public TMasterInfoStandardScheme getScheme() {
      return new TMasterInfoStandardScheme();
    }
  }

  private static class TMasterInfoStandardScheme extends StandardScheme<TMasterInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TMasterInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NETWORK_ADDRESS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.network_address = new com.baidu.palo.thrift.TNetworkAddress();
              struct.network_address.read(iprot);
              struct.setNetwork_addressIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CLUSTER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.cluster_id = iprot.readI32();
              struct.setCluster_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // EPOCH
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.epoch = iprot.readI64();
              struct.setEpochIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TOKEN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.token = iprot.readString();
              struct.setTokenIsSet(true);
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
      if (!struct.isSetCluster_id()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'cluster_id' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetEpoch()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'epoch' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TMasterInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.network_address != null) {
        oprot.writeFieldBegin(NETWORK_ADDRESS_FIELD_DESC);
        struct.network_address.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(CLUSTER_ID_FIELD_DESC);
      oprot.writeI32(struct.cluster_id);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(EPOCH_FIELD_DESC);
      oprot.writeI64(struct.epoch);
      oprot.writeFieldEnd();
      if (struct.token != null) {
        if (struct.isSetToken()) {
          oprot.writeFieldBegin(TOKEN_FIELD_DESC);
          oprot.writeString(struct.token);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TMasterInfoTupleSchemeFactory implements SchemeFactory {
    public TMasterInfoTupleScheme getScheme() {
      return new TMasterInfoTupleScheme();
    }
  }

  private static class TMasterInfoTupleScheme extends TupleScheme<TMasterInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TMasterInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.network_address.write(oprot);
      oprot.writeI32(struct.cluster_id);
      oprot.writeI64(struct.epoch);
      BitSet optionals = new BitSet();
      if (struct.isSetToken()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetToken()) {
        oprot.writeString(struct.token);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TMasterInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.network_address = new com.baidu.palo.thrift.TNetworkAddress();
      struct.network_address.read(iprot);
      struct.setNetwork_addressIsSet(true);
      struct.cluster_id = iprot.readI32();
      struct.setCluster_idIsSet(true);
      struct.epoch = iprot.readI64();
      struct.setEpochIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.token = iprot.readString();
        struct.setTokenIsSet(true);
      }
    }
  }

}

