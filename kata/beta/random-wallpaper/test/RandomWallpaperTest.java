import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Arrays;
import org.junit.Test;

public class RandomWallpaperTest {
  @Test
  public void test1() {
    int[] wallpapers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
    int[] shuffled = RandomWallpaper.randomOrder(wallpapers);
    assertEquals(wallpapers.length, shuffled.length);
    if (Arrays.equals(wallpapers, shuffled)) {
      shuffled = RandomWallpaper.randomOrder(wallpapers);
      assertNotEquals(Arrays.toString(wallpapers), Arrays.toString(shuffled));
    }
    Arrays.sort(wallpapers);
    Arrays.sort(shuffled);
    assertArrayEquals(wallpapers, shuffled);
  }

  @Test
  public void test2() {
    int[] wallpapers = new int[0];
    int[] shuffled = RandomWallpaper.randomOrder(wallpapers);
    assertEquals(wallpapers.length, shuffled.length);
    assertArrayEquals(wallpapers, shuffled);
  }

  @Test
  public void test3() {
    int[] wallpapers = new int[]{1};
    int[] shuffled = RandomWallpaper.randomOrder(wallpapers);
    assertEquals(wallpapers.length, shuffled.length);
    assertArrayEquals(wallpapers, shuffled);
  }
}