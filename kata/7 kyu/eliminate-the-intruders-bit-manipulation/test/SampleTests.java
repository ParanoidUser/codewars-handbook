import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SampleTests {
  @Test
  public void sampleTests() {
    assertEquals(SetBits.eliminateUnsetBits("11010101010101"), 255);
    assertEquals(SetBits.eliminateUnsetBits("111"), 7);
    assertEquals(SetBits.eliminateUnsetBits("1000000"), 1);
  }
}
