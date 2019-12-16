import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class ExampleTests {
  @Test
  public void test1() {
    assertArrayEquals(new long[] {1, 1}, Dinglemouse.clonewars(1));
  }

  @Test
  public void test5() {
    assertArrayEquals(new long[] {16, 57}, Dinglemouse.clonewars(5));
  }

  @Test
  public void test10() {
    assertArrayEquals(new long[] {512, 2036}, Dinglemouse.clonewars(10));
  }
}
