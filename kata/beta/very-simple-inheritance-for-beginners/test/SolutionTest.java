import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void testAddition() {
    Operation operation = new Add();
    operation.execute(2.0, 5.0);
    assertEquals(7.0, operation.result, 0.001);
  }

  @Test
  void testSubtraction() {
    Operation operation = new Subtract();
    operation.execute(2.0, 5.0);
    assertEquals(-3.0, operation.result, 0.001);
  }

  @Test
  void testMultiplication() {
    Operation operation = new Multiply();
    operation.execute(2.0, 5.0);
    assertEquals(10.0, operation.result, 0.001);
  }

  @Test
  void testDivision() {
    Operation operation = new Divide();
    operation.execute(2.0, 5.0);
    assertEquals(0.4, operation.result, 0.001);
  }
}