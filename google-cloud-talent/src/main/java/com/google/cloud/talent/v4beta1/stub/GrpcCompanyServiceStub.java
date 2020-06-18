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

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.RequestParamsExtractor;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.talent.v4beta1.Company;
import com.google.cloud.talent.v4beta1.CreateCompanyRequest;
import com.google.cloud.talent.v4beta1.DeleteCompanyRequest;
import com.google.cloud.talent.v4beta1.GetCompanyRequest;
import com.google.cloud.talent.v4beta1.ListCompaniesRequest;
import com.google.cloud.talent.v4beta1.ListCompaniesResponse;
import com.google.cloud.talent.v4beta1.UpdateCompanyRequest;
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
public class GrpcCompanyServiceStub extends CompanyServiceStub {

  private static final MethodDescriptor<CreateCompanyRequest, Company>
      createCompanyMethodDescriptor =
          MethodDescriptor.<CreateCompanyRequest, Company>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.talent.v4beta1.CompanyService/CreateCompany")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(CreateCompanyRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Company.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<GetCompanyRequest, Company> getCompanyMethodDescriptor =
      MethodDescriptor.<GetCompanyRequest, Company>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.cloud.talent.v4beta1.CompanyService/GetCompany")
          .setRequestMarshaller(ProtoUtils.marshaller(GetCompanyRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Company.getDefaultInstance()))
          .build();
  private static final MethodDescriptor<UpdateCompanyRequest, Company>
      updateCompanyMethodDescriptor =
          MethodDescriptor.<UpdateCompanyRequest, Company>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.talent.v4beta1.CompanyService/UpdateCompany")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(UpdateCompanyRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Company.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<DeleteCompanyRequest, Empty> deleteCompanyMethodDescriptor =
      MethodDescriptor.<DeleteCompanyRequest, Empty>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.cloud.talent.v4beta1.CompanyService/DeleteCompany")
          .setRequestMarshaller(ProtoUtils.marshaller(DeleteCompanyRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Empty.getDefaultInstance()))
          .build();
  private static final MethodDescriptor<ListCompaniesRequest, ListCompaniesResponse>
      listCompaniesMethodDescriptor =
          MethodDescriptor.<ListCompaniesRequest, ListCompaniesResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.talent.v4beta1.CompanyService/ListCompanies")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListCompaniesRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListCompaniesResponse.getDefaultInstance()))
              .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<CreateCompanyRequest, Company> createCompanyCallable;
  private final UnaryCallable<GetCompanyRequest, Company> getCompanyCallable;
  private final UnaryCallable<UpdateCompanyRequest, Company> updateCompanyCallable;
  private final UnaryCallable<DeleteCompanyRequest, Empty> deleteCompanyCallable;
  private final UnaryCallable<ListCompaniesRequest, ListCompaniesResponse> listCompaniesCallable;
  private final UnaryCallable<ListCompaniesRequest, ListCompaniesPagedResponse>
      listCompaniesPagedCallable;

  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcCompanyServiceStub create(CompanyServiceStubSettings settings)
      throws IOException {
    return new GrpcCompanyServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcCompanyServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcCompanyServiceStub(
        CompanyServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcCompanyServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcCompanyServiceStub(
        CompanyServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcCompanyServiceStub, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected GrpcCompanyServiceStub(CompanyServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcCompanyServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcCompanyServiceStub, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected GrpcCompanyServiceStub(
      CompanyServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    GrpcCallSettings<CreateCompanyRequest, Company> createCompanyTransportSettings =
        GrpcCallSettings.<CreateCompanyRequest, Company>newBuilder()
            .setMethodDescriptor(createCompanyMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<CreateCompanyRequest>() {
                  @Override
                  public Map<String, String> extract(CreateCompanyRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("parent", String.valueOf(request.getParent()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<GetCompanyRequest, Company> getCompanyTransportSettings =
        GrpcCallSettings.<GetCompanyRequest, Company>newBuilder()
            .setMethodDescriptor(getCompanyMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<GetCompanyRequest>() {
                  @Override
                  public Map<String, String> extract(GetCompanyRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("name", String.valueOf(request.getName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<UpdateCompanyRequest, Company> updateCompanyTransportSettings =
        GrpcCallSettings.<UpdateCompanyRequest, Company>newBuilder()
            .setMethodDescriptor(updateCompanyMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<UpdateCompanyRequest>() {
                  @Override
                  public Map<String, String> extract(UpdateCompanyRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("company.name", String.valueOf(request.getCompany().getName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<DeleteCompanyRequest, Empty> deleteCompanyTransportSettings =
        GrpcCallSettings.<DeleteCompanyRequest, Empty>newBuilder()
            .setMethodDescriptor(deleteCompanyMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<DeleteCompanyRequest>() {
                  @Override
                  public Map<String, String> extract(DeleteCompanyRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("name", String.valueOf(request.getName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<ListCompaniesRequest, ListCompaniesResponse> listCompaniesTransportSettings =
        GrpcCallSettings.<ListCompaniesRequest, ListCompaniesResponse>newBuilder()
            .setMethodDescriptor(listCompaniesMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<ListCompaniesRequest>() {
                  @Override
                  public Map<String, String> extract(ListCompaniesRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("parent", String.valueOf(request.getParent()));
                    return params.build();
                  }
                })
            .build();

    this.createCompanyCallable =
        callableFactory.createUnaryCallable(
            createCompanyTransportSettings, settings.createCompanySettings(), clientContext);
    this.getCompanyCallable =
        callableFactory.createUnaryCallable(
            getCompanyTransportSettings, settings.getCompanySettings(), clientContext);
    this.updateCompanyCallable =
        callableFactory.createUnaryCallable(
            updateCompanyTransportSettings, settings.updateCompanySettings(), clientContext);
    this.deleteCompanyCallable =
        callableFactory.createUnaryCallable(
            deleteCompanyTransportSettings, settings.deleteCompanySettings(), clientContext);
    this.listCompaniesCallable =
        callableFactory.createUnaryCallable(
            listCompaniesTransportSettings, settings.listCompaniesSettings(), clientContext);
    this.listCompaniesPagedCallable =
        callableFactory.createPagedCallable(
            listCompaniesTransportSettings, settings.listCompaniesSettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public UnaryCallable<CreateCompanyRequest, Company> createCompanyCallable() {
    return createCompanyCallable;
  }

  public UnaryCallable<GetCompanyRequest, Company> getCompanyCallable() {
    return getCompanyCallable;
  }

  public UnaryCallable<UpdateCompanyRequest, Company> updateCompanyCallable() {
    return updateCompanyCallable;
  }

  public UnaryCallable<DeleteCompanyRequest, Empty> deleteCompanyCallable() {
    return deleteCompanyCallable;
  }

  public UnaryCallable<ListCompaniesRequest, ListCompaniesPagedResponse>
      listCompaniesPagedCallable() {
    return listCompaniesPagedCallable;
  }

  public UnaryCallable<ListCompaniesRequest, ListCompaniesResponse> listCompaniesCallable() {
    return listCompaniesCallable;
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
