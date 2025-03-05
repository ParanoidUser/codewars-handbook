import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ExampleTests {
  @Test
  void edge_X_X_X() {
    assertEquals("1st: X 2nd: X 3rd: X", Dinglemouse.horseRacing(new double[3][0]));
  }

  @Test
  void abc() {
    assertEquals("1st: A B C 2nd: - 3rd: -", Dinglemouse.horseRacing(
        new double[][]{
            {3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0},
            {3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0},
            {3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0}
        }));
  }

  @Test
  void ex1_A_B_C() {
    assertEquals("1st: A 2nd: B 3rd: C", Dinglemouse.horseRacing(
        new double[][]{
            {3, 3, 3, 3, 3, 3, 3, 3, 3, 3}, // A
            {2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, // B
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, // C
        }));
  }

  @Test
  void ex2_AB_C() {
    assertEquals("1st: A B 2nd: C 3rd: -", Dinglemouse.horseRacing(
        new double[][]{
            {3, 3, 3, 3, 3, 3, 3, 3, 3, 3}, // A
            {3, 3, 3, 3, 3, 3, 3, 3, 3, 3}, // B
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, // C
        }));
  }

  @Test
  void ex3_A_BC() {
    assertEquals("1st: A 2nd: B C 3rd: -", Dinglemouse.horseRacing(
        new double[][]{
            {3, 3, 3, 3, 3, 3, 3, 3, 3, 3}, // A
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, // B
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, // C
        }));
  }

  @Test
  void ex4_A_C_X() {
    assertEquals("1st: A 2nd: C 3rd: X", Dinglemouse.horseRacing(
        new double[][]{
            {3, 3, 3, 3, 3, 3, 3, 3, 3, 3}, // A
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, // B
            {2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, // C
        }));
  }

  @Test
  void ex5_A_X_X() {
    assertEquals("1st: A 2nd: X 3rd: X", Dinglemouse.horseRacing(
        new double[][]{
            {3, 3, 3, 3, 3, 3, 3, 3, 3, 3}, // A
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, // B
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, // C
        }));
  }

  @Test
  void ex6_BC_X() {
    assertEquals("1st: B C 2nd: X 3rd: -", Dinglemouse.horseRacing(
        new double[][]{
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, // A
            {3, 3, 3, 3, 3, 3, 3, 3, 3, 3}, // B
            {3, 3, 3, 3, 3, 3, 3, 3, 3, 3}, // C
        }));
  }
}