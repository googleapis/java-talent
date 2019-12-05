/*
 * Copyright 2019 Google LLC
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
package com.google.cloud.talent.v4beta1.it;

import static org.junit.Assert.assertEquals;

import com.google.cloud.ServiceOptions;
import com.google.cloud.talent.v4beta1.ClientEvent;
import com.google.cloud.talent.v4beta1.Company;
import com.google.cloud.talent.v4beta1.CompanyName;
import com.google.cloud.talent.v4beta1.CompanyServiceClient;
import com.google.cloud.talent.v4beta1.CompanyWithTenantName;
import com.google.cloud.talent.v4beta1.CompleteQueryRequest;
import com.google.cloud.talent.v4beta1.CompleteQueryResponse;
import com.google.cloud.talent.v4beta1.CompletionClient;
import com.google.cloud.talent.v4beta1.CreateClientEventRequest;
import com.google.cloud.talent.v4beta1.CreateCompanyRequest;
import com.google.cloud.talent.v4beta1.CreateJobRequest;
import com.google.cloud.talent.v4beta1.CreateTenantRequest;
import com.google.cloud.talent.v4beta1.DeleteCompanyRequest;
import com.google.cloud.talent.v4beta1.DeleteJobRequest;
import com.google.cloud.talent.v4beta1.DeleteTenantRequest;
import com.google.cloud.talent.v4beta1.EventServiceClient;
import com.google.cloud.talent.v4beta1.GetCompanyRequest;
import com.google.cloud.talent.v4beta1.GetJobRequest;
import com.google.cloud.talent.v4beta1.GetTenantRequest;
import com.google.cloud.talent.v4beta1.Job;
import com.google.cloud.talent.v4beta1.JobEvent;
import com.google.cloud.talent.v4beta1.JobName;
import com.google.cloud.talent.v4beta1.JobServiceClient;
import com.google.cloud.talent.v4beta1.JobWithTenantName;
import com.google.cloud.talent.v4beta1.ListCompaniesRequest;
import com.google.cloud.talent.v4beta1.ListJobsRequest;
import com.google.cloud.talent.v4beta1.ListTenantsRequest;
import com.google.cloud.talent.v4beta1.ProjectName;
import com.google.cloud.talent.v4beta1.Tenant;
import com.google.cloud.talent.v4beta1.TenantName;
import com.google.cloud.talent.v4beta1.TenantOrProjectName;
import com.google.cloud.talent.v4beta1.TenantServiceClient;
import com.google.cloud.talent.v4beta1.UpdateCompanyRequest;
import com.google.cloud.talent.v4beta1.UpdateJobRequest;
import com.google.cloud.talent.v4beta1.UpdateTenantRequest;
import com.google.protobuf.Timestamp;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.threeten.bp.Instant;

public class ITSystemTest {

  private static TenantServiceClient tenantServiceClient;
  private static CompanyServiceClient companyServiceClient;
  private static JobServiceClient jobServiceClient;
  private static EventServiceClient eventServiceClient;
  private static CompletionClient completionClient;
  private static Tenant TENANT;
  private static String TENANT_ID;
  private static Company COMPANY;
  private static String COMPANY_ID;
  private static Job JOB;
  private static String JOB_ID;
  private static final String PROJECT_ID = ServiceOptions.getDefaultProjectId();
  private static final String TENANT_NAME =
      "projects/"
          + PROJECT_ID
          + "/tenants/"
          + "tenant-test-"
          + UUID.randomUUID().toString().substring(0, 8);
  private static final String DISPLAY_NAME =
      "display-name-test-" + UUID.randomUUID().toString().substring(0, 8);
  private static final String EXTERNAL_ID = String.valueOf(Instant.now().getEpochSecond());
  private static final String REQUISITION_ID = String.valueOf(Instant.now().getEpochSecond());
  private static final String DESCRIPTION = "This is a description of this <i>wonderful</i> job!";
  private static final String TITLE = "Software Engineer";
  private static final String JOB_APPLICATION_URL = "https://www.example.org/job-posting/123";
  private static final String ADDRESS_ONE = "1600 Amphitheatre Parkway, Mountain View, CA 94043";
  private static final String ADDRESS_TWO = "111 8th Avenue, New York, NY 10011";
  private static final String LANGUAGE_CODE = "en-US";

  @BeforeClass
  public static void beforeTest() throws IOException {
    // create tenant
    tenantServiceClient = TenantServiceClient.create();
    ProjectName parent = ProjectName.of(PROJECT_ID);
    Tenant tenant = Tenant.newBuilder().setName(TENANT_NAME).setExternalId(EXTERNAL_ID).build();
    CreateTenantRequest request =
        CreateTenantRequest.newBuilder().setParent(parent.toString()).setTenant(tenant).build();
    TENANT = tenantServiceClient.createTenant(request);
    TENANT_ID = TENANT.getName().substring(TENANT.getName().lastIndexOf("/")).replace("/", "");
    // create company
    companyServiceClient = CompanyServiceClient.create();
    TenantOrProjectName companyParent = TenantName.of(PROJECT_ID, TENANT_ID);
    Company company =
        Company.newBuilder().setDisplayName(DISPLAY_NAME).setExternalId(EXTERNAL_ID).build();
    CreateCompanyRequest companyRequest =
        CreateCompanyRequest.newBuilder()
            .setParent(companyParent.toString())
            .setCompany(company)
            .build();
    COMPANY = companyServiceClient.createCompany(companyRequest);
    COMPANY_ID = COMPANY.getName().substring(COMPANY.getName().lastIndexOf("/")).replace("/", "");
    // create job
    jobServiceClient = JobServiceClient.create();
    TenantOrProjectName jobParent = TenantName.of(PROJECT_ID, TENANT_ID);
    List<String> uris = Arrays.asList(JOB_APPLICATION_URL);
    Job.ApplicationInfo applicationInfo = Job.ApplicationInfo.newBuilder().addAllUris(uris).build();
    List<String> addresses = Arrays.asList(ADDRESS_ONE, ADDRESS_TWO);
    Job job =
        Job.newBuilder()
            .setCompany(COMPANY_ID)
            .setRequisitionId(REQUISITION_ID)
            .setTitle(TITLE)
            .setDescription(DESCRIPTION)
            .setApplicationInfo(applicationInfo)
            .addAllAddresses(addresses)
            .setLanguageCode(LANGUAGE_CODE)
            .build();
    CreateJobRequest jobRequest =
        CreateJobRequest.newBuilder().setParent(jobParent.toString()).setJob(job).build();
    JOB = jobServiceClient.createJob(jobRequest);
    JOB_ID = JOB.getName().substring(JOB.getName().lastIndexOf("/")).replace("/", "");
    // create event
    eventServiceClient = EventServiceClient.create();
    // create completion
    completionClient = CompletionClient.create();
  }

  @AfterClass
  public static void afterTest() {
    completionClient.close();
    eventServiceClient.close();
    // delete job
    JobName jobName = JobWithTenantName.of(PROJECT_ID, TENANT_ID, JOB_ID);
    DeleteJobRequest jobRequest = DeleteJobRequest.newBuilder().setName(jobName.toString()).build();
    jobServiceClient.deleteJob(jobRequest);
    jobServiceClient.close();
    // delete company
    CompanyName companyName = CompanyWithTenantName.of(PROJECT_ID, TENANT_ID, COMPANY_ID);
    DeleteCompanyRequest companyRequest =
        DeleteCompanyRequest.newBuilder().setName(companyName.toString()).build();
    companyServiceClient.deleteCompany(companyRequest);
    companyServiceClient.close();
    // delete tenant
    TenantName name = TenantName.of(PROJECT_ID, TENANT_ID);
    DeleteTenantRequest request = DeleteTenantRequest.newBuilder().setName(name.toString()).build();
    tenantServiceClient.deleteTenant(request);
    tenantServiceClient.close();
  }

  @Test
  public void getTenantTest() {
    TenantName name = TenantName.of(PROJECT_ID, TENANT_ID);
    GetTenantRequest request = GetTenantRequest.newBuilder().setName(name.toString()).build();
    Tenant actual = tenantServiceClient.getTenant(request);
    assertEquals(TENANT.getName(), actual.getName());
    assertEquals(TENANT.getExternalId(), actual.getExternalId());
  }

  @Test
  public void listTenantsTest() {
    ProjectName parent = ProjectName.of(PROJECT_ID);
    ListTenantsRequest request =
        ListTenantsRequest.newBuilder().setParent(parent.toString()).build();
    for (Tenant tenant : tenantServiceClient.listTenants(request).iterateAll()) {
      if (TENANT.getName().equals(tenant.getName())) {
        assertEquals(TENANT.getExternalId(), tenant.getExternalId());
        assertEquals(TENANT.getName(), tenant.getName());
      }
    }
  }

  @Test
  public void updateTenantTest() {
    String external_id = String.valueOf(Instant.now().getEpochSecond());
    Tenant tenant = TENANT.toBuilder().setExternalId(external_id).build();
    UpdateTenantRequest request = UpdateTenantRequest.newBuilder().setTenant(tenant).build();
    Tenant actual = tenantServiceClient.updateTenant(request);
    assertEquals(TENANT.getName(), actual.getName());
    assertEquals(external_id, actual.getExternalId());
  }

  @Test
  public void getCompanyTest() {
    CompanyName name = CompanyWithTenantName.of(PROJECT_ID, TENANT_ID, COMPANY_ID);
    GetCompanyRequest request = GetCompanyRequest.newBuilder().setName(name.toString()).build();
    Company actual = companyServiceClient.getCompany(request);
    assertEquals(COMPANY.getName(), actual.getName());
    assertEquals(COMPANY.getDisplayName(), actual.getDisplayName());
    assertEquals(COMPANY.getExternalId(), actual.getExternalId());
  }

  @Test
  public void listCompaniesTest() {
    TenantOrProjectName parent = TenantName.of(PROJECT_ID, TENANT_ID);
    ListCompaniesRequest request =
        ListCompaniesRequest.newBuilder().setParent(parent.toString()).build();
    for (Company actual : companyServiceClient.listCompanies(request).iterateAll()) {
      if (COMPANY.getName().equals(actual.getName())) {
        assertEquals(COMPANY.getName(), actual.getName());
        assertEquals(COMPANY.getDisplayName(), actual.getDisplayName());
        assertEquals(COMPANY.getExternalId(), actual.getExternalId());
      }
    }
  }

  @Test
  public void updateCompanyTest() {
    String careerSiteUri = "www.example.com";
    Company company = COMPANY.toBuilder().setCareerSiteUri(careerSiteUri).build();
    UpdateCompanyRequest request = UpdateCompanyRequest.newBuilder().setCompany(company).build();
    Company actual = companyServiceClient.updateCompany(request);
    assertEquals(COMPANY.getName(), actual.getName());
    assertEquals(COMPANY.getDisplayName(), actual.getDisplayName());
    assertEquals(careerSiteUri, actual.getCareerSiteUri());
  }

  @Test
  public void getJobTest() {
    JobName name = JobWithTenantName.of(PROJECT_ID, TENANT_ID, JOB_ID);
    GetJobRequest request = GetJobRequest.newBuilder().setName(name.toString()).build();
    Job actual = jobServiceClient.getJob(request);
    assertEquals(JOB.getName(), actual.getName());
    assertEquals(JOB.getCompany(), actual.getCompany());
    assertEquals(JOB.getRequisitionId(), actual.getRequisitionId());
    assertEquals(JOB.getTitle(), actual.getTitle());
    assertEquals(JOB.getDescription(), actual.getDescription());
    assertEquals(JOB.getApplicationInfo(), actual.getApplicationInfo());
    assertEquals(JOB.getAddressesCount(), actual.getAddressesCount());
    assertEquals(JOB.getLanguageCode(), actual.getLanguageCode());
  }

  @Test
  public void listJobsTest() {
    TenantOrProjectName parent = TenantName.of(PROJECT_ID, TENANT_ID);
    String filter = "companyName =" + "\"" + COMPANY.getName() + "\"";
    ListJobsRequest request =
        ListJobsRequest.newBuilder().setParent(parent.toString()).setFilter(filter).build();
    for (Job actual : jobServiceClient.listJobs(request).iterateAll()) {
      if (JOB.getName().equals(actual.getName())) {
        assertEquals(JOB.getName(), actual.getName());
        assertEquals(JOB.getCompany(), actual.getCompany());
        assertEquals(JOB.getRequisitionId(), actual.getRequisitionId());
        assertEquals(JOB.getTitle(), actual.getTitle());
        assertEquals(JOB.getDescription(), actual.getDescription());
        assertEquals(JOB.getApplicationInfo(), actual.getApplicationInfo());
        assertEquals(JOB.getAddressesCount(), actual.getAddressesCount());
        assertEquals(JOB.getLanguageCode(), actual.getLanguageCode());
      }
    }
  }

  @Test
  public void updateJobTest() {
    String department = "Information technology";
    Job job = JOB.toBuilder().setDepartment(department).build();
    UpdateJobRequest request = UpdateJobRequest.newBuilder().setJob(job).build();
    Job actual = jobServiceClient.updateJob(request);
    assertEquals(JOB.getName(), actual.getName());
    assertEquals(JOB.getCompany(), actual.getCompany());
    assertEquals(JOB.getRequisitionId(), actual.getRequisitionId());
    assertEquals(JOB.getTitle(), actual.getTitle());
    assertEquals(JOB.getDescription(), actual.getDescription());
    assertEquals(JOB.getApplicationInfo(), actual.getApplicationInfo());
    assertEquals(JOB.getAddressesCount(), actual.getAddressesCount());
    assertEquals(JOB.getLanguageCode(), actual.getLanguageCode());
    assertEquals(department, actual.getDepartment());
  }

  @Test
  public void createEventTest() {
    String requestId = String.valueOf(Instant.now().getEpochSecond());
    String eventId = String.valueOf(Instant.now().getEpochSecond());
    Instant now = Instant.now();
    TenantOrProjectName parent = TenantName.of(PROJECT_ID, TENANT_ID);
    Timestamp createTime =
        Timestamp.newBuilder().setSeconds(now.getEpochSecond()).setNanos(now.getNano()).build();
    JobEvent.JobEventType type = JobEvent.JobEventType.VIEW;
    List<String> jobs = Arrays.asList(JOB.getName());
    JobEvent jobEvent = JobEvent.newBuilder().setType(type).addAllJobs(jobs).build();
    ClientEvent clientEvent =
        ClientEvent.newBuilder()
            .setRequestId(requestId)
            .setEventId(eventId)
            .setCreateTime(createTime)
            .setJobEvent(jobEvent)
            .build();
    CreateClientEventRequest request =
        CreateClientEventRequest.newBuilder()
            .setParent(parent.toString())
            .setClientEvent(clientEvent)
            .build();
    ClientEvent actual = eventServiceClient.createClientEvent(request);
    assertEquals(requestId, actual.getRequestId());
    assertEquals(eventId, actual.getEventId());
    assertEquals(createTime, actual.getCreateTime());
    assertEquals(jobEvent.getType(), actual.getJobEvent().getType());
  }

  @Test
  public void completeQueryTest() {
    TenantOrProjectName parent = TenantName.of(PROJECT_ID, TENANT_ID);
    List<String> languageCodes = Arrays.asList("en-US");
    CompleteQueryRequest request =
        CompleteQueryRequest.newBuilder()
            .setParent(parent.toString())
            .setQuery("Soft")
            .setPageSize(5)
            .addAllLanguageCodes(languageCodes)
            .build();
    CompleteQueryResponse queryResponse = completionClient.completeQuery(request);
    for (CompleteQueryResponse.CompletionResult result : queryResponse.getCompletionResultsList()) {
      if (TITLE.equals(result.getSuggestion())) {
        assertEquals(CompleteQueryRequest.CompletionType.JOB_TITLE, result.getType());
      }
    }
  }
}
