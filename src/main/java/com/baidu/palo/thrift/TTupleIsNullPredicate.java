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
public class TTupleIsNullPredicate implements org.apache.thrift.TBase<TTupleIsNullPredicate, TTupleIsNullPredicate._Fields>, java.io.Serializable, Cloneable, Comparable<TTupleIsNullPredicate> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TTupleIsNullPredicate");

  private static final org.apache.thrift.protocol.TField TUPLE_IDS_FIELD_DESC = new org.apache.thrift.protocol.TField("tuple_ids", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TTupleIsNullPredicateStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TTupleIsNullPredicateTupleSchemeFactory());
  }

  public List<Integer> tuple_ids; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TUPLE_IDS((short)1, "tuple_ids");

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
        case 1: // TUPLE_IDS
          return TUPLE_IDS;
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
    tmpMap.put(_Fields.TUPLE_IDS, new org.apache.thrift.meta_data.FieldMetaData("tuple_ids", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32            , "TTupleId"))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TTupleIsNullPredicate.class, metaDataMap);
  }

  public TTupleIsNullPredicate() {
  }

  public TTupleIsNullPredicate(
    List<Integer> tuple_ids)
  {
    this();
    this.tuple_ids = tuple_ids;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TTupleIsNullPredicate(TTupleIsNullPredicate other) {
    if (other.isSetTuple_ids()) {
      List<Integer> __this__tuple_ids = new ArrayList<Integer>(other.tuple_ids.size());
      for (Integer other_element : other.tuple_ids) {
        __this__tuple_ids.add(other_element);
      }
      this.tuple_ids = __this__tuple_ids;
    }
  }

  public TTupleIsNullPredicate deepCopy() {
    return new TTupleIsNullPredicate(this);
  }

  @Override
  public void clear() {
    this.tuple_ids = null;
  }

  public int getTuple_idsSize() {
    return (this.tuple_ids == null) ? 0 : this.tuple_ids.size();
  }

  public java.util.Iterator<Integer> getTuple_idsIterator() {
    return (this.tuple_ids == null) ? null : this.tuple_ids.iterator();
  }

  public void addToTuple_ids(int elem) {
    if (this.tuple_ids == null) {
      this.tuple_ids = new ArrayList<Integer>();
    }
    this.tuple_ids.add(elem);
  }

  public List<Integer> getTuple_ids() {
    return this.tuple_ids;
  }

  public TTupleIsNullPredicate setTuple_ids(List<Integer> tuple_ids) {
    this.tuple_ids = tuple_ids;
    return this;
  }

  public void unsetTuple_ids() {
    this.tuple_ids = null;
  }

  /** Returns true if field tuple_ids is set (has been assigned a value) and false otherwise */
  public boolean isSetTuple_ids() {
    return this.tuple_ids != null;
  }

  public void setTuple_idsIsSet(boolean value) {
    if (!value) {
      this.tuple_ids = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TUPLE_IDS:
      if (value == null) {
        unsetTuple_ids();
      } else {
        setTuple_ids((List<Integer>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TUPLE_IDS:
      return getTuple_ids();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TUPLE_IDS:
      return isSetTuple_ids();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TTupleIsNullPredicate)
      return this.equals((TTupleIsNullPredicate)that);
    return false;
  }

  public boolean equals(TTupleIsNullPredicate that) {
    if (that == null)
      return false;

    boolean this_present_tuple_ids = true && this.isSetTuple_ids();
    boolean that_present_tuple_ids = true && that.isSetTuple_ids();
    if (this_present_tuple_ids || that_present_tuple_ids) {
      if (!(this_present_tuple_ids && that_present_tuple_ids))
        return false;
      if (!this.tuple_ids.equals(that.tuple_ids))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_tuple_ids = true && (isSetTuple_ids());
    list.add(present_tuple_ids);
    if (present_tuple_ids)
      list.add(tuple_ids);

    return list.hashCode();
  }

  @Override
  public int compareTo(TTupleIsNullPredicate other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTuple_ids()).compareTo(other.isSetTuple_ids());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTuple_ids()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tuple_ids, other.tuple_ids);
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
    StringBuilder sb = new StringBuilder("TTupleIsNullPredicate(");
    boolean first = true;

    sb.append("tuple_ids:");
    if (this.tuple_ids == null) {
      sb.append("null");
    } else {
      sb.append(this.tuple_ids);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (tuple_ids == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'tuple_ids' was not present! Struct: " + toString());
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TTupleIsNullPredicateStandardSchemeFactory implements SchemeFactory {
    public TTupleIsNullPredicateStandardScheme getScheme() {
      return new TTupleIsNullPredicateStandardScheme();
    }
  }

  private static class TTupleIsNullPredicateStandardScheme extends StandardScheme<TTupleIsNullPredicate> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TTupleIsNullPredicate struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TUPLE_IDS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.tuple_ids = new ArrayList<Integer>(_list0.size);
                int _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = iprot.readI32();
                  struct.tuple_ids.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setTuple_idsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TTupleIsNullPredicate struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.tuple_ids != null) {
        oprot.writeFieldBegin(TUPLE_IDS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, struct.tuple_ids.size()));
          for (int _iter3 : struct.tuple_ids)
          {
            oprot.writeI32(_iter3);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TTupleIsNullPredicateTupleSchemeFactory implements SchemeFactory {
    public TTupleIsNullPredicateTupleScheme getScheme() {
      return new TTupleIsNullPredicateTupleScheme();
    }
  }

  private static class TTupleIsNullPredicateTupleScheme extends TupleScheme<TTupleIsNullPredicate> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TTupleIsNullPredicate struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.tuple_ids.size());
        for (int _iter4 : struct.tuple_ids)
        {
          oprot.writeI32(_iter4);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TTupleIsNullPredicate struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, iprot.readI32());
        struct.tuple_ids = new ArrayList<Integer>(_list5.size);
        int _elem6;
        for (int _i7 = 0; _i7 < _list5.size; ++_i7)
        {
          _elem6 = iprot.readI32();
          struct.tuple_ids.add(_elem6);
        }
      }
      struct.setTuple_idsIsSet(true);
    }
  }

}

