import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BanjoExampleTest {
  @Test
  void sample() {
    assertEquals("Martin does not play banjo", Banjo.areYouPlayingBanjo("Martin"));
    assertEquals("Rikke plays banjo", Banjo.areYouPlayingBanjo("Rikke"));
  }
}
