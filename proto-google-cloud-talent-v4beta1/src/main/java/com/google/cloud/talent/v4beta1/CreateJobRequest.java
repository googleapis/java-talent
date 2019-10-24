/*
 * Copyright 2019 Google LLC
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
// source: google/cloud/talent/v4beta1/job_service.proto

package com.google.cloud.talent.v4beta1;

/**
 *
 *
 * <pre>
 * Create job request.
 * </pre>
 *
 * Protobuf type {@code google.cloud.talent.v4beta1.CreateJobRequest}
 */
public final class CreateJobRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.talent.v4beta1.CreateJobRequest)
    CreateJobRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateJobRequest.newBuilder() to construct.
  private CreateJobRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateJobRequest() {
    parent_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CreateJobRequest(
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

              parent_ = s;
              break;
            }
          case 18:
            {
              com.google.cloud.talent.v4beta1.Job.Builder subBuilder = null;
              if (job_ != null) {
                subBuilder = job_.toBuilder();
              }
              job_ =
                  input.readMessage(
                      com.google.cloud.talent.v4beta1.Job.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(job_);
                job_ = subBuilder.buildPartial();
              }

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
    return com.google.cloud.talent.v4beta1.JobServiceProto
        .internal_static_google_cloud_talent_v4beta1_CreateJobRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.talent.v4beta1.JobServiceProto
        .internal_static_google_cloud_talent_v4beta1_CreateJobRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.talent.v4beta1.CreateJobRequest.class,
            com.google.cloud.talent.v4beta1.CreateJobRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Required. The resource name of the tenant under which the job is created.
   * The format is "projects/{project_id}/tenants/{tenant_id}". For example,
   * "projects/foo/tenant/bar". If tenant id is unspecified a default tenant
   * is created. For example, "projects/foo".
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The resource name of the tenant under which the job is created.
   * The format is "projects/{project_id}/tenants/{tenant_id}". For example,
   * "projects/foo/tenant/bar". If tenant id is unspecified a default tenant
   * is created. For example, "projects/foo".
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int JOB_FIELD_NUMBER = 2;
  private com.google.cloud.talent.v4beta1.Job job_;
  /**
   *
   *
   * <pre>
   * Required. The Job to be created.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Job job = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  public boolean hasJob() {
    return job_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The Job to be created.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Job job = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  public com.google.cloud.talent.v4beta1.Job getJob() {
    return job_ == null ? com.google.cloud.talent.v4beta1.Job.getDefaultInstance() : job_;
  }
  /**
   *
   *
   * <pre>
   * Required. The Job to be created.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Job job = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  public com.google.cloud.talent.v4beta1.JobOrBuilder getJobOrBuilder() {
    return getJob();
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
    if (!getParentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (job_ != null) {
      output.writeMessage(2, getJob());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getParentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (job_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getJob());
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
    if (!(obj instanceof com.google.cloud.talent.v4beta1.CreateJobRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.talent.v4beta1.CreateJobRequest other =
        (com.google.cloud.talent.v4beta1.CreateJobRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasJob() != other.hasJob()) return false;
    if (hasJob()) {
      if (!getJob().equals(other.getJob())) return false;
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
    if (hasJob()) {
      hash = (37 * hash) + JOB_FIELD_NUMBER;
      hash = (53 * hash) + getJob().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.talent.v4beta1.CreateJobRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.talent.v4beta1.CreateJobRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.CreateJobRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.talent.v4beta1.CreateJobRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.CreateJobRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.talent.v4beta1.CreateJobRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.CreateJobRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.talent.v4beta1.CreateJobRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.CreateJobRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.talent.v4beta1.CreateJobRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.CreateJobRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.talent.v4beta1.CreateJobRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.talent.v4beta1.CreateJobRequest prototype) {
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
   * Create job request.
   * </pre>
   *
   * Protobuf type {@code google.cloud.talent.v4beta1.CreateJobRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.talent.v4beta1.CreateJobRequest)
      com.google.cloud.talent.v4beta1.CreateJobRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.talent.v4beta1.JobServiceProto
          .internal_static_google_cloud_talent_v4beta1_CreateJobRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.talent.v4beta1.JobServiceProto
          .internal_static_google_cloud_talent_v4beta1_CreateJobRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.talent.v4beta1.CreateJobRequest.class,
              com.google.cloud.talent.v4beta1.CreateJobRequest.Builder.class);
    }

    // Construct using com.google.cloud.talent.v4beta1.CreateJobRequest.newBuilder()
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
      parent_ = "";

      if (jobBuilder_ == null) {
        job_ = null;
      } else {
        job_ = null;
        jobBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.talent.v4beta1.JobServiceProto
          .internal_static_google_cloud_talent_v4beta1_CreateJobRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.talent.v4beta1.CreateJobRequest getDefaultInstanceForType() {
      return com.google.cloud.talent.v4beta1.CreateJobRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.talent.v4beta1.CreateJobRequest build() {
      com.google.cloud.talent.v4beta1.CreateJobRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.talent.v4beta1.CreateJobRequest buildPartial() {
      com.google.cloud.talent.v4beta1.CreateJobRequest result =
          new com.google.cloud.talent.v4beta1.CreateJobRequest(this);
      result.parent_ = parent_;
      if (jobBuilder_ == null) {
        result.job_ = job_;
      } else {
        result.job_ = jobBuilder_.build();
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
      if (other instanceof com.google.cloud.talent.v4beta1.CreateJobRequest) {
        return mergeFrom((com.google.cloud.talent.v4beta1.CreateJobRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.talent.v4beta1.CreateJobRequest other) {
      if (other == com.google.cloud.talent.v4beta1.CreateJobRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasJob()) {
        mergeJob(other.getJob());
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
      com.google.cloud.talent.v4beta1.CreateJobRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.talent.v4beta1.CreateJobRequest) e.getUnfinishedMessage();
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
     *
     *
     * <pre>
     * Required. The resource name of the tenant under which the job is created.
     * The format is "projects/{project_id}/tenants/{tenant_id}". For example,
     * "projects/foo/tenant/bar". If tenant id is unspecified a default tenant
     * is created. For example, "projects/foo".
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the tenant under which the job is created.
     * The format is "projects/{project_id}/tenants/{tenant_id}". For example,
     * "projects/foo/tenant/bar". If tenant id is unspecified a default tenant
     * is created. For example, "projects/foo".
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the tenant under which the job is created.
     * The format is "projects/{project_id}/tenants/{tenant_id}". For example,
     * "projects/foo/tenant/bar". If tenant id is unspecified a default tenant
     * is created. For example, "projects/foo".
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      parent_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the tenant under which the job is created.
     * The format is "projects/{project_id}/tenants/{tenant_id}". For example,
     * "projects/foo/tenant/bar". If tenant id is unspecified a default tenant
     * is created. For example, "projects/foo".
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearParent() {

      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the tenant under which the job is created.
     * The format is "projects/{project_id}/tenants/{tenant_id}". For example,
     * "projects/foo/tenant/bar". If tenant id is unspecified a default tenant
     * is created. For example, "projects/foo".
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      parent_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.talent.v4beta1.Job job_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.talent.v4beta1.Job,
            com.google.cloud.talent.v4beta1.Job.Builder,
            com.google.cloud.talent.v4beta1.JobOrBuilder>
        jobBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The Job to be created.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.Job job = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public boolean hasJob() {
      return jobBuilder_ != null || job_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The Job to be created.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.Job job = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.talent.v4beta1.Job getJob() {
      if (jobBuilder_ == null) {
        return job_ == null ? com.google.cloud.talent.v4beta1.Job.getDefaultInstance() : job_;
      } else {
        return jobBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The Job to be created.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.Job job = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setJob(com.google.cloud.talent.v4beta1.Job value) {
      if (jobBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        job_ = value;
        onChanged();
      } else {
        jobBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The Job to be created.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.Job job = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setJob(com.google.cloud.talent.v4beta1.Job.Builder builderForValue) {
      if (jobBuilder_ == null) {
        job_ = builderForValue.build();
        onChanged();
      } else {
        jobBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The Job to be created.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.Job job = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeJob(com.google.cloud.talent.v4beta1.Job value) {
      if (jobBuilder_ == null) {
        if (job_ != null) {
          job_ =
              com.google.cloud.talent.v4beta1.Job.newBuilder(job_).mergeFrom(value).buildPartial();
        } else {
          job_ = value;
        }
        onChanged();
      } else {
        jobBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The Job to be created.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.Job job = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearJob() {
      if (jobBuilder_ == null) {
        job_ = null;
        onChanged();
      } else {
        job_ = null;
        jobBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The Job to be created.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.Job job = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.talent.v4beta1.Job.Builder getJobBuilder() {

      onChanged();
      return getJobFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The Job to be created.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.Job job = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.talent.v4beta1.JobOrBuilder getJobOrBuilder() {
      if (jobBuilder_ != null) {
        return jobBuilder_.getMessageOrBuilder();
      } else {
        return job_ == null ? com.google.cloud.talent.v4beta1.Job.getDefaultInstance() : job_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The Job to be created.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.Job job = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.talent.v4beta1.Job,
            com.google.cloud.talent.v4beta1.Job.Builder,
            com.google.cloud.talent.v4beta1.JobOrBuilder>
        getJobFieldBuilder() {
      if (jobBuilder_ == null) {
        jobBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.talent.v4beta1.Job,
                com.google.cloud.talent.v4beta1.Job.Builder,
                com.google.cloud.talent.v4beta1.JobOrBuilder>(
                getJob(), getParentForChildren(), isClean());
        job_ = null;
      }
      return jobBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.talent.v4beta1.CreateJobRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.talent.v4beta1.CreateJobRequest)
  private static final com.google.cloud.talent.v4beta1.CreateJobRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.talent.v4beta1.CreateJobRequest();
  }

  public static com.google.cloud.talent.v4beta1.CreateJobRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateJobRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateJobRequest>() {
        @java.lang.Override
        public CreateJobRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CreateJobRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CreateJobRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateJobRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.talent.v4beta1.CreateJobRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
