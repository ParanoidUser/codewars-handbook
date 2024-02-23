import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class SolutionTest {
  private static TestServer server;

  @BeforeAll
  static void start() throws Exception {
    server = new TestServer(1111);
    server.start();
  }

  @ParameterizedTest
  @ValueSource(booleans = {true, false, true, false, false, true, true, true, true, false})
  void sample(boolean regular) {
    server.setRegular(regular);
    assertEquals(regular, Solution.isRegularServer());
  }

  @AfterAll
  static void stop() throws Exception {
    if (server != null) {
      server.halt();
    }
  }
}