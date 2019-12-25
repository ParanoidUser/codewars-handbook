import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringInterlacingTest {
  @Test
  public void interlaceTestA() {
    assertEquals("HWeolrllod", StringInterlacing.interlace("Hello", "World"));
  }

  @Test
  public void interlaceTestB() {
    assertEquals("sGoimmemleoGviimnm'e", StringInterlacing.interlace("Gimme", "some lovin'"));
  }
}
