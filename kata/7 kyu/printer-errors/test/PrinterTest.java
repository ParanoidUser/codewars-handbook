import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PrinterTest {
  @Test
  public void test() {
    assertEquals("3/56", Printer.printerError("aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz"));
  }
}
