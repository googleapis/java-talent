// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/filters.proto

package com.google.cloud.talent.v4beta1;

public interface WorkExperienceFilterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4beta1.WorkExperienceFilter)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The minimum duration of the work experience (inclusive).
   * </pre>
   *
   * <code>.google.protobuf.Duration min_experience = 1;</code>
   * @return Whether the minExperience field is set.
   */
  boolean hasMinExperience();
  /**
   * <pre>
   * The minimum duration of the work experience (inclusive).
   * </pre>
   *
   * <code>.google.protobuf.Duration min_experience = 1;</code>
   * @return The minExperience.
   */
  com.google.protobuf.Duration getMinExperience();
  /**
   * <pre>
   * The minimum duration of the work experience (inclusive).
   * </pre>
   *
   * <code>.google.protobuf.Duration min_experience = 1;</code>
   */
  com.google.protobuf.DurationOrBuilder getMinExperienceOrBuilder();

  /**
   * <pre>
   * The maximum duration of the work experience (exclusive).
   * </pre>
   *
   * <code>.google.protobuf.Duration max_experience = 2;</code>
   * @return Whether the maxExperience field is set.
   */
  boolean hasMaxExperience();
  /**
   * <pre>
   * The maximum duration of the work experience (exclusive).
   * </pre>
   *
   * <code>.google.protobuf.Duration max_experience = 2;</code>
   * @return The maxExperience.
   */
  com.google.protobuf.Duration getMaxExperience();
  /**
   * <pre>
   * The maximum duration of the work experience (exclusive).
   * </pre>
   *
   * <code>.google.protobuf.Duration max_experience = 2;</code>
   */
  com.google.protobuf.DurationOrBuilder getMaxExperienceOrBuilder();
}