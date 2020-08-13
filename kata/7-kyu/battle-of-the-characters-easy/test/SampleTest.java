import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SampleTest {
  @Test
  void sample() {
    assertEquals("Z", BattleOfTheCharacters.battle("AAA", "Z"));
    assertEquals("TWO", BattleOfTheCharacters.battle("ONE", "TWO"));
    assertEquals("Tie!", BattleOfTheCharacters.battle("ONE", "NEO"));
    assertEquals("FOUR", BattleOfTheCharacters.battle("FOUR", "FIVE"));
    assertEquals("APKIDS", BattleOfTheCharacters.battle("APKIDS", "PTW"));
  }
}
