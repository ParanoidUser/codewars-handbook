import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class RandomWallpaperTest {
  @Test
  void multipleElementsTest() {
    int[] wallpapers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
    int[] shuffled = new RandomWallpaper().randomOrder(wallpapers);
    assertEquals(wallpapers.length, shuffled.length);
    if (Arrays.equals(wallpapers, shuffled)) {
      shuffled = new RandomWallpaper().randomOrder(wallpapers);
      assertNotEquals(Arrays.toString(wallpapers), Arrays.toString(shuffled));
    }
    Arrays.sort(wallpapers);
    Arrays.sort(shuffled);
    assertArrayEquals(wallpapers, shuffled);
  }

  @Test
  void emptyArrayTest() {
    int[] wallpapers = new int[0];
    int[] shuffled = new RandomWallpaper().randomOrder(wallpapers);
    assertEquals(wallpapers.length, shuffled.length);
    assertArrayEquals(wallpapers, shuffled);
  }

  @Test
  void singleElementTest() {
    int[] wallpapers = new int[]{1};
    int[] shuffled = new RandomWallpaper().randomOrder(wallpapers);
    assertEquals(wallpapers.length, shuffled.length);
    assertArrayEquals(wallpapers, shuffled);
  }
}