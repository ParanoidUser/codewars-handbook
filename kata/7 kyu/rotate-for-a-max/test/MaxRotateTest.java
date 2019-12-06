import static org.junit.Assert.*;
import org.junit.Test;

public class MaxRotateTest {
  @Test
  public void test() {
    assertEquals(85821534, MaxRotate.maxRot(38458215));
    assertEquals(988103115, MaxRotate.maxRot(195881031));
    assertEquals(962193428, MaxRotate.maxRot(896219342));
    assertEquals(94183076, MaxRotate.maxRot(69418307));
  }
}
