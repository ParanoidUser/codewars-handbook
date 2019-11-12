import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testAge() {
    assertEquals("You are 4 years old.", AgeDiff.CalculateAge(2012, 2016));
    assertEquals("You are 27 years old.", AgeDiff.CalculateAge(1989, 2016));
    assertEquals("You are 90 years old.", AgeDiff.CalculateAge(2000, 2090));
    assertEquals("You will be born in 10 years.", AgeDiff.CalculateAge(2000, 1990));
    assertEquals("You were born this very year!", AgeDiff.CalculateAge(3400, 3400));
    assertEquals("You are 2000 years old.", AgeDiff.CalculateAge(900, 2900));
    assertEquals("You will be born in 110 years.", AgeDiff.CalculateAge(2010, 1900));
    assertEquals("You will be born in 510 years.", AgeDiff.CalculateAge(2010, 1500));
    assertEquals("You are 1 year old.", AgeDiff.CalculateAge(2011, 2012));
    assertEquals("You will be born in 1 year.", AgeDiff.CalculateAge(2000, 1999));
  }
}
