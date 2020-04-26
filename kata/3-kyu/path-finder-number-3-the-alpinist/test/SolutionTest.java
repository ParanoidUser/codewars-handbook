import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(0, Finder.pathFinder("000\n000\n000"));
    assertEquals(2, Finder.pathFinder("010\n010\n010"));
    assertEquals(4, Finder.pathFinder("010\n101\n010"));
    assertEquals(42, Finder.pathFinder("0707\n7070\n0707\n7070"));
    assertEquals(14, Finder.pathFinder("700000\n077770\n077770\n077770\n077770\n000007"));
    assertEquals(0, Finder.pathFinder("777000\n007000\n007000\n007000\n007000\n007777"));
    assertEquals(4, Finder.pathFinder("000000\n000000\n000000\n000010\n000109\n001010"));
  }
}
