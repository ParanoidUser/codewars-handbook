import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FunctionalProgrammingTest {
  @Test
  public void testJohnSmith() {
    Student jSmith = new Student("John", "Smith", "js123");
    assertTrue("John Smith with student number js123 did not return true", FunctionalProgramming.f.apply(jSmith));
  }
}
