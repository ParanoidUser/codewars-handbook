import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DrinkinTest {
  @Test
  void sample() {
    assertEquals("1 glass of water", new Drinkin().hydrate("1 beer"));
    assertEquals("10 glasses of water", new Drinkin().hydrate("1 shot, 5 beers, 2 shots, 1 glass of wine, 1 beer"));
  }
}