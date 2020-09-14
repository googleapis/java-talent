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
// source: google/cloud/talent/v4/common.proto

package com.google.cloud.talent.v4;

public interface LocationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4.Location)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The type of a location, which corresponds to the address lines field of
   * [google.type.PostalAddress][google.type.PostalAddress]. For example,
   * "Downtown, Atlanta, GA, USA" has a type of
   * [LocationType.NEIGHBORHOOD][google.cloud.talent.v4.Location.LocationType.NEIGHBORHOOD],
   * and "Kansas City, KS, USA" has a type of
   * [LocationType.LOCALITY][google.cloud.talent.v4.Location.LocationType.LOCALITY].
   * </pre>
   *
   * <code>.google.cloud.talent.v4.Location.LocationType location_type = 1;</code>
   *
   * @return The enum numeric value on the wire for locationType.
   */
  int getLocationTypeValue();
  /**
   *
   *
   * <pre>
   * The type of a location, which corresponds to the address lines field of
   * [google.type.PostalAddress][google.type.PostalAddress]. For example,
   * "Downtown, Atlanta, GA, USA" has a type of
   * [LocationType.NEIGHBORHOOD][google.cloud.talent.v4.Location.LocationType.NEIGHBORHOOD],
   * and "Kansas City, KS, USA" has a type of
   * [LocationType.LOCALITY][google.cloud.talent.v4.Location.LocationType.LOCALITY].
   * </pre>
   *
   * <code>.google.cloud.talent.v4.Location.LocationType location_type = 1;</code>
   *
   * @return The locationType.
   */
  com.google.cloud.talent.v4.Location.LocationType getLocationType();

  /**
   *
   *
   * <pre>
   * Postal address of the location that includes human readable information,
   * such as postal delivery and payments addresses. Given a postal address,
   * a postal service can deliver items to a premises, P.O. Box, or other
   * delivery location.
   * </pre>
   *
   * <code>.google.type.PostalAddress postal_address = 2;</code>
   *
   * @return Whether the postalAddress field is set.
   */
  boolean hasPostalAddress();
  /**
   *
   *
   * <pre>
   * Postal address of the location that includes human readable information,
   * such as postal delivery and payments addresses. Given a postal address,
   * a postal service can deliver items to a premises, P.O. Box, or other
   * delivery location.
   * </pre>
   *
   * <code>.google.type.PostalAddress postal_address = 2;</code>
   *
   * @return The postalAddress.
   */
  com.google.type.PostalAddress getPostalAddress();
  /**
   *
   *
   * <pre>
   * Postal address of the location that includes human readable information,
   * such as postal delivery and payments addresses. Given a postal address,
   * a postal service can deliver items to a premises, P.O. Box, or other
   * delivery location.
   * </pre>
   *
   * <code>.google.type.PostalAddress postal_address = 2;</code>
   */
  com.google.type.PostalAddressOrBuilder getPostalAddressOrBuilder();

  /**
   *
   *
   * <pre>
   * An object representing a latitude/longitude pair.
   * </pre>
   *
   * <code>.google.type.LatLng lat_lng = 3;</code>
   *
   * @return Whether the latLng field is set.
   */
  boolean hasLatLng();
  /**
   *
   *
   * <pre>
   * An object representing a latitude/longitude pair.
   * </pre>
   *
   * <code>.google.type.LatLng lat_lng = 3;</code>
   *
   * @return The latLng.
   */
  com.google.type.LatLng getLatLng();
  /**
   *
   *
   * <pre>
   * An object representing a latitude/longitude pair.
   * </pre>
   *
   * <code>.google.type.LatLng lat_lng = 3;</code>
   */
  com.google.type.LatLngOrBuilder getLatLngOrBuilder();

  /**
   *
   *
   * <pre>
   * Radius in miles of the job location. This value is derived from the
   * location bounding box in which a circle with the specified radius
   * centered from [google.type.LatLng][google.type.LatLng] covers the area
   * associated with the job location. For example, currently, "Mountain View,
   * CA, USA" has a radius of 6.17 miles.
   * </pre>
   *
   * <code>double radius_miles = 4;</code>
   *
   * @return The radiusMiles.
   */
  double getRadiusMiles();
}
