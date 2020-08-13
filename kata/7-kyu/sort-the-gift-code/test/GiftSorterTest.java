import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class GiftSorterTest {
  @Test
  void sample() {
    assertEquals("abcdef", new GiftSorter().sortGiftCode("fedcba"));
    assertEquals("abcdefghijklmnopqrstuvwxyz", new GiftSorter().sortGiftCode("zyxwvutsrqponmlkjihgfedcba"));
  }
}
