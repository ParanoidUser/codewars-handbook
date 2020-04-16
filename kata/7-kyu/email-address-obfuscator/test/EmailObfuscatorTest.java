import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EmailObfuscatorTest {
  @Test
  public void test1() {
    assertEquals("test [at] 123 [dot] com", EmailObfuscator.obfuscate("test@123.com"));
  }

  @Test
  public void test2() {
    assertEquals("Code_warrior [at] foo [dot] ac [dot] uk", EmailObfuscator.obfuscate("Code_warrior@foo.ac.uk"));
  }
}
