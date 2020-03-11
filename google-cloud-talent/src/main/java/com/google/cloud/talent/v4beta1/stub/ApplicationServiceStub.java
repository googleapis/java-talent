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
package com.google.cloud.talent.v4beta1.stub;

import static com.google.cloud.talent.v4beta1.ApplicationServiceClient.ListApplicationsPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.talent.v4beta1.Application;
import com.google.cloud.talent.v4beta1.CreateApplicationRequest;
import com.google.cloud.talent.v4beta1.DeleteApplicationRequest;
import com.google.cloud.talent.v4beta1.GetApplicationRequest;
import com.google.cloud.talent.v4beta1.ListApplicationsRequest;
import com.google.cloud.talent.v4beta1.ListApplicationsResponse;
import com.google.cloud.talent.v4beta1.UpdateApplicationRequest;
import com.google.protobuf.Empty;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Base stub class for Cloud Talent Solution API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public abstract class ApplicationServiceStub implements BackgroundResource {

  public UnaryCallable<DeleteApplicationRequest, Empty> deleteApplicationCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteApplicationCallable()");
  }

  public UnaryCallable<CreateApplicationRequest, Application> createApplicationCallable() {
    throw new UnsupportedOperationException("Not implemented: createApplicationCallable()");
  }

  public UnaryCallable<GetApplicationRequest, Application> getApplicationCallable() {
    throw new UnsupportedOperationException("Not implemented: getApplicationCallable()");
  }

  public UnaryCallable<UpdateApplicationRequest, Application> updateApplicationCallable() {
    throw new UnsupportedOperationException("Not implemented: updateApplicationCallable()");
  }

  public UnaryCallable<ListApplicationsRequest, ListApplicationsPagedResponse>
      listApplicationsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listApplicationsPagedCallable()");
  }

  public UnaryCallable<ListApplicationsRequest, ListApplicationsResponse>
      listApplicationsCallable() {
    throw new UnsupportedOperationException("Not implemented: listApplicationsCallable()");
  }

  @Override
  public abstract void close();
}
