import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TimeUtilsTest {
  @Test
  public void shouldConvertCorrectly() {
    assertEquals("1 1 1 1", TimeUtils.convertTime(90061));
    assertEquals("-1 -1 -1 -1", TimeUtils.convertTime(-90061));
  }
}
