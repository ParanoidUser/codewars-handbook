import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SampleTests {
  @Test
  public void sampleTests() {
    assertEquals(255, SetBits.eliminateUnsetBits("11010101010101"));
    assertEquals(7, SetBits.eliminateUnsetBits("111"));
    assertEquals(1, SetBits.eliminateUnsetBits("1000000"));
  }
}
