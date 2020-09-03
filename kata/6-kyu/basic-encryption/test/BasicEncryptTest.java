import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BasicEncryptTest {
  @Test
  void sample() {
    assertEquals("", new BasicEncrypt().encrypt("", 1));
    assertEquals("b", new BasicEncrypt().encrypt("a", 1));
    assertEquals("rngcug\"gpet{rv\"og", new BasicEncrypt().encrypt("please encrypt me", 2));
  }
}
