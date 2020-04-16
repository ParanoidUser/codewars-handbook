import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GiftSorterTest {
  @Test
  public void tests1() {
    assertEquals("sort fedcba", "abcdef", GiftSorter.sortGiftCode("fedcba"));
  }

  @Test
  public void tests2() {
    assertEquals("reverse alphabet", "abcdefghijklmnopqrstuvwxyz", GiftSorter.sortGiftCode("zyxwvutsrqponmlkjihgfedcba"));
  }
}
