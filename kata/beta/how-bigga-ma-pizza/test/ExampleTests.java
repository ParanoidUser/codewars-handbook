import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ExampleTests {
  @Test
  void testCrispy() {
    assertEquals(4.564, Dinglemouse.howBiggaMaPizza(5, "crispy"), 0.001);
    assertEquals(12.909, Dinglemouse.howBiggaMaPizza(10, "crispy"), 0.001);
    assertEquals(23.717, Dinglemouse.howBiggaMaPizza(15, "crispy"), 0.001);
    assertEquals(36.514, Dinglemouse.howBiggaMaPizza(20, "crispy"), 0.001);
  }

  @Test
  void testThick() {
    assertEquals(2.041, Dinglemouse.howBiggaMaPizza(5, "thick"), 0.001);
    assertEquals(5.773, Dinglemouse.howBiggaMaPizza(10, "thick"), 0.001);
    assertEquals(10.606, Dinglemouse.howBiggaMaPizza(15, "thick"), 0.001);
    assertEquals(16.329, Dinglemouse.howBiggaMaPizza(20, "thick"), 0.001);
  }
}