import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void descriptionExamples() {
    assertEquals("<span style=\"color: pink\">F</span><span style=\"color: orange\">3</span><span style=\"color: green\">R</span><span style=\"color: pink\">F</span><span style=\"color: orange\">5</span><span style=\"color: red\">L</span><span style=\"color: pink\">F</span><span style=\"color: orange\">7</span>", RoboScript.highlight("F3RF5LF7"));
    assertEquals("<span style=\"color: pink\">FFF</span><span style=\"color: green\">R</span><span style=\"color: orange\">345</span><span style=\"color: pink\">F</span><span style=\"color: orange\">2</span><span style=\"color: red\">LL</span>", RoboScript.highlight("FFFR345F2LL"));
    assertEquals("<span style=\"color: orange\">17</span>(<span style=\"color: orange\">4934290</span><span style=\"color: pink\">F</span><span style=\"color: orange\">4</span>(<span style=\"color: orange\">0</span><span style=\"color: pink\">F</span>)<span style=\"color: orange\">8</span>", RoboScript.highlight("17(4934290F4(0F)8"));
  }
}