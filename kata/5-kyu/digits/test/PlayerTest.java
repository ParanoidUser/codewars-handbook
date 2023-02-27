import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.ArrayList;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class PlayerTest {
  private static Stream<int[]> fixedCodes() {
    return Stream.of(
        new int[]{0, 1, 2, 3},
        new int[]{1, 2, 3, 7},
        new int[]{7, 0, 1, 4},
        new int[]{9, 8, 7, 6},
        new int[]{0, 9, 8, 7}
    );
  }

  private static Stream<int[]> randomCodes() {
    return Stream.generate(PlayerTest::randomCode).limit(50);
  }

  @ParameterizedTest()
  @MethodSource({"fixedCodes", "randomCodes"})
  void sample(int[] code) {
    Checker checker = RulesChecker.with(code);
    assertArrayEquals(code, Play.tryToGuess(checker));
  }

  private static int[] randomCode() {
    ArrayList<Integer> digits = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      digits.add(i);
    }

    int[] code = new int[4];
    for (int j = 0; j < 4; j++) {
      code[j] = digits.remove((int) (Math.random() * digits.size()));
    }
    return code;
  }
}