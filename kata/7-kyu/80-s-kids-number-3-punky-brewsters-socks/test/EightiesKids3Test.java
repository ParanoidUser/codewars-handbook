import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class EightiesKids3Test {
  @Test
  void sample() {
    assertArrayEquals(new String[]{"argyle", "pink"}, EightiesKids3.getSocks("Punky", new String[] {"pink", "argyle", "argyle"}));
    assertArrayEquals(new String[]{"blue", "yellow"}, EightiesKids3.getSocks("Punky", new String[] {"yellow", "yellow", "blue", "dirty sock"}));
    assertArrayEquals(new String[]{"blue", "blue"}, EightiesKids3.getSocks("Henry", new String[] {"red", "blue", "blue", "green"}));
    assertArrayEquals(new String[0], EightiesKids3.getSocks("Henry", new String[] {"green"}));
  }
}
