import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class GoalsTest {
  @Test
  void sample() {
    assertEquals(43, Goals.laLigaGoals);
    assertEquals(10, Goals.championsLeagueGoals);
    assertEquals(5, Goals.copaDelReyGoals);
    assertEquals(58, Goals.totalGoals);
  }
}