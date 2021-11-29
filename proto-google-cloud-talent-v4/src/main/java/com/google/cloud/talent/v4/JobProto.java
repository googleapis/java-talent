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
// source: google/cloud/talent/v4/job.proto

package com.google.cloud.talent.v4;

public final class JobProto {
  private JobProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4_Job_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4_Job_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4_Job_ApplicationInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4_Job_ApplicationInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4_Job_DerivedInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4_Job_DerivedInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4_Job_ProcessingOptions_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4_Job_ProcessingOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4_Job_CustomAttributesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4_Job_CustomAttributesEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + " google/cloud/talent/v4/job.proto\022\026goog"
          + "le.cloud.talent.v4\032\037google/api/field_beh"
          + "avior.proto\032\031google/api/resource.proto\032#"
          + "google/cloud/talent/v4/common.proto\032\037goo"
          + "gle/protobuf/timestamp.proto\032\034google/api/annotations.proto\"\365\016\n"
          + "\003Job\022\014\n"
          + "\004name\030\001 \001(\t\0224\n"
          + "\007company\030\002 \001(\tB#\340A\002\372A\035\n"
          + "\033jobs.googleapis.com/Company\022\033\n"
          + "\016requisition_id\030\003 \001(\tB\003\340A\002\022\022\n"
          + "\005title\030\004 \001(\tB\003\340A\002\022\030\n"
          + "\013description\030\005 \001(\tB\003\340A\002\022\021\n"
          + "\taddresses\030\006 \003(\t\022E\n"
          + "\020application_info\030\007"
          + " \001(\0132+.google.cloud.talent.v4.Job.ApplicationInfo\0228\n"
          + "\014job_benefits\030\010 \003(\0162\".google.cloud.talent.v4.JobBenefit\022C\n"
          + "\021compensation_info\030\t \001(\0132(.google.cloud.talent.v4.CompensationInfo\022L\n"
          + "\021custom_attributes\030\n"
          + " \003(\01321.google.cloud.talent.v4.Job.CustomAttributesEntry\0228\n"
          + "\014degree_types\030\013 \003(\0162\".google.cloud.talent.v4.DegreeType\022\022\n\n"
          + "department\030\014 \001(\t\022@\n"
          + "\020employment_types\030\r"
          + " \003(\0162&.google.cloud.talent.v4.EmploymentType\022\022\n\n"
          + "incentives\030\016 \001(\t\022\025\n\r"
          + "language_code\030\017 \001(\t\0223\n"
          + "\tjob_level\030\020 \001(\0162 .google.cloud.talent.v4.JobLevel\022\027\n"
          + "\017promotion_value\030\021 \001(\005\022\026\n"
          + "\016qualifications\030\022 \001(\t\022\030\n"
          + "\020responsibilities\030\023 \001(\t\022=\n"
          + "\016posting_region\030\024 \001(\0162%.google.cloud.talent.v4.PostingRegion\022:\n\n"
          + "visibility\030\025 \001(\0162\".google.cloud.talent.v4.VisibilityB\002\030\001\0222\n"
          + "\016job_start_time\030\026 \001(\0132\032.google.protobuf.Timestamp\0220\n"
          + "\014job_end_time\030\027 \001(\0132\032.google.protobuf.Timestamp\0228\n"
          + "\024posting_publish_time\030\030 \001(\0132\032.google.protobuf.Timestamp\0227\n"
          + "\023posting_expire_time\030\031 \001(\0132\032.google.protobuf.Timestamp\022<\n"
          + "\023posting_create_time\030\032"
          + " \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022<\n"
          + "\023posting_update_time\030\033"
          + " \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022!\n"
          + "\024company_display_name\030\034 \001(\tB\003\340A\003\022B\n"
          + "\014derived_info\030\035"
          + " \001(\0132\'.google.cloud.talent.v4.Job.DerivedInfoB\003\340A\003\022I\n"
          + "\022processing_options\030\036"
          + " \001(\0132-.google.cloud.talent.v4.Job.ProcessingOptions\032D\n"
          + "\017ApplicationInfo\022\016\n"
          + "\006emails\030\001 \003(\t\022\023\n"
          + "\013instruction\030\002 \001(\t\022\014\n"
          + "\004uris\030\003 \003(\t\032\177\n"
          + "\013DerivedInfo\0223\n"
          + "\tlocations\030\001 \003(\0132 .google.cloud.talent.v4.Location\022;\n"
          + "\016job_categories\030\003"
          + " \003(\0162#.google.cloud.talent.v4.JobCategory\032\203\001\n"
          + "\021ProcessingOptions\022)\n"
          + "!disable_street_address_resolution\030\001 \001(\010\022C\n"
          + "\021html_sanitization\030\002"
          + " \001(\0162(.google.cloud.talent.v4.HtmlSanitization\032`\n"
          + "\025CustomAttributesEntry\022\013\n"
          + "\003key\030\001 \001(\t\0226\n"
          + "\005value\030\002"
          + " \001(\0132\'.google.cloud.talent.v4.CustomAttribute:\0028\001:L\352AI\n"
          + "\027jobs.googleapis.com/Job\022.projects/{project}/tenants/{tenant}/jobs/{job}Bl\n"
          + "\032com.google.cloud.talent.v4B\010JobProtoP\001Z<google.golang.org/genproto"
          + "/googleapis/cloud/talent/v4;talent\242\002\003CTSb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.talent.v4.CommonProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_cloud_talent_v4_Job_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_talent_v4_Job_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4_Job_descriptor,
            new java.lang.String[] {
              "Name",
              "Company",
              "RequisitionId",
              "Title",
              "Description",
              "Addresses",
              "ApplicationInfo",
              "JobBenefits",
              "CompensationInfo",
              "CustomAttributes",
              "DegreeTypes",
              "Department",
              "EmploymentTypes",
              "Incentives",
              "LanguageCode",
              "JobLevel",
              "PromotionValue",
              "Qualifications",
              "Responsibilities",
              "PostingRegion",
              "Visibility",
              "JobStartTime",
              "JobEndTime",
              "PostingPublishTime",
              "PostingExpireTime",
              "PostingCreateTime",
              "PostingUpdateTime",
              "CompanyDisplayName",
              "DerivedInfo",
              "ProcessingOptions",
            });
    internal_static_google_cloud_talent_v4_Job_ApplicationInfo_descriptor =
        internal_static_google_cloud_talent_v4_Job_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_talent_v4_Job_ApplicationInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4_Job_ApplicationInfo_descriptor,
            new java.lang.String[] {
              "Emails", "Instruction", "Uris",
            });
    internal_static_google_cloud_talent_v4_Job_DerivedInfo_descriptor =
        internal_static_google_cloud_talent_v4_Job_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_talent_v4_Job_DerivedInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4_Job_DerivedInfo_descriptor,
            new java.lang.String[] {
              "Locations", "JobCategories",
            });
    internal_static_google_cloud_talent_v4_Job_ProcessingOptions_descriptor =
        internal_static_google_cloud_talent_v4_Job_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_talent_v4_Job_ProcessingOptions_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4_Job_ProcessingOptions_descriptor,
            new java.lang.String[] {
              "DisableStreetAddressResolution", "HtmlSanitization",
            });
    internal_static_google_cloud_talent_v4_Job_CustomAttributesEntry_descriptor =
        internal_static_google_cloud_talent_v4_Job_descriptor.getNestedTypes().get(3);
    internal_static_google_cloud_talent_v4_Job_CustomAttributesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4_Job_CustomAttributesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.talent.v4.CommonProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
