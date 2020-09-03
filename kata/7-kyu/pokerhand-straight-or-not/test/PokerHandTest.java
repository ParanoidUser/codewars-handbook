import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;

class PokerHandTest {
  @Test
  void sample() {
    assertTrue(PokerHand.IsStraight(List.of(2, 3, 4, 5, 6)));
    assertTrue(PokerHand.IsStraight(List.of(14, 5, 4, 2, 3)));
    assertTrue(PokerHand.IsStraight(List.of(2, 7, 12, 11, 10, 13, 14)));
    assertFalse(PokerHand.IsStraight(List.of(3, 4, 5, 6, 8, 9, 10)));
    assertFalse(PokerHand.IsStraight(List.of(2, 3)));
    assertFalse(PokerHand.IsStraight(List.of(7, 7, 12, 11, 3, 4, 14)));
  }
}
