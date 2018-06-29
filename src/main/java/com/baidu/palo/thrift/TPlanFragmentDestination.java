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
public class TPlanFragmentDestination implements org.apache.thrift.TBase<TPlanFragmentDestination, TPlanFragmentDestination._Fields>, java.io.Serializable, Cloneable, Comparable<TPlanFragmentDestination> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TPlanFragmentDestination");

  private static final org.apache.thrift.protocol.TField FRAGMENT_INSTANCE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("fragment_instance_id", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField SERVER_FIELD_DESC = new org.apache.thrift.protocol.TField("server", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TPlanFragmentDestinationStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TPlanFragmentDestinationTupleSchemeFactory());
  }

  public com.baidu.palo.thrift.TUniqueId fragment_instance_id; // required
  public com.baidu.palo.thrift.TNetworkAddress server; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    FRAGMENT_INSTANCE_ID((short)1, "fragment_instance_id"),
    SERVER((short)2, "server");

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
        case 1: // FRAGMENT_INSTANCE_ID
          return FRAGMENT_INSTANCE_ID;
        case 2: // SERVER
          return SERVER;
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
    tmpMap.put(_Fields.FRAGMENT_INSTANCE_ID, new org.apache.thrift.meta_data.FieldMetaData("fragment_instance_id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.baidu.palo.thrift.TUniqueId.class)));
    tmpMap.put(_Fields.SERVER, new org.apache.thrift.meta_data.FieldMetaData("server", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.baidu.palo.thrift.TNetworkAddress.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TPlanFragmentDestination.class, metaDataMap);
  }

  public TPlanFragmentDestination() {
  }

  public TPlanFragmentDestination(
    com.baidu.palo.thrift.TUniqueId fragment_instance_id,
    com.baidu.palo.thrift.TNetworkAddress server)
  {
    this();
    this.fragment_instance_id = fragment_instance_id;
    this.server = server;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TPlanFragmentDestination(TPlanFragmentDestination other) {
    if (other.isSetFragment_instance_id()) {
      this.fragment_instance_id = new com.baidu.palo.thrift.TUniqueId(other.fragment_instance_id);
    }
    if (other.isSetServer()) {
      this.server = new com.baidu.palo.thrift.TNetworkAddress(other.server);
    }
  }

  public TPlanFragmentDestination deepCopy() {
    return new TPlanFragmentDestination(this);
  }

  @Override
  public void clear() {
    this.fragment_instance_id = null;
    this.server = null;
  }

  public com.baidu.palo.thrift.TUniqueId getFragment_instance_id() {
    return this.fragment_instance_id;
  }

  public TPlanFragmentDestination setFragment_instance_id(com.baidu.palo.thrift.TUniqueId fragment_instance_id) {
    this.fragment_instance_id = fragment_instance_id;
    return this;
  }

  public void unsetFragment_instance_id() {
    this.fragment_instance_id = null;
  }

  /** Returns true if field fragment_instance_id is set (has been assigned a value) and false otherwise */
  public boolean isSetFragment_instance_id() {
    return this.fragment_instance_id != null;
  }

  public void setFragment_instance_idIsSet(boolean value) {
    if (!value) {
      this.fragment_instance_id = null;
    }
  }

  public com.baidu.palo.thrift.TNetworkAddress getServer() {
    return this.server;
  }

  public TPlanFragmentDestination setServer(com.baidu.palo.thrift.TNetworkAddress server) {
    this.server = server;
    return this;
  }

  public void unsetServer() {
    this.server = null;
  }

  /** Returns true if field server is set (has been assigned a value) and false otherwise */
  public boolean isSetServer() {
    return this.server != null;
  }

  public void setServerIsSet(boolean value) {
    if (!value) {
      this.server = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case FRAGMENT_INSTANCE_ID:
      if (value == null) {
        unsetFragment_instance_id();
      } else {
        setFragment_instance_id((com.baidu.palo.thrift.TUniqueId)value);
      }
      break;

    case SERVER:
      if (value == null) {
        unsetServer();
      } else {
        setServer((com.baidu.palo.thrift.TNetworkAddress)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case FRAGMENT_INSTANCE_ID:
      return getFragment_instance_id();

    case SERVER:
      return getServer();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case FRAGMENT_INSTANCE_ID:
      return isSetFragment_instance_id();
    case SERVER:
      return isSetServer();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TPlanFragmentDestination)
      return this.equals((TPlanFragmentDestination)that);
    return false;
  }

  public boolean equals(TPlanFragmentDestination that) {
    if (that == null)
      return false;

    boolean this_present_fragment_instance_id = true && this.isSetFragment_instance_id();
    boolean that_present_fragment_instance_id = true && that.isSetFragment_instance_id();
    if (this_present_fragment_instance_id || that_present_fragment_instance_id) {
      if (!(this_present_fragment_instance_id && that_present_fragment_instance_id))
        return false;
      if (!this.fragment_instance_id.equals(that.fragment_instance_id))
        return false;
    }

    boolean this_present_server = true && this.isSetServer();
    boolean that_present_server = true && that.isSetServer();
    if (this_present_server || that_present_server) {
      if (!(this_present_server && that_present_server))
        return false;
      if (!this.server.equals(that.server))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_fragment_instance_id = true && (isSetFragment_instance_id());
    list.add(present_fragment_instance_id);
    if (present_fragment_instance_id)
      list.add(fragment_instance_id);

    boolean present_server = true && (isSetServer());
    list.add(present_server);
    if (present_server)
      list.add(server);

    return list.hashCode();
  }

  @Override
  public int compareTo(TPlanFragmentDestination other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetFragment_instance_id()).compareTo(other.isSetFragment_instance_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFragment_instance_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fragment_instance_id, other.fragment_instance_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetServer()).compareTo(other.isSetServer());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetServer()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.server, other.server);
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
    StringBuilder sb = new StringBuilder("TPlanFragmentDestination(");
    boolean first = true;

    sb.append("fragment_instance_id:");
    if (this.fragment_instance_id == null) {
      sb.append("null");
    } else {
      sb.append(this.fragment_instance_id);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("server:");
    if (this.server == null) {
      sb.append("null");
    } else {
      sb.append(this.server);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (fragment_instance_id == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'fragment_instance_id' was not present! Struct: " + toString());
    }
    if (server == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'server' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (fragment_instance_id != null) {
      fragment_instance_id.validate();
    }
    if (server != null) {
      server.validate();
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

  private static class TPlanFragmentDestinationStandardSchemeFactory implements SchemeFactory {
    public TPlanFragmentDestinationStandardScheme getScheme() {
      return new TPlanFragmentDestinationStandardScheme();
    }
  }

  private static class TPlanFragmentDestinationStandardScheme extends StandardScheme<TPlanFragmentDestination> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TPlanFragmentDestination struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // FRAGMENT_INSTANCE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.fragment_instance_id = new com.baidu.palo.thrift.TUniqueId();
              struct.fragment_instance_id.read(iprot);
              struct.setFragment_instance_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SERVER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.server = new com.baidu.palo.thrift.TNetworkAddress();
              struct.server.read(iprot);
              struct.setServerIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TPlanFragmentDestination struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.fragment_instance_id != null) {
        oprot.writeFieldBegin(FRAGMENT_INSTANCE_ID_FIELD_DESC);
        struct.fragment_instance_id.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.server != null) {
        oprot.writeFieldBegin(SERVER_FIELD_DESC);
        struct.server.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TPlanFragmentDestinationTupleSchemeFactory implements SchemeFactory {
    public TPlanFragmentDestinationTupleScheme getScheme() {
      return new TPlanFragmentDestinationTupleScheme();
    }
  }

  private static class TPlanFragmentDestinationTupleScheme extends TupleScheme<TPlanFragmentDestination> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TPlanFragmentDestination struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.fragment_instance_id.write(oprot);
      struct.server.write(oprot);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TPlanFragmentDestination struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.fragment_instance_id = new com.baidu.palo.thrift.TUniqueId();
      struct.fragment_instance_id.read(iprot);
      struct.setFragment_instance_idIsSet(true);
      struct.server = new com.baidu.palo.thrift.TNetworkAddress();
      struct.server.read(iprot);
      struct.setServerIsSet(true);
    }
  }

}

