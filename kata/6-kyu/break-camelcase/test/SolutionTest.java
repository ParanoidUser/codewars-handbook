import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("camel Casing", Solution.camelCase("camelCasing"));
    assertEquals("camel Casing Test", Solution.camelCase("camelCasingTest"));
    assertEquals("camelcasingtest", Solution.camelCase("camelcasingtest"));
  }
}
