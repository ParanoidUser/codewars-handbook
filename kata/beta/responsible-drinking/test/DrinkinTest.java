import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DrinkinTest {
  @Test
  public void drinkingTest1() {
    assertEquals("1 glass of water", Drinkin.hydrate("1 beer"));
  }

  @Test
  public void drinkingTest3() {
    assertEquals("10 glasses of water", Drinkin.hydrate("1 shot, 5 beers, 2 shots, 1 glass of wine, 1 beer"));
  }
}