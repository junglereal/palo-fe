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
public class TCreateUserParams implements org.apache.thrift.TBase<TCreateUserParams, TCreateUserParams._Fields>, java.io.Serializable, Cloneable, Comparable<TCreateUserParams> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TCreateUserParams");

  private static final org.apache.thrift.protocol.TField USER_SPEC_FIELD_DESC = new org.apache.thrift.protocol.TField("user_spec", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField PASSWORD_FIELD_DESC = new org.apache.thrift.protocol.TField("password", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TCreateUserParamsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TCreateUserParamsTupleSchemeFactory());
  }

  public TUserSpecification user_spec; // required
  public String password; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USER_SPEC((short)1, "user_spec"),
    PASSWORD((short)2, "password");

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
        case 2: // PASSWORD
          return PASSWORD;
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
  private static final _Fields optionals[] = {_Fields.PASSWORD};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.USER_SPEC, new org.apache.thrift.meta_data.FieldMetaData("user_spec", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TUserSpecification.class)));
    tmpMap.put(_Fields.PASSWORD, new org.apache.thrift.meta_data.FieldMetaData("password", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TCreateUserParams.class, metaDataMap);
  }

  public TCreateUserParams() {
  }

  public TCreateUserParams(
    TUserSpecification user_spec)
  {
    this();
    this.user_spec = user_spec;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TCreateUserParams(TCreateUserParams other) {
    if (other.isSetUser_spec()) {
      this.user_spec = new TUserSpecification(other.user_spec);
    }
    if (other.isSetPassword()) {
      this.password = other.password;
    }
  }

  public TCreateUserParams deepCopy() {
    return new TCreateUserParams(this);
  }

  @Override
  public void clear() {
    this.user_spec = null;
    this.password = null;
  }

  public TUserSpecification getUser_spec() {
    return this.user_spec;
  }

  public TCreateUserParams setUser_spec(TUserSpecification user_spec) {
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

  public String getPassword() {
    return this.password;
  }

  public TCreateUserParams setPassword(String password) {
    this.password = password;
    return this;
  }

  public void unsetPassword() {
    this.password = null;
  }

  /** Returns true if field password is set (has been assigned a value) and false otherwise */
  public boolean isSetPassword() {
    return this.password != null;
  }

  public void setPasswordIsSet(boolean value) {
    if (!value) {
      this.password = null;
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

    case PASSWORD:
      if (value == null) {
        unsetPassword();
      } else {
        setPassword((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case USER_SPEC:
      return getUser_spec();

    case PASSWORD:
      return getPassword();

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
    case PASSWORD:
      return isSetPassword();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TCreateUserParams)
      return this.equals((TCreateUserParams)that);
    return false;
  }

  public boolean equals(TCreateUserParams that) {
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

    boolean this_present_password = true && this.isSetPassword();
    boolean that_present_password = true && that.isSetPassword();
    if (this_present_password || that_present_password) {
      if (!(this_present_password && that_present_password))
        return false;
      if (!this.password.equals(that.password))
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

    boolean present_password = true && (isSetPassword());
    list.add(present_password);
    if (present_password)
      list.add(password);

    return list.hashCode();
  }

  @Override
  public int compareTo(TCreateUserParams other) {
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
    lastComparison = Boolean.valueOf(isSetPassword()).compareTo(other.isSetPassword());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPassword()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.password, other.password);
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
    StringBuilder sb = new StringBuilder("TCreateUserParams(");
    boolean first = true;

    sb.append("user_spec:");
    if (this.user_spec == null) {
      sb.append("null");
    } else {
      sb.append(this.user_spec);
    }
    first = false;
    if (isSetPassword()) {
      if (!first) sb.append(", ");
      sb.append("password:");
      if (this.password == null) {
        sb.append("null");
      } else {
        sb.append(this.password);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (user_spec == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'user_spec' was not present! Struct: " + toString());
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

  private static class TCreateUserParamsStandardSchemeFactory implements SchemeFactory {
    public TCreateUserParamsStandardScheme getScheme() {
      return new TCreateUserParamsStandardScheme();
    }
  }

  private static class TCreateUserParamsStandardScheme extends StandardScheme<TCreateUserParams> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TCreateUserParams struct) throws org.apache.thrift.TException {
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
          case 2: // PASSWORD
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.password = iprot.readString();
              struct.setPasswordIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TCreateUserParams struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.user_spec != null) {
        oprot.writeFieldBegin(USER_SPEC_FIELD_DESC);
        struct.user_spec.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.password != null) {
        if (struct.isSetPassword()) {
          oprot.writeFieldBegin(PASSWORD_FIELD_DESC);
          oprot.writeString(struct.password);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TCreateUserParamsTupleSchemeFactory implements SchemeFactory {
    public TCreateUserParamsTupleScheme getScheme() {
      return new TCreateUserParamsTupleScheme();
    }
  }

  private static class TCreateUserParamsTupleScheme extends TupleScheme<TCreateUserParams> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TCreateUserParams struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.user_spec.write(oprot);
      BitSet optionals = new BitSet();
      if (struct.isSetPassword()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetPassword()) {
        oprot.writeString(struct.password);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TCreateUserParams struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.user_spec = new TUserSpecification();
      struct.user_spec.read(iprot);
      struct.setUser_specIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.password = iprot.readString();
        struct.setPasswordIsSet(true);
      }
    }
  }

}

