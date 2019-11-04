import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FirstClassTest {
  @Test
  public void testSum() {
    assertEquals(3, FirstClass.sum((byte) 1, (byte) 2));
  }
}
