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

import static com.google.cloud.talent.v4beta1.TenantServiceClient.ListTenantsPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ClientSettings;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.cloud.talent.v4beta1.stub.TenantServiceStubSettings;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link TenantServiceClient}.
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
 * <p>For example, to set the total timeout of createTenant to 30 seconds:
 *
 * <pre>
 * <code>
 * TenantServiceSettings.Builder tenantServiceSettingsBuilder =
 *     TenantServiceSettings.newBuilder();
 * tenantServiceSettingsBuilder
 *     .createTenantSettings()
 *     .setRetrySettings(
 *         tenantServiceSettingsBuilder.createTenantSettings().getRetrySettings().toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * TenantServiceSettings tenantServiceSettings = tenantServiceSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class TenantServiceSettings extends ClientSettings<TenantServiceSettings> {
  /** Returns the object with the settings used for calls to createTenant. */
  public UnaryCallSettings<CreateTenantRequest, Tenant> createTenantSettings() {
    return ((TenantServiceStubSettings) getStubSettings()).createTenantSettings();
  }

  /** Returns the object with the settings used for calls to getTenant. */
  public UnaryCallSettings<GetTenantRequest, Tenant> getTenantSettings() {
    return ((TenantServiceStubSettings) getStubSettings()).getTenantSettings();
  }

  /** Returns the object with the settings used for calls to updateTenant. */
  public UnaryCallSettings<UpdateTenantRequest, Tenant> updateTenantSettings() {
    return ((TenantServiceStubSettings) getStubSettings()).updateTenantSettings();
  }

  /** Returns the object with the settings used for calls to deleteTenant. */
  public UnaryCallSettings<DeleteTenantRequest, Empty> deleteTenantSettings() {
    return ((TenantServiceStubSettings) getStubSettings()).deleteTenantSettings();
  }

  /** Returns the object with the settings used for calls to listTenants. */
  public PagedCallSettings<ListTenantsRequest, ListTenantsResponse, ListTenantsPagedResponse>
      listTenantsSettings() {
    return ((TenantServiceStubSettings) getStubSettings()).listTenantsSettings();
  }

  public static final TenantServiceSettings create(TenantServiceStubSettings stub)
      throws IOException {
    return new TenantServiceSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return TenantServiceStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return TenantServiceStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return TenantServiceStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return TenantServiceStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return TenantServiceStubSettings.defaultGrpcTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return TenantServiceStubSettings.defaultTransportChannelProvider();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return TenantServiceStubSettings.defaultApiClientHeaderProviderBuilder();
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

  protected TenantServiceSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for TenantServiceSettings. */
  public static class Builder extends ClientSettings.Builder<TenantServiceSettings, Builder> {
    protected Builder() throws IOException {
      this((ClientContext) null);
    }

    protected Builder(ClientContext clientContext) {
      super(TenantServiceStubSettings.newBuilder(clientContext));
    }

    private static Builder createDefault() {
      return new Builder(TenantServiceStubSettings.newBuilder());
    }

    protected Builder(TenantServiceSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(TenantServiceStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    public TenantServiceStubSettings.Builder getStubSettingsBuilder() {
      return ((TenantServiceStubSettings.Builder) getStubSettings());
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

    /** Returns the builder for the settings used for calls to createTenant. */
    public UnaryCallSettings.Builder<CreateTenantRequest, Tenant> createTenantSettings() {
      return getStubSettingsBuilder().createTenantSettings();
    }

    /** Returns the builder for the settings used for calls to getTenant. */
    public UnaryCallSettings.Builder<GetTenantRequest, Tenant> getTenantSettings() {
      return getStubSettingsBuilder().getTenantSettings();
    }

    /** Returns the builder for the settings used for calls to updateTenant. */
    public UnaryCallSettings.Builder<UpdateTenantRequest, Tenant> updateTenantSettings() {
      return getStubSettingsBuilder().updateTenantSettings();
    }

    /** Returns the builder for the settings used for calls to deleteTenant. */
    public UnaryCallSettings.Builder<DeleteTenantRequest, Empty> deleteTenantSettings() {
      return getStubSettingsBuilder().deleteTenantSettings();
    }

    /** Returns the builder for the settings used for calls to listTenants. */
    public PagedCallSettings.Builder<
            ListTenantsRequest, ListTenantsResponse, ListTenantsPagedResponse>
        listTenantsSettings() {
      return getStubSettingsBuilder().listTenantsSettings();
    }

    @Override
    public TenantServiceSettings build() throws IOException {
      return new TenantServiceSettings(this);
    }
  }
}
