import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SampleTest {
  @Test
  void sample() {
    assertTrue(Arithmophobia.amIAfraid("Monday", 12));
    assertFalse(Arithmophobia.amIAfraid("Monday", 13));
    assertTrue(Arithmophobia.amIAfraid("Tuesday", 965));
    assertFalse(Arithmophobia.amIAfraid("Tuesday", 2));
    assertTrue(Arithmophobia.amIAfraid("Wednesday", 34));
    assertFalse(Arithmophobia.amIAfraid("Wednesday", 32));
    assertTrue(Arithmophobia.amIAfraid("Thursday", 0));
    assertFalse(Arithmophobia.amIAfraid("Thursday", 2));
    assertTrue(Arithmophobia.amIAfraid("Friday", 2));
    assertFalse(Arithmophobia.amIAfraid("Friday", 3));
    assertTrue(Arithmophobia.amIAfraid("Saturday", 56));
    assertFalse(Arithmophobia.amIAfraid("Saturday", 57));
    assertTrue(Arithmophobia.amIAfraid("Sunday", -666));
    assertTrue(Arithmophobia.amIAfraid("Shmanday", -666));
    assertFalse(Arithmophobia.amIAfraid("Shmanday", -667));
  }
}
