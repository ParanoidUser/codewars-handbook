import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BasicEncryptTest {
  @Test
  public void testDecrypt() {
    assertEquals("text = '', rule = 1", "", BasicEncrypt.encrypt("", 1));
    assertEquals("text = 'a', rule = 1", "b", BasicEncrypt.encrypt("a", 1));
    assertEquals("text = 'please encrypt me', rule = 2", "rngcug\"gpet{rv\"og", BasicEncrypt.encrypt("please encrypt me", 2));
  }
}
