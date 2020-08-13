import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class GhostbustersTests {
  @Test
  void sample() {
    assertEquals("Factory", Ghostbusters.ghostBusters("Factor y"));
    assertEquals("Office", Ghostbusters.ghostBusters("O  f fi ce"));
    assertEquals("You just wanted my autograph didn't you?", Ghostbusters.ghostBusters("BusStation"));
  }
}
