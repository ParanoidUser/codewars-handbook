import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertTrue(Solution.solve("abba"));
    assertFalse(Solution.solve("abaazaba"));
    assertTrue(Solution.solve("abccba"));
    assertTrue(Solution.solve("adfa"));
    assertFalse(Solution.solve("ae"));
    assertTrue(Solution.solve("sq"));
    assertFalse(Solution.solve("abzy"));
    assertTrue(Solution.solve("kxbkwgyydkcbtjcosgikfdyhuuprubpwthgflucpyylbofvqxkkvqthmdnywpaunfihvupbwpruwfybdmgeuocltdaidyyewmbzm"));
  }
}