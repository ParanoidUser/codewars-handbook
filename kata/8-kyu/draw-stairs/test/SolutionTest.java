import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void sample() {
    assertEquals("""
        I
         I
          I""", Stairs.draw(3));

    assertEquals("""
        I
         I
          I
           I
            I
             I
              I""", Stairs.draw(7));
  }
}