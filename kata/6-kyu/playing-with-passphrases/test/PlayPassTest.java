import static org.junit.Assert.*;

import org.junit.Test;

public class PlayPassTest {
  @Test
  public void test1() {
    assertEquals("!!!vPz fWpM J", PlayPass.playPass("I LOVE YOU!!!", 1));
  }

  @Test
  public void test4() {
    assertEquals("4897 NkTrC Hq fT67 GjV Pq aP OqTh gOcE CoPcTi aO", PlayPass.playPass("MY GRANMA CAME FROM NY ON THE 23RD OF APRIL 2015", 2));
  }
}
