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

import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.testing.LocalChannelProvider;
import com.google.api.gax.grpc.testing.MockGrpcService;
import com.google.api.gax.grpc.testing.MockServiceHelper;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.protobuf.AbstractMessage;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@javax.annotation.Generated("by GAPIC")
public class EventServiceClientTest {
  private static MockApplicationService mockApplicationService;
  private static MockCompanyService mockCompanyService;
  private static MockCompletion mockCompletion;
  private static MockEventService mockEventService;
  private static MockJobService mockJobService;
  private static MockProfileService mockProfileService;
  private static MockTenantService mockTenantService;
  private static MockServiceHelper serviceHelper;
  private EventServiceClient client;
  private LocalChannelProvider channelProvider;

  @BeforeClass
  public static void startStaticServer() {
    mockApplicationService = new MockApplicationService();
    mockCompanyService = new MockCompanyService();
    mockCompletion = new MockCompletion();
    mockEventService = new MockEventService();
    mockJobService = new MockJobService();
    mockProfileService = new MockProfileService();
    mockTenantService = new MockTenantService();
    serviceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(
                mockApplicationService,
                mockCompanyService,
                mockCompletion,
                mockEventService,
                mockJobService,
                mockProfileService,
                mockTenantService));
    serviceHelper.start();
  }

  @AfterClass
  public static void stopServer() {
    serviceHelper.stop();
  }

  @Before
  public void setUp() throws IOException {
    serviceHelper.reset();
    channelProvider = serviceHelper.createChannelProvider();
    EventServiceSettings settings =
        EventServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = EventServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  @SuppressWarnings("all")
  public void createClientEventTest() {
    String requestId = "requestId37109963";
    String eventId = "eventId278118624";
    String eventNotes = "eventNotes445073628";
    ClientEvent expectedResponse =
        ClientEvent.newBuilder()
            .setRequestId(requestId)
            .setEventId(eventId)
            .setEventNotes(eventNotes)
            .build();
    mockEventService.addResponse(expectedResponse);

    TenantOrProjectName parent = TenantName.of("[PROJECT]", "[TENANT]");
    ClientEvent clientEvent = ClientEvent.newBuilder().build();

    ClientEvent actualResponse = client.createClientEvent(parent, clientEvent);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockEventService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateClientEventRequest actualRequest = (CreateClientEventRequest) actualRequests.get(0);

    Assert.assertEquals(parent, TenantOrProjectNames.parse(actualRequest.getParent()));
    Assert.assertEquals(clientEvent, actualRequest.getClientEvent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void createClientEventExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockEventService.addException(exception);

    try {
      TenantOrProjectName parent = TenantName.of("[PROJECT]", "[TENANT]");
      ClientEvent clientEvent = ClientEvent.newBuilder().build();

      client.createClientEvent(parent, clientEvent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }
}
