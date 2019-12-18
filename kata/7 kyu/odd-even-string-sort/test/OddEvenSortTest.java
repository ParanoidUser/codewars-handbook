import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class OddEvenSortTest {
  @Test
  public void testSomething() {
    assertEquals("Wleclgltihuebredrf ofsheesenasnegrof", OddEvenSort.sortMyString("Wolfeschlegelsteinhausenbergerdorff"));
    assertEquals("MTINLHENLHENGUAIYAGNL EHOYTROYTROYLTMNLRIY", OddEvenSort.sortMyString("METHIONYLTHREONYLTHREONYGLUTAMINYLARGINYL"));
    assertEquals("PEMNUTAIRSOISLCVLAOOISS NUOOLRMCOCPCIIOOCNCNOI", OddEvenSort.sortMyString("PNEUMONOULTRAMICROSCOPICSILICOVOLCANOCONIOSIS"));
    assertEquals("PEDPEDHPPRTYODS SUOSUOYOAAHRIIM", OddEvenSort.sortMyString("PSEUDOPSEUDOHYPOPARATHYROIDISM"));
    assertEquals("FOCNUIIIIIIIAIN LCIACNHLPLFCTO", OddEvenSort.sortMyString("FLOCCINAUCINIHILIPILIFICATION"));
    assertEquals("SBEMTGYHC UDRAOLPI", OddEvenSort.sortMyString("SUBDERMATOGLYPHIC"));
  }
}
