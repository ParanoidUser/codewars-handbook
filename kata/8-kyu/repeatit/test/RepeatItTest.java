import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RepeatItTest {
  @Test
  void sample() {
    assertEquals("Not a string", RepeatIt.repeatString(null, 3));
    assertEquals("***", RepeatIt.repeatString("*", 3));
    assertEquals("HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHello", RepeatIt.repeatString("Hello", 11));
  }
}
