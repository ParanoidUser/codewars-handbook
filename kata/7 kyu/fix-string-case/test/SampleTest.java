import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SampleTest {
  @Test
  public void basicTests() {
    assertEquals("code", Solution.solve("code"));
    assertEquals("CODE", Solution.solve("CODe"));
    assertEquals("code", Solution.solve("COde"));
    assertEquals("code", Solution.solve("Code"));
    assertEquals("", Solution.solve(""));
    assertEquals("JHQURKNGWJJQJXIOIYSZLYSQHZMWIKZOXHBVGPKSJLIOO", Solution.solve("JHquRKngWJJQjxIOiYSzLySqhZmwIKZOxHbvGpKsjlIoo"));
  }
}
