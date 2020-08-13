import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class EmailObfuscatorTest {
  @Test
  void sample() {
    assertEquals("test [at] 123 [dot] com", EmailObfuscator.obfuscate("test@123.com"));
    assertEquals("Code_warrior [at] foo [dot] ac [dot] uk", EmailObfuscator.obfuscate("Code_warrior@foo.ac.uk"));
  }
}
