import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ExampleTests {
  @Test
  public void child() {
    assertTrue(Dinglemouse.child("BWBWBW", "BWBWBB"));
    assertTrue(Dinglemouse.child("BWBWBB", "WWWWBB"));
  }

  @Test
  public void grandchild() {
    assertTrue(Dinglemouse.grandchild("BWBWBW", "WWWWBB"));
    assertTrue(Dinglemouse.grandchild("BWBWBW", "BWBWBB"));
  }

  @Test
  public void notChild() {
    assertFalse(Dinglemouse.child("BWBWBW", "WWWWBB"));
  }
}
