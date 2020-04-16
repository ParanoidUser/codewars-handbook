import static org.junit.Assert.assertEquals;

import java.math.BigInteger;

import org.junit.Test;

public class EasylineTest {
  @Test
  public void test1() {
    assertEquals(new BigInteger("3432"), Easyline.easyLine(7));
    assertEquals(new BigInteger("10400600"), Easyline.easyLine(13));
    assertEquals(new BigInteger("2333606220"), Easyline.easyLine(17));
    assertEquals(new BigInteger("35345263800"), Easyline.easyLine(19));
  }
}
