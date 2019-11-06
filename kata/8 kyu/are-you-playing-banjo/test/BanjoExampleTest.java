import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BanjoExampleTest {
  @Test
  public void PeopleThatPlayBanjo() {
    assertEquals("Nope!", Banjo.areYouPlayingBanjo("Martin"), "Martin does not play banjo");
    assertEquals("Nope!", Banjo.areYouPlayingBanjo("Rikke"), "Rikke plays banjo");
  }
}
