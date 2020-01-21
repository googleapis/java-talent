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

public interface AvailabilityFilterOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4beta1.AvailabilityFilter)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Type of signal to apply filter on.
   * </pre>
   *
   * <code>
   * .google.cloud.talent.v4beta1.AvailabilitySignalType signal_type = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for signalType.
   */
  int getSignalTypeValue();
  /**
   *
   *
   * <pre>
   * Required. Type of signal to apply filter on.
   * </pre>
   *
   * <code>
   * .google.cloud.talent.v4beta1.AvailabilitySignalType signal_type = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The signalType.
   */
  com.google.cloud.talent.v4beta1.AvailabilitySignalType getSignalType();

  /**
   *
   *
   * <pre>
   * Required. Range of times to filter candidate signals by.
   * </pre>
   *
   * <code>
   * .google.cloud.talent.v4beta1.TimestampRange range = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the range field is set.
   */
  boolean hasRange();
  /**
   *
   *
   * <pre>
   * Required. Range of times to filter candidate signals by.
   * </pre>
   *
   * <code>
   * .google.cloud.talent.v4beta1.TimestampRange range = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The range.
   */
  com.google.cloud.talent.v4beta1.TimestampRange getRange();
  /**
   *
   *
   * <pre>
   * Required. Range of times to filter candidate signals by.
   * </pre>
   *
   * <code>
   * .google.cloud.talent.v4beta1.TimestampRange range = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.talent.v4beta1.TimestampRangeOrBuilder getRangeOrBuilder();

  /**
   *
   *
   * <pre>
   * If multiple [AvailabilityFilter][google.cloud.talent.v4beta1.AvailabilityFilter] are provided, the default
   * behavior is to OR all filters, but if this field is set to true, this
   * particular [AvailabilityFilter][google.cloud.talent.v4beta1.AvailabilityFilter] will be AND'ed against other
   * [AvailabilityFilter][google.cloud.talent.v4beta1.AvailabilityFilter].
   * </pre>
   *
   * <code>bool required = 3;</code>
   *
   * @return The required.
   */
  boolean getRequired();
}
