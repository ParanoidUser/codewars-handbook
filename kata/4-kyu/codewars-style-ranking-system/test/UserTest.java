import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class UserTest {
  private final static User global = new User();
  private final User local = new User();

  @ParameterizedTest
  @CsvSource(textBlock = """
      1, -2, 40
      1, -2, 80
      1, -1, 20
      1, -1, 30
      1, -1, 40
      2, -1, 80
      2, 1, 20
      -1, 1, 21
      3, 1, 61
      8, 6, 51
      8, 6, 91
      8, 7, 31
      8, 7, 41
      8, 7, 51
      8, 7, 61
      8, 7, 71
      8, 7, 81
      8, 7, 91
      8, 8, 0
      8, 8, 0
      """)
  void progress(int activity, int rank, int progress) {
    global.incProgress(activity);
    assertEquals(rank, global.rank);
    assertEquals(progress, global.progress);
  }

  @ParameterizedTest
  @CsvSource(textBlock = """
      -8, -8, 3
      -7, -8, 10
      -6, -8, 40
      -5, -8, 90
      -4, -7, 60
      -8, -8, 3
      """)
  void sample(int activity, int rank, int progress) {
    local.incProgress(activity);
    assertEquals(rank, local.rank);
    assertEquals(progress, local.progress);
  }

  @ParameterizedTest
  @ValueSource(ints = {-9, 0, 9})
  void negative(int activity) {
    assertThrows(IllegalArgumentException.class, () -> local.incProgress(activity));
  }
}