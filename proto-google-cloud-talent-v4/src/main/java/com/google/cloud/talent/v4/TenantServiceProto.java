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
// source: google/cloud/talent/v4/tenant_service.proto

package com.google.cloud.talent.v4;

public final class TenantServiceProto {
  private TenantServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4_CreateTenantRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4_CreateTenantRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4_GetTenantRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4_GetTenantRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4_UpdateTenantRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4_UpdateTenantRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4_DeleteTenantRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4_DeleteTenantRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4_ListTenantsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4_ListTenantsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4_ListTenantsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4_ListTenantsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n+google/cloud/talent/v4/tenant_service."
          + "proto\022\026google.cloud.talent.v4\032\034google/ap"
          + "i/annotations.proto\032\027google/api/client.p"
          + "roto\032\037google/api/field_behavior.proto\032\031g"
          + "oogle/api/resource.proto\032#google/cloud/t"
          + "alent/v4/common.proto\032#google/cloud/tale"
          + "nt/v4/tenant.proto\032\033google/protobuf/empt"
          + "y.proto\032 google/protobuf/field_mask.prot"
          + "o\"\217\001\n\023CreateTenantRequest\022C\n\006parent\030\001 \001("
          + "\tB3\340A\002\372A-\n+cloudresourcemanager.googleap"
          + "is.com/Project\0223\n\006tenant\030\002 \001(\0132\036.google."
          + "cloud.talent.v4.TenantB\003\340A\002\"D\n\020GetTenant"
          + "Request\0220\n\004name\030\001 \001(\tB\"\340A\002\372A\034\n\032jobs.goog"
          + "leapis.com/Tenant\"{\n\023UpdateTenantRequest"
          + "\0223\n\006tenant\030\001 \001(\0132\036.google.cloud.talent.v"
          + "4.TenantB\003\340A\002\022/\n\013update_mask\030\002 \001(\0132\032.goo"
          + "gle.protobuf.FieldMask\"G\n\023DeleteTenantRe"
          + "quest\0220\n\004name\030\001 \001(\tB\"\340A\002\372A\034\n\032jobs.google"
          + "apis.com/Tenant\"\200\001\n\022ListTenantsRequest\022C"
          + "\n\006parent\030\001 \001(\tB3\340A\002\372A-\n+cloudresourceman"
          + "ager.googleapis.com/Project\022\022\n\npage_toke"
          + "n\030\002 \001(\t\022\021\n\tpage_size\030\003 \001(\005\"\233\001\n\023ListTenan"
          + "tsResponse\022/\n\007tenants\030\001 \003(\0132\036.google.clo"
          + "ud.talent.v4.Tenant\022\027\n\017next_page_token\030\002"
          + " \001(\t\022:\n\010metadata\030\003 \001(\0132(.google.cloud.ta"
          + "lent.v4.ResponseMetadata2\360\006\n\rTenantServi"
          + "ce\022\234\001\n\014CreateTenant\022+.google.cloud.talen"
          + "t.v4.CreateTenantRequest\032\036.google.cloud."
          + "talent.v4.Tenant\"?\202\323\344\223\002)\"\037/v4/{parent=pr"
          + "ojects/*}/tenants:\006tenant\332A\rparent,tenan"
          + "t\022\205\001\n\tGetTenant\022(.google.cloud.talent.v4"
          + ".GetTenantRequest\032\036.google.cloud.talent."
          + "v4.Tenant\".\202\323\344\223\002!\022\037/v4/{name=projects/*/"
          + "tenants/*}\332A\004name\022\250\001\n\014UpdateTenant\022+.goo"
          + "gle.cloud.talent.v4.UpdateTenantRequest\032"
          + "\036.google.cloud.talent.v4.Tenant\"K\202\323\344\223\00202"
          + "&/v4/{tenant.name=projects/*/tenants/*}:"
          + "\006tenant\332A\022tenant,update_mask\022\203\001\n\014DeleteT"
          + "enant\022+.google.cloud.talent.v4.DeleteTen"
          + "antRequest\032\026.google.protobuf.Empty\".\202\323\344\223"
          + "\002!*\037/v4/{name=projects/*/tenants/*}\332A\004na"
          + "me\022\230\001\n\013ListTenants\022*.google.cloud.talent"
          + ".v4.ListTenantsRequest\032+.google.cloud.ta"
          + "lent.v4.ListTenantsResponse\"0\202\323\344\223\002!\022\037/v4"
          + "/{parent=projects/*}/tenants\332A\006parent\032l\312"
          + "A\023jobs.googleapis.com\322AShttps://www.goog"
          + "leapis.com/auth/cloud-platform,https://w"
          + "ww.googleapis.com/auth/jobsBl\n\032com.googl"
          + "e.cloud.talent.v4B\022TenantServiceProtoP\001Z"
          + "2cloud.google.com/go/talent/apiv4/talent"
          + "pb;talentpb\242\002\003CTSb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.talent.v4.CommonProto.getDescriptor(),
              com.google.cloud.talent.v4.TenantProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_cloud_talent_v4_CreateTenantRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_talent_v4_CreateTenantRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4_CreateTenantRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Tenant",
            });
    internal_static_google_cloud_talent_v4_GetTenantRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_talent_v4_GetTenantRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4_GetTenantRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_talent_v4_UpdateTenantRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_talent_v4_UpdateTenantRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4_UpdateTenantRequest_descriptor,
            new java.lang.String[] {
              "Tenant", "UpdateMask",
            });
    internal_static_google_cloud_talent_v4_DeleteTenantRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_talent_v4_DeleteTenantRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4_DeleteTenantRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_talent_v4_ListTenantsRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_talent_v4_ListTenantsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4_ListTenantsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageToken", "PageSize",
            });
    internal_static_google_cloud_talent_v4_ListTenantsResponse_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_talent_v4_ListTenantsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4_ListTenantsResponse_descriptor,
            new java.lang.String[] {
              "Tenants", "NextPageToken", "Metadata",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.talent.v4.CommonProto.getDescriptor();
    com.google.cloud.talent.v4.TenantProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
