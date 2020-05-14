import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FirstNonRepeatedTest {
  @Test
  void sample() {
    assertEquals((Character) 'e', FirstNonRepeated.firstNonRepeated("test"));
    assertEquals((Character) 'r', FirstNonRepeated.firstNonRepeated("teeter"));
    assertEquals((Character) '5', FirstNonRepeated.firstNonRepeated("1122321235121222"));
    assertEquals((Character) '\0', FirstNonRepeated.firstNonRepeated(""));
  }
}
