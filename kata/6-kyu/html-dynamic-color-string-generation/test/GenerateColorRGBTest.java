import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import org.junit.jupiter.api.Test;

class GenerateColorRGBTest {
  @Test
  void sample() {
    var rnd = new PseudoRandom(List.of(16777215, 2466819, 1));
    assertEquals("#ffffff", GenerateColorRGB.generateColor(rnd));
    assertEquals("#25a403", GenerateColorRGB.generateColor(rnd));
    assertEquals("#000001", GenerateColorRGB.generateColor(rnd));
  }

  private static final class PseudoRandom extends Random {
    private final List<Integer> nums = new LinkedList<>();

    PseudoRandom(List<Integer> nums) {
      this.nums.addAll(nums);
    }

    @Override
    public int nextInt(int bound) {
      return nums.remove(0);
    }
  }
}