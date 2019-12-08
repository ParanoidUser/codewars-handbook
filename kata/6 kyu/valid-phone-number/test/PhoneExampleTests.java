import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PhoneExampleTests {
  @Test
  public void tests() {
    assertTrue(Kata.validPhoneNumber("(123) 456-7890"));
    assertFalse(Kata.validPhoneNumber("(1111)555 2345"));
    assertFalse(Kata.validPhoneNumber("(098) 123 4567"));
  }
}
