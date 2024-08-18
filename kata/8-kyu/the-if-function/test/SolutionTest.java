import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.atomic.AtomicBoolean;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
      true, true
      false, false
      , false
      """)
  void sample(Boolean bool, boolean expected) {
    var actual = new AtomicBoolean(false);
    Kata._if(bool, () -> actual.set(true), () -> actual.set(false));
    assertEquals(expected, actual.get());
  }
}