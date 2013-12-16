/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package bigdata.tweetthrift;

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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Text implements org.apache.thrift.TBase<Text, Text._Fields>, java.io.Serializable, Cloneable, Comparable<Text> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Text");

  private static final org.apache.thrift.protocol.TField ORIGNAL_TEXT_FIELD_DESC = new org.apache.thrift.protocol.TField("orignalText", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField CLEAN_TEXT_FIELD_DESC = new org.apache.thrift.protocol.TField("cleanText", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TextStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TextTupleSchemeFactory());
  }

  public String orignalText; // required
  public String cleanText; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ORIGNAL_TEXT((short)1, "orignalText"),
    CLEAN_TEXT((short)2, "cleanText");

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
        case 1: // ORIGNAL_TEXT
          return ORIGNAL_TEXT;
        case 2: // CLEAN_TEXT
          return CLEAN_TEXT;
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
  private _Fields optionals[] = {_Fields.CLEAN_TEXT};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ORIGNAL_TEXT, new org.apache.thrift.meta_data.FieldMetaData("orignalText", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CLEAN_TEXT, new org.apache.thrift.meta_data.FieldMetaData("cleanText", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Text.class, metaDataMap);
  }

  public Text() {
  }

  public Text(
    String orignalText)
  {
    this();
    this.orignalText = orignalText;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Text(Text other) {
    if (other.isSetOrignalText()) {
      this.orignalText = other.orignalText;
    }
    if (other.isSetCleanText()) {
      this.cleanText = other.cleanText;
    }
  }

  public Text deepCopy() {
    return new Text(this);
  }

  @Override
  public void clear() {
    this.orignalText = null;
    this.cleanText = null;
  }

  public String getOrignalText() {
    return this.orignalText;
  }

  public Text setOrignalText(String orignalText) {
    this.orignalText = orignalText;
    return this;
  }

  public void unsetOrignalText() {
    this.orignalText = null;
  }

  /** Returns true if field orignalText is set (has been assigned a value) and false otherwise */
  public boolean isSetOrignalText() {
    return this.orignalText != null;
  }

  public void setOrignalTextIsSet(boolean value) {
    if (!value) {
      this.orignalText = null;
    }
  }

  public String getCleanText() {
    return this.cleanText;
  }

  public Text setCleanText(String cleanText) {
    this.cleanText = cleanText;
    return this;
  }

  public void unsetCleanText() {
    this.cleanText = null;
  }

  /** Returns true if field cleanText is set (has been assigned a value) and false otherwise */
  public boolean isSetCleanText() {
    return this.cleanText != null;
  }

  public void setCleanTextIsSet(boolean value) {
    if (!value) {
      this.cleanText = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ORIGNAL_TEXT:
      if (value == null) {
        unsetOrignalText();
      } else {
        setOrignalText((String)value);
      }
      break;

    case CLEAN_TEXT:
      if (value == null) {
        unsetCleanText();
      } else {
        setCleanText((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ORIGNAL_TEXT:
      return getOrignalText();

    case CLEAN_TEXT:
      return getCleanText();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ORIGNAL_TEXT:
      return isSetOrignalText();
    case CLEAN_TEXT:
      return isSetCleanText();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Text)
      return this.equals((Text)that);
    return false;
  }

  public boolean equals(Text that) {
    if (that == null)
      return false;

    boolean this_present_orignalText = true && this.isSetOrignalText();
    boolean that_present_orignalText = true && that.isSetOrignalText();
    if (this_present_orignalText || that_present_orignalText) {
      if (!(this_present_orignalText && that_present_orignalText))
        return false;
      if (!this.orignalText.equals(that.orignalText))
        return false;
    }

    boolean this_present_cleanText = true && this.isSetCleanText();
    boolean that_present_cleanText = true && that.isSetCleanText();
    if (this_present_cleanText || that_present_cleanText) {
      if (!(this_present_cleanText && that_present_cleanText))
        return false;
      if (!this.cleanText.equals(that.cleanText))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(Text other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetOrignalText()).compareTo(other.isSetOrignalText());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOrignalText()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.orignalText, other.orignalText);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCleanText()).compareTo(other.isSetCleanText());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCleanText()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cleanText, other.cleanText);
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
    StringBuilder sb = new StringBuilder("Text(");
    boolean first = true;

    sb.append("orignalText:");
    if (this.orignalText == null) {
      sb.append("null");
    } else {
      sb.append(this.orignalText);
    }
    first = false;
    if (isSetCleanText()) {
      if (!first) sb.append(", ");
      sb.append("cleanText:");
      if (this.cleanText == null) {
        sb.append("null");
      } else {
        sb.append(this.cleanText);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (orignalText == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'orignalText' was not present! Struct: " + toString());
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

  private static class TextStandardSchemeFactory implements SchemeFactory {
    public TextStandardScheme getScheme() {
      return new TextStandardScheme();
    }
  }

  private static class TextStandardScheme extends StandardScheme<Text> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Text struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ORIGNAL_TEXT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.orignalText = iprot.readString();
              struct.setOrignalTextIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CLEAN_TEXT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.cleanText = iprot.readString();
              struct.setCleanTextIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Text struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.orignalText != null) {
        oprot.writeFieldBegin(ORIGNAL_TEXT_FIELD_DESC);
        oprot.writeString(struct.orignalText);
        oprot.writeFieldEnd();
      }
      if (struct.cleanText != null) {
        if (struct.isSetCleanText()) {
          oprot.writeFieldBegin(CLEAN_TEXT_FIELD_DESC);
          oprot.writeString(struct.cleanText);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TextTupleSchemeFactory implements SchemeFactory {
    public TextTupleScheme getScheme() {
      return new TextTupleScheme();
    }
  }

  private static class TextTupleScheme extends TupleScheme<Text> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Text struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.orignalText);
      BitSet optionals = new BitSet();
      if (struct.isSetCleanText()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetCleanText()) {
        oprot.writeString(struct.cleanText);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Text struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.orignalText = iprot.readString();
      struct.setOrignalTextIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.cleanText = iprot.readString();
        struct.setCleanTextIsSet(true);
      }
    }
  }

}

