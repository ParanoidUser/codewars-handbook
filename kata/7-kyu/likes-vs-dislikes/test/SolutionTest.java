import static org.junit.jupiter.api.Assertions.assertEquals;
import static preloaded.Button.Dislike;
import static preloaded.Button.Like;
import static preloaded.Button.Nothing;

import org.junit.jupiter.api.Test;
import preloaded.Button;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(Like, Solution.likeOrDislike(new Button[]{Like}));
    assertEquals(Nothing, Solution.likeOrDislike(new Button[]{Like, Like}));
    assertEquals(Dislike, Solution.likeOrDislike(new Button[]{Like, Dislike}));
    assertEquals(Nothing, Solution.likeOrDislike(new Button[]{Like, Dislike, Dislike}));
    assertEquals(Nothing, Solution.likeOrDislike(new Button[0]));
    assertEquals(Like, Solution.likeOrDislike(new Button[]{Like, Like, Dislike, Dislike, Like, Like, Dislike, Like}));
  }
}