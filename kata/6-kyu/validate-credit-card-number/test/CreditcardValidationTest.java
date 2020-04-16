import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class CreditcardValidationTest {
  @Test
  public void test891() {
    assertFalse(Validate.validate("891"));
  }
}
