import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class NameMeTest {
  @Test
  public void testNameMeOne() {
    NameMe nameMe = new NameMe("John", "Doe");
    assertEquals("Verifying First name. Object returned should contain the firstname: John", "John", nameMe.getFirstName());
    assertEquals("Verifying Last name. Object returned should contain the lastname: Doe", "Doe", nameMe.getLastName());
    assertNotEquals("Verifying full name. Object returned should contain full name: John Doe", "JohnDoe", nameMe.getFullName());
    assertEquals("Verifying full name. Object returned should contain full name: John Doe", "John Doe", nameMe.getFullName());
  }
}
