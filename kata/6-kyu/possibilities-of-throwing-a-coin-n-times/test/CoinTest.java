import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class CoinTest {
  @Test
  void sample() {
    assertArrayEquals(new String[]{"H", "T"}, new Kata().coin(1));
    assertArrayEquals(new String[]{"HH", "HT", "TH", "TT"}, new Kata().coin(2));
    assertArrayEquals(new String[]{"HHH", "HHT", "HTH", "HTT", "THH", "THT", "TTH", "TTT"}, new Kata().coin(3));
  }
}