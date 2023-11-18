import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;

class RemovedNumbersTest {
  @Test
  void sample() {
    var expected = List.of(
        new long[]{15, 21},
        new long[]{21, 15}
    );
    var actual = RemovedNumbers.removNb(26);
    assertArrayEquals(expected.get(0), actual.get(0));
    assertArrayEquals(expected.get(1), actual.get(1));

    expected = List.of(
        new long[]{162, 276},
        new long[]{276, 162}
    );
    actual = RemovedNumbers.removNb(300);
    assertArrayEquals(expected.get(0), actual.get(0));
    assertArrayEquals(expected.get(1), actual.get(1));

    actual = RemovedNumbers.removNb(100);
    assertTrue(actual.isEmpty());
  }
}