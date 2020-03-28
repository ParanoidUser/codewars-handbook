import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void basicTests() {
    assertEquals("0", Kata.int2bin(0));
    assertEquals("01", Kata.int2bin(1));
    assertEquals("0101", Kata.int2bin(5));
    assertEquals("011010101", Kata.int2bin(213));
    assertEquals("0100110001001011001111111", Kata.int2bin(9999999));
  }
}