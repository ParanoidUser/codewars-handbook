import static java.util.Arrays.stream;
import static java.util.stream.IntStream.of;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    int[] raffle = LOTTO.numberGenerator();
    assertEquals(7, raffle.length);
    assertFalse(Arrays.equals(raffle, LOTTO.numberGenerator()));

    int superzahl = raffle[6];
    assertTrue(superzahl >= 0 && superzahl < 10);

    int[] numbers = stream(raffle, 0, 6).distinct().sorted().toArray();
    assertEquals(6, of(numbers).distinct().toArray().length);

    assertArrayEquals(numbers, Arrays.copyOfRange(raffle, 0, 6));
    for (int i = 0; i < 6; i++) {
      assertTrue(raffle[i] > 0 && raffle[i] < 50);
    }

    assertEquals(1, LOTTO.checkForWinningCategory(new int[]{1, 2, 3, 4, 5, 6, 7}, new int[]{1, 2, 3, 4, 5, 6, 7}));
    assertEquals(2, LOTTO.checkForWinningCategory(new int[]{1, 2, 3, 4, 5, 6, 0}, new int[]{1, 2, 3, 4, 5, 6, 7}));
    assertEquals(8, LOTTO.checkForWinningCategory(new int[]{1, 2, 3, 34, 35, 39, 1}, new int[]{1, 2, 3, 4, 5, 6, 7}));
  }
}