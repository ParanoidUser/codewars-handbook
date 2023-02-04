import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;

class TestObservedPin {
  @Test
  void sample() {
    assertTrue(ObservedPin.getPINs("8").containsAll(List.of("8", "0", "5", "7", "9")));
    assertTrue(ObservedPin.getPINs("11").containsAll(List.of("11", "21", "41", "12", "22", "42", "14", "24", "44")));
    assertTrue(ObservedPin.getPINs("369").containsAll(List.of("236", "238", "239", "256", "258", "259", "266", "268",
        "269", "296", "298", "299", "336", "338", "339", "356", "358", "359", "366", "368", "369", "396", "398", "399",
        "636", "638", "639", "656", "658", "659", "666", "668", "669", "696", "698", "699")));
  }
}