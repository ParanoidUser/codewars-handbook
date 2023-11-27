import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class UserTest {
  private final static User global = new User();

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
    var user = new User().incProgress(activity);
    assertEquals(rank, user.rank);
    assertEquals(progress, user.progress);
  }
}