import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    PhotoManager photoManager = new PhotoManager();
    for (int i = 0; i < 10; i++) {
      String name = Solution.generateName(photoManager);
      assertTrue(photoManager.nameWasUnique(name));
      assertEquals(6, name.length());
    }
  }
}
