import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CodeWarsTest {
  @Test
  void sample() {
    assertEquals("12345", CodeWars.crack("827ccb0eea8a706c4c34a16891f84e7b"));
    assertEquals("00078", CodeWars.crack("86aa400b65433b608a9db30070ec60cd"));
  }
}