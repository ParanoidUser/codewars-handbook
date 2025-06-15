import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

import org.junit.jupiter.api.Test;

class SampleTest {
  @Test
  void wildBoar() {
    Animal animal = new Animal("Wild Boar");
    assertEquals("Wild Boar makes a noise.", animal.speak());
  }

  @Test
  void mrWhiskers() {
    Cat cat = new Cat("Mr Whiskers");
    assertEquals("Mr Whiskers meows.", cat.speak());
    assertInstanceOf(Animal.class, cat);
  }

  @Test
  void lamp() {
    Cat cat = new Cat("Lamp");
    assertEquals("Lamp meows.", cat.speak());
  }

  @Test
  void moneyBags() {
    Cat cat = new Cat("$$Money Bags$$");
    assertEquals("$$Money Bags$$ meows.", cat.speak());
  }
}