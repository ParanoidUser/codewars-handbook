import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(Map.of("pos", List.of(3, 7), "peaks", List.of(6, 3)), PickPeaks.getPeaks(new int[]{1, 2, 3, 6, 4, 1, 2, 3, 2, 1}));
    assertEquals(Map.of("pos", List.of(3, 7), "peaks", List.of(6, 3)), PickPeaks.getPeaks(new int[]{3, 2, 3, 6, 4, 1, 2, 3, 2, 1, 2, 3}));
    assertEquals(Map.of("pos", List.of(3, 7, 10), "peaks", List.of(6, 3, 2)), PickPeaks.getPeaks(new int[]{3, 2, 3, 6, 4, 1, 2, 3, 2, 1, 2, 2, 2, 1}));
    assertEquals(Map.of("pos", List.of(2, 4), "peaks", List.of(3, 2)), PickPeaks.getPeaks(new int[]{2, 1, 3, 1, 2, 2, 2, 2, 1}));
    assertEquals(Map.of("pos", List.of(2), "peaks", List.of(3)), PickPeaks.getPeaks(new int[]{2, 1, 3, 1, 2, 2, 2, 2}));
  }
}