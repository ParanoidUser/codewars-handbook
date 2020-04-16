import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ExampleTests {
  @Test
  public void hashTest1() {
    assertEquals(0, new Null().hashCode());
  }

  @Test
  public void hashTest2() {
    assertEquals(new Null().hashCode(), new Null().hashCode());
  }

  @Test
  public void test1() {
    assertTrue(new Null().equals(null));
  }

  @Test
  public void test2() {
    Null n = new Null();
    assertEquals(n, n);
  }

  @Test
  public void test3() {
    assertEquals(new Null(), new Null());
  }

  @Test
  public void test4() {
    assertNotEquals(new Object(), new Null());
  }

  @Test
  public void test5() {
    assertEquals("null", new Null().toString());
  }
}
