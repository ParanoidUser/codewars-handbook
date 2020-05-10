import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class PushAnObjectIntoArrayTest {
  @Test
  void sample() {
    assertEquals(List.of("an object"), PushAnObjectIntoArray.push());
  }
}
