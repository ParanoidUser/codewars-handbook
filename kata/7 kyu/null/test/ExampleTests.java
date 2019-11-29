import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class ExampleTests {
  @Test
  public void HashTest1() {
    Null n = new Null();
    assertEquals(n.hashCode(), 0);
  }

  @Test
  public void HashTest2() {
    Null n = new Null();
    assertEquals(n.hashCode(), new Null().hashCode());
  }

  @Test
  public void Test1() {
    Null n = new Null();
    assertEquals(n, null);
  }

  @Test
  public void Test2() {
    Null n = new Null();
    assertEquals(n, n);
  }

  @Test
  public void Test3() {
    Null n = new Null();
    assertEquals(n, new Null());
  }

  @Test
  public void Test4() {
    Null n = new Null();
    assertNotEquals(n, new Object());
  }

  @Test
  public void Test5() {
    Null n = new Null();
    assertEquals(n.toString(), "null");
  }
}
