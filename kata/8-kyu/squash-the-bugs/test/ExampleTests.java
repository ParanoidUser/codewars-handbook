import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ExampleTests {
  @Test
  void sample() {
    assertEquals(7, Kata.findLongest("The quick white fox jumped around the massive dog"));
    assertEquals(10, Kata.findLongest("Take me to tinseltown with you"));
    assertEquals(7, Kata.findLongest("Sausage chops"));
    assertEquals(6, Kata.findLongest("Wind your body and wiggle your belly"));
    assertEquals(7, Kata.findLongest("Lets all go on holiday"));
  }
}
