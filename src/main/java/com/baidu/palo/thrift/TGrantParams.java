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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2018-05-01")
public class TGrantParams implements org.apache.thrift.TBase<TGrantParams, TGrantParams._Fields>, java.io.Serializable, Cloneable, Comparable<TGrantParams> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TGrantParams");

  private static final org.apache.thrift.protocol.TField USER_SPEC_FIELD_DESC = new org.apache.thrift.protocol.TField("user_spec", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField DB_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("db_name", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField PRIV_TYPES_FIELD_DESC = new org.apache.thrift.protocol.TField("priv_types", org.apache.thrift.protocol.TType.LIST, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TGrantParamsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TGrantParamsTupleSchemeFactory());
  }

  public TUserSpecification user_spec; // required
  public String db_name; // required
  public List<TPrivType> priv_types; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USER_SPEC((short)1, "user_spec"),
    DB_NAME((short)3, "db_name"),
    PRIV_TYPES((short)4, "priv_types");

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
        case 1: // USER_SPEC
          return USER_SPEC;
        case 3: // DB_NAME
          return DB_NAME;
        case 4: // PRIV_TYPES
          return PRIV_TYPES;
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
    tmpMap.put(_Fields.USER_SPEC, new org.apache.thrift.meta_data.FieldMetaData("user_spec", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TUserSpecification.class)));
    tmpMap.put(_Fields.DB_NAME, new org.apache.thrift.meta_data.FieldMetaData("db_name", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PRIV_TYPES, new org.apache.thrift.meta_data.FieldMetaData("priv_types", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TPrivType.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TGrantParams.class, metaDataMap);
  }

  public TGrantParams() {
  }

  public TGrantParams(
    TUserSpecification user_spec,
    String db_name,
    List<TPrivType> priv_types)
  {
    this();
    this.user_spec = user_spec;
    this.db_name = db_name;
    this.priv_types = priv_types;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TGrantParams(TGrantParams other) {
    if (other.isSetUser_spec()) {
      this.user_spec = new TUserSpecification(other.user_spec);
    }
    if (other.isSetDb_name()) {
      this.db_name = other.db_name;
    }
    if (other.isSetPriv_types()) {
      List<TPrivType> __this__priv_types = new ArrayList<TPrivType>(other.priv_types.size());
      for (TPrivType other_element : other.priv_types) {
        __this__priv_types.add(other_element);
      }
      this.priv_types = __this__priv_types;
    }
  }

  public TGrantParams deepCopy() {
    return new TGrantParams(this);
  }

  @Override
  public void clear() {
    this.user_spec = null;
    this.db_name = null;
    this.priv_types = null;
  }

  public TUserSpecification getUser_spec() {
    return this.user_spec;
  }

  public TGrantParams setUser_spec(TUserSpecification user_spec) {
    this.user_spec = user_spec;
    return this;
  }

  public void unsetUser_spec() {
    this.user_spec = null;
  }

  /** Returns true if field user_spec is set (has been assigned a value) and false otherwise */
  public boolean isSetUser_spec() {
    return this.user_spec != null;
  }

  public void setUser_specIsSet(boolean value) {
    if (!value) {
      this.user_spec = null;
    }
  }

  public String getDb_name() {
    return this.db_name;
  }

  public TGrantParams setDb_name(String db_name) {
    this.db_name = db_name;
    return this;
  }

  public void unsetDb_name() {
    this.db_name = null;
  }

  /** Returns true if field db_name is set (has been assigned a value) and false otherwise */
  public boolean isSetDb_name() {
    return this.db_name != null;
  }

  public void setDb_nameIsSet(boolean value) {
    if (!value) {
      this.db_name = null;
    }
  }

  public int getPriv_typesSize() {
    return (this.priv_types == null) ? 0 : this.priv_types.size();
  }

  public java.util.Iterator<TPrivType> getPriv_typesIterator() {
    return (this.priv_types == null) ? null : this.priv_types.iterator();
  }

  public void addToPriv_types(TPrivType elem) {
    if (this.priv_types == null) {
      this.priv_types = new ArrayList<TPrivType>();
    }
    this.priv_types.add(elem);
  }

  public List<TPrivType> getPriv_types() {
    return this.priv_types;
  }

  public TGrantParams setPriv_types(List<TPrivType> priv_types) {
    this.priv_types = priv_types;
    return this;
  }

  public void unsetPriv_types() {
    this.priv_types = null;
  }

  /** Returns true if field priv_types is set (has been assigned a value) and false otherwise */
  public boolean isSetPriv_types() {
    return this.priv_types != null;
  }

  public void setPriv_typesIsSet(boolean value) {
    if (!value) {
      this.priv_types = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case USER_SPEC:
      if (value == null) {
        unsetUser_spec();
      } else {
        setUser_spec((TUserSpecification)value);
      }
      break;

    case DB_NAME:
      if (value == null) {
        unsetDb_name();
      } else {
        setDb_name((String)value);
      }
      break;

    case PRIV_TYPES:
      if (value == null) {
        unsetPriv_types();
      } else {
        setPriv_types((List<TPrivType>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case USER_SPEC:
      return getUser_spec();

    case DB_NAME:
      return getDb_name();

    case PRIV_TYPES:
      return getPriv_types();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case USER_SPEC:
      return isSetUser_spec();
    case DB_NAME:
      return isSetDb_name();
    case PRIV_TYPES:
      return isSetPriv_types();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TGrantParams)
      return this.equals((TGrantParams)that);
    return false;
  }

  public boolean equals(TGrantParams that) {
    if (that == null)
      return false;

    boolean this_present_user_spec = true && this.isSetUser_spec();
    boolean that_present_user_spec = true && that.isSetUser_spec();
    if (this_present_user_spec || that_present_user_spec) {
      if (!(this_present_user_spec && that_present_user_spec))
        return false;
      if (!this.user_spec.equals(that.user_spec))
        return false;
    }

    boolean this_present_db_name = true && this.isSetDb_name();
    boolean that_present_db_name = true && that.isSetDb_name();
    if (this_present_db_name || that_present_db_name) {
      if (!(this_present_db_name && that_present_db_name))
        return false;
      if (!this.db_name.equals(that.db_name))
        return false;
    }

    boolean this_present_priv_types = true && this.isSetPriv_types();
    boolean that_present_priv_types = true && that.isSetPriv_types();
    if (this_present_priv_types || that_present_priv_types) {
      if (!(this_present_priv_types && that_present_priv_types))
        return false;
      if (!this.priv_types.equals(that.priv_types))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_user_spec = true && (isSetUser_spec());
    list.add(present_user_spec);
    if (present_user_spec)
      list.add(user_spec);

    boolean present_db_name = true && (isSetDb_name());
    list.add(present_db_name);
    if (present_db_name)
      list.add(db_name);

    boolean present_priv_types = true && (isSetPriv_types());
    list.add(present_priv_types);
    if (present_priv_types)
      list.add(priv_types);

    return list.hashCode();
  }

  @Override
  public int compareTo(TGrantParams other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetUser_spec()).compareTo(other.isSetUser_spec());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUser_spec()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.user_spec, other.user_spec);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDb_name()).compareTo(other.isSetDb_name());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDb_name()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.db_name, other.db_name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPriv_types()).compareTo(other.isSetPriv_types());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPriv_types()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.priv_types, other.priv_types);
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
    StringBuilder sb = new StringBuilder("TGrantParams(");
    boolean first = true;

    sb.append("user_spec:");
    if (this.user_spec == null) {
      sb.append("null");
    } else {
      sb.append(this.user_spec);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("db_name:");
    if (this.db_name == null) {
      sb.append("null");
    } else {
      sb.append(this.db_name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("priv_types:");
    if (this.priv_types == null) {
      sb.append("null");
    } else {
      sb.append(this.priv_types);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (user_spec == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'user_spec' was not present! Struct: " + toString());
    }
    if (db_name == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'db_name' was not present! Struct: " + toString());
    }
    if (priv_types == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'priv_types' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (user_spec != null) {
      user_spec.validate();
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

  private static class TGrantParamsStandardSchemeFactory implements SchemeFactory {
    public TGrantParamsStandardScheme getScheme() {
      return new TGrantParamsStandardScheme();
    }
  }

  private static class TGrantParamsStandardScheme extends StandardScheme<TGrantParams> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TGrantParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // USER_SPEC
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.user_spec = new TUserSpecification();
              struct.user_spec.read(iprot);
              struct.setUser_specIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DB_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.db_name = iprot.readString();
              struct.setDb_nameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // PRIV_TYPES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list68 = iprot.readListBegin();
                struct.priv_types = new ArrayList<TPrivType>(_list68.size);
                TPrivType _elem69;
                for (int _i70 = 0; _i70 < _list68.size; ++_i70)
                {
                  _elem69 = com.baidu.palo.thrift.TPrivType.findByValue(iprot.readI32());
                  struct.priv_types.add(_elem69);
                }
                iprot.readListEnd();
              }
              struct.setPriv_typesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TGrantParams struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.user_spec != null) {
        oprot.writeFieldBegin(USER_SPEC_FIELD_DESC);
        struct.user_spec.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.db_name != null) {
        oprot.writeFieldBegin(DB_NAME_FIELD_DESC);
        oprot.writeString(struct.db_name);
        oprot.writeFieldEnd();
      }
      if (struct.priv_types != null) {
        oprot.writeFieldBegin(PRIV_TYPES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, struct.priv_types.size()));
          for (TPrivType _iter71 : struct.priv_types)
          {
            oprot.writeI32(_iter71.getValue());
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TGrantParamsTupleSchemeFactory implements SchemeFactory {
    public TGrantParamsTupleScheme getScheme() {
      return new TGrantParamsTupleScheme();
    }
  }

  private static class TGrantParamsTupleScheme extends TupleScheme<TGrantParams> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TGrantParams struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.user_spec.write(oprot);
      oprot.writeString(struct.db_name);
      {
        oprot.writeI32(struct.priv_types.size());
        for (TPrivType _iter72 : struct.priv_types)
        {
          oprot.writeI32(_iter72.getValue());
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TGrantParams struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.user_spec = new TUserSpecification();
      struct.user_spec.read(iprot);
      struct.setUser_specIsSet(true);
      struct.db_name = iprot.readString();
      struct.setDb_nameIsSet(true);
      {
        org.apache.thrift.protocol.TList _list73 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, iprot.readI32());
        struct.priv_types = new ArrayList<TPrivType>(_list73.size);
        TPrivType _elem74;
        for (int _i75 = 0; _i75 < _list73.size; ++_i75)
        {
          _elem74 = com.baidu.palo.thrift.TPrivType.findByValue(iprot.readI32());
          struct.priv_types.add(_elem74);
        }
      }
      struct.setPriv_typesIsSet(true);
    }
  }

}
