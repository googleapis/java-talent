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
// source: google/cloud/talent/v4beta1/filters.proto

package com.google.cloud.talent.v4beta1;

public interface ApplicationJobFilterOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4beta1.ApplicationJobFilter)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The job requisition id in the application. The API does an exact match on
   * the [Job.requisition_id][google.cloud.talent.v4beta1.Job.requisition_id] of
   * [Application.job][google.cloud.talent.v4beta1.Application.job] in profiles.
   * </pre>
   *
   * <code>string job_requisition_id = 2;</code>
   */
  java.lang.String getJobRequisitionId();
  /**
   *
   *
   * <pre>
   * The job requisition id in the application. The API does an exact match on
   * the [Job.requisition_id][google.cloud.talent.v4beta1.Job.requisition_id] of
   * [Application.job][google.cloud.talent.v4beta1.Application.job] in profiles.
   * </pre>
   *
   * <code>string job_requisition_id = 2;</code>
   */
  com.google.protobuf.ByteString getJobRequisitionIdBytes();

  /**
   *
   *
   * <pre>
   * The job title in the application. The API does an exact match on the
   * [Job.title][google.cloud.talent.v4beta1.Job.title] of
   * [Application.job][google.cloud.talent.v4beta1.Application.job] in profiles.
   * </pre>
   *
   * <code>string job_title = 3;</code>
   */
  java.lang.String getJobTitle();
  /**
   *
   *
   * <pre>
   * The job title in the application. The API does an exact match on the
   * [Job.title][google.cloud.talent.v4beta1.Job.title] of
   * [Application.job][google.cloud.talent.v4beta1.Application.job] in profiles.
   * </pre>
   *
   * <code>string job_title = 3;</code>
   */
  com.google.protobuf.ByteString getJobTitleBytes();

  /**
   *
   *
   * <pre>
   * If true, the API excludes all profiles with any
   * [Application.job][google.cloud.talent.v4beta1.Application.job] matching the
   * filters.
   * </pre>
   *
   * <code>bool negated = 4;</code>
   */
  boolean getNegated();
}
