import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FibonacciExampleTest {
  @Test
  public void example1() {
    assertEquals(5, Fibonacci.getFibNumb(193150));
  }

  @Test
  public void example2() {
    assertEquals(0, Fibonacci.getFibNumb(300));
  }

  @Test
  public void example3() {
    assertEquals(6, Fibonacci.getFibNumb(20001));
  }
}
