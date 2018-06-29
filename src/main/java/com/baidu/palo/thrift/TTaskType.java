/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.baidu.palo.thrift;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum TTaskType implements org.apache.thrift.TEnum {
  CREATE(0),
  DROP(1),
  PUSH(2),
  CLONE(3),
  STORAGE_MEDIUM_MIGRATE(4),
  ROLLUP(5),
  SCHEMA_CHANGE(6),
  CANCEL_DELETE(7),
  MAKE_SNAPSHOT(8),
  RELEASE_SNAPSHOT(9),
  CHECK_CONSISTENCY(10),
  UPLOAD(11),
  RESTORE(12),
  CLEAR_REMOTE_FILE(13),
  STREAMING_ETL(14),
  STREAMING_PUSH(15);

  private final int value;

  private TTaskType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static TTaskType findByValue(int value) { 
    switch (value) {
      case 0:
        return CREATE;
      case 1:
        return DROP;
      case 2:
        return PUSH;
      case 3:
        return CLONE;
      case 4:
        return STORAGE_MEDIUM_MIGRATE;
      case 5:
        return ROLLUP;
      case 6:
        return SCHEMA_CHANGE;
      case 7:
        return CANCEL_DELETE;
      case 8:
        return MAKE_SNAPSHOT;
      case 9:
        return RELEASE_SNAPSHOT;
      case 10:
        return CHECK_CONSISTENCY;
      case 11:
        return UPLOAD;
      case 12:
        return RESTORE;
      case 13:
        return CLEAR_REMOTE_FILE;
      case 14:
        return STREAMING_ETL;
      case 15:
        return STREAMING_PUSH;
      default:
        return null;
    }
  }
}
