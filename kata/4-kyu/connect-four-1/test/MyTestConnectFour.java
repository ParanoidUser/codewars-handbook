import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class MyTestConnectFour {
  @Test
  public void firstTest() {
    var myList = List.of("A_Red", "B_Yellow", "A_Red", "B_Yellow", "A_Red", "B_Yellow", "G_Red", "B_Yellow");
    assertEquals("it should return Yellow", "Yellow", ConnectFour.whoIsWinner(myList));
  }

  @Test
  public void secondTest() {
    var myList = List.of(
            "C_Yellow", "E_Red", "G_Yellow", "B_Red", "D_Yellow", "B_Red", "B_Yellow",
            "G_Red", "C_Yellow", "C_Red", "D_Yellow", "F_Red", "E_Yellow", "A_Red",
            "A_Yellow", "G_Red", "A_Yellow", "F_Red", "F_Yellow", "D_Red", "B_Yellow",
            "E_Red", "D_Yellow", "A_Red", "G_Yellow", "D_Red", "D_Yellow", "C_Red");
    assertEquals("it should return Yellow", "Yellow", ConnectFour.whoIsWinner(myList));
  }

  @Test
  public void thirdTest() {
    var myList = List.of(
            "A_Yellow", "B_Red", "B_Yellow", "C_Red", "G_Yellow", "C_Red", "C_Yellow",
            "D_Red", "G_Yellow", "D_Red", "G_Yellow", "D_Red", "F_Yellow", "E_Red", "D_Yellow");
    assertEquals("it should return Red", "Red", ConnectFour.whoIsWinner(myList));
  }
}
