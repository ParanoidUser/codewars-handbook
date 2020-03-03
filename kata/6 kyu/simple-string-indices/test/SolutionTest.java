import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSomething() {
    assertEquals(10, Indice.solve("((1)23(45))(aB)", 0));
    assertEquals(3, Indice.solve("((1)23(45))(aB)", 1));
    assertEquals(-1, Indice.solve("((1)23(45))(aB)", 2));
    assertEquals(9, Indice.solve("((1)23(45))(aB)", 6));
    assertEquals(14, Indice.solve("((1)23(45))(aB)", 11));
    assertEquals(28, Indice.solve("(g(At)IO(f)(tM(qk)YF(n)Nr(E)))", 11));
    assertEquals(29, Indice.solve("(g(At)IO(f)(tM(qk)YF(n)Nr(E)))", 0));
    assertEquals(22, Indice.solve("(>_(va)`?(h)C(as)(x(hD)P|(fg)))", 19));
  }
}
