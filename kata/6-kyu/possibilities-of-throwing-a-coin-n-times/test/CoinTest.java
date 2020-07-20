import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class CoinTest {
  @Test
  void sample() {
    assertArrayEquals(new String[]{"H", "T"}, Kata.coin(1));
    assertArrayEquals(new String[]{"HH", "HT", "TH", "TT"}, Kata.coin(2));
    assertArrayEquals(new String[]{"HHH", "HHT", "HTH", "HTT", "THH", "THT", "TTH", "TTT"}, Kata.coin(3));
  }
}