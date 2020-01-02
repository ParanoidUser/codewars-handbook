import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestNumbers {
  @Test
  public void basicTests() {
    assertEquals("10 must be supported and return \"ten\"", "ten", Kata.nameThatNumber(10));
    assertEquals("93 must be supported and return \"ninety three\"", "ninety three", Kata.nameThatNumber(93));
    assertEquals("0 must be supported and return \"zero\"", "zero", Kata.nameThatNumber(0));
  }
}
