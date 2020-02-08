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

import static com.google.cloud.talent.v4beta1.CompanyServiceClient.ListCompaniesPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GaxProperties;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.GrpcTransportChannel;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.ApiCallContext;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.PagedListDescriptor;
import com.google.api.gax.rpc.PagedListResponseFactory;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.talent.v4beta1.Company;
import com.google.cloud.talent.v4beta1.CreateCompanyRequest;
import com.google.cloud.talent.v4beta1.DeleteCompanyRequest;
import com.google.cloud.talent.v4beta1.GetCompanyRequest;
import com.google.cloud.talent.v4beta1.ListCompaniesRequest;
import com.google.cloud.talent.v4beta1.ListCompaniesResponse;
import com.google.cloud.talent.v4beta1.UpdateCompanyRequest;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link CompanyServiceStub}.
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
 * <p>For example, to set the total timeout of createCompany to 30 seconds:
 *
 * <pre>
 * <code>
 * CompanyServiceStubSettings.Builder companyServiceSettingsBuilder =
 *     CompanyServiceStubSettings.newBuilder();
 * companyServiceSettingsBuilder
 *     .createCompanySettings()
 *     .setRetrySettings(
 *         companyServiceSettingsBuilder.createCompanySettings().getRetrySettings().toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * CompanyServiceStubSettings companyServiceSettings = companyServiceSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class CompanyServiceStubSettings extends StubSettings<CompanyServiceStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder()
          .add("https://www.googleapis.com/auth/cloud-platform")
          .add("https://www.googleapis.com/auth/jobs")
          .build();

  private final UnaryCallSettings<CreateCompanyRequest, Company> createCompanySettings;
  private final UnaryCallSettings<GetCompanyRequest, Company> getCompanySettings;
  private final UnaryCallSettings<UpdateCompanyRequest, Company> updateCompanySettings;
  private final UnaryCallSettings<DeleteCompanyRequest, Empty> deleteCompanySettings;
  private final PagedCallSettings<
          ListCompaniesRequest, ListCompaniesResponse, ListCompaniesPagedResponse>
      listCompaniesSettings;

  /** Returns the object with the settings used for calls to createCompany. */
  public UnaryCallSettings<CreateCompanyRequest, Company> createCompanySettings() {
    return createCompanySettings;
  }

  /** Returns the object with the settings used for calls to getCompany. */
  public UnaryCallSettings<GetCompanyRequest, Company> getCompanySettings() {
    return getCompanySettings;
  }

  /** Returns the object with the settings used for calls to updateCompany. */
  public UnaryCallSettings<UpdateCompanyRequest, Company> updateCompanySettings() {
    return updateCompanySettings;
  }

  /** Returns the object with the settings used for calls to deleteCompany. */
  public UnaryCallSettings<DeleteCompanyRequest, Empty> deleteCompanySettings() {
    return deleteCompanySettings;
  }

  /** Returns the object with the settings used for calls to listCompanies. */
  public PagedCallSettings<ListCompaniesRequest, ListCompaniesResponse, ListCompaniesPagedResponse>
      listCompaniesSettings() {
    return listCompaniesSettings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public CompanyServiceStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcCompanyServiceStub.create(this);
    } else {
      throw new UnsupportedOperationException(
          "Transport not supported: " + getTransportChannelProvider().getTransportName());
    }
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return "jobs.googleapis.com:443";
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return DEFAULT_SERVICE_SCOPES;
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return GoogleCredentialsProvider.newBuilder().setScopesToApply(DEFAULT_SERVICE_SCOPES);
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return InstantiatingGrpcChannelProvider.newBuilder()
        .setMaxInboundMessageSize(Integer.MAX_VALUE);
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return defaultGrpcTransportProviderBuilder().build();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken(
            "gapic", GaxProperties.getLibraryVersion(CompanyServiceStubSettings.class))
        .setTransportToken(
            GaxGrpcProperties.getGrpcTokenName(), GaxGrpcProperties.getGrpcVersion());
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

  protected CompanyServiceStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    createCompanySettings = settingsBuilder.createCompanySettings().build();
    getCompanySettings = settingsBuilder.getCompanySettings().build();
    updateCompanySettings = settingsBuilder.updateCompanySettings().build();
    deleteCompanySettings = settingsBuilder.deleteCompanySettings().build();
    listCompaniesSettings = settingsBuilder.listCompaniesSettings().build();
  }

  private static final PagedListDescriptor<ListCompaniesRequest, ListCompaniesResponse, Company>
      LIST_COMPANIES_PAGE_STR_DESC =
          new PagedListDescriptor<ListCompaniesRequest, ListCompaniesResponse, Company>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListCompaniesRequest injectToken(ListCompaniesRequest payload, String token) {
              return ListCompaniesRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListCompaniesRequest injectPageSize(ListCompaniesRequest payload, int pageSize) {
              return ListCompaniesRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListCompaniesRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListCompaniesResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Company> extractResources(ListCompaniesResponse payload) {
              return payload.getCompaniesList() != null
                  ? payload.getCompaniesList()
                  : ImmutableList.<Company>of();
            }
          };

  private static final PagedListResponseFactory<
          ListCompaniesRequest, ListCompaniesResponse, ListCompaniesPagedResponse>
      LIST_COMPANIES_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListCompaniesRequest, ListCompaniesResponse, ListCompaniesPagedResponse>() {
            @Override
            public ApiFuture<ListCompaniesPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListCompaniesRequest, ListCompaniesResponse> callable,
                ListCompaniesRequest request,
                ApiCallContext context,
                ApiFuture<ListCompaniesResponse> futureResponse) {
              PageContext<ListCompaniesRequest, ListCompaniesResponse, Company> pageContext =
                  PageContext.create(callable, LIST_COMPANIES_PAGE_STR_DESC, request, context);
              return ListCompaniesPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  /** Builder for CompanyServiceStubSettings. */
  public static class Builder extends StubSettings.Builder<CompanyServiceStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;

    private final UnaryCallSettings.Builder<CreateCompanyRequest, Company> createCompanySettings;
    private final UnaryCallSettings.Builder<GetCompanyRequest, Company> getCompanySettings;
    private final UnaryCallSettings.Builder<UpdateCompanyRequest, Company> updateCompanySettings;
    private final UnaryCallSettings.Builder<DeleteCompanyRequest, Empty> deleteCompanySettings;
    private final PagedCallSettings.Builder<
            ListCompaniesRequest, ListCompaniesResponse, ListCompaniesPagedResponse>
        listCompaniesSettings;

    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put(
          "idempotent",
          ImmutableSet.copyOf(
              Lists.<StatusCode.Code>newArrayList(
                  StatusCode.Code.DEADLINE_EXCEEDED, StatusCode.Code.UNAVAILABLE)));
      definitions.put("non_idempotent", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings> definitions = ImmutableMap.builder();
      RetrySettings settings = null;
      settings =
          RetrySettings.newBuilder()
              .setInitialRetryDelay(Duration.ofMillis(100L))
              .setRetryDelayMultiplier(1.3)
              .setMaxRetryDelay(Duration.ofMillis(60000L))
              .setInitialRpcTimeout(Duration.ofMillis(20000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeout(Duration.ofMillis(20000L))
              .setTotalTimeout(Duration.ofMillis(600000L))
              .build();
      definitions.put("default", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this((ClientContext) null);
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      createCompanySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      getCompanySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      updateCompanySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      deleteCompanySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      listCompaniesSettings = PagedCallSettings.newBuilder(LIST_COMPANIES_PAGE_STR_FACT);

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              createCompanySettings,
              getCompanySettings,
              updateCompanySettings,
              deleteCompanySettings,
              listCompaniesSettings);

      initDefaults(this);
    }

    private static Builder createDefault() {
      Builder builder = new Builder((ClientContext) null);
      builder.setTransportChannelProvider(defaultTransportChannelProvider());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(defaultApiClientHeaderProviderBuilder().build());
      builder.setEndpoint(getDefaultEndpoint());
      return initDefaults(builder);
    }

    private static Builder initDefaults(Builder builder) {

      builder
          .createCompanySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .getCompanySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .updateCompanySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .deleteCompanySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .listCompaniesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      return builder;
    }

    protected Builder(CompanyServiceStubSettings settings) {
      super(settings);

      createCompanySettings = settings.createCompanySettings.toBuilder();
      getCompanySettings = settings.getCompanySettings.toBuilder();
      updateCompanySettings = settings.updateCompanySettings.toBuilder();
      deleteCompanySettings = settings.deleteCompanySettings.toBuilder();
      listCompaniesSettings = settings.listCompaniesSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              createCompanySettings,
              getCompanySettings,
              updateCompanySettings,
              deleteCompanySettings,
              listCompaniesSettings);
    }

    // NEXT_MAJOR_VER: remove 'throws Exception'
    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) throws Exception {
      super.applyToAllUnaryMethods(unaryMethodSettingsBuilders, settingsUpdater);
      return this;
    }

    public ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders() {
      return unaryMethodSettingsBuilders;
    }

    /** Returns the builder for the settings used for calls to createCompany. */
    public UnaryCallSettings.Builder<CreateCompanyRequest, Company> createCompanySettings() {
      return createCompanySettings;
    }

    /** Returns the builder for the settings used for calls to getCompany. */
    public UnaryCallSettings.Builder<GetCompanyRequest, Company> getCompanySettings() {
      return getCompanySettings;
    }

    /** Returns the builder for the settings used for calls to updateCompany. */
    public UnaryCallSettings.Builder<UpdateCompanyRequest, Company> updateCompanySettings() {
      return updateCompanySettings;
    }

    /** Returns the builder for the settings used for calls to deleteCompany. */
    public UnaryCallSettings.Builder<DeleteCompanyRequest, Empty> deleteCompanySettings() {
      return deleteCompanySettings;
    }

    /** Returns the builder for the settings used for calls to listCompanies. */
    public PagedCallSettings.Builder<
            ListCompaniesRequest, ListCompaniesResponse, ListCompaniesPagedResponse>
        listCompaniesSettings() {
      return listCompaniesSettings;
    }

    @Override
    public CompanyServiceStubSettings build() throws IOException {
      return new CompanyServiceStubSettings(this);
    }
  }
}
