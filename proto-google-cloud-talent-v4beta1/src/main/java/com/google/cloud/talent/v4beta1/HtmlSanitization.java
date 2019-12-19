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
// source: google/cloud/talent/v4beta1/common.proto

package com.google.cloud.talent.v4beta1;

/**
 *
 *
 * <pre>
 * Option for HTML content sanitization on user input fields, for example, job
 * description. By setting this option, user can determine whether and how
 * sanitization is performed on these fields.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.talent.v4beta1.HtmlSanitization}
 */
public enum HtmlSanitization implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Default value.
   * </pre>
   *
   * <code>HTML_SANITIZATION_UNSPECIFIED = 0;</code>
   */
  HTML_SANITIZATION_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Disables sanitization on HTML input.
   * </pre>
   *
   * <code>HTML_SANITIZATION_DISABLED = 1;</code>
   */
  HTML_SANITIZATION_DISABLED(1),
  /**
   *
   *
   * <pre>
   * Sanitizes HTML input, only accepts bold, italic, ordered list, and
   * unordered list markup tags.
   * </pre>
   *
   * <code>SIMPLE_FORMATTING_ONLY = 2;</code>
   */
  SIMPLE_FORMATTING_ONLY(2),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Default value.
   * </pre>
   *
   * <code>HTML_SANITIZATION_UNSPECIFIED = 0;</code>
   */
  public static final int HTML_SANITIZATION_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Disables sanitization on HTML input.
   * </pre>
   *
   * <code>HTML_SANITIZATION_DISABLED = 1;</code>
   */
  public static final int HTML_SANITIZATION_DISABLED_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Sanitizes HTML input, only accepts bold, italic, ordered list, and
   * unordered list markup tags.
   * </pre>
   *
   * <code>SIMPLE_FORMATTING_ONLY = 2;</code>
   */
  public static final int SIMPLE_FORMATTING_ONLY_VALUE = 2;

  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static HtmlSanitization valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static HtmlSanitization forNumber(int value) {
    switch (value) {
      case 0:
        return HTML_SANITIZATION_UNSPECIFIED;
      case 1:
        return HTML_SANITIZATION_DISABLED;
      case 2:
        return SIMPLE_FORMATTING_ONLY;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<HtmlSanitization> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<HtmlSanitization> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<HtmlSanitization>() {
        public HtmlSanitization findValueByNumber(int number) {
          return HtmlSanitization.forNumber(number);
        }
      };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }

  public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
    return getDescriptor();
  }

  public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
    return com.google.cloud.talent.v4beta1.CommonProto.getDescriptor().getEnumTypes().get(9);
  }

  private static final HtmlSanitization[] VALUES = values();

  public static HtmlSanitization valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private HtmlSanitization(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.talent.v4beta1.HtmlSanitization)
}
