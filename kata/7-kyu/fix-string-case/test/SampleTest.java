import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SampleTest {
  @Test
  void sample() {
    assertEquals("code", Solution.solve("code"));
    assertEquals("CODE", Solution.solve("CODe"));
    assertEquals("code", Solution.solve("COde"));
    assertEquals("code", Solution.solve("Code"));
    assertEquals("", Solution.solve(""));
    assertEquals("JHQURKNGWJJQJXIOIYSZLYSQHZMWIKZOXHBVGPKSJLIOO", Solution.solve("JHquRKngWJJQjxIOiYSzLySqhZmwIKZOxHbvGpKsjlIoo"));
  }
}
