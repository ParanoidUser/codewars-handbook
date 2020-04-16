import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloWorldTest {
  @Test
  public void testHelloWorld() {
    assertEquals("hello world!", HelloWorld.greet());
  }
}
