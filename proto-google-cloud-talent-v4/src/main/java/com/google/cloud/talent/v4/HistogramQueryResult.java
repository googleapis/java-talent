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
// source: google/cloud/talent/v4/histogram.proto

package com.google.cloud.talent.v4;

/**
 *
 *
 * <pre>
 * Histogram result that matches [HistogramQuery][google.cloud.talent.v4.HistogramQuery] specified in searches.
 * </pre>
 *
 * Protobuf type {@code google.cloud.talent.v4.HistogramQueryResult}
 */
public final class HistogramQueryResult extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.talent.v4.HistogramQueryResult)
    HistogramQueryResultOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use HistogramQueryResult.newBuilder() to construct.
  private HistogramQueryResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private HistogramQueryResult() {
    histogramQuery_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new HistogramQueryResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private HistogramQueryResult(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              histogramQuery_ = s;
              break;
            }
          case 18:
            {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                histogram_ =
                    com.google.protobuf.MapField.newMapField(
                        HistogramDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000001;
              }
              com.google.protobuf.MapEntry<java.lang.String, java.lang.Long> histogram__ =
                  input.readMessage(
                      HistogramDefaultEntryHolder.defaultEntry.getParserForType(),
                      extensionRegistry);
              histogram_.getMutableMap().put(histogram__.getKey(), histogram__.getValue());
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
    return com.google.cloud.talent.v4.HistogramProto
        .internal_static_google_cloud_talent_v4_HistogramQueryResult_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(int number) {
    switch (number) {
      case 2:
        return internalGetHistogram();
      default:
        throw new RuntimeException("Invalid map field number: " + number);
    }
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.talent.v4.HistogramProto
        .internal_static_google_cloud_talent_v4_HistogramQueryResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.talent.v4.HistogramQueryResult.class,
            com.google.cloud.talent.v4.HistogramQueryResult.Builder.class);
  }

  public static final int HISTOGRAM_QUERY_FIELD_NUMBER = 1;
  private volatile java.lang.Object histogramQuery_;
  /**
   *
   *
   * <pre>
   * Requested histogram expression.
   * </pre>
   *
   * <code>string histogram_query = 1;</code>
   *
   * @return The histogramQuery.
   */
  @java.lang.Override
  public java.lang.String getHistogramQuery() {
    java.lang.Object ref = histogramQuery_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      histogramQuery_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Requested histogram expression.
   * </pre>
   *
   * <code>string histogram_query = 1;</code>
   *
   * @return The bytes for histogramQuery.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getHistogramQueryBytes() {
    java.lang.Object ref = histogramQuery_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      histogramQuery_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HISTOGRAM_FIELD_NUMBER = 2;

  private static final class HistogramDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<java.lang.String, java.lang.Long> defaultEntry =
        com.google.protobuf.MapEntry.<java.lang.String, java.lang.Long>newDefaultInstance(
            com.google.cloud.talent.v4.HistogramProto
                .internal_static_google_cloud_talent_v4_HistogramQueryResult_HistogramEntry_descriptor,
            com.google.protobuf.WireFormat.FieldType.STRING,
            "",
            com.google.protobuf.WireFormat.FieldType.INT64,
            0L);
  }

  private com.google.protobuf.MapField<java.lang.String, java.lang.Long> histogram_;

  private com.google.protobuf.MapField<java.lang.String, java.lang.Long> internalGetHistogram() {
    if (histogram_ == null) {
      return com.google.protobuf.MapField.emptyMapField(HistogramDefaultEntryHolder.defaultEntry);
    }
    return histogram_;
  }

  public int getHistogramCount() {
    return internalGetHistogram().getMap().size();
  }
  /**
   *
   *
   * <pre>
   * A map from the values of the facet associated with distinct values to the
   * number of matching entries with corresponding value.
   * The key format is:
   * * (for string histogram) string values stored in the field.
   * * (for named numeric bucket) name specified in `bucket()` function, like
   *   for `bucket(0, MAX, "non-negative")`, the key will be `non-negative`.
   * * (for anonymous numeric bucket) range formatted as `&lt;low&gt;-&lt;high&gt;`, for
   *   example, `0-1000`, `MIN-0`, and `0-MAX`.
   * </pre>
   *
   * <code>map&lt;string, int64&gt; histogram = 2;</code>
   */
  @java.lang.Override
  public boolean containsHistogram(java.lang.String key) {
    if (key == null) {
      throw new java.lang.NullPointerException();
    }
    return internalGetHistogram().getMap().containsKey(key);
  }
  /** Use {@link #getHistogramMap()} instead. */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.Long> getHistogram() {
    return getHistogramMap();
  }
  /**
   *
   *
   * <pre>
   * A map from the values of the facet associated with distinct values to the
   * number of matching entries with corresponding value.
   * The key format is:
   * * (for string histogram) string values stored in the field.
   * * (for named numeric bucket) name specified in `bucket()` function, like
   *   for `bucket(0, MAX, "non-negative")`, the key will be `non-negative`.
   * * (for anonymous numeric bucket) range formatted as `&lt;low&gt;-&lt;high&gt;`, for
   *   example, `0-1000`, `MIN-0`, and `0-MAX`.
   * </pre>
   *
   * <code>map&lt;string, int64&gt; histogram = 2;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, java.lang.Long> getHistogramMap() {
    return internalGetHistogram().getMap();
  }
  /**
   *
   *
   * <pre>
   * A map from the values of the facet associated with distinct values to the
   * number of matching entries with corresponding value.
   * The key format is:
   * * (for string histogram) string values stored in the field.
   * * (for named numeric bucket) name specified in `bucket()` function, like
   *   for `bucket(0, MAX, "non-negative")`, the key will be `non-negative`.
   * * (for anonymous numeric bucket) range formatted as `&lt;low&gt;-&lt;high&gt;`, for
   *   example, `0-1000`, `MIN-0`, and `0-MAX`.
   * </pre>
   *
   * <code>map&lt;string, int64&gt; histogram = 2;</code>
   */
  @java.lang.Override
  public long getHistogramOrDefault(java.lang.String key, long defaultValue) {
    if (key == null) {
      throw new java.lang.NullPointerException();
    }
    java.util.Map<java.lang.String, java.lang.Long> map = internalGetHistogram().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   *
   *
   * <pre>
   * A map from the values of the facet associated with distinct values to the
   * number of matching entries with corresponding value.
   * The key format is:
   * * (for string histogram) string values stored in the field.
   * * (for named numeric bucket) name specified in `bucket()` function, like
   *   for `bucket(0, MAX, "non-negative")`, the key will be `non-negative`.
   * * (for anonymous numeric bucket) range formatted as `&lt;low&gt;-&lt;high&gt;`, for
   *   example, `0-1000`, `MIN-0`, and `0-MAX`.
   * </pre>
   *
   * <code>map&lt;string, int64&gt; histogram = 2;</code>
   */
  @java.lang.Override
  public long getHistogramOrThrow(java.lang.String key) {
    if (key == null) {
      throw new java.lang.NullPointerException();
    }
    java.util.Map<java.lang.String, java.lang.Long> map = internalGetHistogram().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    if (!getHistogramQueryBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, histogramQuery_);
    }
    com.google.protobuf.GeneratedMessageV3.serializeStringMapTo(
        output, internalGetHistogram(), HistogramDefaultEntryHolder.defaultEntry, 2);
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getHistogramQueryBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, histogramQuery_);
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.Long> entry :
        internalGetHistogram().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.Long> histogram__ =
          HistogramDefaultEntryHolder.defaultEntry
              .newBuilderForType()
              .setKey(entry.getKey())
              .setValue(entry.getValue())
              .build();
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, histogram__);
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
    if (!(obj instanceof com.google.cloud.talent.v4.HistogramQueryResult)) {
      return super.equals(obj);
    }
    com.google.cloud.talent.v4.HistogramQueryResult other =
        (com.google.cloud.talent.v4.HistogramQueryResult) obj;

    if (!getHistogramQuery().equals(other.getHistogramQuery())) return false;
    if (!internalGetHistogram().equals(other.internalGetHistogram())) return false;
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
    hash = (37 * hash) + HISTOGRAM_QUERY_FIELD_NUMBER;
    hash = (53 * hash) + getHistogramQuery().hashCode();
    if (!internalGetHistogram().getMap().isEmpty()) {
      hash = (37 * hash) + HISTOGRAM_FIELD_NUMBER;
      hash = (53 * hash) + internalGetHistogram().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.talent.v4.HistogramQueryResult parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.talent.v4.HistogramQueryResult parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.talent.v4.HistogramQueryResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.talent.v4.HistogramQueryResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.talent.v4.HistogramQueryResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.talent.v4.HistogramQueryResult parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.talent.v4.HistogramQueryResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.talent.v4.HistogramQueryResult parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.talent.v4.HistogramQueryResult parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.talent.v4.HistogramQueryResult parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.talent.v4.HistogramQueryResult parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.talent.v4.HistogramQueryResult parseFrom(
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

  public static Builder newBuilder(com.google.cloud.talent.v4.HistogramQueryResult prototype) {
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
   * Histogram result that matches [HistogramQuery][google.cloud.talent.v4.HistogramQuery] specified in searches.
   * </pre>
   *
   * Protobuf type {@code google.cloud.talent.v4.HistogramQueryResult}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.talent.v4.HistogramQueryResult)
      com.google.cloud.talent.v4.HistogramQueryResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.talent.v4.HistogramProto
          .internal_static_google_cloud_talent_v4_HistogramQueryResult_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(int number) {
      switch (number) {
        case 2:
          return internalGetHistogram();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(int number) {
      switch (number) {
        case 2:
          return internalGetMutableHistogram();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.talent.v4.HistogramProto
          .internal_static_google_cloud_talent_v4_HistogramQueryResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.talent.v4.HistogramQueryResult.class,
              com.google.cloud.talent.v4.HistogramQueryResult.Builder.class);
    }

    // Construct using com.google.cloud.talent.v4.HistogramQueryResult.newBuilder()
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
      histogramQuery_ = "";

      internalGetMutableHistogram().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.talent.v4.HistogramProto
          .internal_static_google_cloud_talent_v4_HistogramQueryResult_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.talent.v4.HistogramQueryResult getDefaultInstanceForType() {
      return com.google.cloud.talent.v4.HistogramQueryResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.talent.v4.HistogramQueryResult build() {
      com.google.cloud.talent.v4.HistogramQueryResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.talent.v4.HistogramQueryResult buildPartial() {
      com.google.cloud.talent.v4.HistogramQueryResult result =
          new com.google.cloud.talent.v4.HistogramQueryResult(this);
      int from_bitField0_ = bitField0_;
      result.histogramQuery_ = histogramQuery_;
      result.histogram_ = internalGetHistogram();
      result.histogram_.makeImmutable();
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
      if (other instanceof com.google.cloud.talent.v4.HistogramQueryResult) {
        return mergeFrom((com.google.cloud.talent.v4.HistogramQueryResult) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.talent.v4.HistogramQueryResult other) {
      if (other == com.google.cloud.talent.v4.HistogramQueryResult.getDefaultInstance())
        return this;
      if (!other.getHistogramQuery().isEmpty()) {
        histogramQuery_ = other.histogramQuery_;
        onChanged();
      }
      internalGetMutableHistogram().mergeFrom(other.internalGetHistogram());
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
      com.google.cloud.talent.v4.HistogramQueryResult parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.talent.v4.HistogramQueryResult) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.lang.Object histogramQuery_ = "";
    /**
     *
     *
     * <pre>
     * Requested histogram expression.
     * </pre>
     *
     * <code>string histogram_query = 1;</code>
     *
     * @return The histogramQuery.
     */
    public java.lang.String getHistogramQuery() {
      java.lang.Object ref = histogramQuery_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        histogramQuery_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Requested histogram expression.
     * </pre>
     *
     * <code>string histogram_query = 1;</code>
     *
     * @return The bytes for histogramQuery.
     */
    public com.google.protobuf.ByteString getHistogramQueryBytes() {
      java.lang.Object ref = histogramQuery_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        histogramQuery_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Requested histogram expression.
     * </pre>
     *
     * <code>string histogram_query = 1;</code>
     *
     * @param value The histogramQuery to set.
     * @return This builder for chaining.
     */
    public Builder setHistogramQuery(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      histogramQuery_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Requested histogram expression.
     * </pre>
     *
     * <code>string histogram_query = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearHistogramQuery() {

      histogramQuery_ = getDefaultInstance().getHistogramQuery();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Requested histogram expression.
     * </pre>
     *
     * <code>string histogram_query = 1;</code>
     *
     * @param value The bytes for histogramQuery to set.
     * @return This builder for chaining.
     */
    public Builder setHistogramQueryBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      histogramQuery_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<java.lang.String, java.lang.Long> histogram_;

    private com.google.protobuf.MapField<java.lang.String, java.lang.Long> internalGetHistogram() {
      if (histogram_ == null) {
        return com.google.protobuf.MapField.emptyMapField(HistogramDefaultEntryHolder.defaultEntry);
      }
      return histogram_;
    }

    private com.google.protobuf.MapField<java.lang.String, java.lang.Long>
        internalGetMutableHistogram() {
      onChanged();
      ;
      if (histogram_ == null) {
        histogram_ =
            com.google.protobuf.MapField.newMapField(HistogramDefaultEntryHolder.defaultEntry);
      }
      if (!histogram_.isMutable()) {
        histogram_ = histogram_.copy();
      }
      return histogram_;
    }

    public int getHistogramCount() {
      return internalGetHistogram().getMap().size();
    }
    /**
     *
     *
     * <pre>
     * A map from the values of the facet associated with distinct values to the
     * number of matching entries with corresponding value.
     * The key format is:
     * * (for string histogram) string values stored in the field.
     * * (for named numeric bucket) name specified in `bucket()` function, like
     *   for `bucket(0, MAX, "non-negative")`, the key will be `non-negative`.
     * * (for anonymous numeric bucket) range formatted as `&lt;low&gt;-&lt;high&gt;`, for
     *   example, `0-1000`, `MIN-0`, and `0-MAX`.
     * </pre>
     *
     * <code>map&lt;string, int64&gt; histogram = 2;</code>
     */
    @java.lang.Override
    public boolean containsHistogram(java.lang.String key) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      return internalGetHistogram().getMap().containsKey(key);
    }
    /** Use {@link #getHistogramMap()} instead. */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.Long> getHistogram() {
      return getHistogramMap();
    }
    /**
     *
     *
     * <pre>
     * A map from the values of the facet associated with distinct values to the
     * number of matching entries with corresponding value.
     * The key format is:
     * * (for string histogram) string values stored in the field.
     * * (for named numeric bucket) name specified in `bucket()` function, like
     *   for `bucket(0, MAX, "non-negative")`, the key will be `non-negative`.
     * * (for anonymous numeric bucket) range formatted as `&lt;low&gt;-&lt;high&gt;`, for
     *   example, `0-1000`, `MIN-0`, and `0-MAX`.
     * </pre>
     *
     * <code>map&lt;string, int64&gt; histogram = 2;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, java.lang.Long> getHistogramMap() {
      return internalGetHistogram().getMap();
    }
    /**
     *
     *
     * <pre>
     * A map from the values of the facet associated with distinct values to the
     * number of matching entries with corresponding value.
     * The key format is:
     * * (for string histogram) string values stored in the field.
     * * (for named numeric bucket) name specified in `bucket()` function, like
     *   for `bucket(0, MAX, "non-negative")`, the key will be `non-negative`.
     * * (for anonymous numeric bucket) range formatted as `&lt;low&gt;-&lt;high&gt;`, for
     *   example, `0-1000`, `MIN-0`, and `0-MAX`.
     * </pre>
     *
     * <code>map&lt;string, int64&gt; histogram = 2;</code>
     */
    @java.lang.Override
    public long getHistogramOrDefault(java.lang.String key, long defaultValue) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      java.util.Map<java.lang.String, java.lang.Long> map = internalGetHistogram().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     *
     *
     * <pre>
     * A map from the values of the facet associated with distinct values to the
     * number of matching entries with corresponding value.
     * The key format is:
     * * (for string histogram) string values stored in the field.
     * * (for named numeric bucket) name specified in `bucket()` function, like
     *   for `bucket(0, MAX, "non-negative")`, the key will be `non-negative`.
     * * (for anonymous numeric bucket) range formatted as `&lt;low&gt;-&lt;high&gt;`, for
     *   example, `0-1000`, `MIN-0`, and `0-MAX`.
     * </pre>
     *
     * <code>map&lt;string, int64&gt; histogram = 2;</code>
     */
    @java.lang.Override
    public long getHistogramOrThrow(java.lang.String key) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      java.util.Map<java.lang.String, java.lang.Long> map = internalGetHistogram().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearHistogram() {
      internalGetMutableHistogram().getMutableMap().clear();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A map from the values of the facet associated with distinct values to the
     * number of matching entries with corresponding value.
     * The key format is:
     * * (for string histogram) string values stored in the field.
     * * (for named numeric bucket) name specified in `bucket()` function, like
     *   for `bucket(0, MAX, "non-negative")`, the key will be `non-negative`.
     * * (for anonymous numeric bucket) range formatted as `&lt;low&gt;-&lt;high&gt;`, for
     *   example, `0-1000`, `MIN-0`, and `0-MAX`.
     * </pre>
     *
     * <code>map&lt;string, int64&gt; histogram = 2;</code>
     */
    public Builder removeHistogram(java.lang.String key) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      internalGetMutableHistogram().getMutableMap().remove(key);
      return this;
    }
    /** Use alternate mutation accessors instead. */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.Long> getMutableHistogram() {
      return internalGetMutableHistogram().getMutableMap();
    }
    /**
     *
     *
     * <pre>
     * A map from the values of the facet associated with distinct values to the
     * number of matching entries with corresponding value.
     * The key format is:
     * * (for string histogram) string values stored in the field.
     * * (for named numeric bucket) name specified in `bucket()` function, like
     *   for `bucket(0, MAX, "non-negative")`, the key will be `non-negative`.
     * * (for anonymous numeric bucket) range formatted as `&lt;low&gt;-&lt;high&gt;`, for
     *   example, `0-1000`, `MIN-0`, and `0-MAX`.
     * </pre>
     *
     * <code>map&lt;string, int64&gt; histogram = 2;</code>
     */
    public Builder putHistogram(java.lang.String key, long value) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }

      internalGetMutableHistogram().getMutableMap().put(key, value);
      return this;
    }
    /**
     *
     *
     * <pre>
     * A map from the values of the facet associated with distinct values to the
     * number of matching entries with corresponding value.
     * The key format is:
     * * (for string histogram) string values stored in the field.
     * * (for named numeric bucket) name specified in `bucket()` function, like
     *   for `bucket(0, MAX, "non-negative")`, the key will be `non-negative`.
     * * (for anonymous numeric bucket) range formatted as `&lt;low&gt;-&lt;high&gt;`, for
     *   example, `0-1000`, `MIN-0`, and `0-MAX`.
     * </pre>
     *
     * <code>map&lt;string, int64&gt; histogram = 2;</code>
     */
    public Builder putAllHistogram(java.util.Map<java.lang.String, java.lang.Long> values) {
      internalGetMutableHistogram().getMutableMap().putAll(values);
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

    // @@protoc_insertion_point(builder_scope:google.cloud.talent.v4.HistogramQueryResult)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.talent.v4.HistogramQueryResult)
  private static final com.google.cloud.talent.v4.HistogramQueryResult DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.talent.v4.HistogramQueryResult();
  }

  public static com.google.cloud.talent.v4.HistogramQueryResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HistogramQueryResult> PARSER =
      new com.google.protobuf.AbstractParser<HistogramQueryResult>() {
        @java.lang.Override
        public HistogramQueryResult parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new HistogramQueryResult(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<HistogramQueryResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HistogramQueryResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.talent.v4.HistogramQueryResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
