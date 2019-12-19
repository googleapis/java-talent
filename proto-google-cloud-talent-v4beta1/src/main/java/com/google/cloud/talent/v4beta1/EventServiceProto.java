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
// source: google/cloud/talent/v4beta1/event_service.proto

package com.google.cloud.talent.v4beta1;

public final class EventServiceProto {
  private EventServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_CreateClientEventRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_CreateClientEventRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n/google/cloud/talent/v4beta1/event_serv"
          + "ice.proto\022\033google.cloud.talent.v4beta1\032\034"
          + "google/api/annotations.proto\032\027google/api"
          + "/client.proto\032\037google/api/field_behavior"
          + ".proto\032\'google/cloud/talent/v4beta1/even"
          + "t.proto\"t\n\030CreateClientEventRequest\022\023\n\006p"
          + "arent\030\001 \001(\tB\003\340A\002\022C\n\014client_event\030\002 \001(\0132("
          + ".google.cloud.talent.v4beta1.ClientEvent"
          + "B\003\340A\0022\343\002\n\014EventService\022\344\001\n\021CreateClientE"
          + "vent\0225.google.cloud.talent.v4beta1.Creat"
          + "eClientEventRequest\032(.google.cloud.talen"
          + "t.v4beta1.ClientEvent\"n\202\323\344\223\002h\"3/v4beta1/"
          + "{parent=projects/*/tenants/*}/clientEven"
          + "ts:\001*Z.\")/v4beta1/{parent=projects/*}/cl"
          + "ientEvents:\001*\032l\312A\023jobs.googleapis.com\322AS"
          + "https://www.googleapis.com/auth/cloud-pl"
          + "atform,https://www.googleapis.com/auth/j"
          + "obsB\177\n\037com.google.cloud.talent.v4beta1B\021"
          + "EventServiceProtoP\001ZAgoogle.golang.org/g"
          + "enproto/googleapis/cloud/talent/v4beta1;"
          + "talent\242\002\003CTSb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.cloud.talent.v4beta1.EventProto.getDescriptor(),
            });
    internal_static_google_cloud_talent_v4beta1_CreateClientEventRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_talent_v4beta1_CreateClientEventRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_CreateClientEventRequest_descriptor,
            new java.lang.String[] {
              "Parent", "ClientEvent",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.cloud.talent.v4beta1.EventProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
