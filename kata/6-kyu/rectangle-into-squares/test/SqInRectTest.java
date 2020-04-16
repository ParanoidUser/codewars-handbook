import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.List;

import org.junit.Test;

public class SqInRectTest {
  @Test
  public void test1() {
    assertEquals(List.of(3, 2, 1, 1), SqInRect.sqInRect(5, 3));
  }

  @Test
  public void test2() {
    assertNull(SqInRect.sqInRect(5, 5));
  }
}
