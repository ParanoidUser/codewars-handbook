import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ExampleTests {
  @Test
  void sample() {
    assertEquals("ping", Dinglemouse.pingPong("ping-pong-aaaa-ping-pong-ping-aaaa"));
    assertEquals("ping", Dinglemouse.pingPong("pong-ping-bink-ping-pong-donk"));
    assertEquals("pong", Dinglemouse.pingPong("ping-pong-bink-pong-ping-donk"));
    assertEquals("ping", Dinglemouse.pingPong("ping-pong-ping-pong-bonk-bing-doof"));
    assertEquals("ping", Dinglemouse.pingPong("pong-ding-pong-ping-donk-ping-pong-thud"));
    assertEquals("pong", Dinglemouse.pingPong("pong-ping-dong-ping-pong-tink-bonk-pong-ping-doof"));
    assertEquals("ping", Dinglemouse.pingPong("ping-pong-bink-ping-pong-donk-pong-ping-pong-ping-bang"));
  }
}