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
package com.google.cloud.talent.v4beta1;

import static com.google.cloud.talent.v4beta1.JobServiceClient.ListJobsPagedResponse;
import static com.google.cloud.talent.v4beta1.JobServiceClient.SearchJobsForAlertPagedResponse;
import static com.google.cloud.talent.v4beta1.JobServiceClient.SearchJobsPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ClientSettings;
import com.google.api.gax.rpc.OperationCallSettings;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.cloud.talent.v4beta1.stub.JobServiceStubSettings;
import com.google.longrunning.Operation;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link JobServiceClient}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (jobs.googleapis.com) and default port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the total timeout of createJob to 30 seconds:
 *
 * <pre>
 * <code>
 * JobServiceSettings.Builder jobServiceSettingsBuilder =
 *     JobServiceSettings.newBuilder();
 * jobServiceSettingsBuilder
 *     .createJobSettings()
 *     .setRetrySettings(
 *         jobServiceSettingsBuilder.createJobSettings().getRetrySettings().toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * JobServiceSettings jobServiceSettings = jobServiceSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class JobServiceSettings extends ClientSettings<JobServiceSettings> {
  /** Returns the object with the settings used for calls to createJob. */
  public UnaryCallSettings<CreateJobRequest, Job> createJobSettings() {
    return ((JobServiceStubSettings) getStubSettings()).createJobSettings();
  }

  /** Returns the object with the settings used for calls to getJob. */
  public UnaryCallSettings<GetJobRequest, Job> getJobSettings() {
    return ((JobServiceStubSettings) getStubSettings()).getJobSettings();
  }

  /** Returns the object with the settings used for calls to updateJob. */
  public UnaryCallSettings<UpdateJobRequest, Job> updateJobSettings() {
    return ((JobServiceStubSettings) getStubSettings()).updateJobSettings();
  }

  /** Returns the object with the settings used for calls to deleteJob. */
  public UnaryCallSettings<DeleteJobRequest, Empty> deleteJobSettings() {
    return ((JobServiceStubSettings) getStubSettings()).deleteJobSettings();
  }

  /** Returns the object with the settings used for calls to listJobs. */
  public PagedCallSettings<ListJobsRequest, ListJobsResponse, ListJobsPagedResponse>
      listJobsSettings() {
    return ((JobServiceStubSettings) getStubSettings()).listJobsSettings();
  }

  /** Returns the object with the settings used for calls to batchDeleteJobs. */
  public UnaryCallSettings<BatchDeleteJobsRequest, Empty> batchDeleteJobsSettings() {
    return ((JobServiceStubSettings) getStubSettings()).batchDeleteJobsSettings();
  }

  /** Returns the object with the settings used for calls to searchJobs. */
  public PagedCallSettings<SearchJobsRequest, SearchJobsResponse, SearchJobsPagedResponse>
      searchJobsSettings() {
    return ((JobServiceStubSettings) getStubSettings()).searchJobsSettings();
  }

  /** Returns the object with the settings used for calls to searchJobsForAlert. */
  public PagedCallSettings<SearchJobsRequest, SearchJobsResponse, SearchJobsForAlertPagedResponse>
      searchJobsForAlertSettings() {
    return ((JobServiceStubSettings) getStubSettings()).searchJobsForAlertSettings();
  }

  /** Returns the object with the settings used for calls to batchCreateJobs. */
  public UnaryCallSettings<BatchCreateJobsRequest, Operation> batchCreateJobsSettings() {
    return ((JobServiceStubSettings) getStubSettings()).batchCreateJobsSettings();
  }

  /** Returns the object with the settings used for calls to batchCreateJobs. */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public OperationCallSettings<BatchCreateJobsRequest, JobOperationResult, BatchOperationMetadata>
      batchCreateJobsOperationSettings() {
    return ((JobServiceStubSettings) getStubSettings()).batchCreateJobsOperationSettings();
  }

  /** Returns the object with the settings used for calls to batchUpdateJobs. */
  public UnaryCallSettings<BatchUpdateJobsRequest, Operation> batchUpdateJobsSettings() {
    return ((JobServiceStubSettings) getStubSettings()).batchUpdateJobsSettings();
  }

  /** Returns the object with the settings used for calls to batchUpdateJobs. */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public OperationCallSettings<BatchUpdateJobsRequest, JobOperationResult, BatchOperationMetadata>
      batchUpdateJobsOperationSettings() {
    return ((JobServiceStubSettings) getStubSettings()).batchUpdateJobsOperationSettings();
  }

  public static final JobServiceSettings create(JobServiceStubSettings stub) throws IOException {
    return new JobServiceSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return JobServiceStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return JobServiceStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return JobServiceStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return JobServiceStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return JobServiceStubSettings.defaultGrpcTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return JobServiceStubSettings.defaultTransportChannelProvider();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return JobServiceStubSettings.defaultApiClientHeaderProviderBuilder();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected JobServiceSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for JobServiceSettings. */
  public static class Builder extends ClientSettings.Builder<JobServiceSettings, Builder> {
    protected Builder() throws IOException {
      this((ClientContext) null);
    }

    protected Builder(ClientContext clientContext) {
      super(JobServiceStubSettings.newBuilder(clientContext));
    }

    private static Builder createDefault() {
      return new Builder(JobServiceStubSettings.newBuilder());
    }

    protected Builder(JobServiceSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(JobServiceStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    public JobServiceStubSettings.Builder getStubSettingsBuilder() {
      return ((JobServiceStubSettings.Builder) getStubSettings());
    }

    // NEXT_MAJOR_VER: remove 'throws Exception'
    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) throws Exception {
      super.applyToAllUnaryMethods(
          getStubSettingsBuilder().unaryMethodSettingsBuilders(), settingsUpdater);
      return this;
    }

    /** Returns the builder for the settings used for calls to createJob. */
    public UnaryCallSettings.Builder<CreateJobRequest, Job> createJobSettings() {
      return getStubSettingsBuilder().createJobSettings();
    }

    /** Returns the builder for the settings used for calls to getJob. */
    public UnaryCallSettings.Builder<GetJobRequest, Job> getJobSettings() {
      return getStubSettingsBuilder().getJobSettings();
    }

    /** Returns the builder for the settings used for calls to updateJob. */
    public UnaryCallSettings.Builder<UpdateJobRequest, Job> updateJobSettings() {
      return getStubSettingsBuilder().updateJobSettings();
    }

    /** Returns the builder for the settings used for calls to deleteJob. */
    public UnaryCallSettings.Builder<DeleteJobRequest, Empty> deleteJobSettings() {
      return getStubSettingsBuilder().deleteJobSettings();
    }

    /** Returns the builder for the settings used for calls to listJobs. */
    public PagedCallSettings.Builder<ListJobsRequest, ListJobsResponse, ListJobsPagedResponse>
        listJobsSettings() {
      return getStubSettingsBuilder().listJobsSettings();
    }

    /** Returns the builder for the settings used for calls to batchDeleteJobs. */
    public UnaryCallSettings.Builder<BatchDeleteJobsRequest, Empty> batchDeleteJobsSettings() {
      return getStubSettingsBuilder().batchDeleteJobsSettings();
    }

    /** Returns the builder for the settings used for calls to searchJobs. */
    public PagedCallSettings.Builder<SearchJobsRequest, SearchJobsResponse, SearchJobsPagedResponse>
        searchJobsSettings() {
      return getStubSettingsBuilder().searchJobsSettings();
    }

    /** Returns the builder for the settings used for calls to searchJobsForAlert. */
    public PagedCallSettings.Builder<
            SearchJobsRequest, SearchJobsResponse, SearchJobsForAlertPagedResponse>
        searchJobsForAlertSettings() {
      return getStubSettingsBuilder().searchJobsForAlertSettings();
    }

    /** Returns the builder for the settings used for calls to batchCreateJobs. */
    public UnaryCallSettings.Builder<BatchCreateJobsRequest, Operation> batchCreateJobsSettings() {
      return getStubSettingsBuilder().batchCreateJobsSettings();
    }

    /** Returns the builder for the settings used for calls to batchCreateJobs. */
    @BetaApi(
        "The surface for long-running operations is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            BatchCreateJobsRequest, JobOperationResult, BatchOperationMetadata>
        batchCreateJobsOperationSettings() {
      return getStubSettingsBuilder().batchCreateJobsOperationSettings();
    }

    /** Returns the builder for the settings used for calls to batchUpdateJobs. */
    public UnaryCallSettings.Builder<BatchUpdateJobsRequest, Operation> batchUpdateJobsSettings() {
      return getStubSettingsBuilder().batchUpdateJobsSettings();
    }

    /** Returns the builder for the settings used for calls to batchUpdateJobs. */
    @BetaApi(
        "The surface for long-running operations is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            BatchUpdateJobsRequest, JobOperationResult, BatchOperationMetadata>
        batchUpdateJobsOperationSettings() {
      return getStubSettingsBuilder().batchUpdateJobsOperationSettings();
    }

    @Override
    public JobServiceSettings build() throws IOException {
      return new JobServiceSettings(this);
    }
  }
}
