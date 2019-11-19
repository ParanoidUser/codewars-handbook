import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SampleTest {
  @Test
  public void basicTests() {
    assertEquals("Z", BattleOfTheCharacters.battle("AAA", "Z"));
    assertEquals("TWO", BattleOfTheCharacters.battle("ONE", "TWO"));
    assertEquals("Tie!", BattleOfTheCharacters.battle("ONE", "NEO"));
    assertEquals("FOUR", BattleOfTheCharacters.battle("FOUR", "FIVE"));
    assertEquals("APKIDS", BattleOfTheCharacters.battle("APKIDS", "PTW"));
  }
}
