import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AutoMorphic {
  @Test
  public void oneDigitNumber() {
    assertEquals("Automorphic", Solution.autoMorphic(1));
    assertEquals("Not!!", Solution.autoMorphic(3));
    assertEquals("Automorphic", Solution.autoMorphic(6));
    assertEquals("Not!!", Solution.autoMorphic(9));
  }

  @Test
  public void twoDigitNumber() {
    assertEquals("Automorphic", Solution.autoMorphic(25));
    assertEquals("Not!!", Solution.autoMorphic(13));
    assertEquals("Automorphic", Solution.autoMorphic(76));
    assertEquals("Not!!", Solution.autoMorphic(95));
  }

  @Test
  public void largerNumber() {
    assertEquals("Automorphic", Solution.autoMorphic(625));
    assertEquals("Not!!", Solution.autoMorphic(225));
    assertEquals("Not!!", Solution.autoMorphic(425));
    assertEquals("Not!!", Solution.autoMorphic(399));
  }
}
