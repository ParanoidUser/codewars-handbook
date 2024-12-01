import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ForemanPigTest {
  @Test
  void sample() {
    assertEquals("walk your dog at nine", ForemanPig.decipher(new String[]{"u lk zxuq hfk as fouh", "y l  zpuv  xe at sicd", "welvayfuqbfpeaauaqcrc"}));
    assertEquals("hello world", ForemanPig.decipher(new String[]{"hello world"}));
    assertEquals("", ForemanPig.decipher(new String[]{"", "", "", "", ""}));
    assertEquals("   ", ForemanPig.decipher(new String[]{"a  ", " b ", "  c", "   ", "   "}));
    assertEquals("foreman pig", ForemanPig.decipher(new String[]{"foreman pig", "foreman pig"}));
  }
}