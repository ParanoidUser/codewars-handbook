import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestGCF {
  @Test
  public void basicTests() {
    assertEquals(4, Kata.findGCF(8, 20));
    assertEquals(1, Kata.findGCF(5, 13));
    assertEquals(100, Kata.findGCF(100, 100));
  }
}
