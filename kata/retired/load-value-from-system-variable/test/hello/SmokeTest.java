package hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class SmokeTest {
  @BeforeAll
  static void setUp() {
    System.setProperty("name", "world");
  }

  @Test
  void loadsNameFromSystem(@Autowired HomeController controller) {
    assertNotNull(controller);
    assertEquals("Hello world!", controller.greeting());
  }

  @AfterAll
  static void tearDown() {
    System.clearProperty("name");
  }
}