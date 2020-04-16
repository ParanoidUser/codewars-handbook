import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void sampleTests() {
    String a = "000\n" + "000\n" + "000",
        b = "010\n" + "010\n" + "010",
        c = "010\n" + "101\n" + "010",
        d = "0707\n" + "7070\n" + "0707\n" + "7070",
        e = "700000\n" + "077770\n" + "077770\n" + "077770\n" + "077770\n" + "000007",
        f = "777000\n" + "007000\n" + "007000\n" + "007000\n" + "007000\n" + "007777",
        g = "000000\n" + "000000\n" + "000000\n" + "000010\n" + "000109\n" + "001010";

    assertEquals(0, Finder.pathFinder(a));
    assertEquals(2, Finder.pathFinder(b));
    assertEquals(4, Finder.pathFinder(c));
    assertEquals(42, Finder.pathFinder(d));
    assertEquals(14, Finder.pathFinder(e));
    assertEquals(0, Finder.pathFinder(f));
    assertEquals(4, Finder.pathFinder(g));
  }
}
