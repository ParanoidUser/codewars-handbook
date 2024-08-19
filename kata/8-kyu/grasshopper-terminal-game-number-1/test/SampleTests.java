import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SampleTests {
  @Test()
  void sample() {
    Hero hero = new Hero();
    assertEquals("Hero", hero.name);
    assertEquals(0, hero.experience);
    assertEquals(100, hero.health);
    assertEquals("00", hero.position);
    assertEquals(5, hero.damage);
    Hero bjornTheViking = new Hero("Björn Øhrling");
    assertEquals("Björn Øhrling", bjornTheViking.name);
  }
}