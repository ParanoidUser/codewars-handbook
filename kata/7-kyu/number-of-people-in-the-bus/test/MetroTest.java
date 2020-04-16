import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class MetroTest {
  @Test
  public void test1() {
    assertEquals(5, Metro.countPassengers(List.of(new int[] {10, 0}, new int[] {3, 5}, new int[] {2, 5})));
  }
}
