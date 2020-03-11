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

import static com.google.cloud.talent.v4beta1.TenantServiceClient.ListTenantsPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.RequestParamsExtractor;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.talent.v4beta1.CreateTenantRequest;
import com.google.cloud.talent.v4beta1.DeleteTenantRequest;
import com.google.cloud.talent.v4beta1.GetTenantRequest;
import com.google.cloud.talent.v4beta1.ListTenantsRequest;
import com.google.cloud.talent.v4beta1.ListTenantsResponse;
import com.google.cloud.talent.v4beta1.Tenant;
import com.google.cloud.talent.v4beta1.UpdateTenantRequest;
import com.google.common.collect.ImmutableMap;
import com.google.protobuf.Empty;
import io.grpc.MethodDescriptor;
import io.grpc.protobuf.ProtoUtils;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * gRPC stub implementation for Cloud Talent Solution API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public class GrpcTenantServiceStub extends TenantServiceStub {

  private static final MethodDescriptor<DeleteTenantRequest, Empty> deleteTenantMethodDescriptor =
      MethodDescriptor.<DeleteTenantRequest, Empty>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.cloud.talent.v4beta1.TenantService/DeleteTenant")
          .setRequestMarshaller(ProtoUtils.marshaller(DeleteTenantRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Empty.getDefaultInstance()))
          .build();
  private static final MethodDescriptor<CreateTenantRequest, Tenant> createTenantMethodDescriptor =
      MethodDescriptor.<CreateTenantRequest, Tenant>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.cloud.talent.v4beta1.TenantService/CreateTenant")
          .setRequestMarshaller(ProtoUtils.marshaller(CreateTenantRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Tenant.getDefaultInstance()))
          .build();
  private static final MethodDescriptor<GetTenantRequest, Tenant> getTenantMethodDescriptor =
      MethodDescriptor.<GetTenantRequest, Tenant>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.cloud.talent.v4beta1.TenantService/GetTenant")
          .setRequestMarshaller(ProtoUtils.marshaller(GetTenantRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Tenant.getDefaultInstance()))
          .build();
  private static final MethodDescriptor<UpdateTenantRequest, Tenant> updateTenantMethodDescriptor =
      MethodDescriptor.<UpdateTenantRequest, Tenant>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.cloud.talent.v4beta1.TenantService/UpdateTenant")
          .setRequestMarshaller(ProtoUtils.marshaller(UpdateTenantRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Tenant.getDefaultInstance()))
          .build();
  private static final MethodDescriptor<ListTenantsRequest, ListTenantsResponse>
      listTenantsMethodDescriptor =
          MethodDescriptor.<ListTenantsRequest, ListTenantsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.talent.v4beta1.TenantService/ListTenants")
              .setRequestMarshaller(ProtoUtils.marshaller(ListTenantsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListTenantsResponse.getDefaultInstance()))
              .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<DeleteTenantRequest, Empty> deleteTenantCallable;
  private final UnaryCallable<CreateTenantRequest, Tenant> createTenantCallable;
  private final UnaryCallable<GetTenantRequest, Tenant> getTenantCallable;
  private final UnaryCallable<UpdateTenantRequest, Tenant> updateTenantCallable;
  private final UnaryCallable<ListTenantsRequest, ListTenantsResponse> listTenantsCallable;
  private final UnaryCallable<ListTenantsRequest, ListTenantsPagedResponse>
      listTenantsPagedCallable;

  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcTenantServiceStub create(TenantServiceStubSettings settings)
      throws IOException {
    return new GrpcTenantServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcTenantServiceStub create(ClientContext clientContext) throws IOException {
    return new GrpcTenantServiceStub(TenantServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcTenantServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcTenantServiceStub(
        TenantServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcTenantServiceStub, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected GrpcTenantServiceStub(TenantServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcTenantServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcTenantServiceStub, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected GrpcTenantServiceStub(
      TenantServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    GrpcCallSettings<DeleteTenantRequest, Empty> deleteTenantTransportSettings =
        GrpcCallSettings.<DeleteTenantRequest, Empty>newBuilder()
            .setMethodDescriptor(deleteTenantMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<DeleteTenantRequest>() {
                  @Override
                  public Map<String, String> extract(DeleteTenantRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("name", String.valueOf(request.getName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<CreateTenantRequest, Tenant> createTenantTransportSettings =
        GrpcCallSettings.<CreateTenantRequest, Tenant>newBuilder()
            .setMethodDescriptor(createTenantMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<CreateTenantRequest>() {
                  @Override
                  public Map<String, String> extract(CreateTenantRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("parent", String.valueOf(request.getParent()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<GetTenantRequest, Tenant> getTenantTransportSettings =
        GrpcCallSettings.<GetTenantRequest, Tenant>newBuilder()
            .setMethodDescriptor(getTenantMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<GetTenantRequest>() {
                  @Override
                  public Map<String, String> extract(GetTenantRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("name", String.valueOf(request.getName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<UpdateTenantRequest, Tenant> updateTenantTransportSettings =
        GrpcCallSettings.<UpdateTenantRequest, Tenant>newBuilder()
            .setMethodDescriptor(updateTenantMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<UpdateTenantRequest>() {
                  @Override
                  public Map<String, String> extract(UpdateTenantRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("tenant.name", String.valueOf(request.getTenant().getName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<ListTenantsRequest, ListTenantsResponse> listTenantsTransportSettings =
        GrpcCallSettings.<ListTenantsRequest, ListTenantsResponse>newBuilder()
            .setMethodDescriptor(listTenantsMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<ListTenantsRequest>() {
                  @Override
                  public Map<String, String> extract(ListTenantsRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("parent", String.valueOf(request.getParent()));
                    return params.build();
                  }
                })
            .build();

    this.deleteTenantCallable =
        callableFactory.createUnaryCallable(
            deleteTenantTransportSettings, settings.deleteTenantSettings(), clientContext);
    this.createTenantCallable =
        callableFactory.createUnaryCallable(
            createTenantTransportSettings, settings.createTenantSettings(), clientContext);
    this.getTenantCallable =
        callableFactory.createUnaryCallable(
            getTenantTransportSettings, settings.getTenantSettings(), clientContext);
    this.updateTenantCallable =
        callableFactory.createUnaryCallable(
            updateTenantTransportSettings, settings.updateTenantSettings(), clientContext);
    this.listTenantsCallable =
        callableFactory.createUnaryCallable(
            listTenantsTransportSettings, settings.listTenantsSettings(), clientContext);
    this.listTenantsPagedCallable =
        callableFactory.createPagedCallable(
            listTenantsTransportSettings, settings.listTenantsSettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public UnaryCallable<DeleteTenantRequest, Empty> deleteTenantCallable() {
    return deleteTenantCallable;
  }

  public UnaryCallable<CreateTenantRequest, Tenant> createTenantCallable() {
    return createTenantCallable;
  }

  public UnaryCallable<GetTenantRequest, Tenant> getTenantCallable() {
    return getTenantCallable;
  }

  public UnaryCallable<UpdateTenantRequest, Tenant> updateTenantCallable() {
    return updateTenantCallable;
  }

  public UnaryCallable<ListTenantsRequest, ListTenantsPagedResponse> listTenantsPagedCallable() {
    return listTenantsPagedCallable;
  }

  public UnaryCallable<ListTenantsRequest, ListTenantsResponse> listTenantsCallable() {
    return listTenantsCallable;
  }

  @Override
  public final void close() {
    shutdown();
  }

  @Override
  public void shutdown() {
    backgroundResources.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return backgroundResources.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return backgroundResources.isTerminated();
  }

  @Override
  public void shutdownNow() {
    backgroundResources.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return backgroundResources.awaitTermination(duration, unit);
  }
}
