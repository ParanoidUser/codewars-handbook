import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("You are 4 years old.", new AgeDiff().CalculateAge(2012, 2016));
    assertEquals("You are 27 years old.", new AgeDiff().CalculateAge(1989, 2016));
    assertEquals("You are 90 years old.", new AgeDiff().CalculateAge(2000, 2090));
    assertEquals("You will be born in 10 years.", new AgeDiff().CalculateAge(2000, 1990));
    assertEquals("You were born this very year!", new AgeDiff().CalculateAge(3400, 3400));
    assertEquals("You are 2000 years old.", new AgeDiff().CalculateAge(900, 2900));
    assertEquals("You will be born in 110 years.", new AgeDiff().CalculateAge(2010, 1900));
    assertEquals("You will be born in 510 years.", new AgeDiff().CalculateAge(2010, 1500));
    assertEquals("You are 1 year old.", new AgeDiff().CalculateAge(2011, 2012));
    assertEquals("You will be born in 1 year.", new AgeDiff().CalculateAge(2000, 1999));
  }
}
