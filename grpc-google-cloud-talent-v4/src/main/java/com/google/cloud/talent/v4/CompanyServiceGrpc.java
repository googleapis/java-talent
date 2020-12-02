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
package com.google.cloud.talent.v4;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/** */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/cloud/talent/v4/company_service.proto")
public final class CompanyServiceGrpc {

  private CompanyServiceGrpc() {}

  public static final String SERVICE_NAME = "google.cloud.talent.v4.CompanyService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.talent.v4.CreateCompanyRequest, com.google.cloud.talent.v4.Company>
      getCreateCompanyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCompany",
      requestType = com.google.cloud.talent.v4.CreateCompanyRequest.class,
      responseType = com.google.cloud.talent.v4.Company.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.talent.v4.CreateCompanyRequest, com.google.cloud.talent.v4.Company>
      getCreateCompanyMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.talent.v4.CreateCompanyRequest, com.google.cloud.talent.v4.Company>
        getCreateCompanyMethod;
    if ((getCreateCompanyMethod = CompanyServiceGrpc.getCreateCompanyMethod) == null) {
      synchronized (CompanyServiceGrpc.class) {
        if ((getCreateCompanyMethod = CompanyServiceGrpc.getCreateCompanyMethod) == null) {
          CompanyServiceGrpc.getCreateCompanyMethod =
              getCreateCompanyMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.talent.v4.CreateCompanyRequest,
                          com.google.cloud.talent.v4.Company>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateCompany"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.talent.v4.CreateCompanyRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.talent.v4.Company.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new CompanyServiceMethodDescriptorSupplier("CreateCompany"))
                      .build();
        }
      }
    }
    return getCreateCompanyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.talent.v4.GetCompanyRequest, com.google.cloud.talent.v4.Company>
      getGetCompanyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCompany",
      requestType = com.google.cloud.talent.v4.GetCompanyRequest.class,
      responseType = com.google.cloud.talent.v4.Company.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.talent.v4.GetCompanyRequest, com.google.cloud.talent.v4.Company>
      getGetCompanyMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.talent.v4.GetCompanyRequest, com.google.cloud.talent.v4.Company>
        getGetCompanyMethod;
    if ((getGetCompanyMethod = CompanyServiceGrpc.getGetCompanyMethod) == null) {
      synchronized (CompanyServiceGrpc.class) {
        if ((getGetCompanyMethod = CompanyServiceGrpc.getGetCompanyMethod) == null) {
          CompanyServiceGrpc.getGetCompanyMethod =
              getGetCompanyMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.talent.v4.GetCompanyRequest,
                          com.google.cloud.talent.v4.Company>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCompany"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.talent.v4.GetCompanyRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.talent.v4.Company.getDefaultInstance()))
                      .setSchemaDescriptor(new CompanyServiceMethodDescriptorSupplier("GetCompany"))
                      .build();
        }
      }
    }
    return getGetCompanyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.talent.v4.UpdateCompanyRequest, com.google.cloud.talent.v4.Company>
      getUpdateCompanyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateCompany",
      requestType = com.google.cloud.talent.v4.UpdateCompanyRequest.class,
      responseType = com.google.cloud.talent.v4.Company.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.talent.v4.UpdateCompanyRequest, com.google.cloud.talent.v4.Company>
      getUpdateCompanyMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.talent.v4.UpdateCompanyRequest, com.google.cloud.talent.v4.Company>
        getUpdateCompanyMethod;
    if ((getUpdateCompanyMethod = CompanyServiceGrpc.getUpdateCompanyMethod) == null) {
      synchronized (CompanyServiceGrpc.class) {
        if ((getUpdateCompanyMethod = CompanyServiceGrpc.getUpdateCompanyMethod) == null) {
          CompanyServiceGrpc.getUpdateCompanyMethod =
              getUpdateCompanyMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.talent.v4.UpdateCompanyRequest,
                          com.google.cloud.talent.v4.Company>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateCompany"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.talent.v4.UpdateCompanyRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.talent.v4.Company.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new CompanyServiceMethodDescriptorSupplier("UpdateCompany"))
                      .build();
        }
      }
    }
    return getUpdateCompanyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.talent.v4.DeleteCompanyRequest, com.google.protobuf.Empty>
      getDeleteCompanyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteCompany",
      requestType = com.google.cloud.talent.v4.DeleteCompanyRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.talent.v4.DeleteCompanyRequest, com.google.protobuf.Empty>
      getDeleteCompanyMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.talent.v4.DeleteCompanyRequest, com.google.protobuf.Empty>
        getDeleteCompanyMethod;
    if ((getDeleteCompanyMethod = CompanyServiceGrpc.getDeleteCompanyMethod) == null) {
      synchronized (CompanyServiceGrpc.class) {
        if ((getDeleteCompanyMethod = CompanyServiceGrpc.getDeleteCompanyMethod) == null) {
          CompanyServiceGrpc.getDeleteCompanyMethod =
              getDeleteCompanyMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.talent.v4.DeleteCompanyRequest, com.google.protobuf.Empty>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteCompany"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.talent.v4.DeleteCompanyRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.protobuf.Empty.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new CompanyServiceMethodDescriptorSupplier("DeleteCompany"))
                      .build();
        }
      }
    }
    return getDeleteCompanyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.talent.v4.ListCompaniesRequest,
          com.google.cloud.talent.v4.ListCompaniesResponse>
      getListCompaniesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListCompanies",
      requestType = com.google.cloud.talent.v4.ListCompaniesRequest.class,
      responseType = com.google.cloud.talent.v4.ListCompaniesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.talent.v4.ListCompaniesRequest,
          com.google.cloud.talent.v4.ListCompaniesResponse>
      getListCompaniesMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.talent.v4.ListCompaniesRequest,
            com.google.cloud.talent.v4.ListCompaniesResponse>
        getListCompaniesMethod;
    if ((getListCompaniesMethod = CompanyServiceGrpc.getListCompaniesMethod) == null) {
      synchronized (CompanyServiceGrpc.class) {
        if ((getListCompaniesMethod = CompanyServiceGrpc.getListCompaniesMethod) == null) {
          CompanyServiceGrpc.getListCompaniesMethod =
              getListCompaniesMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.talent.v4.ListCompaniesRequest,
                          com.google.cloud.talent.v4.ListCompaniesResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListCompanies"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.talent.v4.ListCompaniesRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.talent.v4.ListCompaniesResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new CompanyServiceMethodDescriptorSupplier("ListCompanies"))
                      .build();
        }
      }
    }
    return getListCompaniesMethod;
  }

  /** Creates a new async stub that supports all call types for the service */
  public static CompanyServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CompanyServiceStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<CompanyServiceStub>() {
          @java.lang.Override
          public CompanyServiceStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new CompanyServiceStub(channel, callOptions);
          }
        };
    return CompanyServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CompanyServiceBlockingStub newBlockingStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CompanyServiceBlockingStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<CompanyServiceBlockingStub>() {
          @java.lang.Override
          public CompanyServiceBlockingStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new CompanyServiceBlockingStub(channel, callOptions);
          }
        };
    return CompanyServiceBlockingStub.newStub(factory, channel);
  }

  /** Creates a new ListenableFuture-style stub that supports unary calls on the service */
  public static CompanyServiceFutureStub newFutureStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CompanyServiceFutureStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<CompanyServiceFutureStub>() {
          @java.lang.Override
          public CompanyServiceFutureStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new CompanyServiceFutureStub(channel, callOptions);
          }
        };
    return CompanyServiceFutureStub.newStub(factory, channel);
  }

  /** */
  public abstract static class CompanyServiceImplBase implements io.grpc.BindableService {

    /** */
    public void createCompany(
        com.google.cloud.talent.v4.CreateCompanyRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.talent.v4.Company> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateCompanyMethod(), responseObserver);
    }

    /** */
    public void getCompany(
        com.google.cloud.talent.v4.GetCompanyRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.talent.v4.Company> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCompanyMethod(), responseObserver);
    }

    /** */
    public void updateCompany(
        com.google.cloud.talent.v4.UpdateCompanyRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.talent.v4.Company> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateCompanyMethod(), responseObserver);
    }

    /** */
    public void deleteCompany(
        com.google.cloud.talent.v4.DeleteCompanyRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteCompanyMethod(), responseObserver);
    }

    /** */
    public void listCompanies(
        com.google.cloud.talent.v4.ListCompaniesRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.talent.v4.ListCompaniesResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getListCompaniesMethod(), responseObserver);
    }

    @java.lang.Override
    public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
              getCreateCompanyMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.talent.v4.CreateCompanyRequest,
                      com.google.cloud.talent.v4.Company>(this, METHODID_CREATE_COMPANY)))
          .addMethod(
              getGetCompanyMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.talent.v4.GetCompanyRequest,
                      com.google.cloud.talent.v4.Company>(this, METHODID_GET_COMPANY)))
          .addMethod(
              getUpdateCompanyMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.talent.v4.UpdateCompanyRequest,
                      com.google.cloud.talent.v4.Company>(this, METHODID_UPDATE_COMPANY)))
          .addMethod(
              getDeleteCompanyMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.talent.v4.DeleteCompanyRequest, com.google.protobuf.Empty>(
                      this, METHODID_DELETE_COMPANY)))
          .addMethod(
              getListCompaniesMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.talent.v4.ListCompaniesRequest,
                      com.google.cloud.talent.v4.ListCompaniesResponse>(
                      this, METHODID_LIST_COMPANIES)))
          .build();
    }
  }

  /** */
  public static final class CompanyServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CompanyServiceStub> {
    private CompanyServiceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CompanyServiceStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CompanyServiceStub(channel, callOptions);
    }

    /** */
    public void createCompany(
        com.google.cloud.talent.v4.CreateCompanyRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.talent.v4.Company> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateCompanyMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void getCompany(
        com.google.cloud.talent.v4.GetCompanyRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.talent.v4.Company> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCompanyMethod(), getCallOptions()), request, responseObserver);
    }

    /** */
    public void updateCompany(
        com.google.cloud.talent.v4.UpdateCompanyRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.talent.v4.Company> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateCompanyMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void deleteCompany(
        com.google.cloud.talent.v4.DeleteCompanyRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteCompanyMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void listCompanies(
        com.google.cloud.talent.v4.ListCompaniesRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.talent.v4.ListCompaniesResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListCompaniesMethod(), getCallOptions()),
          request,
          responseObserver);
    }
  }

  /** */
  public static final class CompanyServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CompanyServiceBlockingStub> {
    private CompanyServiceBlockingStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CompanyServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CompanyServiceBlockingStub(channel, callOptions);
    }

    /** */
    public com.google.cloud.talent.v4.Company createCompany(
        com.google.cloud.talent.v4.CreateCompanyRequest request) {
      return blockingUnaryCall(getChannel(), getCreateCompanyMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.talent.v4.Company getCompany(
        com.google.cloud.talent.v4.GetCompanyRequest request) {
      return blockingUnaryCall(getChannel(), getGetCompanyMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.talent.v4.Company updateCompany(
        com.google.cloud.talent.v4.UpdateCompanyRequest request) {
      return blockingUnaryCall(getChannel(), getUpdateCompanyMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.protobuf.Empty deleteCompany(
        com.google.cloud.talent.v4.DeleteCompanyRequest request) {
      return blockingUnaryCall(getChannel(), getDeleteCompanyMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.talent.v4.ListCompaniesResponse listCompanies(
        com.google.cloud.talent.v4.ListCompaniesRequest request) {
      return blockingUnaryCall(getChannel(), getListCompaniesMethod(), getCallOptions(), request);
    }
  }

  /** */
  public static final class CompanyServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CompanyServiceFutureStub> {
    private CompanyServiceFutureStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CompanyServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CompanyServiceFutureStub(channel, callOptions);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.talent.v4.Company>
        createCompany(com.google.cloud.talent.v4.CreateCompanyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateCompanyMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.talent.v4.Company>
        getCompany(com.google.cloud.talent.v4.GetCompanyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCompanyMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.talent.v4.Company>
        updateCompany(com.google.cloud.talent.v4.UpdateCompanyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateCompanyMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty>
        deleteCompany(com.google.cloud.talent.v4.DeleteCompanyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteCompanyMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.talent.v4.ListCompaniesResponse>
        listCompanies(com.google.cloud.talent.v4.ListCompaniesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListCompaniesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_COMPANY = 0;
  private static final int METHODID_GET_COMPANY = 1;
  private static final int METHODID_UPDATE_COMPANY = 2;
  private static final int METHODID_DELETE_COMPANY = 3;
  private static final int METHODID_LIST_COMPANIES = 4;

  private static final class MethodHandlers<Req, Resp>
      implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CompanyServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CompanyServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_COMPANY:
          serviceImpl.createCompany(
              (com.google.cloud.talent.v4.CreateCompanyRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.talent.v4.Company>) responseObserver);
          break;
        case METHODID_GET_COMPANY:
          serviceImpl.getCompany(
              (com.google.cloud.talent.v4.GetCompanyRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.talent.v4.Company>) responseObserver);
          break;
        case METHODID_UPDATE_COMPANY:
          serviceImpl.updateCompany(
              (com.google.cloud.talent.v4.UpdateCompanyRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.talent.v4.Company>) responseObserver);
          break;
        case METHODID_DELETE_COMPANY:
          serviceImpl.deleteCompany(
              (com.google.cloud.talent.v4.DeleteCompanyRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LIST_COMPANIES:
          serviceImpl.listCompanies(
              (com.google.cloud.talent.v4.ListCompaniesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.talent.v4.ListCompaniesResponse>)
                  responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private abstract static class CompanyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier,
          io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CompanyServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.cloud.talent.v4.CompanyServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CompanyService");
    }
  }

  private static final class CompanyServiceFileDescriptorSupplier
      extends CompanyServiceBaseDescriptorSupplier {
    CompanyServiceFileDescriptorSupplier() {}
  }

  private static final class CompanyServiceMethodDescriptorSupplier
      extends CompanyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CompanyServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CompanyServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor =
              result =
                  io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                      .setSchemaDescriptor(new CompanyServiceFileDescriptorSupplier())
                      .addMethod(getCreateCompanyMethod())
                      .addMethod(getGetCompanyMethod())
                      .addMethod(getUpdateCompanyMethod())
                      .addMethod(getDeleteCompanyMethod())
                      .addMethod(getListCompaniesMethod())
                      .build();
        }
      }
    }
    return result;
  }
}
