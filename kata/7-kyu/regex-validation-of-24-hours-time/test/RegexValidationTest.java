import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RegexValidationTest {
  @Test
  public void test1() {
    assertTrue(RegexValidation.validateTime("01:00"));
  }

  @Test
  public void test2() {
    assertTrue(RegexValidation.validateTime("1:00"));
  }

  @Test
  public void test3() {
    assertTrue(RegexValidation.validateTime("00:00"));
  }

  @Test
  public void test4() {
    assertFalse(RegexValidation.validateTime("13:1"));
  }

  @Test
  public void test5() {
    assertFalse(RegexValidation.validateTime("12:60"));
  }
}
