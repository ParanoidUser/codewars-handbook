import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestConsecTest {
  @Test
  public void test() {
    assertEquals("abigailtheta", LongestConsec.longestConsec(new String[] {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"}, 2));
    assertEquals("oocccffuucccjjjkkkjyyyeehh", LongestConsec.longestConsec(new String[] {"ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh"}, 1));
    assertEquals("", LongestConsec.longestConsec(new String[] {}, 3));
    assertEquals("wkppqsztdkmvcuwvereiupccauycnjutlvvweqilsfytihvrzlaodfixoyxvyuyvgpck", LongestConsec.longestConsec(new String[] {"itvayloxrp", "wkppqsztdkmvcuwvereiupccauycnjutlv", "vweqilsfytihvrzlaodfixoyxvyuyvgpck"}, 2));
    assertEquals("wlwsasphmxxowiaxujylentrklctozmymu", LongestConsec.longestConsec(new String[] {"wlwsasphmxx", "owiaxujylentrklctozmymu", "wpgozvxxiu"}, 2));
    assertEquals("", LongestConsec.longestConsec(new String[] {"zone", "abigail", "theta", "form", "libe", "zas"}, -2));
    assertEquals("ixoyx3452zzzzzzzzzzzz", LongestConsec.longestConsec(new String[] {"it", "wkppv", "ixoyx", "3452", "zzzzzzzzzzzz"}, 3));
    assertEquals("", LongestConsec.longestConsec(new String[] {"it", "wkppv", "ixoyx", "3452", "zzzzzzzzzzzz"}, 15));
    assertEquals("", LongestConsec.longestConsec(new String[] {"it", "wkppv", "ixoyx", "3452", "zzzzzzzzzzzz"}, 0));
  }
}
