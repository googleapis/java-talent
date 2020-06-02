/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/filters.proto

package com.google.cloud.talent.v4beta1;

/**
 *
 *
 * <pre>
 * Filter on availability signals.
 * </pre>
 *
 * Protobuf type {@code google.cloud.talent.v4beta1.AvailabilityFilter}
 */
public final class AvailabilityFilter extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.talent.v4beta1.AvailabilityFilter)
    AvailabilityFilterOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AvailabilityFilter.newBuilder() to construct.
  private AvailabilityFilter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AvailabilityFilter() {
    signalType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AvailabilityFilter();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private AvailabilityFilter(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8:
            {
              int rawValue = input.readEnum();

              signalType_ = rawValue;
              break;
            }
          case 18:
            {
              com.google.cloud.talent.v4beta1.TimestampRange.Builder subBuilder = null;
              if (range_ != null) {
                subBuilder = range_.toBuilder();
              }
              range_ =
                  input.readMessage(
                      com.google.cloud.talent.v4beta1.TimestampRange.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(range_);
                range_ = subBuilder.buildPartial();
              }

              break;
            }
          case 24:
            {
              required_ = input.readBool();
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.talent.v4beta1.FiltersProto
        .internal_static_google_cloud_talent_v4beta1_AvailabilityFilter_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.talent.v4beta1.FiltersProto
        .internal_static_google_cloud_talent_v4beta1_AvailabilityFilter_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.talent.v4beta1.AvailabilityFilter.class,
            com.google.cloud.talent.v4beta1.AvailabilityFilter.Builder.class);
  }

  public static final int SIGNAL_TYPE_FIELD_NUMBER = 1;
  private int signalType_;
  /**
   *
   *
   * <pre>
   * Required. Type of signal to apply filter on.
   * </pre>
   *
   * <code>
   * .google.cloud.talent.v4beta1.AvailabilitySignalType signal_type = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for signalType.
   */
  @java.lang.Override
  public int getSignalTypeValue() {
    return signalType_;
  }
  /**
   *
   *
   * <pre>
   * Required. Type of signal to apply filter on.
   * </pre>
   *
   * <code>
   * .google.cloud.talent.v4beta1.AvailabilitySignalType signal_type = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The signalType.
   */
  @java.lang.Override
  public com.google.cloud.talent.v4beta1.AvailabilitySignalType getSignalType() {
    @SuppressWarnings("deprecation")
    com.google.cloud.talent.v4beta1.AvailabilitySignalType result =
        com.google.cloud.talent.v4beta1.AvailabilitySignalType.valueOf(signalType_);
    return result == null
        ? com.google.cloud.talent.v4beta1.AvailabilitySignalType.UNRECOGNIZED
        : result;
  }

  public static final int RANGE_FIELD_NUMBER = 2;
  private com.google.cloud.talent.v4beta1.TimestampRange range_;
  /**
   *
   *
   * <pre>
   * Required. Range of times to filter candidate signals by.
   * </pre>
   *
   * <code>
   * .google.cloud.talent.v4beta1.TimestampRange range = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the range field is set.
   */
  @java.lang.Override
  public boolean hasRange() {
    return range_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. Range of times to filter candidate signals by.
   * </pre>
   *
   * <code>
   * .google.cloud.talent.v4beta1.TimestampRange range = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The range.
   */
  @java.lang.Override
  public com.google.cloud.talent.v4beta1.TimestampRange getRange() {
    return range_ == null
        ? com.google.cloud.talent.v4beta1.TimestampRange.getDefaultInstance()
        : range_;
  }
  /**
   *
   *
   * <pre>
   * Required. Range of times to filter candidate signals by.
   * </pre>
   *
   * <code>
   * .google.cloud.talent.v4beta1.TimestampRange range = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.talent.v4beta1.TimestampRangeOrBuilder getRangeOrBuilder() {
    return getRange();
  }

  public static final int REQUIRED_FIELD_NUMBER = 3;
  private boolean required_;
  /**
   *
   *
   * <pre>
   * If multiple [AvailabilityFilter][google.cloud.talent.v4beta1.AvailabilityFilter] are provided, the default
   * behavior is to OR all filters, but if this field is set to true, this
   * particular [AvailabilityFilter][google.cloud.talent.v4beta1.AvailabilityFilter] will be AND'ed against other
   * [AvailabilityFilter][google.cloud.talent.v4beta1.AvailabilityFilter].
   * </pre>
   *
   * <code>bool required = 3;</code>
   *
   * @return The required.
   */
  @java.lang.Override
  public boolean getRequired() {
    return required_;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (signalType_
        != com.google.cloud.talent.v4beta1.AvailabilitySignalType
            .AVAILABILITY_SIGNAL_TYPE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(1, signalType_);
    }
    if (range_ != null) {
      output.writeMessage(2, getRange());
    }
    if (required_ != false) {
      output.writeBool(3, required_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (signalType_
        != com.google.cloud.talent.v4beta1.AvailabilitySignalType
            .AVAILABILITY_SIGNAL_TYPE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, signalType_);
    }
    if (range_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getRange());
    }
    if (required_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(3, required_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.talent.v4beta1.AvailabilityFilter)) {
      return super.equals(obj);
    }
    com.google.cloud.talent.v4beta1.AvailabilityFilter other =
        (com.google.cloud.talent.v4beta1.AvailabilityFilter) obj;

    if (signalType_ != other.signalType_) return false;
    if (hasRange() != other.hasRange()) return false;
    if (hasRange()) {
      if (!getRange().equals(other.getRange())) return false;
    }
    if (getRequired() != other.getRequired()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SIGNAL_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + signalType_;
    if (hasRange()) {
      hash = (37 * hash) + RANGE_FIELD_NUMBER;
      hash = (53 * hash) + getRange().hashCode();
    }
    hash = (37 * hash) + REQUIRED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getRequired());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.talent.v4beta1.AvailabilityFilter parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.talent.v4beta1.AvailabilityFilter parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.AvailabilityFilter parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.talent.v4beta1.AvailabilityFilter parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.AvailabilityFilter parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.talent.v4beta1.AvailabilityFilter parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.AvailabilityFilter parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.talent.v4beta1.AvailabilityFilter parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.AvailabilityFilter parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.talent.v4beta1.AvailabilityFilter parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.AvailabilityFilter parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.talent.v4beta1.AvailabilityFilter parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.talent.v4beta1.AvailabilityFilter prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Filter on availability signals.
   * </pre>
   *
   * Protobuf type {@code google.cloud.talent.v4beta1.AvailabilityFilter}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.talent.v4beta1.AvailabilityFilter)
      com.google.cloud.talent.v4beta1.AvailabilityFilterOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.talent.v4beta1.FiltersProto
          .internal_static_google_cloud_talent_v4beta1_AvailabilityFilter_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.talent.v4beta1.FiltersProto
          .internal_static_google_cloud_talent_v4beta1_AvailabilityFilter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.talent.v4beta1.AvailabilityFilter.class,
              com.google.cloud.talent.v4beta1.AvailabilityFilter.Builder.class);
    }

    // Construct using com.google.cloud.talent.v4beta1.AvailabilityFilter.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      signalType_ = 0;

      if (rangeBuilder_ == null) {
        range_ = null;
      } else {
        range_ = null;
        rangeBuilder_ = null;
      }
      required_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.talent.v4beta1.FiltersProto
          .internal_static_google_cloud_talent_v4beta1_AvailabilityFilter_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.talent.v4beta1.AvailabilityFilter getDefaultInstanceForType() {
      return com.google.cloud.talent.v4beta1.AvailabilityFilter.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.talent.v4beta1.AvailabilityFilter build() {
      com.google.cloud.talent.v4beta1.AvailabilityFilter result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.talent.v4beta1.AvailabilityFilter buildPartial() {
      com.google.cloud.talent.v4beta1.AvailabilityFilter result =
          new com.google.cloud.talent.v4beta1.AvailabilityFilter(this);
      result.signalType_ = signalType_;
      if (rangeBuilder_ == null) {
        result.range_ = range_;
      } else {
        result.range_ = rangeBuilder_.build();
      }
      result.required_ = required_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.talent.v4beta1.AvailabilityFilter) {
        return mergeFrom((com.google.cloud.talent.v4beta1.AvailabilityFilter) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.talent.v4beta1.AvailabilityFilter other) {
      if (other == com.google.cloud.talent.v4beta1.AvailabilityFilter.getDefaultInstance())
        return this;
      if (other.signalType_ != 0) {
        setSignalTypeValue(other.getSignalTypeValue());
      }
      if (other.hasRange()) {
        mergeRange(other.getRange());
      }
      if (other.getRequired() != false) {
        setRequired(other.getRequired());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.talent.v4beta1.AvailabilityFilter parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.talent.v4beta1.AvailabilityFilter) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int signalType_ = 0;
    /**
     *
     *
     * <pre>
     * Required. Type of signal to apply filter on.
     * </pre>
     *
     * <code>
     * .google.cloud.talent.v4beta1.AvailabilitySignalType signal_type = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The enum numeric value on the wire for signalType.
     */
    @java.lang.Override
    public int getSignalTypeValue() {
      return signalType_;
    }
    /**
     *
     *
     * <pre>
     * Required. Type of signal to apply filter on.
     * </pre>
     *
     * <code>
     * .google.cloud.talent.v4beta1.AvailabilitySignalType signal_type = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param value The enum numeric value on the wire for signalType to set.
     * @return This builder for chaining.
     */
    public Builder setSignalTypeValue(int value) {

      signalType_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Type of signal to apply filter on.
     * </pre>
     *
     * <code>
     * .google.cloud.talent.v4beta1.AvailabilitySignalType signal_type = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The signalType.
     */
    @java.lang.Override
    public com.google.cloud.talent.v4beta1.AvailabilitySignalType getSignalType() {
      @SuppressWarnings("deprecation")
      com.google.cloud.talent.v4beta1.AvailabilitySignalType result =
          com.google.cloud.talent.v4beta1.AvailabilitySignalType.valueOf(signalType_);
      return result == null
          ? com.google.cloud.talent.v4beta1.AvailabilitySignalType.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Required. Type of signal to apply filter on.
     * </pre>
     *
     * <code>
     * .google.cloud.talent.v4beta1.AvailabilitySignalType signal_type = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param value The signalType to set.
     * @return This builder for chaining.
     */
    public Builder setSignalType(com.google.cloud.talent.v4beta1.AvailabilitySignalType value) {
      if (value == null) {
        throw new NullPointerException();
      }

      signalType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Type of signal to apply filter on.
     * </pre>
     *
     * <code>
     * .google.cloud.talent.v4beta1.AvailabilitySignalType signal_type = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSignalType() {

      signalType_ = 0;
      onChanged();
      return this;
    }

    private com.google.cloud.talent.v4beta1.TimestampRange range_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.talent.v4beta1.TimestampRange,
            com.google.cloud.talent.v4beta1.TimestampRange.Builder,
            com.google.cloud.talent.v4beta1.TimestampRangeOrBuilder>
        rangeBuilder_;
    /**
     *
     *
     * <pre>
     * Required. Range of times to filter candidate signals by.
     * </pre>
     *
     * <code>
     * .google.cloud.talent.v4beta1.TimestampRange range = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the range field is set.
     */
    public boolean hasRange() {
      return rangeBuilder_ != null || range_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. Range of times to filter candidate signals by.
     * </pre>
     *
     * <code>
     * .google.cloud.talent.v4beta1.TimestampRange range = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The range.
     */
    public com.google.cloud.talent.v4beta1.TimestampRange getRange() {
      if (rangeBuilder_ == null) {
        return range_ == null
            ? com.google.cloud.talent.v4beta1.TimestampRange.getDefaultInstance()
            : range_;
      } else {
        return rangeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Range of times to filter candidate signals by.
     * </pre>
     *
     * <code>
     * .google.cloud.talent.v4beta1.TimestampRange range = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setRange(com.google.cloud.talent.v4beta1.TimestampRange value) {
      if (rangeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        range_ = value;
        onChanged();
      } else {
        rangeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Range of times to filter candidate signals by.
     * </pre>
     *
     * <code>
     * .google.cloud.talent.v4beta1.TimestampRange range = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setRange(
        com.google.cloud.talent.v4beta1.TimestampRange.Builder builderForValue) {
      if (rangeBuilder_ == null) {
        range_ = builderForValue.build();
        onChanged();
      } else {
        rangeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Range of times to filter candidate signals by.
     * </pre>
     *
     * <code>
     * .google.cloud.talent.v4beta1.TimestampRange range = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeRange(com.google.cloud.talent.v4beta1.TimestampRange value) {
      if (rangeBuilder_ == null) {
        if (range_ != null) {
          range_ =
              com.google.cloud.talent.v4beta1.TimestampRange.newBuilder(range_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          range_ = value;
        }
        onChanged();
      } else {
        rangeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Range of times to filter candidate signals by.
     * </pre>
     *
     * <code>
     * .google.cloud.talent.v4beta1.TimestampRange range = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearRange() {
      if (rangeBuilder_ == null) {
        range_ = null;
        onChanged();
      } else {
        range_ = null;
        rangeBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Range of times to filter candidate signals by.
     * </pre>
     *
     * <code>
     * .google.cloud.talent.v4beta1.TimestampRange range = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.talent.v4beta1.TimestampRange.Builder getRangeBuilder() {

      onChanged();
      return getRangeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. Range of times to filter candidate signals by.
     * </pre>
     *
     * <code>
     * .google.cloud.talent.v4beta1.TimestampRange range = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.talent.v4beta1.TimestampRangeOrBuilder getRangeOrBuilder() {
      if (rangeBuilder_ != null) {
        return rangeBuilder_.getMessageOrBuilder();
      } else {
        return range_ == null
            ? com.google.cloud.talent.v4beta1.TimestampRange.getDefaultInstance()
            : range_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Range of times to filter candidate signals by.
     * </pre>
     *
     * <code>
     * .google.cloud.talent.v4beta1.TimestampRange range = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.talent.v4beta1.TimestampRange,
            com.google.cloud.talent.v4beta1.TimestampRange.Builder,
            com.google.cloud.talent.v4beta1.TimestampRangeOrBuilder>
        getRangeFieldBuilder() {
      if (rangeBuilder_ == null) {
        rangeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.talent.v4beta1.TimestampRange,
                com.google.cloud.talent.v4beta1.TimestampRange.Builder,
                com.google.cloud.talent.v4beta1.TimestampRangeOrBuilder>(
                getRange(), getParentForChildren(), isClean());
        range_ = null;
      }
      return rangeBuilder_;
    }

    private boolean required_;
    /**
     *
     *
     * <pre>
     * If multiple [AvailabilityFilter][google.cloud.talent.v4beta1.AvailabilityFilter] are provided, the default
     * behavior is to OR all filters, but if this field is set to true, this
     * particular [AvailabilityFilter][google.cloud.talent.v4beta1.AvailabilityFilter] will be AND'ed against other
     * [AvailabilityFilter][google.cloud.talent.v4beta1.AvailabilityFilter].
     * </pre>
     *
     * <code>bool required = 3;</code>
     *
     * @return The required.
     */
    @java.lang.Override
    public boolean getRequired() {
      return required_;
    }
    /**
     *
     *
     * <pre>
     * If multiple [AvailabilityFilter][google.cloud.talent.v4beta1.AvailabilityFilter] are provided, the default
     * behavior is to OR all filters, but if this field is set to true, this
     * particular [AvailabilityFilter][google.cloud.talent.v4beta1.AvailabilityFilter] will be AND'ed against other
     * [AvailabilityFilter][google.cloud.talent.v4beta1.AvailabilityFilter].
     * </pre>
     *
     * <code>bool required = 3;</code>
     *
     * @param value The required to set.
     * @return This builder for chaining.
     */
    public Builder setRequired(boolean value) {

      required_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If multiple [AvailabilityFilter][google.cloud.talent.v4beta1.AvailabilityFilter] are provided, the default
     * behavior is to OR all filters, but if this field is set to true, this
     * particular [AvailabilityFilter][google.cloud.talent.v4beta1.AvailabilityFilter] will be AND'ed against other
     * [AvailabilityFilter][google.cloud.talent.v4beta1.AvailabilityFilter].
     * </pre>
     *
     * <code>bool required = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRequired() {

      required_ = false;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.talent.v4beta1.AvailabilityFilter)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.talent.v4beta1.AvailabilityFilter)
  private static final com.google.cloud.talent.v4beta1.AvailabilityFilter DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.talent.v4beta1.AvailabilityFilter();
  }

  public static com.google.cloud.talent.v4beta1.AvailabilityFilter getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AvailabilityFilter> PARSER =
      new com.google.protobuf.AbstractParser<AvailabilityFilter>() {
        @java.lang.Override
        public AvailabilityFilter parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new AvailabilityFilter(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<AvailabilityFilter> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AvailabilityFilter> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.talent.v4beta1.AvailabilityFilter getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
