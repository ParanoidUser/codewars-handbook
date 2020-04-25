import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class CountTest {
  @Test
  void test_some_characters() {
    assertEquals(3, Count.countCharOccurrences("missippi", 'i'));
    assertEquals(2, Count.countCharOccurrences("feed", 'e'));
  }

  @Test
  void test_all_characters() {
    assertEquals(8, Count.countCharOccurrences("aaaaaaaa", 'a'));
  }

  @Test
  void test_no_characters() {
    assertEquals(0, Count.countCharOccurrences("quicksilver", 'z'));
  }
}