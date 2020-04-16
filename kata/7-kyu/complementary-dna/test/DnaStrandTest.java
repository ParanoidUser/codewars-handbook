import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DnaStrandTest {
  @Test
  public void test01() {
    assertEquals("TTTT", DnaStrand.makeComplement("AAAA"));
  }

  @Test
  public void test02() {
    assertEquals("TAACG", DnaStrand.makeComplement("ATTGC"));
  }

  @Test
  public void test03() {
    assertEquals("CATA", DnaStrand.makeComplement("GTAT"));
  }
}
