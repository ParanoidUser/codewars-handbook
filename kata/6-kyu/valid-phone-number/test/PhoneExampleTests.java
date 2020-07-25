import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class PhoneExampleTests {
  @Test
  void sample() {
    assertTrue(Kata.validPhoneNumber("(123) 456-7890"));
    assertFalse(Kata.validPhoneNumber("(1111)555 2345"));
    assertFalse(Kata.validPhoneNumber("(098) 123 4567"));
  }
}
