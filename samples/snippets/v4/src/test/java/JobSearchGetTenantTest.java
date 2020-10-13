/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
import static com.google.common.truth.Truth.assertThat;

import com.example.jobs.JobSearchGetTenant;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JobSearchGetTenantTest {
  private static final String PROJECT_ID = System.getenv("GOOGLE_CLOUD_PROJECT");
  private static final String TENANT_ID = System.getenv("CTS_TENANT_ID");

  private ByteArrayOutputStream bout;
  private PrintStream out;

  @Before
  public void setUp() throws IOException {
    bout = new ByteArrayOutputStream();
    out = new PrintStream(bout);
    System.setOut(out);
  }

  @Test
  public void testGetTenant() throws IOException {
    // retrieve a tenant.
    JobSearchGetTenant.getTenant(PROJECT_ID, TENANT_ID);
    String got = bout.toString();
    assertThat(got).contains("Name:");
    assertThat(got).contains("External ID:");
  }

  @After
  public void tearDown() throws IOException {

    System.setOut(null);
  }
}
