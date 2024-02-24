import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SampleTests {
  @Test
  void sample() {
    assertArrayEquals(new int[]{17, 17, 17}, HexToRGB.hexStringToRGB("#111111"));
    assertArrayEquals(new int[]{0, 0, 0}, HexToRGB.hexStringToRGB("#000000"));
    assertArrayEquals(new int[]{255, 153, 51}, HexToRGB.hexStringToRGB("#FF9933"));
    assertArrayEquals(new int[]{190, 173, 237}, HexToRGB.hexStringToRGB("#beaded"));
    assertArrayEquals(new int[]{250, 52, 86}, HexToRGB.hexStringToRGB("#Fa3456"));
  }
}