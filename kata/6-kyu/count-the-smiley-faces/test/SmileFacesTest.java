import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class SmileFacesTest {
  @Test
  void sample() {
    assertEquals(2, SmileFaces.countSmileys(List.of(":)", ":D", ":-}", ":-()")));
    assertEquals(1, SmileFaces.countSmileys(List.of(":)", "XD", ":0}", "x:-", "):-", "D:")));
    assertEquals(2, SmileFaces.countSmileys(List.of(":)", ":D", "X-}", "xo)", ":X", ":-3", ":3")));
    assertEquals(4, SmileFaces.countSmileys(List.of(":)", ":)", "x-]", ":ox", ";-(", ";-)", ";~(", ":~D")));
  }
}
