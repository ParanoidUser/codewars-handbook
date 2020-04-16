import static org.junit.Assert.assertEquals;

import java.util.*;

import org.junit.Before;
import org.junit.Test;

public class MysteryColorAnalyzerTest {

  private static final int RANDOM_TEST_RUNS = 5;

  MysteryColorAnalyzer mysteryColorAnalyzer;
  Random random = new Random();

  @Before
  public void setUp() {
    mysteryColorAnalyzer = new MysteryColorAnalyzerImpl();
  }

  @Test
  public void test_noColors_numberOfDistinctColors() {
    assertEquals(0, mysteryColorAnalyzer.numberOfDistinctColors(new ArrayList<>()));
  }

  @Test
  public void test_noColors_colorOccurrence() {
    Arrays.stream(Color.class.getEnumConstants())
        .forEach(color -> assertEquals(0, mysteryColorAnalyzer.colorOccurrence(new ArrayList<>(), color)));
  }

  @Test
  public void test_primaryColors_numberOfDistinctColors() {
    List<Color> primaryMysteryColors = getPrimaryMysteryColors();
    assertEquals(3, mysteryColorAnalyzer.numberOfDistinctColors(primaryMysteryColors));
  }

  @Test
  public void test_primaryColors_colorOccurrence() {
    List<Color> primaryMysteryColors = getPrimaryMysteryColors();
    assertEquals(1, mysteryColorAnalyzer.colorOccurrence(primaryMysteryColors, Color.RED));
    assertEquals(1, mysteryColorAnalyzer.colorOccurrence(primaryMysteryColors, Color.GREEN));
    assertEquals(1, mysteryColorAnalyzer.colorOccurrence(primaryMysteryColors, Color.BLUE));
    assertEquals(0, mysteryColorAnalyzer.colorOccurrence(primaryMysteryColors, Color.YELLOW));
    assertEquals(0, mysteryColorAnalyzer.colorOccurrence(primaryMysteryColors, Color.ORANGE));
    assertEquals(0, mysteryColorAnalyzer.colorOccurrence(primaryMysteryColors, Color.PURPLE));
    assertEquals(0, mysteryColorAnalyzer.colorOccurrence(primaryMysteryColors, Color.WHITE));
    assertEquals(0, mysteryColorAnalyzer.colorOccurrence(primaryMysteryColors, Color.BLACK));
  }

  @Test
  public void test_ColorMixture_numberOfDistinctColors() {
    List<Color> mysteryColors = getMysteryColors();
    assertEquals(6, mysteryColorAnalyzer.numberOfDistinctColors(mysteryColors));
  }

  @Test
  public void test_ColorMixture_colorOccurrence() {
    List<Color> mysteryColors = getMysteryColors();
    assertEquals(4, mysteryColorAnalyzer.colorOccurrence(mysteryColors, Color.RED));
    assertEquals(2, mysteryColorAnalyzer.colorOccurrence(mysteryColors, Color.GREEN));
    assertEquals(4, mysteryColorAnalyzer.colorOccurrence(mysteryColors, Color.BLUE));
    assertEquals(0, mysteryColorAnalyzer.colorOccurrence(mysteryColors, Color.YELLOW));
    assertEquals(1, mysteryColorAnalyzer.colorOccurrence(mysteryColors, Color.ORANGE));
    assertEquals(2, mysteryColorAnalyzer.colorOccurrence(mysteryColors, Color.PURPLE));
    assertEquals(0, mysteryColorAnalyzer.colorOccurrence(mysteryColors, Color.WHITE));
    assertEquals(1, mysteryColorAnalyzer.colorOccurrence(mysteryColors, Color.BLACK));
  }

  @Test
  public void test_Random_numberOfDistinctColors() {
    for (int t = 0; t < RANDOM_TEST_RUNS; t++) {
      List<Color> randomMysteryColors = getRandomMysteryColors(random.nextInt(125) + 4);
      assertEquals(new HashSet<>(randomMysteryColors).size(), mysteryColorAnalyzer.numberOfDistinctColors(randomMysteryColors));
    }
  }

  @Test
  public void test_Random_colorOccurrence() {
    for (int t = 0; t < RANDOM_TEST_RUNS; t++) {
      List<Color> randomMysteryColors = getRandomMysteryColors(random.nextInt(125) + 4);
      Arrays.stream(Color.class.getEnumConstants())
          .forEach(color -> assertEquals(colorCount(randomMysteryColors, color), mysteryColorAnalyzer.colorOccurrence(randomMysteryColors, color)));
    }
  }

  private List<Color> getPrimaryMysteryColors() {
    List<Color> primaryMysteryColors = new ArrayList<>();
    primaryMysteryColors.add(Color.RED);
    primaryMysteryColors.add(Color.GREEN);
    primaryMysteryColors.add(Color.BLUE);
    return primaryMysteryColors;
  }

  private List<Color> getMysteryColors() {
    List<Color> mysteryColors = new ArrayList<>();
    mysteryColors.add(Color.RED);
    mysteryColors.add(Color.RED);
    mysteryColors.add(Color.GREEN);
    mysteryColors.add(Color.PURPLE);
    mysteryColors.add(Color.BLUE);
    mysteryColors.add(Color.RED);
    mysteryColors.add(Color.BLUE);
    mysteryColors.add(Color.RED);
    mysteryColors.add(Color.BLUE);
    mysteryColors.add(Color.BLUE);
    mysteryColors.add(Color.BLACK);
    mysteryColors.add(Color.PURPLE);
    mysteryColors.add(Color.ORANGE);
    mysteryColors.add(Color.GREEN);
    return mysteryColors;
  }

  private List<Color> getRandomMysteryColors(int colorCount) {
    List<Color> randomMysteryColors = new ArrayList<>();
    for (int i = 0; i < colorCount; i++) {
      randomMysteryColors.add(getRandomColor());
    }
    return randomMysteryColors;
  }

  private Color getRandomColor() {
    return Color.class.getEnumConstants()[random.nextInt(Color.class.getEnumConstants().length)];
  }

  private int colorCount(List<Color> mysteryColors, Color color) {
    return Collections.frequency(mysteryColors, color);
  }
}
