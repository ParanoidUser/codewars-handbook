import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
  @Test
  void edgeCasesTest() {
    assertEquals("", PhoneWords.phoneWords(""));
    assertEquals("", PhoneWords.phoneWords("111"));
    assertEquals("", PhoneWords.phoneWords(null));
  }

  @Test
  void sample() {
    assertEquals("hello how are you", PhoneWords.phoneWords("443355555566604466690277733099966688"));
    assertEquals("kata", PhoneWords.phoneWords("55282"));
    assertEquals("im a tester", PhoneWords.phoneWords("44460208337777833777"));
    assertEquals("codewars", PhoneWords.phoneWords("22266631339277717777"));
    assertEquals("null", PhoneWords.phoneWords("66885551555"));
    assertEquals("text", PhoneWords.phoneWords("833998"));
    assertEquals("   ", PhoneWords.phoneWords("000"));
    assertEquals("java", PhoneWords.phoneWords("528882"));
    assertEquals("kumite", PhoneWords.phoneWords("55886444833"));
    assertEquals("apple", PhoneWords.phoneWords("271755533"));
  }
}