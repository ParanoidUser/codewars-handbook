import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  @Test
  void sample() {
    assertTrue(Kata.validateHello("hello"));
    assertTrue(Kata.validateHello("ciao bella!"));
    assertTrue(Kata.validateHello("salut"));
    assertTrue(Kata.validateHello("hallo, salut"));
    assertTrue(Kata.validateHello("hombre! Hola!"));
    assertTrue(Kata.validateHello("Hallo, wie geht's dir?"));
    assertTrue(Kata.validateHello("AHOJ!"));
    assertTrue(Kata.validateHello("czesc"));
    assertTrue(Kata.validateHello("Ahoj"));
    assertFalse(Kata.validateHello("meh"));
  }
}