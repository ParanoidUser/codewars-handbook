import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BasicEncryptTest {
  @Test
  void sample() {
    assertEquals("", BasicEncrypt.encrypt("", 1));
    assertEquals("b", BasicEncrypt.encrypt("a", 1));
    assertEquals("rngcug\"gpet{rv\"og", BasicEncrypt.encrypt("please encrypt me", 2));
  }
}
