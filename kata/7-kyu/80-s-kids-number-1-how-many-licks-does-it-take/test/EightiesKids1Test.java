import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;
import org.junit.jupiter.api.Test;

class EightiesKids1Test {
  @Test
  void sample() {
    assertEquals("It took 2 licks to get to the tootsie roll center of a tootsie pop.", EightiesKids1.totalLicks(Map.of("white magic", -250)));
    assertEquals("It took 245 licks to get to the tootsie roll center of a tootsie pop.", EightiesKids1.totalLicks(Map.of("happiness", -5, "clear skies", -2)));
    assertEquals("It took 252 licks to get to the tootsie roll center of a tootsie pop.", EightiesKids1.totalLicks(Map.of()));
    assertEquals("It took 260 licks to get to the tootsie roll center of a tootsie pop. The toughest challenge was freezing temps.", EightiesKids1.totalLicks(Map.of("freezing temps", 10, "clear skies", -2)));
    assertEquals("It took 512 licks to get to the tootsie roll center of a tootsie pop. The toughest challenge was evil wizards.", EightiesKids1.totalLicks(Map.of("dragons", 100, "evil wizards", 110, "trolls", 50)));
  }
}
