import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("You are 4 years old.", AgeDiff.calculateAge(2012, 2016));
    assertEquals("You are 27 years old.", AgeDiff.calculateAge(1989, 2016));
    assertEquals("You are 90 years old.", AgeDiff.calculateAge(2000, 2090));
    assertEquals("You will be born in 10 years.", AgeDiff.calculateAge(2000, 1990));
    assertEquals("You were born this very year!", AgeDiff.calculateAge(3400, 3400));
    assertEquals("You are 2000 years old.", AgeDiff.calculateAge(900, 2900));
    assertEquals("You will be born in 110 years.", AgeDiff.calculateAge(2010, 1900));
    assertEquals("You will be born in 510 years.", AgeDiff.calculateAge(2010, 1500));
    assertEquals("You are 1 year old.", AgeDiff.calculateAge(2011, 2012));
    assertEquals("You will be born in 1 year.", AgeDiff.calculateAge(2000, 1999));
  }
}
