import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Set;
import org.junit.jupiter.api.Test;

class BingoCardTests {
  @Test
  void cardHas24Numbers() {
    assertEquals(24, BingoCard.getCard().length);
  }

  @Test
  void eachNumberOnCardIsUnique() {
    for (int i = 0; i < 10; i++) {
      String[] card = BingoCard.getCard();
      Set<String> set = Set.of(card);
      assertEquals(set.size(), card.length);
    }
  }

  @Test
  void categoriesAreInCorrectOrder() {
    String[] card = BingoCard.getCard();

    checkCategory(card, "B", 1, 5);
    checkCategory(card, "I", 6, 10);
    checkCategory(card, "N", 11, 14);
    checkCategory(card, "G", 15, 19);
    checkCategory(card, "O", 20, 24);
  }

  @Test
  void numbersWithinColumnAreAllInTheCorrectRange() {
    String[] card = BingoCard.getCard();

    checkColumn(card, 1, 5, 1, 15);
    checkColumn(card, 6, 10, 16, 30);
    checkColumn(card, 11, 14, 31, 45);
    checkColumn(card, 15, 19, 46, 60);
    checkColumn(card, 20, 24, 61, 75);
  }

  @Test
  void numbersWithinColumnAreInRandomOrder() {
    String[] card = BingoCard.getCard();

    int count = checkColumnOnRandomness(card, 1, 5)
        + checkColumnOnRandomness(card, 6, 10)
        + checkColumnOnRandomness(card, 11, 14)
        + checkColumnOnRandomness(card, 15, 19)
        + checkColumnOnRandomness(card, 20, 24);

    assertTrue(count > 1);
  }

  private void checkCategory(String[] card, String column, int start, int end) {
    for (int i = start - 1; i < end; i++) {
      assertTrue(card[i].startsWith(column));
    }
  }

  private void checkColumn(String[] card, int start, int end, int beginRange, int endRange) {
    for (int i = start - 1; i < end; i++) {
      int n = Integer.parseInt(card[i].substring(1));
      assertTrue(n >= beginRange && n <= endRange);
    }
  }

  private int checkColumnOnRandomness(String[] card, int start, int end) {
    int n = 0;
    boolean up = false;
    boolean down = false;

    for (int i = start - 1; i < end; i++) {
      int n1 = Integer.parseInt(card[i].substring(1));

      if (n != 0) {
        if (n1 > n) {
          up = true;
        }
        if (n1 < n) {
          down = true;
        }
      }
      n = n1;
    }

    return up && down ? 1 : 0;
  }
}
