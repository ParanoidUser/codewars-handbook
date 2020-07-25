import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ExampleTests {
  @Test
  void sample() {
    assertEquals(0, Dinglemouse.countDeafRats("~O~O~O~O P"));
    assertEquals(1, Dinglemouse.countDeafRats("P O~ O~ ~O O~"));
    assertEquals(2, Dinglemouse.countDeafRats("~O~O~O~OP~O~OO~"));
  }
}
