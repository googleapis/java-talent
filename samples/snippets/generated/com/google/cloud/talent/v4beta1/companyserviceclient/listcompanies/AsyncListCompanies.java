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

package com.google.cloud.talent.v4beta1.samples;

// [START talent_v4beta1_generated_companyserviceclient_listcompanies_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.talent.v4beta1.Company;
import com.google.cloud.talent.v4beta1.CompanyServiceClient;
import com.google.cloud.talent.v4beta1.ListCompaniesRequest;
import com.google.cloud.talent.v4beta1.TenantName;

public class AsyncListCompanies {

  public static void main(String[] args) throws Exception {
    asyncListCompanies();
  }

  public static void asyncListCompanies() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (CompanyServiceClient companyServiceClient = CompanyServiceClient.create()) {
      ListCompaniesRequest request =
          ListCompaniesRequest.newBuilder()
              .setParent(TenantName.of("[PROJECT]", "[TENANT]").toString())
              .setPageToken("pageToken873572522")
              .setPageSize(883849137)
              .setRequireOpenJobs(true)
              .build();
      ApiFuture<Company> future =
          companyServiceClient.listCompaniesPagedCallable().futureCall(request);
      // Do something.
      for (Company element : future.get().iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END talent_v4beta1_generated_companyserviceclient_listcompanies_async]