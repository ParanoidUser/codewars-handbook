import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigInteger;
import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void basicTests() {
    assertEquals(new BigInteger("1"), GreenNumbers.get(1));
    assertEquals(new BigInteger("5"), GreenNumbers.get(2));
    assertEquals(new BigInteger("6"), GreenNumbers.get(3));
    assertEquals(new BigInteger("25"), GreenNumbers.get(4));
  }

  @Test
  void biggerTests() {
    assertEquals(new BigInteger("2890625"), GreenNumbers.get(12));
    assertEquals(new BigInteger("7109376"), GreenNumbers.get(13));
  }

  @Test
  void advancedTests() {
    assertEquals(new BigInteger("6188999442576576769103890995893380022607743740081787109376"), GreenNumbers.get(100));
    assertEquals(new BigInteger("9580863811000557423423230896109004106619977392256259918212890625"), GreenNumbers.get(110));
  }
}
