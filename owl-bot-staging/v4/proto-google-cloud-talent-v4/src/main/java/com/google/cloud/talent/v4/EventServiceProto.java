// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4/event_service.proto

package com.google.cloud.talent.v4;

public final class EventServiceProto {
  private EventServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_talent_v4_CreateClientEventRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4_CreateClientEventRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*google/cloud/talent/v4/event_service.p" +
      "roto\022\026google.cloud.talent.v4\032\034google/api" +
      "/annotations.proto\032\027google/api/client.pr" +
      "oto\032\037google/api/field_behavior.proto\032\031go" +
      "ogle/api/resource.proto\032\"google/cloud/ta" +
      "lent/v4/event.proto\"\216\001\n\030CreateClientEven" +
      "tRequest\0222\n\006parent\030\001 \001(\tB\"\340A\002\372A\034\n\032jobs.g" +
      "oogleapis.com/Tenant\022>\n\014client_event\030\002 \001" +
      "(\0132#.google.cloud.talent.v4.ClientEventB" +
      "\003\340A\0022\305\002\n\014EventService\022\306\001\n\021CreateClientEv" +
      "ent\0220.google.cloud.talent.v4.CreateClien" +
      "tEventRequest\032#.google.cloud.talent.v4.C" +
      "lientEvent\"Z\202\323\344\223\002>\"./v4/{parent=projects" +
      "/*/tenants/*}/clientEvents:\014client_event" +
      "\332A\023parent,client_event\032l\312A\023jobs.googleap" +
      "is.com\322AShttps://www.googleapis.com/auth" +
      "/cloud-platform,https://www.googleapis.c" +
      "om/auth/jobsBk\n\032com.google.cloud.talent." +
      "v4B\021EventServiceProtoP\001Z2cloud.google.co" +
      "m/go/talent/apiv4/talentpb;talentpb\242\002\003CT" +
      "Sb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.talent.v4.EventProto.getDescriptor(),
        });
    internal_static_google_cloud_talent_v4_CreateClientEventRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_talent_v4_CreateClientEventRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_talent_v4_CreateClientEventRequest_descriptor,
        new java.lang.String[] { "Parent", "ClientEvent", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.talent.v4.EventProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
