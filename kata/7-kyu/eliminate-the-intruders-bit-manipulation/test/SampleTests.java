import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SampleTests {
  @Test
  void sample() {
    assertEquals(255, new SetBits().eliminateUnsetBits("11010101010101"));
    assertEquals(7, new SetBits().eliminateUnsetBits("111"));
    assertEquals(1, new SetBits().eliminateUnsetBits("1000000"));
  }
}
