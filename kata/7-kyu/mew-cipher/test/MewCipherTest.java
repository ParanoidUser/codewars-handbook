import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MewCipherTest {
  @Test
  void sample() {
    assertEquals("walk your dog at nine", MewCipher.decipher(new String[]{"u lk zxuq hfk as fouh", "y l  zpuv  xe at sicd", "welvayfuqbfpeaauaqcrc"}));
    assertEquals("hello world", MewCipher.decipher(new String[]{"hello world"}));
    assertEquals("", MewCipher.decipher(new String[]{"", "", "", "", ""}));
    assertEquals("   ", MewCipher.decipher(new String[]{"a  ", " b ", "  c", "   ", "   "}));
    assertEquals("foreman pig", MewCipher.decipher(new String[]{"foreman pig", "foreman pig"}));
  }
}