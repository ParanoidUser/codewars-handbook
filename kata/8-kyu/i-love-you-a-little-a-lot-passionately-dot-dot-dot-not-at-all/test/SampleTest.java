import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SampleTest {
  @Test
  void sample() {
    assertEquals("I love you", Sid.howMuchILoveYou(1));
    assertEquals("a little", Sid.howMuchILoveYou(2));
    assertEquals("not at all", Sid.howMuchILoveYou(6));
  }
}
