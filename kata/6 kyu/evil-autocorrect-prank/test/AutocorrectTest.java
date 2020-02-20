import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AutocorrectTest {
  @Test
  public void testApply() {
    assertEquals("your sister", Kata.autocorrect("u"));
    assertEquals("your sister", Kata.autocorrect("you"));
    assertEquals("your sister", Kata.autocorrect("Youuuuu"));
    assertEquals("youtube", Kata.autocorrect("youtube"));
    assertEquals("I miss your sister!", Kata.autocorrect("I miss you!"));
    assertEquals("your sister your sister youville utube your sister youyouyou uuu raiyou united your sister your sister your sister", Kata.autocorrect("You u youville utube you youyouyou uuu raiyou united youuuu u you"));
  }
}
