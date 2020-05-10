import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ExampleTests {
  @Test
  void sample() {
    assertEquals(1, Kata.hexToDec("1"));
    assertEquals(10, Kata.hexToDec("a"));
    assertEquals(16, Kata.hexToDec("10"));
    assertEquals(255, Kata.hexToDec("FF"));
    assertEquals(-12, Kata.hexToDec("-C"));
  }
}
