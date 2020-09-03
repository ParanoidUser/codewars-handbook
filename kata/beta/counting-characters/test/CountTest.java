import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CountTest {
  @Test
  void sample() {
    assertEquals(3, Count.countCharOccurrences("missippi", 'i'));
    assertEquals(2, Count.countCharOccurrences("feed", 'e'));
    assertEquals(8, Count.countCharOccurrences("aaaaaaaa", 'a'));
    assertEquals(0, Count.countCharOccurrences("quicksilver", 'z'));
  }
}