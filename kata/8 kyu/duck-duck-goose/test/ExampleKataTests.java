import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ExampleKataTests {
  @Test
  public void tests() {
    Player[] players = makePlayerArr(new String[] {"a", "b", "c", "d", "c", "e", "f", "g", "h", "z"});
    assertEquals("a", Kata.duckDuckGoose(players, 1));
    assertEquals("c", Kata.duckDuckGoose(players, 3));
    assertEquals("z", Kata.duckDuckGoose(players, 10));
    assertEquals("z", Kata.duckDuckGoose(players, 20));
    assertEquals("z", Kata.duckDuckGoose(players, 30));
    assertEquals("g", Kata.duckDuckGoose(players, 18));
    assertEquals("g", Kata.duckDuckGoose(players, 28));
    assertEquals("b", Kata.duckDuckGoose(players, 12));
    assertEquals("b", Kata.duckDuckGoose(players, 2));
    assertEquals("f", Kata.duckDuckGoose(players, 7));
  }

  private Player[] makePlayerArr(String[] names) {
    Player[] players = new Player[names.length];
    for (int i = 0; i < names.length; i++) {
      players[i] = new Player(names[i]);
    }
    return players;
  }
}
