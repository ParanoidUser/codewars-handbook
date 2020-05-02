import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("Underweight", Calculate.bmi(80, 2.10));
    assertEquals("Normal", Calculate.bmi(80, 1.80));
    assertEquals("Overweight", Calculate.bmi(80, 1.70));
    assertEquals("Obese", Calculate.bmi(100, 1.80));
  }
}
