import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

public class PokerHandTest {
  @Test
  public void test1IsStraight() {
    List<Integer> hand = List.of(2, 3, 4, 5, 6);
    assertTrue("2, 3, 4, 5, 6", PokerHand.IsStraight(hand));
  }

  @Test
  public void test2IsStraight() {
    List<Integer> hand = List.of(14, 5, 4, 2, 3);
    assertTrue("14, 5, 4 ,2, 3", PokerHand.IsStraight(hand));
  }

  @Test
  public void test3IsStraight() {
    List<Integer> hand = List.of(2, 3);
    assertFalse("2, 3", PokerHand.IsStraight(hand));
  }

  @Test
  public void test4IsStraight() {
    List<Integer> hand = List.of(7, 7, 12, 11, 3, 4, 14);
    assertFalse("7, 7, 12 ,11, 3, 4, 14", PokerHand.IsStraight(hand));
  }

  @Test
  public void test5IsStraight() {
    List<Integer> hand = List.of(2, 7, 12 ,11, 10, 13, 14);
    assertTrue("2, 7, 12 ,11, 10, 13, 14", PokerHand.IsStraight(hand));
  }
}
