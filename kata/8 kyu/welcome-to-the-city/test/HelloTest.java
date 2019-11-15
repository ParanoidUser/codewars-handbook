import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HelloTest {
  @Test
  public void test1() {
    assertEquals("Hello, John Smith! Welcome to Phoenix, Arizona!", Hello.sayHello(new String[] {"John", "Smith"}, "Phoenix", "Arizona"));
  }
}
