import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class ExampleKataTests {
  @Test
  void squareBlock() {
    boolean[][] square = {
        {true, true},
        {true, true}};
    assertArrayEquals(square, Tetris.Rotate(square));
  }

  @Test
  void lBlock() {
    boolean[][] post = {
        {true, true, true},
        {true, false, false}};

    assertArrayEquals(post, Tetris.Rotate(new boolean[][]{
        {true, false},
        {true, false},
        {true, true}}));
  }
}