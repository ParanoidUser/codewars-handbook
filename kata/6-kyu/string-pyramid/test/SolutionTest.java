import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(" # \n***", Pyramid.watchPyramidFromTheSide("*#"));
    assertEquals("***\n*#*\n***", Pyramid.watchPyramidFromAbove("*#"));
    assertEquals(9, Pyramid.countVisibleCharactersOfThePyramid("*#"));
    assertEquals(10, Pyramid.countAllCharactersOfThePyramid("*#"));

    assertEquals("  c  \n bbb \naaaaa", Pyramid.watchPyramidFromTheSide("abc"));
    assertEquals("aaaaa\nabbba\nabcba\nabbba\naaaaa", Pyramid.watchPyramidFromAbove("abc"));
    assertEquals(25, Pyramid.countVisibleCharactersOfThePyramid("abc"));
    assertEquals(35, Pyramid.countAllCharactersOfThePyramid("abc"));


    assertEquals("", Pyramid.watchPyramidFromTheSide(""));
    assertEquals("", Pyramid.watchPyramidFromAbove(""));
    assertEquals(-1, Pyramid.countVisibleCharactersOfThePyramid(""));
    assertEquals(-1, Pyramid.countAllCharactersOfThePyramid(""));

    assertNull(Pyramid.watchPyramidFromTheSide(null));
    assertNull(Pyramid.watchPyramidFromAbove(null));
    assertEquals(-1, Pyramid.countVisibleCharactersOfThePyramid(null));
    assertEquals(-1, Pyramid.countAllCharactersOfThePyramid(null));
  }
}