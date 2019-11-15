import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RentalCarExampleTests {
  @Test
  public void under3Tests() {
    assertEquals(40, Kata.rentalCarCost(1));
    assertEquals(80, Kata.rentalCarCost(2));
  }

  @Test
  public void under7Tests() {
    assertEquals(100, Kata.rentalCarCost(3));
    assertEquals(140, Kata.rentalCarCost(4));
    assertEquals(180, Kata.rentalCarCost(5));
    assertEquals(220, Kata.rentalCarCost(6));
  }

  @Test
  public void over7Tests() {
    assertEquals(230, Kata.rentalCarCost(7));
    assertEquals(270, Kata.rentalCarCost(8));
    assertEquals(310, Kata.rentalCarCost(9));
    assertEquals(350, Kata.rentalCarCost(10));
  }
}
