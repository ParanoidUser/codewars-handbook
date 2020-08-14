import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertArrayEquals(new String[]{"AbCdEf", "aBcDeF"}, Solution.capitalize("abcdef"));
    assertArrayEquals(new String[]{"CoDeWaRs", "cOdEwArS"}, Solution.capitalize("codewars"));
    assertArrayEquals(new String[]{"AbRaCaDaBrA", "aBrAcAdAbRa"}, Solution.capitalize("abracadabra"));
    assertArrayEquals(new String[]{"CoDeWaRrIoRs", "cOdEwArRiOrS"}, Solution.capitalize("codewarriors"));
  }
}
