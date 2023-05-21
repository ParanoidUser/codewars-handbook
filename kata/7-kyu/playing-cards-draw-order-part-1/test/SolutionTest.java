import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(List.of("5D", "JC", "AD", "5C", "8C", "4H", "7C"), CardDraw.draw(List.of("5D", "4H", "JC", "8C", "AD", "7C", "5C")));
    assertEquals(List.of("KC", "QC", "KD", "QD", "KH", "QH", "KS", "QS"), CardDraw.draw(List.of("KC", "KH", "QC", "KS", "KD", "QH", "QD", "QS")));
  }
}