/*
 * Copyright 2020 Google LLC
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

package com.google.cloud.talent.v4;

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.talent.v4.stub.CompanyServiceStub;
import com.google.cloud.talent.v4.stub.CompanyServiceStubSettings;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.Empty;
import com.google.protobuf.FieldMask;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: A service that handles company management, including CRUD and enumeration.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>{@code
 * try (CompanyServiceClient companyServiceClient = CompanyServiceClient.create()) {
 *   TenantName parent = TenantName.of("[PROJECT]", "[TENANT]");
 *   Company company = Company.newBuilder().build();
 *   Company response = companyServiceClient.createCompany(parent, company);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the CompanyServiceClient object to clean up resources such
 * as threads. In the example above, try-with-resources is used, which automatically calls close().
 *
 * <p>The surface of this class includes several types of Java methods for each of the API's
 * methods:
 *
 * <ol>
 *   <li>A "flattened" method. With this type of method, the fields of the request type have been
 *       converted into function parameters. It may be the case that not all fields are available as
 *       parameters, and not every API method will have a flattened method entry point.
 *   <li>A "request object" method. This type of method only takes one parameter, a request object,
 *       which must be constructed before the call. Not every API method will have a request object
 *       method.
 *   <li>A "callable" method. This type of method takes no parameters and returns an immutable API
 *       callable object, which can be used to initiate calls to the service.
 * </ol>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of CompanyServiceSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * CompanyServiceSettings companyServiceSettings =
 *     CompanyServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * CompanyServiceClient companyServiceClient = CompanyServiceClient.create(companyServiceSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * CompanyServiceSettings companyServiceSettings =
 *     CompanyServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * CompanyServiceClient companyServiceClient = CompanyServiceClient.create(companyServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class CompanyServiceClient implements BackgroundResource {
  private final CompanyServiceSettings settings;
  private final CompanyServiceStub stub;

  /** Constructs an instance of CompanyServiceClient with default settings. */
  public static final CompanyServiceClient create() throws IOException {
    return create(CompanyServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of CompanyServiceClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final CompanyServiceClient create(CompanyServiceSettings settings)
      throws IOException {
    return new CompanyServiceClient(settings);
  }

  /**
   * Constructs an instance of CompanyServiceClient, using the given stub for making calls. This is
   * for advanced usage - prefer using create(CompanyServiceSettings).
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final CompanyServiceClient create(CompanyServiceStub stub) {
    return new CompanyServiceClient(stub);
  }

  /**
   * Constructs an instance of CompanyServiceClient, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected CompanyServiceClient(CompanyServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((CompanyServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected CompanyServiceClient(CompanyServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final CompanyServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public CompanyServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new company entity.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (CompanyServiceClient companyServiceClient = CompanyServiceClient.create()) {
   *   TenantName parent = TenantName.of("[PROJECT]", "[TENANT]");
   *   Company company = Company.newBuilder().build();
   *   Company response = companyServiceClient.createCompany(parent, company);
   * }
   * }</pre>
   *
   * @param parent Required. Resource name of the tenant under which the company is created.
   *     <p>The format is "projects/{project_id}/tenants/{tenant_id}", for example,
   *     "projects/foo/tenants/bar".
   * @param company Required. The company to be created.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Company createCompany(TenantName parent, Company company) {
    CreateCompanyRequest request =
        CreateCompanyRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setCompany(company)
            .build();
    return createCompany(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new company entity.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (CompanyServiceClient companyServiceClient = CompanyServiceClient.create()) {
   *   String parent = TenantName.of("[PROJECT]", "[TENANT]").toString();
   *   Company company = Company.newBuilder().build();
   *   Company response = companyServiceClient.createCompany(parent, company);
   * }
   * }</pre>
   *
   * @param parent Required. Resource name of the tenant under which the company is created.
   *     <p>The format is "projects/{project_id}/tenants/{tenant_id}", for example,
   *     "projects/foo/tenants/bar".
   * @param company Required. The company to be created.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Company createCompany(String parent, Company company) {
    CreateCompanyRequest request =
        CreateCompanyRequest.newBuilder().setParent(parent).setCompany(company).build();
    return createCompany(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new company entity.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (CompanyServiceClient companyServiceClient = CompanyServiceClient.create()) {
   *   CreateCompanyRequest request =
   *       CreateCompanyRequest.newBuilder()
   *           .setParent(TenantName.of("[PROJECT]", "[TENANT]").toString())
   *           .setCompany(Company.newBuilder().build())
   *           .build();
   *   Company response = companyServiceClient.createCompany(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Company createCompany(CreateCompanyRequest request) {
    return createCompanyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new company entity.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (CompanyServiceClient companyServiceClient = CompanyServiceClient.create()) {
   *   CreateCompanyRequest request =
   *       CreateCompanyRequest.newBuilder()
   *           .setParent(TenantName.of("[PROJECT]", "[TENANT]").toString())
   *           .setCompany(Company.newBuilder().build())
   *           .build();
   *   ApiFuture<Company> future = companyServiceClient.createCompanyCallable().futureCall(request);
   *   // Do something.
   *   Company response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CreateCompanyRequest, Company> createCompanyCallable() {
    return stub.createCompanyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves specified company.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (CompanyServiceClient companyServiceClient = CompanyServiceClient.create()) {
   *   CompanyName name = CompanyName.of("[PROJECT]", "[TENANT]", "[COMPANY]");
   *   Company response = companyServiceClient.getCompany(name);
   * }
   * }</pre>
   *
   * @param name Required. The resource name of the company to be retrieved.
   *     <p>The format is "projects/{project_id}/tenants/{tenant_id}/companies/{company_id}", for
   *     example, "projects/api-test-project/tenants/foo/companies/bar".
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Company getCompany(CompanyName name) {
    GetCompanyRequest request =
        GetCompanyRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return getCompany(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves specified company.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (CompanyServiceClient companyServiceClient = CompanyServiceClient.create()) {
   *   String name = CompanyName.of("[PROJECT]", "[TENANT]", "[COMPANY]").toString();
   *   Company response = companyServiceClient.getCompany(name);
   * }
   * }</pre>
   *
   * @param name Required. The resource name of the company to be retrieved.
   *     <p>The format is "projects/{project_id}/tenants/{tenant_id}/companies/{company_id}", for
   *     example, "projects/api-test-project/tenants/foo/companies/bar".
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Company getCompany(String name) {
    GetCompanyRequest request = GetCompanyRequest.newBuilder().setName(name).build();
    return getCompany(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves specified company.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (CompanyServiceClient companyServiceClient = CompanyServiceClient.create()) {
   *   GetCompanyRequest request =
   *       GetCompanyRequest.newBuilder()
   *           .setName(CompanyName.of("[PROJECT]", "[TENANT]", "[COMPANY]").toString())
   *           .build();
   *   Company response = companyServiceClient.getCompany(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Company getCompany(GetCompanyRequest request) {
    return getCompanyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves specified company.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (CompanyServiceClient companyServiceClient = CompanyServiceClient.create()) {
   *   GetCompanyRequest request =
   *       GetCompanyRequest.newBuilder()
   *           .setName(CompanyName.of("[PROJECT]", "[TENANT]", "[COMPANY]").toString())
   *           .build();
   *   ApiFuture<Company> future = companyServiceClient.getCompanyCallable().futureCall(request);
   *   // Do something.
   *   Company response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetCompanyRequest, Company> getCompanyCallable() {
    return stub.getCompanyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates specified company.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (CompanyServiceClient companyServiceClient = CompanyServiceClient.create()) {
   *   Company company = Company.newBuilder().build();
   *   FieldMask updateMask = FieldMask.newBuilder().build();
   *   Company response = companyServiceClient.updateCompany(company, updateMask);
   * }
   * }</pre>
   *
   * @param company Required. The company resource to replace the current resource in the system.
   * @param updateMask Strongly recommended for the best service experience.
   *     <p>If [update_mask][google.cloud.talent.v4.UpdateCompanyRequest.update_mask] is provided,
   *     only the specified fields in [company][google.cloud.talent.v4.UpdateCompanyRequest.company]
   *     are updated. Otherwise all the fields are updated.
   *     <p>A field mask to specify the company fields to be updated. Only top level fields of
   *     [Company][google.cloud.talent.v4.Company] are supported.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Company updateCompany(Company company, FieldMask updateMask) {
    UpdateCompanyRequest request =
        UpdateCompanyRequest.newBuilder().setCompany(company).setUpdateMask(updateMask).build();
    return updateCompany(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates specified company.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (CompanyServiceClient companyServiceClient = CompanyServiceClient.create()) {
   *   UpdateCompanyRequest request =
   *       UpdateCompanyRequest.newBuilder()
   *           .setCompany(Company.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   Company response = companyServiceClient.updateCompany(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Company updateCompany(UpdateCompanyRequest request) {
    return updateCompanyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates specified company.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (CompanyServiceClient companyServiceClient = CompanyServiceClient.create()) {
   *   UpdateCompanyRequest request =
   *       UpdateCompanyRequest.newBuilder()
   *           .setCompany(Company.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   ApiFuture<Company> future = companyServiceClient.updateCompanyCallable().futureCall(request);
   *   // Do something.
   *   Company response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<UpdateCompanyRequest, Company> updateCompanyCallable() {
    return stub.updateCompanyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes specified company. Prerequisite: The company has no jobs associated with it.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (CompanyServiceClient companyServiceClient = CompanyServiceClient.create()) {
   *   CompanyName name = CompanyName.of("[PROJECT]", "[TENANT]", "[COMPANY]");
   *   companyServiceClient.deleteCompany(name);
   * }
   * }</pre>
   *
   * @param name Required. The resource name of the company to be deleted.
   *     <p>The format is "projects/{project_id}/tenants/{tenant_id}/companies/{company_id}", for
   *     example, "projects/foo/tenants/bar/companies/baz".
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteCompany(CompanyName name) {
    DeleteCompanyRequest request =
        DeleteCompanyRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    deleteCompany(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes specified company. Prerequisite: The company has no jobs associated with it.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (CompanyServiceClient companyServiceClient = CompanyServiceClient.create()) {
   *   String name = CompanyName.of("[PROJECT]", "[TENANT]", "[COMPANY]").toString();
   *   companyServiceClient.deleteCompany(name);
   * }
   * }</pre>
   *
   * @param name Required. The resource name of the company to be deleted.
   *     <p>The format is "projects/{project_id}/tenants/{tenant_id}/companies/{company_id}", for
   *     example, "projects/foo/tenants/bar/companies/baz".
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteCompany(String name) {
    DeleteCompanyRequest request = DeleteCompanyRequest.newBuilder().setName(name).build();
    deleteCompany(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes specified company. Prerequisite: The company has no jobs associated with it.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (CompanyServiceClient companyServiceClient = CompanyServiceClient.create()) {
   *   DeleteCompanyRequest request =
   *       DeleteCompanyRequest.newBuilder()
   *           .setName(CompanyName.of("[PROJECT]", "[TENANT]", "[COMPANY]").toString())
   *           .build();
   *   companyServiceClient.deleteCompany(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteCompany(DeleteCompanyRequest request) {
    deleteCompanyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes specified company. Prerequisite: The company has no jobs associated with it.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (CompanyServiceClient companyServiceClient = CompanyServiceClient.create()) {
   *   DeleteCompanyRequest request =
   *       DeleteCompanyRequest.newBuilder()
   *           .setName(CompanyName.of("[PROJECT]", "[TENANT]", "[COMPANY]").toString())
   *           .build();
   *   ApiFuture<Empty> future = companyServiceClient.deleteCompanyCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<DeleteCompanyRequest, Empty> deleteCompanyCallable() {
    return stub.deleteCompanyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all companies associated with the project.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (CompanyServiceClient companyServiceClient = CompanyServiceClient.create()) {
   *   TenantName parent = TenantName.of("[PROJECT]", "[TENANT]");
   *   for (Company element : companyServiceClient.listCompanies(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. Resource name of the tenant under which the company is created.
   *     <p>The format is "projects/{project_id}/tenants/{tenant_id}", for example,
   *     "projects/foo/tenants/bar".
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListCompaniesPagedResponse listCompanies(TenantName parent) {
    ListCompaniesRequest request =
        ListCompaniesRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listCompanies(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all companies associated with the project.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (CompanyServiceClient companyServiceClient = CompanyServiceClient.create()) {
   *   String parent = TenantName.of("[PROJECT]", "[TENANT]").toString();
   *   for (Company element : companyServiceClient.listCompanies(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. Resource name of the tenant under which the company is created.
   *     <p>The format is "projects/{project_id}/tenants/{tenant_id}", for example,
   *     "projects/foo/tenants/bar".
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListCompaniesPagedResponse listCompanies(String parent) {
    ListCompaniesRequest request = ListCompaniesRequest.newBuilder().setParent(parent).build();
    return listCompanies(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all companies associated with the project.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (CompanyServiceClient companyServiceClient = CompanyServiceClient.create()) {
   *   ListCompaniesRequest request =
   *       ListCompaniesRequest.newBuilder()
   *           .setParent(TenantName.of("[PROJECT]", "[TENANT]").toString())
   *           .setPageToken("pageToken873572522")
   *           .setPageSize(883849137)
   *           .setRequireOpenJobs(true)
   *           .build();
   *   for (Company element : companyServiceClient.listCompanies(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListCompaniesPagedResponse listCompanies(ListCompaniesRequest request) {
    return listCompaniesPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all companies associated with the project.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (CompanyServiceClient companyServiceClient = CompanyServiceClient.create()) {
   *   ListCompaniesRequest request =
   *       ListCompaniesRequest.newBuilder()
   *           .setParent(TenantName.of("[PROJECT]", "[TENANT]").toString())
   *           .setPageToken("pageToken873572522")
   *           .setPageSize(883849137)
   *           .setRequireOpenJobs(true)
   *           .build();
   *   ApiFuture<Company> future =
   *       companyServiceClient.listCompaniesPagedCallable().futureCall(request);
   *   // Do something.
   *   for (Company element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListCompaniesRequest, ListCompaniesPagedResponse>
      listCompaniesPagedCallable() {
    return stub.listCompaniesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all companies associated with the project.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (CompanyServiceClient companyServiceClient = CompanyServiceClient.create()) {
   *   while (true) {
   *     ListCompaniesResponse response = companyServiceClient.listCompaniesCallable().call(request);
   *     for (Company element : response.getResponsesList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListCompaniesRequest, ListCompaniesResponse> listCompaniesCallable() {
    return stub.listCompaniesCallable();
  }

  @Override
  public final void close() {
    stub.close();
  }

  @Override
  public void shutdown() {
    stub.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return stub.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return stub.isTerminated();
  }

  @Override
  public void shutdownNow() {
    stub.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return stub.awaitTermination(duration, unit);
  }

  public static class ListCompaniesPagedResponse
      extends AbstractPagedListResponse<
          ListCompaniesRequest,
          ListCompaniesResponse,
          Company,
          ListCompaniesPage,
          ListCompaniesFixedSizeCollection> {

    public static ApiFuture<ListCompaniesPagedResponse> createAsync(
        PageContext<ListCompaniesRequest, ListCompaniesResponse, Company> context,
        ApiFuture<ListCompaniesResponse> futureResponse) {
      ApiFuture<ListCompaniesPage> futurePage =
          ListCompaniesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListCompaniesPage, ListCompaniesPagedResponse>() {
            @Override
            public ListCompaniesPagedResponse apply(ListCompaniesPage input) {
              return new ListCompaniesPagedResponse(input);
            }
          },
          MoreExecutors.directExecutor());
    }

    private ListCompaniesPagedResponse(ListCompaniesPage page) {
      super(page, ListCompaniesFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListCompaniesPage
      extends AbstractPage<
          ListCompaniesRequest, ListCompaniesResponse, Company, ListCompaniesPage> {

    private ListCompaniesPage(
        PageContext<ListCompaniesRequest, ListCompaniesResponse, Company> context,
        ListCompaniesResponse response) {
      super(context, response);
    }

    private static ListCompaniesPage createEmptyPage() {
      return new ListCompaniesPage(null, null);
    }

    @Override
    protected ListCompaniesPage createPage(
        PageContext<ListCompaniesRequest, ListCompaniesResponse, Company> context,
        ListCompaniesResponse response) {
      return new ListCompaniesPage(context, response);
    }

    @Override
    public ApiFuture<ListCompaniesPage> createPageAsync(
        PageContext<ListCompaniesRequest, ListCompaniesResponse, Company> context,
        ApiFuture<ListCompaniesResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListCompaniesFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListCompaniesRequest,
          ListCompaniesResponse,
          Company,
          ListCompaniesPage,
          ListCompaniesFixedSizeCollection> {

    private ListCompaniesFixedSizeCollection(List<ListCompaniesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListCompaniesFixedSizeCollection createEmptyCollection() {
      return new ListCompaniesFixedSizeCollection(null, 0);
    }

    @Override
    protected ListCompaniesFixedSizeCollection createCollection(
        List<ListCompaniesPage> pages, int collectionSize) {
      return new ListCompaniesFixedSizeCollection(pages, collectionSize);
    }
  }
}
