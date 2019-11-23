import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HexadecimalShould {
  @Test
  public void test() {
    assertEquals("0x100", Hexadecimal.convertToHex(256));
  }
}
