// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/profile_service.proto

package com.google.cloud.talent.v4beta1;

/**
 * <pre>
 * Create profile request.
 * </pre>
 *
 * Protobuf type {@code google.cloud.talent.v4beta1.CreateProfileRequest}
 */
public final class CreateProfileRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.talent.v4beta1.CreateProfileRequest)
    CreateProfileRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateProfileRequest.newBuilder() to construct.
  private CreateProfileRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateProfileRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateProfileRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateProfileRequest(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            parent_ = s;
            break;
          }
          case 18: {
            com.google.cloud.talent.v4beta1.Profile.Builder subBuilder = null;
            if (profile_ != null) {
              subBuilder = profile_.toBuilder();
            }
            profile_ = input.readMessage(com.google.cloud.talent.v4beta1.Profile.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(profile_);
              profile_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.talent.v4beta1.ProfileServiceProto.internal_static_google_cloud_talent_v4beta1_CreateProfileRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.talent.v4beta1.ProfileServiceProto.internal_static_google_cloud_talent_v4beta1_CreateProfileRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.talent.v4beta1.CreateProfileRequest.class, com.google.cloud.talent.v4beta1.CreateProfileRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   * <pre>
   * Required. The name of the tenant this profile belongs to.
   * The format is "projects/{project_id}/tenants/{tenant_id}". For example,
   * "projects/foo/tenants/bar".
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The name of the tenant this profile belongs to.
   * The format is "projects/{project_id}/tenants/{tenant_id}". For example,
   * "projects/foo/tenants/bar".
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PROFILE_FIELD_NUMBER = 2;
  private com.google.cloud.talent.v4beta1.Profile profile_;
  /**
   * <pre>
   * Required. The profile to be created.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Profile profile = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the profile field is set.
   */
  @java.lang.Override
  public boolean hasProfile() {
    return profile_ != null;
  }
  /**
   * <pre>
   * Required. The profile to be created.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Profile profile = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The profile.
   */
  @java.lang.Override
  public com.google.cloud.talent.v4beta1.Profile getProfile() {
    return profile_ == null ? com.google.cloud.talent.v4beta1.Profile.getDefaultInstance() : profile_;
  }
  /**
   * <pre>
   * Required. The profile to be created.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Profile profile = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.talent.v4beta1.ProfileOrBuilder getProfileOrBuilder() {
    return getProfile();
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (profile_ != null) {
      output.writeMessage(2, getProfile());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (profile_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getProfile());
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
    if (!(obj instanceof com.google.cloud.talent.v4beta1.CreateProfileRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.talent.v4beta1.CreateProfileRequest other = (com.google.cloud.talent.v4beta1.CreateProfileRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (hasProfile() != other.hasProfile()) return false;
    if (hasProfile()) {
      if (!getProfile()
          .equals(other.getProfile())) return false;
    }
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasProfile()) {
      hash = (37 * hash) + PROFILE_FIELD_NUMBER;
      hash = (53 * hash) + getProfile().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.talent.v4beta1.CreateProfileRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.talent.v4beta1.CreateProfileRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.talent.v4beta1.CreateProfileRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.talent.v4beta1.CreateProfileRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.talent.v4beta1.CreateProfileRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.talent.v4beta1.CreateProfileRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.talent.v4beta1.CreateProfileRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.talent.v4beta1.CreateProfileRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.talent.v4beta1.CreateProfileRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.talent.v4beta1.CreateProfileRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.talent.v4beta1.CreateProfileRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.talent.v4beta1.CreateProfileRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.talent.v4beta1.CreateProfileRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Create profile request.
   * </pre>
   *
   * Protobuf type {@code google.cloud.talent.v4beta1.CreateProfileRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.talent.v4beta1.CreateProfileRequest)
      com.google.cloud.talent.v4beta1.CreateProfileRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.talent.v4beta1.ProfileServiceProto.internal_static_google_cloud_talent_v4beta1_CreateProfileRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.talent.v4beta1.ProfileServiceProto.internal_static_google_cloud_talent_v4beta1_CreateProfileRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.talent.v4beta1.CreateProfileRequest.class, com.google.cloud.talent.v4beta1.CreateProfileRequest.Builder.class);
    }

    // Construct using com.google.cloud.talent.v4beta1.CreateProfileRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      if (profileBuilder_ == null) {
        profile_ = null;
      } else {
        profile_ = null;
        profileBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.talent.v4beta1.ProfileServiceProto.internal_static_google_cloud_talent_v4beta1_CreateProfileRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.talent.v4beta1.CreateProfileRequest getDefaultInstanceForType() {
      return com.google.cloud.talent.v4beta1.CreateProfileRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.talent.v4beta1.CreateProfileRequest build() {
      com.google.cloud.talent.v4beta1.CreateProfileRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.talent.v4beta1.CreateProfileRequest buildPartial() {
      com.google.cloud.talent.v4beta1.CreateProfileRequest result = new com.google.cloud.talent.v4beta1.CreateProfileRequest(this);
      result.parent_ = parent_;
      if (profileBuilder_ == null) {
        result.profile_ = profile_;
      } else {
        result.profile_ = profileBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.talent.v4beta1.CreateProfileRequest) {
        return mergeFrom((com.google.cloud.talent.v4beta1.CreateProfileRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.talent.v4beta1.CreateProfileRequest other) {
      if (other == com.google.cloud.talent.v4beta1.CreateProfileRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasProfile()) {
        mergeProfile(other.getProfile());
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
      com.google.cloud.talent.v4beta1.CreateProfileRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.talent.v4beta1.CreateProfileRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * Required. The name of the tenant this profile belongs to.
     * The format is "projects/{project_id}/tenants/{tenant_id}". For example,
     * "projects/foo/tenants/bar".
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The name of the tenant this profile belongs to.
     * The format is "projects/{project_id}/tenants/{tenant_id}". For example,
     * "projects/foo/tenants/bar".
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The name of the tenant this profile belongs to.
     * The format is "projects/{project_id}/tenants/{tenant_id}". For example,
     * "projects/foo/tenants/bar".
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      parent_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The name of the tenant this profile belongs to.
     * The format is "projects/{project_id}/tenants/{tenant_id}". For example,
     * "projects/foo/tenants/bar".
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      
      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The name of the tenant this profile belongs to.
     * The format is "projects/{project_id}/tenants/{tenant_id}". For example,
     * "projects/foo/tenants/bar".
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      parent_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.talent.v4beta1.Profile profile_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.talent.v4beta1.Profile, com.google.cloud.talent.v4beta1.Profile.Builder, com.google.cloud.talent.v4beta1.ProfileOrBuilder> profileBuilder_;
    /**
     * <pre>
     * Required. The profile to be created.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.Profile profile = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the profile field is set.
     */
    public boolean hasProfile() {
      return profileBuilder_ != null || profile_ != null;
    }
    /**
     * <pre>
     * Required. The profile to be created.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.Profile profile = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The profile.
     */
    public com.google.cloud.talent.v4beta1.Profile getProfile() {
      if (profileBuilder_ == null) {
        return profile_ == null ? com.google.cloud.talent.v4beta1.Profile.getDefaultInstance() : profile_;
      } else {
        return profileBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The profile to be created.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.Profile profile = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setProfile(com.google.cloud.talent.v4beta1.Profile value) {
      if (profileBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        profile_ = value;
        onChanged();
      } else {
        profileBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The profile to be created.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.Profile profile = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setProfile(
        com.google.cloud.talent.v4beta1.Profile.Builder builderForValue) {
      if (profileBuilder_ == null) {
        profile_ = builderForValue.build();
        onChanged();
      } else {
        profileBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. The profile to be created.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.Profile profile = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeProfile(com.google.cloud.talent.v4beta1.Profile value) {
      if (profileBuilder_ == null) {
        if (profile_ != null) {
          profile_ =
            com.google.cloud.talent.v4beta1.Profile.newBuilder(profile_).mergeFrom(value).buildPartial();
        } else {
          profile_ = value;
        }
        onChanged();
      } else {
        profileBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The profile to be created.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.Profile profile = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearProfile() {
      if (profileBuilder_ == null) {
        profile_ = null;
        onChanged();
      } else {
        profile_ = null;
        profileBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. The profile to be created.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.Profile profile = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.talent.v4beta1.Profile.Builder getProfileBuilder() {
      
      onChanged();
      return getProfileFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The profile to be created.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.Profile profile = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.talent.v4beta1.ProfileOrBuilder getProfileOrBuilder() {
      if (profileBuilder_ != null) {
        return profileBuilder_.getMessageOrBuilder();
      } else {
        return profile_ == null ?
            com.google.cloud.talent.v4beta1.Profile.getDefaultInstance() : profile_;
      }
    }
    /**
     * <pre>
     * Required. The profile to be created.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.Profile profile = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.talent.v4beta1.Profile, com.google.cloud.talent.v4beta1.Profile.Builder, com.google.cloud.talent.v4beta1.ProfileOrBuilder> 
        getProfileFieldBuilder() {
      if (profileBuilder_ == null) {
        profileBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.talent.v4beta1.Profile, com.google.cloud.talent.v4beta1.Profile.Builder, com.google.cloud.talent.v4beta1.ProfileOrBuilder>(
                getProfile(),
                getParentForChildren(),
                isClean());
        profile_ = null;
      }
      return profileBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.talent.v4beta1.CreateProfileRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.talent.v4beta1.CreateProfileRequest)
  private static final com.google.cloud.talent.v4beta1.CreateProfileRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.talent.v4beta1.CreateProfileRequest();
  }

  public static com.google.cloud.talent.v4beta1.CreateProfileRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateProfileRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateProfileRequest>() {
    @java.lang.Override
    public CreateProfileRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateProfileRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateProfileRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateProfileRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.talent.v4beta1.CreateProfileRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
