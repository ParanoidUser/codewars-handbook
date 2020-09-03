import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SampleTest {
  @Test
  void sample() {
    assertTrue(Arithmophobia.AmIAfraid("Monday", 12));
    assertFalse(Arithmophobia.AmIAfraid("Monday", 13));
    assertTrue(Arithmophobia.AmIAfraid("Tuesday", 965));
    assertFalse(Arithmophobia.AmIAfraid("Tuesday", 2));
    assertTrue(Arithmophobia.AmIAfraid("Wednesday", 34));
    assertFalse(Arithmophobia.AmIAfraid("Wednesday", 32));
    assertTrue(Arithmophobia.AmIAfraid("Thursday", 0));
    assertFalse(Arithmophobia.AmIAfraid("Thursday", 2));
    assertTrue(Arithmophobia.AmIAfraid("Friday", 2));
    assertFalse(Arithmophobia.AmIAfraid("Friday", 3));
    assertTrue(Arithmophobia.AmIAfraid("Saturday", 56));
    assertFalse(Arithmophobia.AmIAfraid("Saturday", 57));
    assertTrue(Arithmophobia.AmIAfraid("Sunday", -666));
    assertTrue(Arithmophobia.AmIAfraid("Shmanday", -666));
    assertFalse(Arithmophobia.AmIAfraid("Shmanday", -667));
  }
}
