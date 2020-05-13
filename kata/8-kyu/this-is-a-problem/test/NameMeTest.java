import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class NameMeTest {
  @Test
  void sample() {
    NameMe nameMe = new NameMe("John", "Doe");
    assertEquals("John", nameMe.getFirstName());
    assertEquals("Doe", nameMe.getLastName());
    assertEquals("John Doe", nameMe.getFullName());
  }
}
