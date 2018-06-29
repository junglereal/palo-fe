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
public class TAnalyticWindow implements org.apache.thrift.TBase<TAnalyticWindow, TAnalyticWindow._Fields>, java.io.Serializable, Cloneable, Comparable<TAnalyticWindow> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TAnalyticWindow");

  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField WINDOW_START_FIELD_DESC = new org.apache.thrift.protocol.TField("window_start", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField WINDOW_END_FIELD_DESC = new org.apache.thrift.protocol.TField("window_end", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TAnalyticWindowStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TAnalyticWindowTupleSchemeFactory());
  }

  /**
   * 
   * @see TAnalyticWindowType
   */
  public TAnalyticWindowType type; // required
  public TAnalyticWindowBoundary window_start; // optional
  public TAnalyticWindowBoundary window_end; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see TAnalyticWindowType
     */
    TYPE((short)1, "type"),
    WINDOW_START((short)2, "window_start"),
    WINDOW_END((short)3, "window_end");

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
        case 2: // WINDOW_START
          return WINDOW_START;
        case 3: // WINDOW_END
          return WINDOW_END;
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
  private static final _Fields optionals[] = {_Fields.WINDOW_START,_Fields.WINDOW_END};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TAnalyticWindowType.class)));
    tmpMap.put(_Fields.WINDOW_START, new org.apache.thrift.meta_data.FieldMetaData("window_start", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TAnalyticWindowBoundary.class)));
    tmpMap.put(_Fields.WINDOW_END, new org.apache.thrift.meta_data.FieldMetaData("window_end", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TAnalyticWindowBoundary.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TAnalyticWindow.class, metaDataMap);
  }

  public TAnalyticWindow() {
  }

  public TAnalyticWindow(
    TAnalyticWindowType type)
  {
    this();
    this.type = type;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TAnalyticWindow(TAnalyticWindow other) {
    if (other.isSetType()) {
      this.type = other.type;
    }
    if (other.isSetWindow_start()) {
      this.window_start = new TAnalyticWindowBoundary(other.window_start);
    }
    if (other.isSetWindow_end()) {
      this.window_end = new TAnalyticWindowBoundary(other.window_end);
    }
  }

  public TAnalyticWindow deepCopy() {
    return new TAnalyticWindow(this);
  }

  @Override
  public void clear() {
    this.type = null;
    this.window_start = null;
    this.window_end = null;
  }

  /**
   * 
   * @see TAnalyticWindowType
   */
  public TAnalyticWindowType getType() {
    return this.type;
  }

  /**
   * 
   * @see TAnalyticWindowType
   */
  public TAnalyticWindow setType(TAnalyticWindowType type) {
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

  public TAnalyticWindowBoundary getWindow_start() {
    return this.window_start;
  }

  public TAnalyticWindow setWindow_start(TAnalyticWindowBoundary window_start) {
    this.window_start = window_start;
    return this;
  }

  public void unsetWindow_start() {
    this.window_start = null;
  }

  /** Returns true if field window_start is set (has been assigned a value) and false otherwise */
  public boolean isSetWindow_start() {
    return this.window_start != null;
  }

  public void setWindow_startIsSet(boolean value) {
    if (!value) {
      this.window_start = null;
    }
  }

  public TAnalyticWindowBoundary getWindow_end() {
    return this.window_end;
  }

  public TAnalyticWindow setWindow_end(TAnalyticWindowBoundary window_end) {
    this.window_end = window_end;
    return this;
  }

  public void unsetWindow_end() {
    this.window_end = null;
  }

  /** Returns true if field window_end is set (has been assigned a value) and false otherwise */
  public boolean isSetWindow_end() {
    return this.window_end != null;
  }

  public void setWindow_endIsSet(boolean value) {
    if (!value) {
      this.window_end = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((TAnalyticWindowType)value);
      }
      break;

    case WINDOW_START:
      if (value == null) {
        unsetWindow_start();
      } else {
        setWindow_start((TAnalyticWindowBoundary)value);
      }
      break;

    case WINDOW_END:
      if (value == null) {
        unsetWindow_end();
      } else {
        setWindow_end((TAnalyticWindowBoundary)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TYPE:
      return getType();

    case WINDOW_START:
      return getWindow_start();

    case WINDOW_END:
      return getWindow_end();

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
    case WINDOW_START:
      return isSetWindow_start();
    case WINDOW_END:
      return isSetWindow_end();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TAnalyticWindow)
      return this.equals((TAnalyticWindow)that);
    return false;
  }

  public boolean equals(TAnalyticWindow that) {
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

    boolean this_present_window_start = true && this.isSetWindow_start();
    boolean that_present_window_start = true && that.isSetWindow_start();
    if (this_present_window_start || that_present_window_start) {
      if (!(this_present_window_start && that_present_window_start))
        return false;
      if (!this.window_start.equals(that.window_start))
        return false;
    }

    boolean this_present_window_end = true && this.isSetWindow_end();
    boolean that_present_window_end = true && that.isSetWindow_end();
    if (this_present_window_end || that_present_window_end) {
      if (!(this_present_window_end && that_present_window_end))
        return false;
      if (!this.window_end.equals(that.window_end))
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

    boolean present_window_start = true && (isSetWindow_start());
    list.add(present_window_start);
    if (present_window_start)
      list.add(window_start);

    boolean present_window_end = true && (isSetWindow_end());
    list.add(present_window_end);
    if (present_window_end)
      list.add(window_end);

    return list.hashCode();
  }

  @Override
  public int compareTo(TAnalyticWindow other) {
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
    lastComparison = Boolean.valueOf(isSetWindow_start()).compareTo(other.isSetWindow_start());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWindow_start()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.window_start, other.window_start);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetWindow_end()).compareTo(other.isSetWindow_end());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWindow_end()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.window_end, other.window_end);
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
    StringBuilder sb = new StringBuilder("TAnalyticWindow(");
    boolean first = true;

    sb.append("type:");
    if (this.type == null) {
      sb.append("null");
    } else {
      sb.append(this.type);
    }
    first = false;
    if (isSetWindow_start()) {
      if (!first) sb.append(", ");
      sb.append("window_start:");
      if (this.window_start == null) {
        sb.append("null");
      } else {
        sb.append(this.window_start);
      }
      first = false;
    }
    if (isSetWindow_end()) {
      if (!first) sb.append(", ");
      sb.append("window_end:");
      if (this.window_end == null) {
        sb.append("null");
      } else {
        sb.append(this.window_end);
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
    if (window_start != null) {
      window_start.validate();
    }
    if (window_end != null) {
      window_end.validate();
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

  private static class TAnalyticWindowStandardSchemeFactory implements SchemeFactory {
    public TAnalyticWindowStandardScheme getScheme() {
      return new TAnalyticWindowStandardScheme();
    }
  }

  private static class TAnalyticWindowStandardScheme extends StandardScheme<TAnalyticWindow> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TAnalyticWindow struct) throws org.apache.thrift.TException {
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
              struct.type = com.baidu.palo.thrift.TAnalyticWindowType.findByValue(iprot.readI32());
              struct.setTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // WINDOW_START
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.window_start = new TAnalyticWindowBoundary();
              struct.window_start.read(iprot);
              struct.setWindow_startIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // WINDOW_END
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.window_end = new TAnalyticWindowBoundary();
              struct.window_end.read(iprot);
              struct.setWindow_endIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TAnalyticWindow struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.type != null) {
        oprot.writeFieldBegin(TYPE_FIELD_DESC);
        oprot.writeI32(struct.type.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.window_start != null) {
        if (struct.isSetWindow_start()) {
          oprot.writeFieldBegin(WINDOW_START_FIELD_DESC);
          struct.window_start.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.window_end != null) {
        if (struct.isSetWindow_end()) {
          oprot.writeFieldBegin(WINDOW_END_FIELD_DESC);
          struct.window_end.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TAnalyticWindowTupleSchemeFactory implements SchemeFactory {
    public TAnalyticWindowTupleScheme getScheme() {
      return new TAnalyticWindowTupleScheme();
    }
  }

  private static class TAnalyticWindowTupleScheme extends TupleScheme<TAnalyticWindow> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TAnalyticWindow struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.type.getValue());
      BitSet optionals = new BitSet();
      if (struct.isSetWindow_start()) {
        optionals.set(0);
      }
      if (struct.isSetWindow_end()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetWindow_start()) {
        struct.window_start.write(oprot);
      }
      if (struct.isSetWindow_end()) {
        struct.window_end.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TAnalyticWindow struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.type = com.baidu.palo.thrift.TAnalyticWindowType.findByValue(iprot.readI32());
      struct.setTypeIsSet(true);
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.window_start = new TAnalyticWindowBoundary();
        struct.window_start.read(iprot);
        struct.setWindow_startIsSet(true);
      }
      if (incoming.get(1)) {
        struct.window_end = new TAnalyticWindowBoundary();
        struct.window_end.read(iprot);
        struct.setWindow_endIsSet(true);
      }
    }
  }

}

