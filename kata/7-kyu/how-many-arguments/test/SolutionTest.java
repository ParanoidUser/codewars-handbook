import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigInteger;
import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(3, Arguments.countArgs(1, 2, 3));
    assertEquals(3, Arguments.countArgs(1, 2, "uhsaf uas"));
    assertEquals(1, Arguments.countArgs(1));
    assertEquals(4, Arguments.countArgs('a', 865, "asfhgajsf", new BigInteger("123456")));
    assertEquals(0, Arguments.countArgs());
  }
}
