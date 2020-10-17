import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalculatorTest {
  @Test
  void sample() {
    var calc = new Calculator();
    assertEquals(0, calc.getTotalArea(), .0001);
    assertEquals(12, calc.getTotalArea(new Triangle(6, 4)), .0001);
    assertEquals(36, calc.getTotalArea(new Square(6)), .0001);
    assertEquals(32, calc.getTotalArea(new Rectangle(4, 8)), .0001);
    assertEquals(28.27, calc.getTotalArea(new Circle(3)), .0001);
    assertEquals(4.45, calc.getTotalArea(new Rectangle(1.112, 2), new Rectangle(1.111, 2)), .0001);
    assertEquals(49.14, calc.getTotalArea(new Rectangle(4, 2), new Rectangle(3, 4), new Circle(1), new Square(1), new Triangle(10, 5)), .0001);
  }
}