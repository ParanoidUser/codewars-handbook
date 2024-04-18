import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class StringMergerTest {
  @Test
  void sample() {
    assertTrue(StringMerger.isMerge("", "", ""));
    assertTrue(StringMerger.isMerge("codewars", "code", "wars"));
    assertTrue(StringMerger.isMerge("codewars", "cdwr", "oeas"));
    assertTrue(StringMerger.isMerge("Bananas from Bahamas", "Bahas", "Bananas from am"));
    assertTrue(StringMerger.isMerge("Can we merge it? Yes, we can!", "aw egets,we ca", "Cn emr i? Ye n!"));
    assertTrue(StringMerger.isMerge("Can we merge it? Yes, we can!", "an  re Ye,we !", "Cwemeg it?s can"));
    assertFalse(StringMerger.isMerge("", "code", "wars"));
    assertFalse(StringMerger.isMerge("codewars", "cod", "wars"));
    assertFalse(StringMerger.isMerge("\\*M[w6c8\\[5m>", ">*M[68m\\", "wc\\[5"));
  }
}