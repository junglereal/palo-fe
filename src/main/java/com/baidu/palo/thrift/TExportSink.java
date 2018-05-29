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
public class TExportSink implements org.apache.thrift.TBase<TExportSink, TExportSink._Fields>, java.io.Serializable, Cloneable, Comparable<TExportSink> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TExportSink");

  private static final org.apache.thrift.protocol.TField FILE_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("file_type", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField EXPORT_PATH_FIELD_DESC = new org.apache.thrift.protocol.TField("export_path", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField COLUMN_SEPARATOR_FIELD_DESC = new org.apache.thrift.protocol.TField("column_separator", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField LINE_DELIMITER_FIELD_DESC = new org.apache.thrift.protocol.TField("line_delimiter", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField BROKER_ADDRESSES_FIELD_DESC = new org.apache.thrift.protocol.TField("broker_addresses", org.apache.thrift.protocol.TType.LIST, (short)5);
  private static final org.apache.thrift.protocol.TField PROPERTIES_FIELD_DESC = new org.apache.thrift.protocol.TField("properties", org.apache.thrift.protocol.TType.MAP, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TExportSinkStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TExportSinkTupleSchemeFactory());
  }

  /**
   * 
   * @see com.baidu.palo.thrift.TFileType
   */
  public com.baidu.palo.thrift.TFileType file_type; // required
  public String export_path; // required
  public String column_separator; // required
  public String line_delimiter; // required
  public List<com.baidu.palo.thrift.TNetworkAddress> broker_addresses; // optional
  public Map<String,String> properties; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see com.baidu.palo.thrift.TFileType
     */
    FILE_TYPE((short)1, "file_type"),
    EXPORT_PATH((short)2, "export_path"),
    COLUMN_SEPARATOR((short)3, "column_separator"),
    LINE_DELIMITER((short)4, "line_delimiter"),
    BROKER_ADDRESSES((short)5, "broker_addresses"),
    PROPERTIES((short)6, "properties");

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
        case 1: // FILE_TYPE
          return FILE_TYPE;
        case 2: // EXPORT_PATH
          return EXPORT_PATH;
        case 3: // COLUMN_SEPARATOR
          return COLUMN_SEPARATOR;
        case 4: // LINE_DELIMITER
          return LINE_DELIMITER;
        case 5: // BROKER_ADDRESSES
          return BROKER_ADDRESSES;
        case 6: // PROPERTIES
          return PROPERTIES;
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
  private static final _Fields optionals[] = {_Fields.BROKER_ADDRESSES,_Fields.PROPERTIES};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.FILE_TYPE, new org.apache.thrift.meta_data.FieldMetaData("file_type", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, com.baidu.palo.thrift.TFileType.class)));
    tmpMap.put(_Fields.EXPORT_PATH, new org.apache.thrift.meta_data.FieldMetaData("export_path", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.COLUMN_SEPARATOR, new org.apache.thrift.meta_data.FieldMetaData("column_separator", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.LINE_DELIMITER, new org.apache.thrift.meta_data.FieldMetaData("line_delimiter", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.BROKER_ADDRESSES, new org.apache.thrift.meta_data.FieldMetaData("broker_addresses", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.baidu.palo.thrift.TNetworkAddress.class))));
    tmpMap.put(_Fields.PROPERTIES, new org.apache.thrift.meta_data.FieldMetaData("properties", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TExportSink.class, metaDataMap);
  }

  public TExportSink() {
  }

  public TExportSink(
    com.baidu.palo.thrift.TFileType file_type,
    String export_path,
    String column_separator,
    String line_delimiter)
  {
    this();
    this.file_type = file_type;
    this.export_path = export_path;
    this.column_separator = column_separator;
    this.line_delimiter = line_delimiter;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TExportSink(TExportSink other) {
    if (other.isSetFile_type()) {
      this.file_type = other.file_type;
    }
    if (other.isSetExport_path()) {
      this.export_path = other.export_path;
    }
    if (other.isSetColumn_separator()) {
      this.column_separator = other.column_separator;
    }
    if (other.isSetLine_delimiter()) {
      this.line_delimiter = other.line_delimiter;
    }
    if (other.isSetBroker_addresses()) {
      List<com.baidu.palo.thrift.TNetworkAddress> __this__broker_addresses = new ArrayList<com.baidu.palo.thrift.TNetworkAddress>(other.broker_addresses.size());
      for (com.baidu.palo.thrift.TNetworkAddress other_element : other.broker_addresses) {
        __this__broker_addresses.add(new com.baidu.palo.thrift.TNetworkAddress(other_element));
      }
      this.broker_addresses = __this__broker_addresses;
    }
    if (other.isSetProperties()) {
      Map<String,String> __this__properties = new HashMap<String,String>(other.properties);
      this.properties = __this__properties;
    }
  }

  public TExportSink deepCopy() {
    return new TExportSink(this);
  }

  @Override
  public void clear() {
    this.file_type = null;
    this.export_path = null;
    this.column_separator = null;
    this.line_delimiter = null;
    this.broker_addresses = null;
    this.properties = null;
  }

  /**
   * 
   * @see com.baidu.palo.thrift.TFileType
   */
  public com.baidu.palo.thrift.TFileType getFile_type() {
    return this.file_type;
  }

  /**
   * 
   * @see com.baidu.palo.thrift.TFileType
   */
  public TExportSink setFile_type(com.baidu.palo.thrift.TFileType file_type) {
    this.file_type = file_type;
    return this;
  }

  public void unsetFile_type() {
    this.file_type = null;
  }

  /** Returns true if field file_type is set (has been assigned a value) and false otherwise */
  public boolean isSetFile_type() {
    return this.file_type != null;
  }

  public void setFile_typeIsSet(boolean value) {
    if (!value) {
      this.file_type = null;
    }
  }

  public String getExport_path() {
    return this.export_path;
  }

  public TExportSink setExport_path(String export_path) {
    this.export_path = export_path;
    return this;
  }

  public void unsetExport_path() {
    this.export_path = null;
  }

  /** Returns true if field export_path is set (has been assigned a value) and false otherwise */
  public boolean isSetExport_path() {
    return this.export_path != null;
  }

  public void setExport_pathIsSet(boolean value) {
    if (!value) {
      this.export_path = null;
    }
  }

  public String getColumn_separator() {
    return this.column_separator;
  }

  public TExportSink setColumn_separator(String column_separator) {
    this.column_separator = column_separator;
    return this;
  }

  public void unsetColumn_separator() {
    this.column_separator = null;
  }

  /** Returns true if field column_separator is set (has been assigned a value) and false otherwise */
  public boolean isSetColumn_separator() {
    return this.column_separator != null;
  }

  public void setColumn_separatorIsSet(boolean value) {
    if (!value) {
      this.column_separator = null;
    }
  }

  public String getLine_delimiter() {
    return this.line_delimiter;
  }

  public TExportSink setLine_delimiter(String line_delimiter) {
    this.line_delimiter = line_delimiter;
    return this;
  }

  public void unsetLine_delimiter() {
    this.line_delimiter = null;
  }

  /** Returns true if field line_delimiter is set (has been assigned a value) and false otherwise */
  public boolean isSetLine_delimiter() {
    return this.line_delimiter != null;
  }

  public void setLine_delimiterIsSet(boolean value) {
    if (!value) {
      this.line_delimiter = null;
    }
  }

  public int getBroker_addressesSize() {
    return (this.broker_addresses == null) ? 0 : this.broker_addresses.size();
  }

  public java.util.Iterator<com.baidu.palo.thrift.TNetworkAddress> getBroker_addressesIterator() {
    return (this.broker_addresses == null) ? null : this.broker_addresses.iterator();
  }

  public void addToBroker_addresses(com.baidu.palo.thrift.TNetworkAddress elem) {
    if (this.broker_addresses == null) {
      this.broker_addresses = new ArrayList<com.baidu.palo.thrift.TNetworkAddress>();
    }
    this.broker_addresses.add(elem);
  }

  public List<com.baidu.palo.thrift.TNetworkAddress> getBroker_addresses() {
    return this.broker_addresses;
  }

  public TExportSink setBroker_addresses(List<com.baidu.palo.thrift.TNetworkAddress> broker_addresses) {
    this.broker_addresses = broker_addresses;
    return this;
  }

  public void unsetBroker_addresses() {
    this.broker_addresses = null;
  }

  /** Returns true if field broker_addresses is set (has been assigned a value) and false otherwise */
  public boolean isSetBroker_addresses() {
    return this.broker_addresses != null;
  }

  public void setBroker_addressesIsSet(boolean value) {
    if (!value) {
      this.broker_addresses = null;
    }
  }

  public int getPropertiesSize() {
    return (this.properties == null) ? 0 : this.properties.size();
  }

  public void putToProperties(String key, String val) {
    if (this.properties == null) {
      this.properties = new HashMap<String,String>();
    }
    this.properties.put(key, val);
  }

  public Map<String,String> getProperties() {
    return this.properties;
  }

  public TExportSink setProperties(Map<String,String> properties) {
    this.properties = properties;
    return this;
  }

  public void unsetProperties() {
    this.properties = null;
  }

  /** Returns true if field properties is set (has been assigned a value) and false otherwise */
  public boolean isSetProperties() {
    return this.properties != null;
  }

  public void setPropertiesIsSet(boolean value) {
    if (!value) {
      this.properties = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case FILE_TYPE:
      if (value == null) {
        unsetFile_type();
      } else {
        setFile_type((com.baidu.palo.thrift.TFileType)value);
      }
      break;

    case EXPORT_PATH:
      if (value == null) {
        unsetExport_path();
      } else {
        setExport_path((String)value);
      }
      break;

    case COLUMN_SEPARATOR:
      if (value == null) {
        unsetColumn_separator();
      } else {
        setColumn_separator((String)value);
      }
      break;

    case LINE_DELIMITER:
      if (value == null) {
        unsetLine_delimiter();
      } else {
        setLine_delimiter((String)value);
      }
      break;

    case BROKER_ADDRESSES:
      if (value == null) {
        unsetBroker_addresses();
      } else {
        setBroker_addresses((List<com.baidu.palo.thrift.TNetworkAddress>)value);
      }
      break;

    case PROPERTIES:
      if (value == null) {
        unsetProperties();
      } else {
        setProperties((Map<String,String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case FILE_TYPE:
      return getFile_type();

    case EXPORT_PATH:
      return getExport_path();

    case COLUMN_SEPARATOR:
      return getColumn_separator();

    case LINE_DELIMITER:
      return getLine_delimiter();

    case BROKER_ADDRESSES:
      return getBroker_addresses();

    case PROPERTIES:
      return getProperties();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case FILE_TYPE:
      return isSetFile_type();
    case EXPORT_PATH:
      return isSetExport_path();
    case COLUMN_SEPARATOR:
      return isSetColumn_separator();
    case LINE_DELIMITER:
      return isSetLine_delimiter();
    case BROKER_ADDRESSES:
      return isSetBroker_addresses();
    case PROPERTIES:
      return isSetProperties();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TExportSink)
      return this.equals((TExportSink)that);
    return false;
  }

  public boolean equals(TExportSink that) {
    if (that == null)
      return false;

    boolean this_present_file_type = true && this.isSetFile_type();
    boolean that_present_file_type = true && that.isSetFile_type();
    if (this_present_file_type || that_present_file_type) {
      if (!(this_present_file_type && that_present_file_type))
        return false;
      if (!this.file_type.equals(that.file_type))
        return false;
    }

    boolean this_present_export_path = true && this.isSetExport_path();
    boolean that_present_export_path = true && that.isSetExport_path();
    if (this_present_export_path || that_present_export_path) {
      if (!(this_present_export_path && that_present_export_path))
        return false;
      if (!this.export_path.equals(that.export_path))
        return false;
    }

    boolean this_present_column_separator = true && this.isSetColumn_separator();
    boolean that_present_column_separator = true && that.isSetColumn_separator();
    if (this_present_column_separator || that_present_column_separator) {
      if (!(this_present_column_separator && that_present_column_separator))
        return false;
      if (!this.column_separator.equals(that.column_separator))
        return false;
    }

    boolean this_present_line_delimiter = true && this.isSetLine_delimiter();
    boolean that_present_line_delimiter = true && that.isSetLine_delimiter();
    if (this_present_line_delimiter || that_present_line_delimiter) {
      if (!(this_present_line_delimiter && that_present_line_delimiter))
        return false;
      if (!this.line_delimiter.equals(that.line_delimiter))
        return false;
    }

    boolean this_present_broker_addresses = true && this.isSetBroker_addresses();
    boolean that_present_broker_addresses = true && that.isSetBroker_addresses();
    if (this_present_broker_addresses || that_present_broker_addresses) {
      if (!(this_present_broker_addresses && that_present_broker_addresses))
        return false;
      if (!this.broker_addresses.equals(that.broker_addresses))
        return false;
    }

    boolean this_present_properties = true && this.isSetProperties();
    boolean that_present_properties = true && that.isSetProperties();
    if (this_present_properties || that_present_properties) {
      if (!(this_present_properties && that_present_properties))
        return false;
      if (!this.properties.equals(that.properties))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_file_type = true && (isSetFile_type());
    list.add(present_file_type);
    if (present_file_type)
      list.add(file_type.getValue());

    boolean present_export_path = true && (isSetExport_path());
    list.add(present_export_path);
    if (present_export_path)
      list.add(export_path);

    boolean present_column_separator = true && (isSetColumn_separator());
    list.add(present_column_separator);
    if (present_column_separator)
      list.add(column_separator);

    boolean present_line_delimiter = true && (isSetLine_delimiter());
    list.add(present_line_delimiter);
    if (present_line_delimiter)
      list.add(line_delimiter);

    boolean present_broker_addresses = true && (isSetBroker_addresses());
    list.add(present_broker_addresses);
    if (present_broker_addresses)
      list.add(broker_addresses);

    boolean present_properties = true && (isSetProperties());
    list.add(present_properties);
    if (present_properties)
      list.add(properties);

    return list.hashCode();
  }

  @Override
  public int compareTo(TExportSink other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetFile_type()).compareTo(other.isSetFile_type());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFile_type()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.file_type, other.file_type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetExport_path()).compareTo(other.isSetExport_path());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExport_path()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.export_path, other.export_path);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetColumn_separator()).compareTo(other.isSetColumn_separator());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColumn_separator()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.column_separator, other.column_separator);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLine_delimiter()).compareTo(other.isSetLine_delimiter());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLine_delimiter()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.line_delimiter, other.line_delimiter);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBroker_addresses()).compareTo(other.isSetBroker_addresses());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBroker_addresses()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.broker_addresses, other.broker_addresses);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetProperties()).compareTo(other.isSetProperties());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProperties()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.properties, other.properties);
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
    StringBuilder sb = new StringBuilder("TExportSink(");
    boolean first = true;

    sb.append("file_type:");
    if (this.file_type == null) {
      sb.append("null");
    } else {
      sb.append(this.file_type);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("export_path:");
    if (this.export_path == null) {
      sb.append("null");
    } else {
      sb.append(this.export_path);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("column_separator:");
    if (this.column_separator == null) {
      sb.append("null");
    } else {
      sb.append(this.column_separator);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("line_delimiter:");
    if (this.line_delimiter == null) {
      sb.append("null");
    } else {
      sb.append(this.line_delimiter);
    }
    first = false;
    if (isSetBroker_addresses()) {
      if (!first) sb.append(", ");
      sb.append("broker_addresses:");
      if (this.broker_addresses == null) {
        sb.append("null");
      } else {
        sb.append(this.broker_addresses);
      }
      first = false;
    }
    if (isSetProperties()) {
      if (!first) sb.append(", ");
      sb.append("properties:");
      if (this.properties == null) {
        sb.append("null");
      } else {
        sb.append(this.properties);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (file_type == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'file_type' was not present! Struct: " + toString());
    }
    if (export_path == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'export_path' was not present! Struct: " + toString());
    }
    if (column_separator == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'column_separator' was not present! Struct: " + toString());
    }
    if (line_delimiter == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'line_delimiter' was not present! Struct: " + toString());
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

  private static class TExportSinkStandardSchemeFactory implements SchemeFactory {
    public TExportSinkStandardScheme getScheme() {
      return new TExportSinkStandardScheme();
    }
  }

  private static class TExportSinkStandardScheme extends StandardScheme<TExportSink> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TExportSink struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // FILE_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.file_type = com.baidu.palo.thrift.TFileType.findByValue(iprot.readI32());
              struct.setFile_typeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // EXPORT_PATH
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.export_path = iprot.readString();
              struct.setExport_pathIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // COLUMN_SEPARATOR
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.column_separator = iprot.readString();
              struct.setColumn_separatorIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // LINE_DELIMITER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.line_delimiter = iprot.readString();
              struct.setLine_delimiterIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // BROKER_ADDRESSES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list50 = iprot.readListBegin();
                struct.broker_addresses = new ArrayList<com.baidu.palo.thrift.TNetworkAddress>(_list50.size);
                com.baidu.palo.thrift.TNetworkAddress _elem51;
                for (int _i52 = 0; _i52 < _list50.size; ++_i52)
                {
                  _elem51 = new com.baidu.palo.thrift.TNetworkAddress();
                  _elem51.read(iprot);
                  struct.broker_addresses.add(_elem51);
                }
                iprot.readListEnd();
              }
              struct.setBroker_addressesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // PROPERTIES
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map53 = iprot.readMapBegin();
                struct.properties = new HashMap<String,String>(2*_map53.size);
                String _key54;
                String _val55;
                for (int _i56 = 0; _i56 < _map53.size; ++_i56)
                {
                  _key54 = iprot.readString();
                  _val55 = iprot.readString();
                  struct.properties.put(_key54, _val55);
                }
                iprot.readMapEnd();
              }
              struct.setPropertiesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TExportSink struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.file_type != null) {
        oprot.writeFieldBegin(FILE_TYPE_FIELD_DESC);
        oprot.writeI32(struct.file_type.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.export_path != null) {
        oprot.writeFieldBegin(EXPORT_PATH_FIELD_DESC);
        oprot.writeString(struct.export_path);
        oprot.writeFieldEnd();
      }
      if (struct.column_separator != null) {
        oprot.writeFieldBegin(COLUMN_SEPARATOR_FIELD_DESC);
        oprot.writeString(struct.column_separator);
        oprot.writeFieldEnd();
      }
      if (struct.line_delimiter != null) {
        oprot.writeFieldBegin(LINE_DELIMITER_FIELD_DESC);
        oprot.writeString(struct.line_delimiter);
        oprot.writeFieldEnd();
      }
      if (struct.broker_addresses != null) {
        if (struct.isSetBroker_addresses()) {
          oprot.writeFieldBegin(BROKER_ADDRESSES_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.broker_addresses.size()));
            for (com.baidu.palo.thrift.TNetworkAddress _iter57 : struct.broker_addresses)
            {
              _iter57.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.properties != null) {
        if (struct.isSetProperties()) {
          oprot.writeFieldBegin(PROPERTIES_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.properties.size()));
            for (Map.Entry<String, String> _iter58 : struct.properties.entrySet())
            {
              oprot.writeString(_iter58.getKey());
              oprot.writeString(_iter58.getValue());
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TExportSinkTupleSchemeFactory implements SchemeFactory {
    public TExportSinkTupleScheme getScheme() {
      return new TExportSinkTupleScheme();
    }
  }

  private static class TExportSinkTupleScheme extends TupleScheme<TExportSink> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TExportSink struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.file_type.getValue());
      oprot.writeString(struct.export_path);
      oprot.writeString(struct.column_separator);
      oprot.writeString(struct.line_delimiter);
      BitSet optionals = new BitSet();
      if (struct.isSetBroker_addresses()) {
        optionals.set(0);
      }
      if (struct.isSetProperties()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetBroker_addresses()) {
        {
          oprot.writeI32(struct.broker_addresses.size());
          for (com.baidu.palo.thrift.TNetworkAddress _iter59 : struct.broker_addresses)
          {
            _iter59.write(oprot);
          }
        }
      }
      if (struct.isSetProperties()) {
        {
          oprot.writeI32(struct.properties.size());
          for (Map.Entry<String, String> _iter60 : struct.properties.entrySet())
          {
            oprot.writeString(_iter60.getKey());
            oprot.writeString(_iter60.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TExportSink struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.file_type = com.baidu.palo.thrift.TFileType.findByValue(iprot.readI32());
      struct.setFile_typeIsSet(true);
      struct.export_path = iprot.readString();
      struct.setExport_pathIsSet(true);
      struct.column_separator = iprot.readString();
      struct.setColumn_separatorIsSet(true);
      struct.line_delimiter = iprot.readString();
      struct.setLine_delimiterIsSet(true);
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list61 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.broker_addresses = new ArrayList<com.baidu.palo.thrift.TNetworkAddress>(_list61.size);
          com.baidu.palo.thrift.TNetworkAddress _elem62;
          for (int _i63 = 0; _i63 < _list61.size; ++_i63)
          {
            _elem62 = new com.baidu.palo.thrift.TNetworkAddress();
            _elem62.read(iprot);
            struct.broker_addresses.add(_elem62);
          }
        }
        struct.setBroker_addressesIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TMap _map64 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.properties = new HashMap<String,String>(2*_map64.size);
          String _key65;
          String _val66;
          for (int _i67 = 0; _i67 < _map64.size; ++_i67)
          {
            _key65 = iprot.readString();
            _val66 = iprot.readString();
            struct.properties.put(_key65, _val66);
          }
        }
        struct.setPropertiesIsSet(true);
      }
    }
  }

}
