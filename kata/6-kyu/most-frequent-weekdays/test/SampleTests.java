import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SampleTests {
  @Test
  void sample() {
    assertArrayEquals(new String[]{"Wednesday", "Thursday"}, Kata.mostFrequentDays(2020));
    assertArrayEquals(new String[]{"Tuesday", "Wednesday"}, Kata.mostFrequentDays(1084));
    assertArrayEquals(new String[]{"Sunday"}, Kata.mostFrequentDays(1167));
    assertArrayEquals(new String[]{"Friday", "Saturday"}, Kata.mostFrequentDays(1216));
    assertArrayEquals(new String[]{"Friday", "Saturday"}, Kata.mostFrequentDays(1492));
    assertArrayEquals(new String[]{"Monday"}, Kata.mostFrequentDays(1770));
    assertArrayEquals(new String[]{"Saturday"}, Kata.mostFrequentDays(1785));
    assertArrayEquals(new String[]{"Wednesday", "Thursday"}, Kata.mostFrequentDays(212));
    assertArrayEquals(new String[]{"Tuesday"}, Kata.mostFrequentDays(1901));
    assertArrayEquals(new String[]{"Saturday"}, Kata.mostFrequentDays(2135));
    assertArrayEquals(new String[]{"Sunday"}, Kata.mostFrequentDays(3043));
    assertArrayEquals(new String[]{"Monday"}, Kata.mostFrequentDays(2001));
    assertArrayEquals(new String[]{"Sunday"}, Kata.mostFrequentDays(3150));
    assertArrayEquals(new String[]{"Tuesday"}, Kata.mostFrequentDays(3230));
    assertArrayEquals(new String[]{"Monday", "Sunday"}, Kata.mostFrequentDays(328));
    assertArrayEquals(new String[]{"Friday", "Saturday"}, Kata.mostFrequentDays(2016));
    assertArrayEquals(new String[]{"Monday"}, Kata.mostFrequentDays(334));
    assertArrayEquals(new String[]{"Wednesday"}, Kata.mostFrequentDays(1986));
    assertArrayEquals(new String[]{"Thursday"}, Kata.mostFrequentDays(3361));
    assertArrayEquals(new String[]{"Thursday"}, Kata.mostFrequentDays(5863));
    assertArrayEquals(new String[]{"Saturday"}, Kata.mostFrequentDays(1910));
    assertArrayEquals(new String[]{"Monday", "Tuesday"}, Kata.mostFrequentDays(1968));
    assertArrayEquals(new String[]{"Thursday", "Friday"}, Kata.mostFrequentDays(7548));
    assertArrayEquals(new String[]{"Wednesday", "Thursday"}, Kata.mostFrequentDays(8116));
    assertArrayEquals(new String[]{"Friday"}, Kata.mostFrequentDays(9137));
    assertArrayEquals(new String[]{"Wednesday"}, Kata.mostFrequentDays(1794));
  }
}
