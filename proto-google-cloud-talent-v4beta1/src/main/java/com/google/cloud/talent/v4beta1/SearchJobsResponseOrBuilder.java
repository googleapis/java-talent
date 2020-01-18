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
// source: google/cloud/talent/v4beta1/job_service.proto

package com.google.cloud.talent.v4beta1;

public interface SearchJobsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4beta1.SearchJobsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The Job entities that match the specified [SearchJobsRequest][google.cloud.talent.v4beta1.SearchJobsRequest].
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.SearchJobsResponse.MatchingJob matching_jobs = 1;
   * </code>
   */
  java.util.List<com.google.cloud.talent.v4beta1.SearchJobsResponse.MatchingJob>
      getMatchingJobsList();
  /**
   *
   *
   * <pre>
   * The Job entities that match the specified [SearchJobsRequest][google.cloud.talent.v4beta1.SearchJobsRequest].
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.SearchJobsResponse.MatchingJob matching_jobs = 1;
   * </code>
   */
  com.google.cloud.talent.v4beta1.SearchJobsResponse.MatchingJob getMatchingJobs(int index);
  /**
   *
   *
   * <pre>
   * The Job entities that match the specified [SearchJobsRequest][google.cloud.talent.v4beta1.SearchJobsRequest].
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.SearchJobsResponse.MatchingJob matching_jobs = 1;
   * </code>
   */
  int getMatchingJobsCount();
  /**
   *
   *
   * <pre>
   * The Job entities that match the specified [SearchJobsRequest][google.cloud.talent.v4beta1.SearchJobsRequest].
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.SearchJobsResponse.MatchingJob matching_jobs = 1;
   * </code>
   */
  java.util.List<? extends com.google.cloud.talent.v4beta1.SearchJobsResponse.MatchingJobOrBuilder>
      getMatchingJobsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The Job entities that match the specified [SearchJobsRequest][google.cloud.talent.v4beta1.SearchJobsRequest].
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.SearchJobsResponse.MatchingJob matching_jobs = 1;
   * </code>
   */
  com.google.cloud.talent.v4beta1.SearchJobsResponse.MatchingJobOrBuilder getMatchingJobsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * The histogram results that match with specified
   * [SearchJobsRequest.histogram_queries][google.cloud.talent.v4beta1.SearchJobsRequest.histogram_queries].
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.HistogramQueryResult histogram_query_results = 2;
   * </code>
   */
  java.util.List<com.google.cloud.talent.v4beta1.HistogramQueryResult>
      getHistogramQueryResultsList();
  /**
   *
   *
   * <pre>
   * The histogram results that match with specified
   * [SearchJobsRequest.histogram_queries][google.cloud.talent.v4beta1.SearchJobsRequest.histogram_queries].
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.HistogramQueryResult histogram_query_results = 2;
   * </code>
   */
  com.google.cloud.talent.v4beta1.HistogramQueryResult getHistogramQueryResults(int index);
  /**
   *
   *
   * <pre>
   * The histogram results that match with specified
   * [SearchJobsRequest.histogram_queries][google.cloud.talent.v4beta1.SearchJobsRequest.histogram_queries].
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.HistogramQueryResult histogram_query_results = 2;
   * </code>
   */
  int getHistogramQueryResultsCount();
  /**
   *
   *
   * <pre>
   * The histogram results that match with specified
   * [SearchJobsRequest.histogram_queries][google.cloud.talent.v4beta1.SearchJobsRequest.histogram_queries].
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.HistogramQueryResult histogram_query_results = 2;
   * </code>
   */
  java.util.List<? extends com.google.cloud.talent.v4beta1.HistogramQueryResultOrBuilder>
      getHistogramQueryResultsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The histogram results that match with specified
   * [SearchJobsRequest.histogram_queries][google.cloud.talent.v4beta1.SearchJobsRequest.histogram_queries].
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.HistogramQueryResult histogram_query_results = 2;
   * </code>
   */
  com.google.cloud.talent.v4beta1.HistogramQueryResultOrBuilder getHistogramQueryResultsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * The token that specifies the starting position of the next page of results.
   * This field is empty if there are no more results.
   * </pre>
   *
   * <code>string next_page_token = 3;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * The token that specifies the starting position of the next page of results.
   * This field is empty if there are no more results.
   * </pre>
   *
   * <code>string next_page_token = 3;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();

  /**
   *
   *
   * <pre>
   * The location filters that the service applied to the specified query. If
   * any filters are lat-lng based, the [Location.location_type][google.cloud.talent.v4beta1.Location.location_type] is
   * [Location.LocationType.LOCATION_TYPE_UNSPECIFIED][google.cloud.talent.v4beta1.Location.LocationType.LOCATION_TYPE_UNSPECIFIED].
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.Location location_filters = 4;</code>
   */
  java.util.List<com.google.cloud.talent.v4beta1.Location> getLocationFiltersList();
  /**
   *
   *
   * <pre>
   * The location filters that the service applied to the specified query. If
   * any filters are lat-lng based, the [Location.location_type][google.cloud.talent.v4beta1.Location.location_type] is
   * [Location.LocationType.LOCATION_TYPE_UNSPECIFIED][google.cloud.talent.v4beta1.Location.LocationType.LOCATION_TYPE_UNSPECIFIED].
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.Location location_filters = 4;</code>
   */
  com.google.cloud.talent.v4beta1.Location getLocationFilters(int index);
  /**
   *
   *
   * <pre>
   * The location filters that the service applied to the specified query. If
   * any filters are lat-lng based, the [Location.location_type][google.cloud.talent.v4beta1.Location.location_type] is
   * [Location.LocationType.LOCATION_TYPE_UNSPECIFIED][google.cloud.talent.v4beta1.Location.LocationType.LOCATION_TYPE_UNSPECIFIED].
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.Location location_filters = 4;</code>
   */
  int getLocationFiltersCount();
  /**
   *
   *
   * <pre>
   * The location filters that the service applied to the specified query. If
   * any filters are lat-lng based, the [Location.location_type][google.cloud.talent.v4beta1.Location.location_type] is
   * [Location.LocationType.LOCATION_TYPE_UNSPECIFIED][google.cloud.talent.v4beta1.Location.LocationType.LOCATION_TYPE_UNSPECIFIED].
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.Location location_filters = 4;</code>
   */
  java.util.List<? extends com.google.cloud.talent.v4beta1.LocationOrBuilder>
      getLocationFiltersOrBuilderList();
  /**
   *
   *
   * <pre>
   * The location filters that the service applied to the specified query. If
   * any filters are lat-lng based, the [Location.location_type][google.cloud.talent.v4beta1.Location.location_type] is
   * [Location.LocationType.LOCATION_TYPE_UNSPECIFIED][google.cloud.talent.v4beta1.Location.LocationType.LOCATION_TYPE_UNSPECIFIED].
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.Location location_filters = 4;</code>
   */
  com.google.cloud.talent.v4beta1.LocationOrBuilder getLocationFiltersOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * An estimation of the number of jobs that match the specified query.
   * This number isn't guaranteed to be accurate. For accurate results,
   * see [SearchJobsRequest.require_precise_result_size][google.cloud.talent.v4beta1.SearchJobsRequest.require_precise_result_size].
   * </pre>
   *
   * <code>int32 estimated_total_size = 5;</code>
   *
   * @return The estimatedTotalSize.
   */
  int getEstimatedTotalSize();

  /**
   *
   *
   * <pre>
   * The precise result count, which is available only if the client set
   * [SearchJobsRequest.require_precise_result_size][google.cloud.talent.v4beta1.SearchJobsRequest.require_precise_result_size] to `true`, or if the
   * response is the last page of results. Otherwise, the value is `-1`.
   * </pre>
   *
   * <code>int32 total_size = 6;</code>
   *
   * @return The totalSize.
   */
  int getTotalSize();

  /**
   *
   *
   * <pre>
   * Additional information for the API invocation, such as the request
   * tracking id.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.ResponseMetadata metadata = 7;</code>
   *
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   *
   *
   * <pre>
   * Additional information for the API invocation, such as the request
   * tracking id.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.ResponseMetadata metadata = 7;</code>
   *
   * @return The metadata.
   */
  com.google.cloud.talent.v4beta1.ResponseMetadata getMetadata();
  /**
   *
   *
   * <pre>
   * Additional information for the API invocation, such as the request
   * tracking id.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.ResponseMetadata metadata = 7;</code>
   */
  com.google.cloud.talent.v4beta1.ResponseMetadataOrBuilder getMetadataOrBuilder();

  /**
   *
   *
   * <pre>
   * If query broadening is enabled, we may append additional results from the
   * broadened query. This number indicates how many of the jobs returned in the
   * jobs field are from the broadened query. These results are always at the
   * end of the jobs list. In particular, a value of 0, or if the field isn't
   * set, all the jobs in the jobs list are from the original
   * (without broadening) query. If this field is non-zero, subsequent requests
   * with offset after this result set should contain all broadened results.
   * </pre>
   *
   * <code>int32 broadened_query_jobs_count = 8;</code>
   *
   * @return The broadenedQueryJobsCount.
   */
  int getBroadenedQueryJobsCount();

  /**
   *
   *
   * <pre>
   * The spell checking result, and correction.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.SpellingCorrection spell_correction = 9;</code>
   *
   * @return Whether the spellCorrection field is set.
   */
  boolean hasSpellCorrection();
  /**
   *
   *
   * <pre>
   * The spell checking result, and correction.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.SpellingCorrection spell_correction = 9;</code>
   *
   * @return The spellCorrection.
   */
  com.google.cloud.talent.v4beta1.SpellingCorrection getSpellCorrection();
  /**
   *
   *
   * <pre>
   * The spell checking result, and correction.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.SpellingCorrection spell_correction = 9;</code>
   */
  com.google.cloud.talent.v4beta1.SpellingCorrectionOrBuilder getSpellCorrectionOrBuilder();
}
