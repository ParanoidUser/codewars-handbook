import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("Automorphic", Solution.autoMorphic(1));
    assertEquals("Automorphic", Solution.autoMorphic(6));
    assertEquals("Automorphic", Solution.autoMorphic(25));
    assertEquals("Automorphic", Solution.autoMorphic(76));
    assertEquals("Automorphic", Solution.autoMorphic(625));
    assertEquals("Not!!", Solution.autoMorphic(3));
    assertEquals("Not!!", Solution.autoMorphic(9));
    assertEquals("Not!!", Solution.autoMorphic(13));
    assertEquals("Not!!", Solution.autoMorphic(95));
    assertEquals("Not!!", Solution.autoMorphic(225));
    assertEquals("Not!!", Solution.autoMorphic(425));
    assertEquals("Not!!", Solution.autoMorphic(399));
  }
}
