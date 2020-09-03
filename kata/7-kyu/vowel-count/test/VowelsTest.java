import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class VowelsTest {
  @Test
  void sample() {
    assertEquals(5, Vowels.getCount("abracadabra"));
  }
}
