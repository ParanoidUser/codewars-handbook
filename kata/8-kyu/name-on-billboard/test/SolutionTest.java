import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(600, Billboard.billboard("Jeong-Ho Aristotelis", 30));
    assertEquals(570, Billboard.billboard("Abishai Charalampos", 30));
    assertEquals(420, Billboard.billboard("Idwal Augustin", 30));
    assertEquals(260, Billboard.billboard("Hadufuns John", 20));
    assertEquals(570, Billboard.billboard("Zoroaster Donnchadh", 30));
    assertEquals(450, Billboard.billboard("Claude Miljenko", 30));
    assertEquals(165, Billboard.billboard("Werner Vígi", 15));
    assertEquals(420, Billboard.billboard("Anani Fridumar", 30));
    assertEquals(270, Billboard.billboard("Paolo Oli", 30));
    assertEquals(600, Billboard.billboard("Hjalmar Liupold", 40));
    assertEquals(390, Billboard.billboard("Simon Eadwulf", 30));
  }
}