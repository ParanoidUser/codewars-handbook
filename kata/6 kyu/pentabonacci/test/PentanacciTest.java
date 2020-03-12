import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PentanacciTest {
  @Test
  public void test() {
    assertEquals(15, Pentanacci.countOddPentaFib(45));
    assertEquals(23, Pentanacci.countOddPentaFib(68));
    assertEquals(25, Pentanacci.countOddPentaFib(76));
    assertEquals(33, Pentanacci.countOddPentaFib(100));
    assertEquals(40, Pentanacci.countOddPentaFib(121));
  }
}
