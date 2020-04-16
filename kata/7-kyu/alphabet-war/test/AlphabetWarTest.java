import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AlphabetWarTest {
  @Test
  public void basicTest() {
    assertEquals("Right side wins!", Kata.alphabetWar("z"));
    assertEquals("Let's fight again!", Kata.alphabetWar("zdqmwpbs"));
    assertEquals("Right side wins!", Kata.alphabetWar("zzzzs"));
    assertEquals("Left side wins!", Kata.alphabetWar("wwwwwwz"));
  }
}
