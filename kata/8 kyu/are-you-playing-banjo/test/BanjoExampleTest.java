import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BanjoExampleTest {
  @Test
  public void peopleThatPlayBanjo() {
    assertEquals("Martin does not play banjo", Banjo.areYouPlayingBanjo("Martin"));
    assertEquals("Rikke plays banjo", Banjo.areYouPlayingBanjo("Rikke"));
  }
}
