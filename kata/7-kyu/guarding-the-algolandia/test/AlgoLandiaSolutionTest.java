import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AlgoLandiaSolutionTest {
  @Test
  public void testAlreadySafe() {
    assertEquals(0, AlgoLandiaSolution.findNeededGuards(new boolean[] {true, true, false, true, false}));
  }

  @Test
  public void testEasy() {
    assertEquals(2, AlgoLandiaSolution.findNeededGuards(new boolean[] {false, false, true, false, false}));
  }

  @Test
  public void testFifth() {
    assertEquals(2, AlgoLandiaSolution.findNeededGuards(new boolean[] {true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, true, true, true, true, true, true, true, false, true, true, true, false, true, true, true, true, true, true, true, true, true, true, false, false, true, true, true, false, false}));
    assertEquals(2, AlgoLandiaSolution.findNeededGuards(new boolean[] {true, false, true, true, true, true, true, true, false, true, true, true, true, true, true, true, false, true, true, true, true, false, true, true, true, false, true, true, true, false, false, true, true, true, true, true, true, true, false, true, true, true, true, true, true, false, true, true, true, true, true, true, true, true, true, false, true, true, true, false, false, true, true, true, true, true, false, true, true, true, true, true, true, true, true, true, true, true, true, true}));
  }

  @Test
  public void testFour()
  {
    assertEquals(0, AlgoLandiaSolution.findNeededGuards(new boolean[] {true, true, true, true, true, true, false, true, true, true, true, true, true, true, true, true, true, false, true, true, true, true, true, false, true, true, true, true, true, false, true, true, true, true, true, true, true, true, true, false, true, true, true, true}));
    assertEquals(0, AlgoLandiaSolution.findNeededGuards(new boolean[] {true, true, true}));
    assertEquals(0, AlgoLandiaSolution.findNeededGuards(new boolean[] {true, true, true, false, true}));
    assertEquals(0, AlgoLandiaSolution.findNeededGuards(new boolean[] {true, true, false, true, false}));
    assertEquals(0, AlgoLandiaSolution.findNeededGuards(new boolean[] {true, true, true, true, true, true, true, true, true, true, true, false}));
    assertEquals(0, AlgoLandiaSolution.findNeededGuards(new boolean[] {true, true, true, true, true, true, false, true, true, true, true, true, true, true, true, true, true, false, true, true, true, true, true, false, true, true, true, true, true, false, true, true, true, true, true, true, true, true, true, false, true, true, true, true}));
    assertEquals(1, AlgoLandiaSolution.findNeededGuards(new boolean[] {true, true, true, true, false, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, true, true, true, true, true, true, true, true, true, true, true, true, true}));
    assertEquals(1, AlgoLandiaSolution.findNeededGuards(new boolean[] {true, true, true, true, true, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, true, true, true, true, true, true, true, true, true, true, true, true, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, true, true, true, true, true, true, true, true, false, true, true, true, true, true, true, false, true, true, true, true, true, true, true, true, true}));
    assertEquals(1, AlgoLandiaSolution.findNeededGuards(new boolean[] {true, true, true, true, true, true, true, true, true, true, true, true, false, true, true, true, false, true, true, true, true, true, true, false, true, true, true, false, true, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false, true, true, true, true, true, true, true, true, true, true, true, true, true}));
    assertEquals(1, AlgoLandiaSolution.findNeededGuards(new boolean[] {true, true, true, true, true, true, false, false, false, true, true, true, true, false, true, true, true, true, true, false, true, true, true, false, true, true, true, true, true, true, true, true, true, true, true, true, true}));
    assertEquals(2, AlgoLandiaSolution.findNeededGuards(new boolean[] {true, true, false, false, false, true, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, true, true, true, true, true, true, true, false, true, true, true, true, false, true, true, true, true, true, true, true, true, true, true, true, false, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true}));
  }

  @Test
  public void testSecond() {
    assertEquals(0, AlgoLandiaSolution.findNeededGuards(new boolean[] {true}));
    assertEquals(0, AlgoLandiaSolution.findNeededGuards(new boolean[] {false}));
    assertEquals(2, AlgoLandiaSolution.findNeededGuards(new boolean[] {false, false, false, true, false, false, false, true}));
  }

  @Test
  public void testFirst() {
    assertEquals(2, AlgoLandiaSolution.findNeededGuards(new boolean[] {false, false, true, false, false}));
    assertEquals(2, AlgoLandiaSolution.findNeededGuards(new boolean[] {false, false, false, false, false}));
    assertEquals(3, AlgoLandiaSolution.findNeededGuards(new boolean[] {false, false, false, false, false, false}));
  }
}
