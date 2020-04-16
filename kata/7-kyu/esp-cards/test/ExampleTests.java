import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ExampleTests {
  @Test
  public void testSquare() {
    char[][] card = Card.makeSquareCard();
    assertEquals("square", Dinglemouse.nameTheShape(card));
  }

  @Test
  public void testDiamond() {
    char[][] card = Card.makeDiamondCard();
    assertEquals("diamond", Dinglemouse.nameTheShape(card));
  }

  @Test
  public void testCircle() {
    char[][] card = Card.makeCircleCard();
    assertEquals("circle", Dinglemouse.nameTheShape(card));
  }
}
