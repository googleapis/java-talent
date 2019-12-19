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
// source: google/cloud/talent/v4beta1/event.proto

package com.google.cloud.talent.v4beta1;

public interface ClientEventOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4beta1.ClientEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Strongly recommended for the best service experience.
   * A unique ID generated in the API responses. It can be found in
   * [ResponseMetadata.request_id][google.cloud.talent.v4beta1.ResponseMetadata.request_id].
   * </pre>
   *
   * <code>string request_id = 1;</code>
   *
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   *
   *
   * <pre>
   * Strongly recommended for the best service experience.
   * A unique ID generated in the API responses. It can be found in
   * [ResponseMetadata.request_id][google.cloud.talent.v4beta1.ResponseMetadata.request_id].
   * </pre>
   *
   * <code>string request_id = 1;</code>
   *
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString getRequestIdBytes();

  /**
   *
   *
   * <pre>
   * Required. A unique identifier, generated by the client application.
   * </pre>
   *
   * <code>string event_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The eventId.
   */
  java.lang.String getEventId();
  /**
   *
   *
   * <pre>
   * Required. A unique identifier, generated by the client application.
   * </pre>
   *
   * <code>string event_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for eventId.
   */
  com.google.protobuf.ByteString getEventIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The timestamp of the event.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Required. The timestamp of the event.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Required. The timestamp of the event.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * An event issued when a job seeker interacts with the application that
   * implements Cloud Talent Solution.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.JobEvent job_event = 5;</code>
   *
   * @return Whether the jobEvent field is set.
   */
  boolean hasJobEvent();
  /**
   *
   *
   * <pre>
   * An event issued when a job seeker interacts with the application that
   * implements Cloud Talent Solution.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.JobEvent job_event = 5;</code>
   *
   * @return The jobEvent.
   */
  com.google.cloud.talent.v4beta1.JobEvent getJobEvent();
  /**
   *
   *
   * <pre>
   * An event issued when a job seeker interacts with the application that
   * implements Cloud Talent Solution.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.JobEvent job_event = 5;</code>
   */
  com.google.cloud.talent.v4beta1.JobEventOrBuilder getJobEventOrBuilder();

  /**
   *
   *
   * <pre>
   * An event issued when a profile searcher interacts with the application
   * that implements Cloud Talent Solution.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.ProfileEvent profile_event = 6;</code>
   *
   * @return Whether the profileEvent field is set.
   */
  boolean hasProfileEvent();
  /**
   *
   *
   * <pre>
   * An event issued when a profile searcher interacts with the application
   * that implements Cloud Talent Solution.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.ProfileEvent profile_event = 6;</code>
   *
   * @return The profileEvent.
   */
  com.google.cloud.talent.v4beta1.ProfileEvent getProfileEvent();
  /**
   *
   *
   * <pre>
   * An event issued when a profile searcher interacts with the application
   * that implements Cloud Talent Solution.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.ProfileEvent profile_event = 6;</code>
   */
  com.google.cloud.talent.v4beta1.ProfileEventOrBuilder getProfileEventOrBuilder();

  /**
   *
   *
   * <pre>
   * Notes about the event provided by recruiters or other users, for example,
   * feedback on why a profile was bookmarked.
   * </pre>
   *
   * <code>string event_notes = 9;</code>
   *
   * @return The eventNotes.
   */
  java.lang.String getEventNotes();
  /**
   *
   *
   * <pre>
   * Notes about the event provided by recruiters or other users, for example,
   * feedback on why a profile was bookmarked.
   * </pre>
   *
   * <code>string event_notes = 9;</code>
   *
   * @return The bytes for eventNotes.
   */
  com.google.protobuf.ByteString getEventNotesBytes();

  public com.google.cloud.talent.v4beta1.ClientEvent.EventCase getEventCase();
}
