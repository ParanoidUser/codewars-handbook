import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class JavaUnicodeEncoderTest {
  @Test
  void sample() {
    assertEquals("\\u0068\\u006f\\u006c\\u0061", JavaUnicodeEncoder.encode("hola"));
    assertEquals("hola", JavaUnicodeEncoder.decode("\\u0068\\u006f\\u006c\\u0061"));
  }
}