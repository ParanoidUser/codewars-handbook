import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PlayPassTest {
  @Test
  void sample() {
    assertEquals("!!!vPz fWpM J", PlayPass.playPass("I LOVE YOU!!!", 1));
    assertEquals("!тЕвИрП", PlayPass.playPass("привет!", 1));
    assertEquals("4897 NkTrC Hq fT67 GjV Pq aP OqTh gOcE CoPcTi aO", PlayPass.playPass("MY GRANMA CAME FROM NY ON THE 23RD OF APRIL 2015", 2));
  }
}
