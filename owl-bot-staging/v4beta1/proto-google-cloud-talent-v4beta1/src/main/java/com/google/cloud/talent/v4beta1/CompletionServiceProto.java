// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/completion_service.proto

package com.google.cloud.talent.v4beta1;

public final class CompletionServiceProto {
  private CompletionServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_talent_v4beta1_CompleteQueryRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_CompleteQueryRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_talent_v4beta1_CompleteQueryResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_CompleteQueryResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_talent_v4beta1_CompleteQueryResponse_CompletionResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_CompleteQueryResponse_CompletionResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4google/cloud/talent/v4beta1/completion" +
      "_service.proto\022\033google.cloud.talent.v4be" +
      "ta1\032\034google/api/annotations.proto\032\037googl" +
      "e/api/field_behavior.proto\032\031google/api/r" +
      "esource.proto\032(google/cloud/talent/v4bet" +
      "a1/common.proto\032\027google/api/client.proto" +
      "\"\223\004\n\024CompleteQueryRequest\0223\n\006parent\030\001 \001(" +
      "\tB#\340A\002\372A\035\022\033jobs.googleapis.com/Company\022\022" +
      "\n\005query\030\002 \001(\tB\003\340A\002\022\026\n\016language_codes\030\003 \003" +
      "(\t\022\026\n\tpage_size\030\004 \001(\005B\003\340A\002\0221\n\007company\030\005 " +
      "\001(\tB \372A\035\n\033jobs.googleapis.com/Company\022P\n" +
      "\005scope\030\006 \001(\0162A.google.cloud.talent.v4bet" +
      "a1.CompleteQueryRequest.CompletionScope\022" +
      "N\n\004type\030\007 \001(\0162@.google.cloud.talent.v4be" +
      "ta1.CompleteQueryRequest.CompletionType\"" +
      "K\n\017CompletionScope\022 \n\034COMPLETION_SCOPE_U" +
      "NSPECIFIED\020\000\022\n\n\006TENANT\020\001\022\n\n\006PUBLIC\020\002\"`\n\016" +
      "CompletionType\022\037\n\033COMPLETION_TYPE_UNSPEC" +
      "IFIED\020\000\022\r\n\tJOB_TITLE\020\001\022\020\n\014COMPANY_NAME\020\002" +
      "\022\014\n\010COMBINED\020\003\"\305\002\n\025CompleteQueryResponse" +
      "\022_\n\022completion_results\030\001 \003(\0132C.google.cl" +
      "oud.talent.v4beta1.CompleteQueryResponse" +
      ".CompletionResult\022?\n\010metadata\030\002 \001(\0132-.go" +
      "ogle.cloud.talent.v4beta1.ResponseMetada" +
      "ta\032\211\001\n\020CompletionResult\022\022\n\nsuggestion\030\001 " +
      "\001(\t\022N\n\004type\030\002 \001(\0162@.google.cloud.talent." +
      "v4beta1.CompleteQueryRequest.CompletionT" +
      "ype\022\021\n\timage_uri\030\003 \001(\t2\325\002\n\nCompletion\022\330\001" +
      "\n\rCompleteQuery\0221.google.cloud.talent.v4" +
      "beta1.CompleteQueryRequest\0322.google.clou" +
      "d.talent.v4beta1.CompleteQueryResponse\"`" +
      "\202\323\344\223\002Z\022//v4beta1/{parent=projects/*/tena" +
      "nts/*}:completeZ\'\022%/v4beta1/{parent=proj" +
      "ects/*}:complete\032l\312A\023jobs.googleapis.com" +
      "\322AShttps://www.googleapis.com/auth/cloud" +
      "-platform,https://www.googleapis.com/aut" +
      "h/jobsB\204\001\n\037com.google.cloud.talent.v4bet" +
      "a1B\026CompletionServiceProtoP\001ZAgoogle.gol" +
      "ang.org/genproto/googleapis/cloud/talent" +
      "/v4beta1;talent\242\002\003CTSb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.talent.v4beta1.CommonProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
        });
    internal_static_google_cloud_talent_v4beta1_CompleteQueryRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_talent_v4beta1_CompleteQueryRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_talent_v4beta1_CompleteQueryRequest_descriptor,
        new java.lang.String[] { "Parent", "Query", "LanguageCodes", "PageSize", "Company", "Scope", "Type", });
    internal_static_google_cloud_talent_v4beta1_CompleteQueryResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_talent_v4beta1_CompleteQueryResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_talent_v4beta1_CompleteQueryResponse_descriptor,
        new java.lang.String[] { "CompletionResults", "Metadata", });
    internal_static_google_cloud_talent_v4beta1_CompleteQueryResponse_CompletionResult_descriptor =
      internal_static_google_cloud_talent_v4beta1_CompleteQueryResponse_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_talent_v4beta1_CompleteQueryResponse_CompletionResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_talent_v4beta1_CompleteQueryResponse_CompletionResult_descriptor,
        new java.lang.String[] { "Suggestion", "Type", "ImageUri", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.talent.v4beta1.CommonProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
