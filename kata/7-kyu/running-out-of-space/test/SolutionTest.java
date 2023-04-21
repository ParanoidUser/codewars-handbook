import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
  @Test
  void sample() {
    assertArrayEquals(new String[]{"kevin", "kevinhas", "kevinhasno", "kevinhasnospace"}, OutOfSpace.spacey(new String[]{"kevin", "has", "no", "space"}));
    assertArrayEquals(new String[]{"Camel", "CamelCase", "CamelCaseShould", "CamelCaseShouldRemain"}, OutOfSpace.spacey(new String[]{"Camel", "Case", "Should", "Remain"}));
    assertArrayEquals(new String[]{"Trying!", "Trying!Adding2", "Trying!Adding2Diff3rent", "Trying!Adding2Diff3rentComb1nati0ns"}, OutOfSpace.spacey(new String[]{"Trying!", "Adding2", "Diff3rent", "Comb1nati0ns"}));
  }
}