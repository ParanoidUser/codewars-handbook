import static org.junit.Assert.assertEquals;

import java.util.Random;

import org.junit.Test;

public class SolutionTest {
  private static int refFriends(int n) {
    if (n < 2) return 0;
    else return Math.max(0, (int) (Math.log(n - 1) / Math.log(2)));
  }

  @Test
  public void shouldWorkForExampleTestCases() {
    assertEquals(0, Friends.friends(0));
    assertEquals(0, Friends.friends(1));
    assertEquals(0, Friends.friends(2));
  }

  @Test
  public void shouldWorkForBiggerTestCases() {
    assertEquals(refFriends(2570), Friends.friends(2570));
    assertEquals(refFriends(25700), Friends.friends(25700));
    assertEquals(refFriends(1000696969), Friends.friends(1000696969));
    assertEquals(refFriends(314997064), Friends.friends(314997064));
    assertEquals(refFriends(719694914), Friends.friends(719694914));
    assertEquals(refFriends(74093885), Friends.friends(74093885));
  }

  @Test
  public void shouldWorkForSpecialTestCases() {
    assertEquals(1, Friends.friends(4));
    assertEquals(1, Friends.friends(3));
    assertEquals(3, Friends.friends(16));
  }

  @Test
  public void shouldWorkForRandomTestCases() {
    Random random = new Random();
    for (int i = 0; i < 10; i++) {
      int n = random.nextInt() % 1000000001;
      assertEquals(refFriends(n), Friends.friends(n));
    }
  }
}
