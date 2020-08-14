import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AlphabetWarTest {
  @Test
  void sample() {
    assertEquals("Right side wins!", Kata.alphabetWar("z"));
    assertEquals("Let's fight again!", Kata.alphabetWar("zdqmwpbs"));
    assertEquals("Right side wins!", Kata.alphabetWar("zzzzs"));
    assertEquals("Left side wins!", Kata.alphabetWar("wwwwwwz"));
    assertEquals("Let's fight again!", Kata.alphabetWar("!!"));
  }
}
