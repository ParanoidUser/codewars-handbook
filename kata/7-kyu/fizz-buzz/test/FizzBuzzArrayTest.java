import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FizzBuzzArrayTest {
  @Test
  void sample() {
    assertArrayEquals(new String[]{"1"}, FizzBuzzArray.fizzBuzz(1));
    assertArrayEquals(new String[]{"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"}, FizzBuzzArray.fizzBuzz(10));
  }
}