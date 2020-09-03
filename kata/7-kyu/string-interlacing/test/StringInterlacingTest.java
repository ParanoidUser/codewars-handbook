import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StringInterlacingTest {
  @Test
  void sample() {
    assertEquals("HWeolrllod", StringInterlacing.interlace("Hello", "World"));
    assertEquals("sGoimmemleoGviimnm'e", StringInterlacing.interlace("Gimme", "some lovin'"));
  }
}
