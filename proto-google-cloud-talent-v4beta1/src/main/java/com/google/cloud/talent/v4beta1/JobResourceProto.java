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
// source: google/cloud/talent/v4beta1/job.proto

package com.google.cloud.talent.v4beta1;

public final class JobResourceProto {
  private JobResourceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_Job_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_Job_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_Job_ApplicationInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_Job_ApplicationInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_Job_DerivedInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_Job_DerivedInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_Job_ProcessingOptions_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_Job_ProcessingOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_Job_CustomAttributesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_Job_CustomAttributesEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n%google/cloud/talent/v4beta1/job.proto\022"
          + "\033google.cloud.talent.v4beta1\032\037google/api"
          + "/field_behavior.proto\032\031google/api/resour"
          + "ce.proto\032(google/cloud/talent/v4beta1/co"
          + "mmon.proto\032\037google/protobuf/timestamp.pr"
          + "oto\032 google/type/postal_address.proto\032\034g"
          + "oogle/api/annotations.proto\"\340\017\n\003Job\022\014\n\004n"
          + "ame\030\001 \001(\t\0224\n\007company\030\002 \001(\tB#\340A\002\372A\035\n\033jobs"
          + ".googleapis.com/Company\022\033\n\016requisition_i"
          + "d\030\003 \001(\tB\003\340A\002\022\022\n\005title\030\004 \001(\tB\003\340A\002\022\030\n\013desc"
          + "ription\030\005 \001(\tB\003\340A\002\022\021\n\taddresses\030\006 \003(\t\022J\n"
          + "\020application_info\030\007 \001(\01320.google.cloud.t"
          + "alent.v4beta1.Job.ApplicationInfo\022=\n\014job"
          + "_benefits\030\010 \003(\0162\'.google.cloud.talent.v4"
          + "beta1.JobBenefit\022H\n\021compensation_info\030\t "
          + "\001(\0132-.google.cloud.talent.v4beta1.Compen"
          + "sationInfo\022Q\n\021custom_attributes\030\n \003(\01326."
          + "google.cloud.talent.v4beta1.Job.CustomAt"
          + "tributesEntry\022=\n\014degree_types\030\013 \003(\0162\'.go"
          + "ogle.cloud.talent.v4beta1.DegreeType\022\022\n\n"
          + "department\030\014 \001(\t\022E\n\020employment_types\030\r \003"
          + "(\0162+.google.cloud.talent.v4beta1.Employm"
          + "entType\022\022\n\nincentives\030\016 \001(\t\022\025\n\rlanguage_"
          + "code\030\017 \001(\t\0228\n\tjob_level\030\020 \001(\0162%.google.c"
          + "loud.talent.v4beta1.JobLevel\022\027\n\017promotio"
          + "n_value\030\021 \001(\005\022\026\n\016qualifications\030\022 \001(\t\022\030\n"
          + "\020responsibilities\030\023 \001(\t\022B\n\016posting_regio"
          + "n\030\024 \001(\0162*.google.cloud.talent.v4beta1.Po"
          + "stingRegion\022?\n\nvisibility\030\025 \001(\0162\'.google"
          + ".cloud.talent.v4beta1.VisibilityB\002\030\001\0222\n\016"
          + "job_start_time\030\026 \001(\0132\032.google.protobuf.T"
          + "imestamp\0220\n\014job_end_time\030\027 \001(\0132\032.google."
          + "protobuf.Timestamp\0228\n\024posting_publish_ti"
          + "me\030\030 \001(\0132\032.google.protobuf.Timestamp\0227\n\023"
          + "posting_expire_time\030\031 \001(\0132\032.google.proto"
          + "buf.Timestamp\022<\n\023posting_create_time\030\032 \001"
          + "(\0132\032.google.protobuf.TimestampB\003\340A\003\022<\n\023p"
          + "osting_update_time\030\033 \001(\0132\032.google.protob"
          + "uf.TimestampB\003\340A\003\022!\n\024company_display_nam"
          + "e\030\034 \001(\tB\003\340A\003\022G\n\014derived_info\030\035 \001(\0132,.goo"
          + "gle.cloud.talent.v4beta1.Job.DerivedInfo"
          + "B\003\340A\003\022N\n\022processing_options\030\036 \001(\01322.goog"
          + "le.cloud.talent.v4beta1.Job.ProcessingOp"
          + "tions\032D\n\017ApplicationInfo\022\016\n\006emails\030\001 \003(\t"
          + "\022\023\n\013instruction\030\002 \001(\t\022\014\n\004uris\030\003 \003(\t\032\211\001\n\013"
          + "DerivedInfo\0228\n\tlocations\030\001 \003(\0132%.google."
          + "cloud.talent.v4beta1.Location\022@\n\016job_cat"
          + "egories\030\003 \003(\0162(.google.cloud.talent.v4be"
          + "ta1.JobCategory\032\210\001\n\021ProcessingOptions\022)\n"
          + "!disable_street_address_resolution\030\001 \001(\010"
          + "\022H\n\021html_sanitization\030\002 \001(\0162-.google.clo"
          + "ud.talent.v4beta1.HtmlSanitization\032e\n\025Cu"
          + "stomAttributesEntry\022\013\n\003key\030\001 \001(\t\022;\n\005valu"
          + "e\030\002 \001(\0132,.google.cloud.talent.v4beta1.Cu"
          + "stomAttribute:\0028\001:k\352Ah\n\027jobs.googleapis."
          + "com/Job\022\035projects/{project}/jobs/{job}\022."
          + "projects/{project}/tenants/{tenant}/jobs"
          + "/{job}B~\n\037com.google.cloud.talent.v4beta"
          + "1B\020JobResourceProtoP\001ZAgoogle.golang.org"
          + "/genproto/googleapis/cloud/talent/v4beta"
          + "1;talent\242\002\003CTSb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.talent.v4beta1.CommonProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.type.PostalAddressProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_cloud_talent_v4beta1_Job_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_talent_v4beta1_Job_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_Job_descriptor,
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
    internal_static_google_cloud_talent_v4beta1_Job_ApplicationInfo_descriptor =
        internal_static_google_cloud_talent_v4beta1_Job_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_talent_v4beta1_Job_ApplicationInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_Job_ApplicationInfo_descriptor,
            new java.lang.String[] {
              "Emails", "Instruction", "Uris",
            });
    internal_static_google_cloud_talent_v4beta1_Job_DerivedInfo_descriptor =
        internal_static_google_cloud_talent_v4beta1_Job_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_talent_v4beta1_Job_DerivedInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_Job_DerivedInfo_descriptor,
            new java.lang.String[] {
              "Locations", "JobCategories",
            });
    internal_static_google_cloud_talent_v4beta1_Job_ProcessingOptions_descriptor =
        internal_static_google_cloud_talent_v4beta1_Job_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_talent_v4beta1_Job_ProcessingOptions_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_Job_ProcessingOptions_descriptor,
            new java.lang.String[] {
              "DisableStreetAddressResolution", "HtmlSanitization",
            });
    internal_static_google_cloud_talent_v4beta1_Job_CustomAttributesEntry_descriptor =
        internal_static_google_cloud_talent_v4beta1_Job_descriptor.getNestedTypes().get(3);
    internal_static_google_cloud_talent_v4beta1_Job_CustomAttributesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_Job_CustomAttributesEntry_descriptor,
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
    com.google.cloud.talent.v4beta1.CommonProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.type.PostalAddressProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
