import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {
  @Test
  void should_return_number() {
    assertEquals("2", FizzBuzz.convert(2));
    assertEquals("4", FizzBuzz.convert(4));
  }

  @Test
  void should_return_fizz() {
    assertEquals("fizz", FizzBuzz.convert(3));
  }

  @Test
  void should_return_buzz() {
    assertEquals("buzz", FizzBuzz.convert(20));
  }

  @Test
  void should_return_fizzBuzz() {
    assertEquals("fizz buzz", FizzBuzz.convert(15));
    assertEquals("fizz buzz", FizzBuzz.convert(-45));
  }
}