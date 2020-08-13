import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SupernaturalTest {
  @Test
  void sample() {
    assertEquals("Behead it with a machete, idjits!", Supernatural.bob("vampire"));
    assertEquals("It depends on which one it is, idjits!", Supernatural.bob("pagan god"));
    assertEquals("I have friggin no idea yet, idjits!", Supernatural.bob("I have friggin no idea yet, idjits!"));
  }
}
