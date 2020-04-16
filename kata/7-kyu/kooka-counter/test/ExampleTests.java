import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ExampleTests {
  @Test
  public void examples() {
    assertEquals(0, Dinglemouse.kookaCounter(""));
    assertEquals(1, Dinglemouse.kookaCounter("hahahahaha"));
    assertEquals(2, Dinglemouse.kookaCounter("hahahahahaHaHaHa"));
    assertEquals(3, Dinglemouse.kookaCounter("HaHaHahahaHaHa"));
  }
}
