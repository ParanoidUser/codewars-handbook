import static org.junit.Assert.*;

import org.junit.Test;

public class ExampleTests {
  @Test
  public void examples() {
    assertEquals(1, Kata.hexToDec("1"));
    assertEquals(10, Kata.hexToDec("a"));
    assertEquals(16, Kata.hexToDec("10"));
    assertEquals(255, Kata.hexToDec("FF"));
    assertEquals(-12, Kata.hexToDec("-C"));
  }
}
