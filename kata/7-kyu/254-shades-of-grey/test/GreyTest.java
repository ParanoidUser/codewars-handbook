import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class GreyTest {
  @Test
  void sample() {
    assertArrayEquals(new String[0], ShadesOfGrey.shadesOfGrey(-1));
    assertArrayEquals(new String[0], ShadesOfGrey.shadesOfGrey(0));
    assertArrayEquals(new String[] {"#010101"}, ShadesOfGrey.shadesOfGrey(1));
  }
}
