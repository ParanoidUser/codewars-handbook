import static java.util.Map.of;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ExampleTests {
  private HtmlColorParser parser;

  @Before
  public void setup() {
    parser = new HtmlColorParser(of(
                "black", "#000000",
                "blue", "#0000ff",
                "brown", "#a52a2a",
                "green", "#008000",
                "limegreen", "#32cd32",
                "orange", "#ffa500",
                "red", "#ff0000",
                "violet", "#ee82ee",
                "yellow", "#ffff00"));
  }

  @Test
  public void testExamples() {
    assertEquals(new RGB(128, 255, 160), parser.parse("#80FFA0"));
    assertEquals(new RGB(51, 187, 119), parser.parse("#3B7"));
    assertEquals(new RGB(50, 205, 50), parser.parse("LimeGreen"));
  }
}
