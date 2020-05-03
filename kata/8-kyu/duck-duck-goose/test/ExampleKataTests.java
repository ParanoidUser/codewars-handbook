import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ExampleKataTests {
  @Test
  void sample() {
    Player[] players = {
        new Player("a"),
        new Player("b"),
        new Player("c"),
        new Player("d"),
        new Player("c"),
        new Player("e"),
        new Player("f"),
        new Player("g"),
        new Player("h"),
        new Player("z")
    };
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
}
