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
// source: google/cloud/talent/v4beta1/tenant_service.proto

package com.google.cloud.talent.v4beta1;

/**
 *
 *
 * <pre>
 * Request for updating a specified tenant.
 * </pre>
 *
 * Protobuf type {@code google.cloud.talent.v4beta1.UpdateTenantRequest}
 */
public final class UpdateTenantRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.talent.v4beta1.UpdateTenantRequest)
    UpdateTenantRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateTenantRequest.newBuilder() to construct.
  private UpdateTenantRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateTenantRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateTenantRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.talent.v4beta1.TenantServiceProto
        .internal_static_google_cloud_talent_v4beta1_UpdateTenantRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.talent.v4beta1.TenantServiceProto
        .internal_static_google_cloud_talent_v4beta1_UpdateTenantRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.talent.v4beta1.UpdateTenantRequest.class,
            com.google.cloud.talent.v4beta1.UpdateTenantRequest.Builder.class);
  }

  public static final int TENANT_FIELD_NUMBER = 1;
  private com.google.cloud.talent.v4beta1.Tenant tenant_;
  /**
   *
   *
   * <pre>
   * Required. The tenant resource to replace the current resource in the system.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Tenant tenant = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the tenant field is set.
   */
  @java.lang.Override
  public boolean hasTenant() {
    return tenant_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The tenant resource to replace the current resource in the system.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Tenant tenant = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The tenant.
   */
  @java.lang.Override
  public com.google.cloud.talent.v4beta1.Tenant getTenant() {
    return tenant_ == null ? com.google.cloud.talent.v4beta1.Tenant.getDefaultInstance() : tenant_;
  }
  /**
   *
   *
   * <pre>
   * Required. The tenant resource to replace the current resource in the system.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Tenant tenant = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.talent.v4beta1.TenantOrBuilder getTenantOrBuilder() {
    return getTenant();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * Strongly recommended for the best service experience.
   * If [update_mask][google.cloud.talent.v4beta1.UpdateTenantRequest.update_mask] is provided, only the specified fields in
   * [tenant][google.cloud.talent.v4beta1.UpdateTenantRequest.tenant] are updated. Otherwise all the fields are updated.
   * A field mask to specify the tenant fields to be updated. Only
   * top level fields of [Tenant][google.cloud.talent.v4beta1.Tenant] are supported.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   *
   *
   * <pre>
   * Strongly recommended for the best service experience.
   * If [update_mask][google.cloud.talent.v4beta1.UpdateTenantRequest.update_mask] is provided, only the specified fields in
   * [tenant][google.cloud.talent.v4beta1.UpdateTenantRequest.tenant] are updated. Otherwise all the fields are updated.
   * A field mask to specify the tenant fields to be updated. Only
   * top level fields of [Tenant][google.cloud.talent.v4beta1.Tenant] are supported.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   *
   *
   * <pre>
   * Strongly recommended for the best service experience.
   * If [update_mask][google.cloud.talent.v4beta1.UpdateTenantRequest.update_mask] is provided, only the specified fields in
   * [tenant][google.cloud.talent.v4beta1.UpdateTenantRequest.tenant] are updated. Otherwise all the fields are updated.
   * A field mask to specify the tenant fields to be updated. Only
   * top level fields of [Tenant][google.cloud.talent.v4beta1.Tenant] are supported.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
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
    if (tenant_ != null) {
      output.writeMessage(1, getTenant());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (tenant_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getTenant());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUpdateMask());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.talent.v4beta1.UpdateTenantRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.talent.v4beta1.UpdateTenantRequest other =
        (com.google.cloud.talent.v4beta1.UpdateTenantRequest) obj;

    if (hasTenant() != other.hasTenant()) return false;
    if (hasTenant()) {
      if (!getTenant().equals(other.getTenant())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasTenant()) {
      hash = (37 * hash) + TENANT_FIELD_NUMBER;
      hash = (53 * hash) + getTenant().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.talent.v4beta1.UpdateTenantRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.talent.v4beta1.UpdateTenantRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.UpdateTenantRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.talent.v4beta1.UpdateTenantRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.UpdateTenantRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.talent.v4beta1.UpdateTenantRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.UpdateTenantRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.talent.v4beta1.UpdateTenantRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.UpdateTenantRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.talent.v4beta1.UpdateTenantRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.UpdateTenantRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.talent.v4beta1.UpdateTenantRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.talent.v4beta1.UpdateTenantRequest prototype) {
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
   * Request for updating a specified tenant.
   * </pre>
   *
   * Protobuf type {@code google.cloud.talent.v4beta1.UpdateTenantRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.talent.v4beta1.UpdateTenantRequest)
      com.google.cloud.talent.v4beta1.UpdateTenantRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.talent.v4beta1.TenantServiceProto
          .internal_static_google_cloud_talent_v4beta1_UpdateTenantRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.talent.v4beta1.TenantServiceProto
          .internal_static_google_cloud_talent_v4beta1_UpdateTenantRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.talent.v4beta1.UpdateTenantRequest.class,
              com.google.cloud.talent.v4beta1.UpdateTenantRequest.Builder.class);
    }

    // Construct using com.google.cloud.talent.v4beta1.UpdateTenantRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (tenantBuilder_ == null) {
        tenant_ = null;
      } else {
        tenant_ = null;
        tenantBuilder_ = null;
      }
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.talent.v4beta1.TenantServiceProto
          .internal_static_google_cloud_talent_v4beta1_UpdateTenantRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.talent.v4beta1.UpdateTenantRequest getDefaultInstanceForType() {
      return com.google.cloud.talent.v4beta1.UpdateTenantRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.talent.v4beta1.UpdateTenantRequest build() {
      com.google.cloud.talent.v4beta1.UpdateTenantRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.talent.v4beta1.UpdateTenantRequest buildPartial() {
      com.google.cloud.talent.v4beta1.UpdateTenantRequest result =
          new com.google.cloud.talent.v4beta1.UpdateTenantRequest(this);
      if (tenantBuilder_ == null) {
        result.tenant_ = tenant_;
      } else {
        result.tenant_ = tenantBuilder_.build();
      }
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
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
      if (other instanceof com.google.cloud.talent.v4beta1.UpdateTenantRequest) {
        return mergeFrom((com.google.cloud.talent.v4beta1.UpdateTenantRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.talent.v4beta1.UpdateTenantRequest other) {
      if (other == com.google.cloud.talent.v4beta1.UpdateTenantRequest.getDefaultInstance())
        return this;
      if (other.hasTenant()) {
        mergeTenant(other.getTenant());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
                input.readMessage(getTenantFieldBuilder().getBuilder(), extensionRegistry);

                break;
              } // case 10
            case 18:
              {
                input.readMessage(getUpdateMaskFieldBuilder().getBuilder(), extensionRegistry);

                break;
              } // case 18
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private com.google.cloud.talent.v4beta1.Tenant tenant_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.talent.v4beta1.Tenant,
            com.google.cloud.talent.v4beta1.Tenant.Builder,
            com.google.cloud.talent.v4beta1.TenantOrBuilder>
        tenantBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The tenant resource to replace the current resource in the system.
     * </pre>
     *
     * <code>
     * .google.cloud.talent.v4beta1.Tenant tenant = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the tenant field is set.
     */
    public boolean hasTenant() {
      return tenantBuilder_ != null || tenant_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The tenant resource to replace the current resource in the system.
     * </pre>
     *
     * <code>
     * .google.cloud.talent.v4beta1.Tenant tenant = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The tenant.
     */
    public com.google.cloud.talent.v4beta1.Tenant getTenant() {
      if (tenantBuilder_ == null) {
        return tenant_ == null
            ? com.google.cloud.talent.v4beta1.Tenant.getDefaultInstance()
            : tenant_;
      } else {
        return tenantBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The tenant resource to replace the current resource in the system.
     * </pre>
     *
     * <code>
     * .google.cloud.talent.v4beta1.Tenant tenant = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setTenant(com.google.cloud.talent.v4beta1.Tenant value) {
      if (tenantBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        tenant_ = value;
        onChanged();
      } else {
        tenantBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The tenant resource to replace the current resource in the system.
     * </pre>
     *
     * <code>
     * .google.cloud.talent.v4beta1.Tenant tenant = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setTenant(com.google.cloud.talent.v4beta1.Tenant.Builder builderForValue) {
      if (tenantBuilder_ == null) {
        tenant_ = builderForValue.build();
        onChanged();
      } else {
        tenantBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The tenant resource to replace the current resource in the system.
     * </pre>
     *
     * <code>
     * .google.cloud.talent.v4beta1.Tenant tenant = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeTenant(com.google.cloud.talent.v4beta1.Tenant value) {
      if (tenantBuilder_ == null) {
        if (tenant_ != null) {
          tenant_ =
              com.google.cloud.talent.v4beta1.Tenant.newBuilder(tenant_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          tenant_ = value;
        }
        onChanged();
      } else {
        tenantBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The tenant resource to replace the current resource in the system.
     * </pre>
     *
     * <code>
     * .google.cloud.talent.v4beta1.Tenant tenant = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearTenant() {
      if (tenantBuilder_ == null) {
        tenant_ = null;
        onChanged();
      } else {
        tenant_ = null;
        tenantBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The tenant resource to replace the current resource in the system.
     * </pre>
     *
     * <code>
     * .google.cloud.talent.v4beta1.Tenant tenant = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.talent.v4beta1.Tenant.Builder getTenantBuilder() {

      onChanged();
      return getTenantFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The tenant resource to replace the current resource in the system.
     * </pre>
     *
     * <code>
     * .google.cloud.talent.v4beta1.Tenant tenant = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.talent.v4beta1.TenantOrBuilder getTenantOrBuilder() {
      if (tenantBuilder_ != null) {
        return tenantBuilder_.getMessageOrBuilder();
      } else {
        return tenant_ == null
            ? com.google.cloud.talent.v4beta1.Tenant.getDefaultInstance()
            : tenant_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The tenant resource to replace the current resource in the system.
     * </pre>
     *
     * <code>
     * .google.cloud.talent.v4beta1.Tenant tenant = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.talent.v4beta1.Tenant,
            com.google.cloud.talent.v4beta1.Tenant.Builder,
            com.google.cloud.talent.v4beta1.TenantOrBuilder>
        getTenantFieldBuilder() {
      if (tenantBuilder_ == null) {
        tenantBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.talent.v4beta1.Tenant,
                com.google.cloud.talent.v4beta1.Tenant.Builder,
                com.google.cloud.talent.v4beta1.TenantOrBuilder>(
                getTenant(), getParentForChildren(), isClean());
        tenant_ = null;
      }
      return tenantBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        updateMaskBuilder_;
    /**
     *
     *
     * <pre>
     * Strongly recommended for the best service experience.
     * If [update_mask][google.cloud.talent.v4beta1.UpdateTenantRequest.update_mask] is provided, only the specified fields in
     * [tenant][google.cloud.talent.v4beta1.UpdateTenantRequest.tenant] are updated. Otherwise all the fields are updated.
     * A field mask to specify the tenant fields to be updated. Only
     * top level fields of [Tenant][google.cloud.talent.v4beta1.Tenant] are supported.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     *
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     *
     *
     * <pre>
     * Strongly recommended for the best service experience.
     * If [update_mask][google.cloud.talent.v4beta1.UpdateTenantRequest.update_mask] is provided, only the specified fields in
     * [tenant][google.cloud.talent.v4beta1.UpdateTenantRequest.tenant] are updated. Otherwise all the fields are updated.
     * A field mask to specify the tenant fields to be updated. Only
     * top level fields of [Tenant][google.cloud.talent.v4beta1.Tenant] are supported.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     *
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Strongly recommended for the best service experience.
     * If [update_mask][google.cloud.talent.v4beta1.UpdateTenantRequest.update_mask] is provided, only the specified fields in
     * [tenant][google.cloud.talent.v4beta1.UpdateTenantRequest.tenant] are updated. Otherwise all the fields are updated.
     * A field mask to specify the tenant fields to be updated. Only
     * top level fields of [Tenant][google.cloud.talent.v4beta1.Tenant] are supported.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Strongly recommended for the best service experience.
     * If [update_mask][google.cloud.talent.v4beta1.UpdateTenantRequest.update_mask] is provided, only the specified fields in
     * [tenant][google.cloud.talent.v4beta1.UpdateTenantRequest.tenant] are updated. Otherwise all the fields are updated.
     * A field mask to specify the tenant fields to be updated. Only
     * top level fields of [Tenant][google.cloud.talent.v4beta1.Tenant] are supported.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Strongly recommended for the best service experience.
     * If [update_mask][google.cloud.talent.v4beta1.UpdateTenantRequest.update_mask] is provided, only the specified fields in
     * [tenant][google.cloud.talent.v4beta1.UpdateTenantRequest.tenant] are updated. Otherwise all the fields are updated.
     * A field mask to specify the tenant fields to be updated. Only
     * top level fields of [Tenant][google.cloud.talent.v4beta1.Tenant] are supported.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (updateMask_ != null) {
          updateMask_ =
              com.google.protobuf.FieldMask.newBuilder(updateMask_).mergeFrom(value).buildPartial();
        } else {
          updateMask_ = value;
        }
        onChanged();
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Strongly recommended for the best service experience.
     * If [update_mask][google.cloud.talent.v4beta1.UpdateTenantRequest.update_mask] is provided, only the specified fields in
     * [tenant][google.cloud.talent.v4beta1.UpdateTenantRequest.tenant] are updated. Otherwise all the fields are updated.
     * A field mask to specify the tenant fields to be updated. Only
     * top level fields of [Tenant][google.cloud.talent.v4beta1.Tenant] are supported.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder clearUpdateMask() {
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
        onChanged();
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Strongly recommended for the best service experience.
     * If [update_mask][google.cloud.talent.v4beta1.UpdateTenantRequest.update_mask] is provided, only the specified fields in
     * [tenant][google.cloud.talent.v4beta1.UpdateTenantRequest.tenant] are updated. Otherwise all the fields are updated.
     * A field mask to specify the tenant fields to be updated. Only
     * top level fields of [Tenant][google.cloud.talent.v4beta1.Tenant] are supported.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {

      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Strongly recommended for the best service experience.
     * If [update_mask][google.cloud.talent.v4beta1.UpdateTenantRequest.update_mask] is provided, only the specified fields in
     * [tenant][google.cloud.talent.v4beta1.UpdateTenantRequest.tenant] are updated. Otherwise all the fields are updated.
     * A field mask to specify the tenant fields to be updated. Only
     * top level fields of [Tenant][google.cloud.talent.v4beta1.Tenant] are supported.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      }
    }
    /**
     *
     *
     * <pre>
     * Strongly recommended for the best service experience.
     * If [update_mask][google.cloud.talent.v4beta1.UpdateTenantRequest.update_mask] is provided, only the specified fields in
     * [tenant][google.cloud.talent.v4beta1.UpdateTenantRequest.tenant] are updated. Otherwise all the fields are updated.
     * A field mask to specify the tenant fields to be updated. Only
     * top level fields of [Tenant][google.cloud.talent.v4beta1.Tenant] are supported.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(), getParentForChildren(), isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.talent.v4beta1.UpdateTenantRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.talent.v4beta1.UpdateTenantRequest)
  private static final com.google.cloud.talent.v4beta1.UpdateTenantRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.talent.v4beta1.UpdateTenantRequest();
  }

  public static com.google.cloud.talent.v4beta1.UpdateTenantRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateTenantRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateTenantRequest>() {
        @java.lang.Override
        public UpdateTenantRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<UpdateTenantRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateTenantRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.talent.v4beta1.UpdateTenantRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
