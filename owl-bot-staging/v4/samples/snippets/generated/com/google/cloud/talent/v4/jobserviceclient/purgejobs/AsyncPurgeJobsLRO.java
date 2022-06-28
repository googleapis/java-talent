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

// [START talent_v4_generated_jobserviceclient_purgejobs_lro_async]
import com.google.api.gax.longrunning.OperationFuture;
import com.google.cloud.talent.v4.BatchOperationMetadata;
import com.google.cloud.talent.v4.JobServiceClient;
import com.google.cloud.talent.v4.ProjectName;
import com.google.cloud.talent.v4.PurgeJobsRequest;
import com.google.cloud.talent.v4.PurgeJobsResponse;

public class AsyncPurgeJobsLRO {

  public static void main(String[] args) throws Exception {
    asyncPurgeJobsLRO();
  }

  public static void asyncPurgeJobsLRO() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
      PurgeJobsRequest request =
          PurgeJobsRequest.newBuilder()
              .setParent(ProjectName.of("[PROJECT]").toString())
              .setFilter("filter-1274492040")
              .setForce(true)
              .build();
      OperationFuture<PurgeJobsResponse, BatchOperationMetadata> future =
          jobServiceClient.purgeJobsOperationCallable().futureCall(request);
      // Do something.
      PurgeJobsResponse response = future.get();
    }
  }
}
// [END talent_v4_generated_jobserviceclient_purgejobs_lro_async]
