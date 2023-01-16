import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SampleTest {
  @Test
  void sample() {
    assertEquals("1", Kata.incrementString(""));
    assertEquals("foo1", Kata.incrementString("foo"));
    assertEquals("foobar001", Kata.incrementString("foobar000"));
    assertEquals("foobar002", Kata.incrementString("foobar001"));
    assertEquals("foobar100", Kata.incrementString("foobar99"));
    assertEquals("foobar100", Kata.incrementString("foobar099"));
    assertEquals("fo99obar100", Kata.incrementString("fo99obar99"));
    assertEquals("0491296363177430", Kata.incrementString("0491296363177429"));
    assertEquals("1718167655699202162420737213", Kata.incrementString("1718167655699202162420737212"));
  }
}