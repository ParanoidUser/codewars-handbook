import static java.util.List.of;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ConnectFourTest {

  @Test
  void firstTest() {
    var myList = of("A_Red", "B_Yellow", "A_Red", "B_Yellow", "A_Red", "B_Yellow", "G_Red", "B_Yellow");
    assertEquals("Yellow", ConnectFour.whoIsWinner(myList));
  }

  @Test
  void secondTest() {
    var myList = of(
        "C_Yellow", "E_Red", "G_Yellow", "B_Red", "D_Yellow", "B_Red", "B_Yellow",
        "G_Red", "C_Yellow", "C_Red", "D_Yellow", "F_Red", "E_Yellow", "A_Red",
        "A_Yellow", "G_Red", "A_Yellow", "F_Red", "F_Yellow", "D_Red", "B_Yellow",
        "E_Red", "D_Yellow", "A_Red", "G_Yellow", "D_Red", "D_Yellow", "C_Red");
    assertEquals("Yellow", ConnectFour.whoIsWinner(myList));
  }

  @Test
  void thirdTest() {
    var myList = of(
        "A_Yellow", "B_Red", "B_Yellow", "C_Red", "G_Yellow", "C_Red", "C_Yellow",
        "D_Red", "G_Yellow", "D_Red", "G_Yellow", "D_Red", "F_Yellow", "E_Red", "D_Yellow");
    assertEquals("Red", ConnectFour.whoIsWinner(myList));
  }

  @Test
  void drawTest() {
    var myList = of("C_Yellow", "B_Red");
    assertEquals("Draw", ConnectFour.whoIsWinner(myList));
  }

  @Test
  void overflowTest() {
    var myList = of("A_Yellow", "A_Red", "A_Yellow", "A_Red", "A_Yellow", "A_Red", "A_Yellow", "A_Red");
    assertEquals("Draw", ConnectFour.whoIsWinner(myList));
  }
}
