import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AutocorrectTest {
  @Test
  void sample() {
    assertEquals("youtube", Kata.autocorrect("youtube"));
    assertEquals("your sister", Kata.autocorrect("u"));
    assertEquals("your sister", Kata.autocorrect("you"));
    assertEquals("your sister", Kata.autocorrect("Youuuuu"));
    assertEquals("I miss your sister!", Kata.autocorrect("I miss you!"));
    assertEquals("your sister your sister youville utube your sister youyouyou uuu raiyou united your sister your sister your sister", Kata.autocorrect("You u youville utube you youyouyou uuu raiyou united youuuu u you"));
  }
}
