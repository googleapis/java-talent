/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.talent.v4.samples;

// [START talent_v4_generated_jobserviceclient_searchjobs_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.talent.v4.HistogramQuery;
import com.google.cloud.talent.v4.JobQuery;
import com.google.cloud.talent.v4.JobServiceClient;
import com.google.cloud.talent.v4.JobView;
import com.google.cloud.talent.v4.RequestMetadata;
import com.google.cloud.talent.v4.SearchJobsRequest;
import com.google.cloud.talent.v4.SearchJobsResponse;
import com.google.cloud.talent.v4.TenantName;
import java.util.ArrayList;

public class AsyncSearchJobs {

  public static void main(String[] args) throws Exception {
    asyncSearchJobs();
  }

  public static void asyncSearchJobs() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
      SearchJobsRequest request =
          SearchJobsRequest.newBuilder()
              .setParent(TenantName.of("[PROJECT]", "[TENANT]").toString())
              .setRequestMetadata(RequestMetadata.newBuilder().build())
              .setJobQuery(JobQuery.newBuilder().build())
              .setEnableBroadening(true)
              .addAllHistogramQueries(new ArrayList<HistogramQuery>())
              .setJobView(JobView.forNumber(0))
              .setOffset(-1019779949)
              .setMaxPageSize(524069526)
              .setPageToken("pageToken873572522")
              .setOrderBy("orderBy-1207110587")
              .setCustomRankingInfo(SearchJobsRequest.CustomRankingInfo.newBuilder().build())
              .setDisableKeywordMatch(true)
              .build();
      ApiFuture<SearchJobsResponse> future =
          jobServiceClient.searchJobsCallable().futureCall(request);
      // Do something.
      SearchJobsResponse response = future.get();
    }
  }
}
// [END talent_v4_generated_jobserviceclient_searchjobs_async]
