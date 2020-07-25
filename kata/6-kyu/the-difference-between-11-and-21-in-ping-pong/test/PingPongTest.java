import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class PingPongTest {

  @Test
  void sample() {
    var r1 = List.of(
        new Score(11, 0),
        new Score(11, 0),
        new Score(1, 1),
        new Score(21, 0),
        new Score(2, 1)
    );
    assertEquals(r1, PingPong.result("WWWWWWWWWWWWWWWWWWWWWWLW"));

    var r2 = List.of(
        new Score(11, 0),
        new Score(0, 11),
        new Score(11, 11)
    );
    assertEquals(r2, PingPong.result("WWWWWWWWWWWLLLLLLLLLLL"));

    var r3 = List.of(
        new Score(9, 11),
        new Score(1, 0),
        new Score(10, 11)
    );
    assertEquals(r3, PingPong.result("WLWLLLWWWLWLWLLLWLWLW"));

    var r4 = List.of(
        new Score(5, 11),
        new Score(4, 11),
        new Score(0, 4),
        new Score(9, 21),
        new Score(0, 5)
    );
    assertEquals(r4, PingPong.result("LLLWLLLWLWLLWLWLLWLLWLWLLLWLLLLLLLL"));

    var r5 = List.of(
        new Score(12, 10),
        new Score(11, 8),
        new Score(21, 18),
        new Score(2, 0)
    );
    assertEquals(r5, PingPong.result("LWWWLWLLLLWLWLWWWWLLWWWLLWLWLWLWLLWLWWWWW"));
  }
}
