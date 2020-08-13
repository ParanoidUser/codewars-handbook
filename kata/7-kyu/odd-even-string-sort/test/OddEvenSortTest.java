import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class OddEvenSortTest {
  @Test
  void sample() {
    assertEquals("SBEMTGYHC UDRAOLPI", OddEvenSort.sortMyString("SUBDERMATOGLYPHIC"));
    assertEquals("FOCNUIIIIIIIAIN LCIACNHLPLFCTO", OddEvenSort.sortMyString("FLOCCINAUCINIHILIPILIFICATION"));
    assertEquals("PEDPEDHPPRTYODS SUOSUOYOAAHRIIM", OddEvenSort.sortMyString("PSEUDOPSEUDOHYPOPARATHYROIDISM"));
    assertEquals("Wleclgltihuebredrf ofsheesenasnegrof", OddEvenSort.sortMyString("Wolfeschlegelsteinhausenbergerdorff"));
    assertEquals("MTINLHENLHENGUAIYAGNL EHOYTROYTROYLTMNLRIY", OddEvenSort.sortMyString("METHIONYLTHREONYLTHREONYGLUTAMINYLARGINYL"));
    assertEquals("PEMNUTAIRSOISLCVLAOOISS NUOOLRMCOCPCIIOOCNCNOI", OddEvenSort.sortMyString("PNEUMONOULTRAMICROSCOPICSILICOVOLCANOCONIOSIS"));
  }
}
