import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class ConsecutivesTest {
  @Test
  public void test() {
    assertEquals(List.of(1, 12, 0, 4, 6, 1), Consecutives.sumConsecutives(List.of(1, 4, 4, 4, 0, 4, 3, 3, 1)));
    assertEquals(List.of(-10, 14, 12, 0), Consecutives.sumConsecutives(List.of(-5, -5, 7, 7, 12, 0)));
  }
}
