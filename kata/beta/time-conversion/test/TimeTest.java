import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TimeTest {
  @Test
  public void timeTest1() {
    assertEquals("19:05:45", Time.convertTime("07:05:45PM"));
  }
}