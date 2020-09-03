import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class KataTest {
  @Test
  void sample() {
    assertEquals("th3s 6s my str15ng", Kata.vowel2Index("this is my string"));
    assertEquals("C2d4w6rs 10s th15 b18st s23t25 27n th32 w35rld", Kata.vowel2Index("Codewars is the best site in the world"));
    assertEquals("T2m4rr7w 10s g1415ng t20 b23 r2627n29ng", Kata.vowel2Index("Tomorrow is going to be raining"));
    assertEquals("", Kata.vowel2Index(""));
  }
}
