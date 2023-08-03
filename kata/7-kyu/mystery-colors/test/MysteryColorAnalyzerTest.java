import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class MysteryColorAnalyzerTest {
  @Test
  void emptyColorsList() {
    var analyzer = new MysteryColorAnalyzerImpl();
    List<Color> empty = List.of();
    assertEquals(0, analyzer.numberOfDistinctColors(empty));
    assertEquals(0, analyzer.colorOccurrence(empty, Color.RED));
    assertEquals(0, analyzer.colorOccurrence(empty, Color.GREEN));
    assertEquals(0, analyzer.colorOccurrence(empty, Color.BLUE));
    assertEquals(0, analyzer.colorOccurrence(empty, Color.YELLOW));
    assertEquals(0, analyzer.colorOccurrence(empty, Color.ORANGE));
    assertEquals(0, analyzer.colorOccurrence(empty, Color.PURPLE));
    assertEquals(0, analyzer.colorOccurrence(empty, Color.WHITE));
    assertEquals(0, analyzer.colorOccurrence(empty, Color.BLACK));
  }

  @Test
  void rgbColors() {
    var analyzer = new MysteryColorAnalyzerImpl();
    var rgb = List.of(Color.RED, Color.GREEN, Color.BLUE);
    assertEquals(3, analyzer.numberOfDistinctColors(rgb));
    assertEquals(1, analyzer.colorOccurrence(rgb, Color.RED));
    assertEquals(1, analyzer.colorOccurrence(rgb, Color.GREEN));
    assertEquals(1, analyzer.colorOccurrence(rgb, Color.BLUE));
    assertEquals(0, analyzer.colorOccurrence(rgb, Color.YELLOW));
    assertEquals(0, analyzer.colorOccurrence(rgb, Color.ORANGE));
    assertEquals(0, analyzer.colorOccurrence(rgb, Color.PURPLE));
    assertEquals(0, analyzer.colorOccurrence(rgb, Color.WHITE));
    assertEquals(0, analyzer.colorOccurrence(rgb, Color.BLACK));
  }

  @Test
  void duplicateColors() {
    var analyzer = new MysteryColorAnalyzerImpl();
    var duplicate = List.of(Color.RED, Color.GREEN, Color.PURPLE, Color.BLUE, Color.RED, Color.BLUE, Color.RED, Color.BLUE, Color.BLACK, Color.PURPLE, Color.ORANGE, Color.GREEN);
    assertEquals(6, analyzer.numberOfDistinctColors(duplicate));
    assertEquals(3, analyzer.colorOccurrence(duplicate, Color.RED));
    assertEquals(2, analyzer.colorOccurrence(duplicate, Color.GREEN));
    assertEquals(3, analyzer.colorOccurrence(duplicate, Color.BLUE));
    assertEquals(0, analyzer.colorOccurrence(duplicate, Color.YELLOW));
    assertEquals(1, analyzer.colorOccurrence(duplicate, Color.ORANGE));
    assertEquals(2, analyzer.colorOccurrence(duplicate, Color.PURPLE));
    assertEquals(0, analyzer.colorOccurrence(duplicate, Color.WHITE));
    assertEquals(1, analyzer.colorOccurrence(duplicate, Color.BLACK));
  }
}