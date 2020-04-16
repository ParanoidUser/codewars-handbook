import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void basicTests() {
    assertArrayEquals(new String[] {"AbCdEf", "aBcDeF"}, Solution.capitalize("abcdef"));
    assertArrayEquals(new String[] {"CoDeWaRs", "cOdEwArS"}, Solution.capitalize("codewars"));
    assertArrayEquals(new String[] {"AbRaCaDaBrA", "aBrAcAdAbRa"}, Solution.capitalize("abracadabra"));
    assertArrayEquals(new String[] {"CoDeWaRrIoRs", "cOdEwArRiOrS"}, Solution.capitalize("codewarriors"));
  }
}
