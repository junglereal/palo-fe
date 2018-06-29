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
public class TDataStreamSink implements org.apache.thrift.TBase<TDataStreamSink, TDataStreamSink._Fields>, java.io.Serializable, Cloneable, Comparable<TDataStreamSink> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TDataStreamSink");

  private static final org.apache.thrift.protocol.TField DEST_NODE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("dest_node_id", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField OUTPUT_PARTITION_FIELD_DESC = new org.apache.thrift.protocol.TField("output_partition", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField IGNORE_NOT_FOUND_FIELD_DESC = new org.apache.thrift.protocol.TField("ignore_not_found", org.apache.thrift.protocol.TType.BOOL, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TDataStreamSinkStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TDataStreamSinkTupleSchemeFactory());
  }

  public int dest_node_id; // required
  public com.baidu.palo.thrift.TDataPartition output_partition; // required
  public boolean ignore_not_found; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DEST_NODE_ID((short)1, "dest_node_id"),
    OUTPUT_PARTITION((short)2, "output_partition"),
    IGNORE_NOT_FOUND((short)3, "ignore_not_found");

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
        case 1: // DEST_NODE_ID
          return DEST_NODE_ID;
        case 2: // OUTPUT_PARTITION
          return OUTPUT_PARTITION;
        case 3: // IGNORE_NOT_FOUND
          return IGNORE_NOT_FOUND;
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
  private static final int __DEST_NODE_ID_ISSET_ID = 0;
  private static final int __IGNORE_NOT_FOUND_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.IGNORE_NOT_FOUND};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DEST_NODE_ID, new org.apache.thrift.meta_data.FieldMetaData("dest_node_id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "TPlanNodeId")));
    tmpMap.put(_Fields.OUTPUT_PARTITION, new org.apache.thrift.meta_data.FieldMetaData("output_partition", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.baidu.palo.thrift.TDataPartition.class)));
    tmpMap.put(_Fields.IGNORE_NOT_FOUND, new org.apache.thrift.meta_data.FieldMetaData("ignore_not_found", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TDataStreamSink.class, metaDataMap);
  }

  public TDataStreamSink() {
  }

  public TDataStreamSink(
    int dest_node_id,
    com.baidu.palo.thrift.TDataPartition output_partition)
  {
    this();
    this.dest_node_id = dest_node_id;
    setDest_node_idIsSet(true);
    this.output_partition = output_partition;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TDataStreamSink(TDataStreamSink other) {
    __isset_bitfield = other.__isset_bitfield;
    this.dest_node_id = other.dest_node_id;
    if (other.isSetOutput_partition()) {
      this.output_partition = new com.baidu.palo.thrift.TDataPartition(other.output_partition);
    }
    this.ignore_not_found = other.ignore_not_found;
  }

  public TDataStreamSink deepCopy() {
    return new TDataStreamSink(this);
  }

  @Override
  public void clear() {
    setDest_node_idIsSet(false);
    this.dest_node_id = 0;
    this.output_partition = null;
    setIgnore_not_foundIsSet(false);
    this.ignore_not_found = false;
  }

  public int getDest_node_id() {
    return this.dest_node_id;
  }

  public TDataStreamSink setDest_node_id(int dest_node_id) {
    this.dest_node_id = dest_node_id;
    setDest_node_idIsSet(true);
    return this;
  }

  public void unsetDest_node_id() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __DEST_NODE_ID_ISSET_ID);
  }

  /** Returns true if field dest_node_id is set (has been assigned a value) and false otherwise */
  public boolean isSetDest_node_id() {
    return EncodingUtils.testBit(__isset_bitfield, __DEST_NODE_ID_ISSET_ID);
  }

  public void setDest_node_idIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __DEST_NODE_ID_ISSET_ID, value);
  }

  public com.baidu.palo.thrift.TDataPartition getOutput_partition() {
    return this.output_partition;
  }

  public TDataStreamSink setOutput_partition(com.baidu.palo.thrift.TDataPartition output_partition) {
    this.output_partition = output_partition;
    return this;
  }

  public void unsetOutput_partition() {
    this.output_partition = null;
  }

  /** Returns true if field output_partition is set (has been assigned a value) and false otherwise */
  public boolean isSetOutput_partition() {
    return this.output_partition != null;
  }

  public void setOutput_partitionIsSet(boolean value) {
    if (!value) {
      this.output_partition = null;
    }
  }

  public boolean isIgnore_not_found() {
    return this.ignore_not_found;
  }

  public TDataStreamSink setIgnore_not_found(boolean ignore_not_found) {
    this.ignore_not_found = ignore_not_found;
    setIgnore_not_foundIsSet(true);
    return this;
  }

  public void unsetIgnore_not_found() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __IGNORE_NOT_FOUND_ISSET_ID);
  }

  /** Returns true if field ignore_not_found is set (has been assigned a value) and false otherwise */
  public boolean isSetIgnore_not_found() {
    return EncodingUtils.testBit(__isset_bitfield, __IGNORE_NOT_FOUND_ISSET_ID);
  }

  public void setIgnore_not_foundIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __IGNORE_NOT_FOUND_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case DEST_NODE_ID:
      if (value == null) {
        unsetDest_node_id();
      } else {
        setDest_node_id((Integer)value);
      }
      break;

    case OUTPUT_PARTITION:
      if (value == null) {
        unsetOutput_partition();
      } else {
        setOutput_partition((com.baidu.palo.thrift.TDataPartition)value);
      }
      break;

    case IGNORE_NOT_FOUND:
      if (value == null) {
        unsetIgnore_not_found();
      } else {
        setIgnore_not_found((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case DEST_NODE_ID:
      return getDest_node_id();

    case OUTPUT_PARTITION:
      return getOutput_partition();

    case IGNORE_NOT_FOUND:
      return isIgnore_not_found();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case DEST_NODE_ID:
      return isSetDest_node_id();
    case OUTPUT_PARTITION:
      return isSetOutput_partition();
    case IGNORE_NOT_FOUND:
      return isSetIgnore_not_found();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TDataStreamSink)
      return this.equals((TDataStreamSink)that);
    return false;
  }

  public boolean equals(TDataStreamSink that) {
    if (that == null)
      return false;

    boolean this_present_dest_node_id = true;
    boolean that_present_dest_node_id = true;
    if (this_present_dest_node_id || that_present_dest_node_id) {
      if (!(this_present_dest_node_id && that_present_dest_node_id))
        return false;
      if (this.dest_node_id != that.dest_node_id)
        return false;
    }

    boolean this_present_output_partition = true && this.isSetOutput_partition();
    boolean that_present_output_partition = true && that.isSetOutput_partition();
    if (this_present_output_partition || that_present_output_partition) {
      if (!(this_present_output_partition && that_present_output_partition))
        return false;
      if (!this.output_partition.equals(that.output_partition))
        return false;
    }

    boolean this_present_ignore_not_found = true && this.isSetIgnore_not_found();
    boolean that_present_ignore_not_found = true && that.isSetIgnore_not_found();
    if (this_present_ignore_not_found || that_present_ignore_not_found) {
      if (!(this_present_ignore_not_found && that_present_ignore_not_found))
        return false;
      if (this.ignore_not_found != that.ignore_not_found)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_dest_node_id = true;
    list.add(present_dest_node_id);
    if (present_dest_node_id)
      list.add(dest_node_id);

    boolean present_output_partition = true && (isSetOutput_partition());
    list.add(present_output_partition);
    if (present_output_partition)
      list.add(output_partition);

    boolean present_ignore_not_found = true && (isSetIgnore_not_found());
    list.add(present_ignore_not_found);
    if (present_ignore_not_found)
      list.add(ignore_not_found);

    return list.hashCode();
  }

  @Override
  public int compareTo(TDataStreamSink other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetDest_node_id()).compareTo(other.isSetDest_node_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDest_node_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dest_node_id, other.dest_node_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOutput_partition()).compareTo(other.isSetOutput_partition());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOutput_partition()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.output_partition, other.output_partition);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIgnore_not_found()).compareTo(other.isSetIgnore_not_found());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIgnore_not_found()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ignore_not_found, other.ignore_not_found);
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
    StringBuilder sb = new StringBuilder("TDataStreamSink(");
    boolean first = true;

    sb.append("dest_node_id:");
    sb.append(this.dest_node_id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("output_partition:");
    if (this.output_partition == null) {
      sb.append("null");
    } else {
      sb.append(this.output_partition);
    }
    first = false;
    if (isSetIgnore_not_found()) {
      if (!first) sb.append(", ");
      sb.append("ignore_not_found:");
      sb.append(this.ignore_not_found);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'dest_node_id' because it's a primitive and you chose the non-beans generator.
    if (output_partition == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'output_partition' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (output_partition != null) {
      output_partition.validate();
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

  private static class TDataStreamSinkStandardSchemeFactory implements SchemeFactory {
    public TDataStreamSinkStandardScheme getScheme() {
      return new TDataStreamSinkStandardScheme();
    }
  }

  private static class TDataStreamSinkStandardScheme extends StandardScheme<TDataStreamSink> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TDataStreamSink struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DEST_NODE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.dest_node_id = iprot.readI32();
              struct.setDest_node_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // OUTPUT_PARTITION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.output_partition = new com.baidu.palo.thrift.TDataPartition();
              struct.output_partition.read(iprot);
              struct.setOutput_partitionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // IGNORE_NOT_FOUND
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.ignore_not_found = iprot.readBool();
              struct.setIgnore_not_foundIsSet(true);
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
      if (!struct.isSetDest_node_id()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'dest_node_id' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TDataStreamSink struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(DEST_NODE_ID_FIELD_DESC);
      oprot.writeI32(struct.dest_node_id);
      oprot.writeFieldEnd();
      if (struct.output_partition != null) {
        oprot.writeFieldBegin(OUTPUT_PARTITION_FIELD_DESC);
        struct.output_partition.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.isSetIgnore_not_found()) {
        oprot.writeFieldBegin(IGNORE_NOT_FOUND_FIELD_DESC);
        oprot.writeBool(struct.ignore_not_found);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TDataStreamSinkTupleSchemeFactory implements SchemeFactory {
    public TDataStreamSinkTupleScheme getScheme() {
      return new TDataStreamSinkTupleScheme();
    }
  }

  private static class TDataStreamSinkTupleScheme extends TupleScheme<TDataStreamSink> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TDataStreamSink struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.dest_node_id);
      struct.output_partition.write(oprot);
      BitSet optionals = new BitSet();
      if (struct.isSetIgnore_not_found()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetIgnore_not_found()) {
        oprot.writeBool(struct.ignore_not_found);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TDataStreamSink struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.dest_node_id = iprot.readI32();
      struct.setDest_node_idIsSet(true);
      struct.output_partition = new com.baidu.palo.thrift.TDataPartition();
      struct.output_partition.read(iprot);
      struct.setOutput_partitionIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.ignore_not_found = iprot.readBool();
        struct.setIgnore_not_foundIsSet(true);
      }
    }
  }

}

