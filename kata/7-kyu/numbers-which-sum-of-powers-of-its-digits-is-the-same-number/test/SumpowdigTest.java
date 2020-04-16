import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class SumpowdigTest {
  @Test
  public void test() {
    assertEquals("[]", Arrays.toString(Sumpowdig.eqSumPowDig(100, 2)));
    assertEquals("[153]", Arrays.toString(Sumpowdig.eqSumPowDig(200, 3)));
    assertEquals("[153, 370]", Arrays.toString(Sumpowdig.eqSumPowDig(370, 3)));
    assertEquals("[153, 370, 371]", Arrays.toString(Sumpowdig.eqSumPowDig(400, 3)));
    assertEquals("[153, 370, 371, 407]", Arrays.toString(Sumpowdig.eqSumPowDig(500, 3)));
  }
}
