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
  private static Tenant tenant;
  private static String tenantId;
  private static Company company;
  private static String companyId;
  private static Job job;
  private static String jobId;
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
    ITSystemTest.tenant = tenantServiceClient.createTenant(request);
    tenantId =
        ITSystemTest.tenant
            .getName()
            .substring(ITSystemTest.tenant.getName().lastIndexOf("/"))
            .replace("/", "");
    // create company
    companyServiceClient = CompanyServiceClient.create();
    TenantOrProjectName companyParent = TenantName.of(PROJECT_ID, tenantId);
    Company company =
        Company.newBuilder().setDisplayName(DISPLAY_NAME).setExternalId(EXTERNAL_ID).build();
    CreateCompanyRequest companyRequest =
        CreateCompanyRequest.newBuilder()
            .setParent(companyParent.toString())
            .setCompany(company)
            .build();
    ITSystemTest.company = companyServiceClient.createCompany(companyRequest);
    companyId =
        ITSystemTest.company
            .getName()
            .substring(ITSystemTest.company.getName().lastIndexOf("/"))
            .replace("/", "");
    // create job
    jobServiceClient = JobServiceClient.create();
    TenantOrProjectName jobParent = TenantName.of(PROJECT_ID, tenantId);
    List<String> uris = Arrays.asList(JOB_APPLICATION_URL);
    Job.ApplicationInfo applicationInfo = Job.ApplicationInfo.newBuilder().addAllUris(uris).build();
    List<String> addresses = Arrays.asList(ADDRESS_ONE, ADDRESS_TWO);
    Job job =
        Job.newBuilder()
            .setCompany(companyId)
            .setRequisitionId(REQUISITION_ID)
            .setTitle(TITLE)
            .setDescription(DESCRIPTION)
            .setApplicationInfo(applicationInfo)
            .addAllAddresses(addresses)
            .setLanguageCode(LANGUAGE_CODE)
            .build();
    CreateJobRequest jobRequest =
        CreateJobRequest.newBuilder().setParent(jobParent.toString()).setJob(job).build();
    ITSystemTest.job = jobServiceClient.createJob(jobRequest);
    jobId =
        ITSystemTest.job
            .getName()
            .substring(ITSystemTest.job.getName().lastIndexOf("/"))
            .replace("/", "");
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
    JobName jobName = JobWithTenantName.of(PROJECT_ID, tenantId, jobId);
    DeleteJobRequest jobRequest = DeleteJobRequest.newBuilder().setName(jobName.toString()).build();
    jobServiceClient.deleteJob(jobRequest);
    jobServiceClient.close();
    // delete company
    CompanyName companyName = CompanyWithTenantName.of(PROJECT_ID, tenantId, companyId);
    DeleteCompanyRequest companyRequest =
        DeleteCompanyRequest.newBuilder().setName(companyName.toString()).build();
    companyServiceClient.deleteCompany(companyRequest);
    companyServiceClient.close();
    // delete tenant
    TenantName name = TenantName.of(PROJECT_ID, tenantId);
    DeleteTenantRequest request = DeleteTenantRequest.newBuilder().setName(name.toString()).build();
    tenantServiceClient.deleteTenant(request);
    tenantServiceClient.close();
  }

  @Test
  public void getTenantTest() {
    TenantName name = TenantName.of(PROJECT_ID, tenantId);
    GetTenantRequest request = GetTenantRequest.newBuilder().setName(name.toString()).build();
    Tenant actual = tenantServiceClient.getTenant(request);
    assertEquals(tenant.getName(), actual.getName());
    assertEquals(tenant.getExternalId(), actual.getExternalId());
  }

  @Test
  public void listTenantsTest() {
    ProjectName parent = ProjectName.of(PROJECT_ID);
    ListTenantsRequest request =
        ListTenantsRequest.newBuilder().setParent(parent.toString()).build();
    for (Tenant tenant : tenantServiceClient.listTenants(request).iterateAll()) {
      if (ITSystemTest.tenant.getName().equals(tenant.getName())) {
        assertEquals(ITSystemTest.tenant.getExternalId(), tenant.getExternalId());
        assertEquals(ITSystemTest.tenant.getName(), tenant.getName());
      }
    }
  }

  @Test
  public void updateTenantTest() {
    String external_id = String.valueOf(Instant.now().getEpochSecond());
    Tenant tenant = ITSystemTest.tenant.toBuilder().setExternalId(external_id).build();
    UpdateTenantRequest request = UpdateTenantRequest.newBuilder().setTenant(tenant).build();
    Tenant actual = tenantServiceClient.updateTenant(request);
    assertEquals(ITSystemTest.tenant.getName(), actual.getName());
    assertEquals(external_id, actual.getExternalId());
  }

  @Test
  public void getCompanyTest() {
    CompanyName name = CompanyWithTenantName.of(PROJECT_ID, tenantId, companyId);
    GetCompanyRequest request = GetCompanyRequest.newBuilder().setName(name.toString()).build();
    Company actual = companyServiceClient.getCompany(request);
    assertEquals(company.getName(), actual.getName());
    assertEquals(company.getDisplayName(), actual.getDisplayName());
    assertEquals(company.getExternalId(), actual.getExternalId());
  }

  @Test
  public void listCompaniesTest() {
    TenantOrProjectName parent = TenantName.of(PROJECT_ID, tenantId);
    ListCompaniesRequest request =
        ListCompaniesRequest.newBuilder().setParent(parent.toString()).build();
    for (Company actual : companyServiceClient.listCompanies(request).iterateAll()) {
      if (company.getName().equals(actual.getName())) {
        assertEquals(company.getName(), actual.getName());
        assertEquals(company.getDisplayName(), actual.getDisplayName());
        assertEquals(company.getExternalId(), actual.getExternalId());
      }
    }
  }

  @Test
  public void updateCompanyTest() {
    String careerSiteUri = "www.example.com";
    Company company = ITSystemTest.company.toBuilder().setCareerSiteUri(careerSiteUri).build();
    UpdateCompanyRequest request = UpdateCompanyRequest.newBuilder().setCompany(company).build();
    Company actual = companyServiceClient.updateCompany(request);
    assertEquals(ITSystemTest.company.getName(), actual.getName());
    assertEquals(ITSystemTest.company.getDisplayName(), actual.getDisplayName());
    assertEquals(careerSiteUri, actual.getCareerSiteUri());
  }

  @Test
  public void getJobTest() {
    JobName name = JobWithTenantName.of(PROJECT_ID, tenantId, jobId);
    GetJobRequest request = GetJobRequest.newBuilder().setName(name.toString()).build();
    Job actual = jobServiceClient.getJob(request);
    assertEquals(job.getName(), actual.getName());
    assertEquals(job.getCompany(), actual.getCompany());
    assertEquals(job.getRequisitionId(), actual.getRequisitionId());
    assertEquals(job.getTitle(), actual.getTitle());
    assertEquals(job.getDescription(), actual.getDescription());
    assertEquals(job.getApplicationInfo(), actual.getApplicationInfo());
    assertEquals(job.getAddressesCount(), actual.getAddressesCount());
    assertEquals(job.getLanguageCode(), actual.getLanguageCode());
  }

  @Test
  public void listJobsTest() {
    TenantOrProjectName parent = TenantName.of(PROJECT_ID, tenantId);
    String filter = "companyName =" + "\"" + company.getName() + "\"";
    ListJobsRequest request =
        ListJobsRequest.newBuilder().setParent(parent.toString()).setFilter(filter).build();
    for (Job actual : jobServiceClient.listJobs(request).iterateAll()) {
      if (job.getName().equals(actual.getName())) {
        assertEquals(job.getName(), actual.getName());
        assertEquals(job.getCompany(), actual.getCompany());
        assertEquals(job.getRequisitionId(), actual.getRequisitionId());
        assertEquals(job.getTitle(), actual.getTitle());
        assertEquals(job.getDescription(), actual.getDescription());
        assertEquals(job.getApplicationInfo(), actual.getApplicationInfo());
        assertEquals(job.getAddressesCount(), actual.getAddressesCount());
        assertEquals(job.getLanguageCode(), actual.getLanguageCode());
      }
    }
  }

  @Test
  public void updateJobTest() {
    String department = "Information technology";
    Job job = ITSystemTest.job.toBuilder().setDepartment(department).build();
    UpdateJobRequest request = UpdateJobRequest.newBuilder().setJob(job).build();
    Job actual = jobServiceClient.updateJob(request);
    assertEquals(ITSystemTest.job.getName(), actual.getName());
    assertEquals(ITSystemTest.job.getCompany(), actual.getCompany());
    assertEquals(ITSystemTest.job.getRequisitionId(), actual.getRequisitionId());
    assertEquals(ITSystemTest.job.getTitle(), actual.getTitle());
    assertEquals(ITSystemTest.job.getDescription(), actual.getDescription());
    assertEquals(ITSystemTest.job.getApplicationInfo(), actual.getApplicationInfo());
    assertEquals(ITSystemTest.job.getAddressesCount(), actual.getAddressesCount());
    assertEquals(ITSystemTest.job.getLanguageCode(), actual.getLanguageCode());
    assertEquals(department, actual.getDepartment());
  }

  @Test
  public void createEventTest() {
    String requestId = String.valueOf(Instant.now().getEpochSecond());
    String eventId = String.valueOf(Instant.now().getEpochSecond());
    Instant now = Instant.now();
    TenantOrProjectName parent = TenantName.of(PROJECT_ID, tenantId);
    Timestamp createTime =
        Timestamp.newBuilder().setSeconds(now.getEpochSecond()).setNanos(now.getNano()).build();
    JobEvent.JobEventType type = JobEvent.JobEventType.VIEW;
    List<String> jobs = Arrays.asList(job.getName());
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
    TenantOrProjectName parent = TenantName.of(PROJECT_ID, tenantId);
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
