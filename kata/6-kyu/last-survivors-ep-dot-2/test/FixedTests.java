import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FixedTests {
  @Test
  void sample() {
    assertEquals("", Kata.lastSurvivors(""));
    assertEquals("c", Kata.lastSurvivors("zzab"));
    assertEquals("ac", Kata.lastSurvivors("abaa"));
    assertEquals("acdeghlmnqrvyz", Kata.lastSurvivors("xsdlafqpcmjytoikojsecamgdkehrqqgfknlhoudqygkbxftivfbpxhxtqgpkvsrfflpgrlhkbfnyftwkdebwfidmpauoteahyh"));
  }
}

