import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.function.Function;

import org.junit.Test;

public class PointViewTest {
  @Test
  public void test1() throws NoSuchMethodException {
    var method = PointView.class.getMethod("point", Integer.class, Integer.class);
    assertTrue(method.getReturnType().isAssignableFrom(Function.class));
  }

  @Test
  public void test2() {
    assertEquals(Integer.valueOf(3), PointView.fst(PointView.point(3, 4)));
    assertEquals(Integer.valueOf(37), PointView.snd(PointView.point(24, 37)));
  }

  @Test
  public void test3() {
    assertEquals(2930, PointView.sqrDist(PointView.point(22, 55), PointView.point(75, 66)));
    assertEquals(3400, PointView.sqrDist(PointView.point(11, 22), PointView.point(65, 44)));
  }

  @Test
  public void test4() {
    assertLineEqual(new int[] {4, 3, -146}, PointView.line(PointView.point(20, 22), PointView.point(29, 10)));
    assertLineEqual(new int[] {24, -24, -144}, PointView.line(PointView.point(38, 32), PointView.point(14, 8)));
  }

  private void assertLineEqual(int[] l1, int[] l2) {
    int d1 = l1[0] * l2[1] - l2[0] * l1[1];
    int d2 = l1[1] * l2[2] - l1[2] * l2[1];
    int d3 = l1[0] * l2[2] - l1[2] * l2[0];
    assertTrue(d1 == 0 && d2 == 0 && d3 == 0);
    assertFalse(l1[0] == 0 && l1[1] == 0 && l1[2] == 0);
  }
}
