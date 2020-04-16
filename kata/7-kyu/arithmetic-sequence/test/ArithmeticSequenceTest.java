import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ArithmeticSequenceTest {
  @Test
  public void testArithmeticSequence_knownValues() {
    assertEquals("Wrong answer for first = 0 n = 55 d = 1", 55, Sequence.nthterm(0, 55, 1));
    assertEquals("Wrong answer for first = 0 n = 100 d = 5", 500, Sequence.nthterm(0, 100, 5));
    assertEquals("Wrong answer for first = 14 n = 4 d = 7", 42, Sequence.nthterm(14, 4, 7));
    assertEquals("Wrong answer for first = 10000 n = 99 d = -50", 5050, Sequence.nthterm(10000, 99, -50));
    assertEquals("Wrong answer for first = 10000 n = 110 d = -50", 4500, Sequence.nthterm(10000, 110, -50));
    assertEquals("Wrong answer for first = 0 n = 99 d = 1", 99, Sequence.nthterm(0, 99, 1));
  }
}
