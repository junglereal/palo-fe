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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2018-06-26")
public class TColumnDef implements org.apache.thrift.TBase<TColumnDef, TColumnDef._Fields>, java.io.Serializable, Cloneable, Comparable<TColumnDef> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TColumnDef");

  private static final org.apache.thrift.protocol.TField COLUMN_DESC_FIELD_DESC = new org.apache.thrift.protocol.TField("columnDesc", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField COMMENT_FIELD_DESC = new org.apache.thrift.protocol.TField("comment", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TColumnDefStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TColumnDefTupleSchemeFactory());
  }

  public TColumnDesc columnDesc; // required
  public String comment; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    COLUMN_DESC((short)1, "columnDesc"),
    COMMENT((short)2, "comment");

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
        case 1: // COLUMN_DESC
          return COLUMN_DESC;
        case 2: // COMMENT
          return COMMENT;
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
  private static final _Fields optionals[] = {_Fields.COMMENT};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.COLUMN_DESC, new org.apache.thrift.meta_data.FieldMetaData("columnDesc", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TColumnDesc.class)));
    tmpMap.put(_Fields.COMMENT, new org.apache.thrift.meta_data.FieldMetaData("comment", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TColumnDef.class, metaDataMap);
  }

  public TColumnDef() {
  }

  public TColumnDef(
    TColumnDesc columnDesc)
  {
    this();
    this.columnDesc = columnDesc;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TColumnDef(TColumnDef other) {
    if (other.isSetColumnDesc()) {
      this.columnDesc = new TColumnDesc(other.columnDesc);
    }
    if (other.isSetComment()) {
      this.comment = other.comment;
    }
  }

  public TColumnDef deepCopy() {
    return new TColumnDef(this);
  }

  @Override
  public void clear() {
    this.columnDesc = null;
    this.comment = null;
  }

  public TColumnDesc getColumnDesc() {
    return this.columnDesc;
  }

  public TColumnDef setColumnDesc(TColumnDesc columnDesc) {
    this.columnDesc = columnDesc;
    return this;
  }

  public void unsetColumnDesc() {
    this.columnDesc = null;
  }

  /** Returns true if field columnDesc is set (has been assigned a value) and false otherwise */
  public boolean isSetColumnDesc() {
    return this.columnDesc != null;
  }

  public void setColumnDescIsSet(boolean value) {
    if (!value) {
      this.columnDesc = null;
    }
  }

  public String getComment() {
    return this.comment;
  }

  public TColumnDef setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public void unsetComment() {
    this.comment = null;
  }

  /** Returns true if field comment is set (has been assigned a value) and false otherwise */
  public boolean isSetComment() {
    return this.comment != null;
  }

  public void setCommentIsSet(boolean value) {
    if (!value) {
      this.comment = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case COLUMN_DESC:
      if (value == null) {
        unsetColumnDesc();
      } else {
        setColumnDesc((TColumnDesc)value);
      }
      break;

    case COMMENT:
      if (value == null) {
        unsetComment();
      } else {
        setComment((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case COLUMN_DESC:
      return getColumnDesc();

    case COMMENT:
      return getComment();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case COLUMN_DESC:
      return isSetColumnDesc();
    case COMMENT:
      return isSetComment();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TColumnDef)
      return this.equals((TColumnDef)that);
    return false;
  }

  public boolean equals(TColumnDef that) {
    if (that == null)
      return false;

    boolean this_present_columnDesc = true && this.isSetColumnDesc();
    boolean that_present_columnDesc = true && that.isSetColumnDesc();
    if (this_present_columnDesc || that_present_columnDesc) {
      if (!(this_present_columnDesc && that_present_columnDesc))
        return false;
      if (!this.columnDesc.equals(that.columnDesc))
        return false;
    }

    boolean this_present_comment = true && this.isSetComment();
    boolean that_present_comment = true && that.isSetComment();
    if (this_present_comment || that_present_comment) {
      if (!(this_present_comment && that_present_comment))
        return false;
      if (!this.comment.equals(that.comment))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_columnDesc = true && (isSetColumnDesc());
    list.add(present_columnDesc);
    if (present_columnDesc)
      list.add(columnDesc);

    boolean present_comment = true && (isSetComment());
    list.add(present_comment);
    if (present_comment)
      list.add(comment);

    return list.hashCode();
  }

  @Override
  public int compareTo(TColumnDef other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetColumnDesc()).compareTo(other.isSetColumnDesc());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColumnDesc()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.columnDesc, other.columnDesc);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetComment()).compareTo(other.isSetComment());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetComment()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.comment, other.comment);
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
    StringBuilder sb = new StringBuilder("TColumnDef(");
    boolean first = true;

    sb.append("columnDesc:");
    if (this.columnDesc == null) {
      sb.append("null");
    } else {
      sb.append(this.columnDesc);
    }
    first = false;
    if (isSetComment()) {
      if (!first) sb.append(", ");
      sb.append("comment:");
      if (this.comment == null) {
        sb.append("null");
      } else {
        sb.append(this.comment);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (columnDesc == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'columnDesc' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (columnDesc != null) {
      columnDesc.validate();
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

  private static class TColumnDefStandardSchemeFactory implements SchemeFactory {
    public TColumnDefStandardScheme getScheme() {
      return new TColumnDefStandardScheme();
    }
  }

  private static class TColumnDefStandardScheme extends StandardScheme<TColumnDef> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TColumnDef struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // COLUMN_DESC
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.columnDesc = new TColumnDesc();
              struct.columnDesc.read(iprot);
              struct.setColumnDescIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // COMMENT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.comment = iprot.readString();
              struct.setCommentIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TColumnDef struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.columnDesc != null) {
        oprot.writeFieldBegin(COLUMN_DESC_FIELD_DESC);
        struct.columnDesc.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.comment != null) {
        if (struct.isSetComment()) {
          oprot.writeFieldBegin(COMMENT_FIELD_DESC);
          oprot.writeString(struct.comment);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TColumnDefTupleSchemeFactory implements SchemeFactory {
    public TColumnDefTupleScheme getScheme() {
      return new TColumnDefTupleScheme();
    }
  }

  private static class TColumnDefTupleScheme extends TupleScheme<TColumnDef> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TColumnDef struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.columnDesc.write(oprot);
      BitSet optionals = new BitSet();
      if (struct.isSetComment()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetComment()) {
        oprot.writeString(struct.comment);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TColumnDef struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.columnDesc = new TColumnDesc();
      struct.columnDesc.read(iprot);
      struct.setColumnDescIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.comment = iprot.readString();
        struct.setCommentIsSet(true);
      }
    }
  }

}

