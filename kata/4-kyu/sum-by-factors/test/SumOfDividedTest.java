import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SumOfDividedTest {
  @Test
  void sample() {
    assertEquals("(2 832)(3 186)(5 155)(7 182)(11 407)(13 117)(17 153)(19 -38)(23 46)(29 -87)(37 407)(47 423)(419 419)", SumOfDivided.sumOfDivided(new int[]{45, 376, 102, 100, 419, -76, 38, 407, 51, 46, 64, 47, -65, 182, 75, -87}));
    assertEquals("(2 12)(3 27)(5 15)", SumOfDivided.sumOfDivided(new int[]{12, 15}));
  }
}