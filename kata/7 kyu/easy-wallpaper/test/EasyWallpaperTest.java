import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EasyWallpaperTest {
  @Test
  public void test1() {
    assertEquals("ten", EasyWallpaper.wallpaper(4, 3.5, 3));
  }

  @Test
  public void test2() {
    assertEquals("sixteen", EasyWallpaper.wallpaper(6.3, 4.5, 3.29));
  }

  @Test
  public void test3() {
    assertEquals("seventeen", EasyWallpaper.wallpaper(6.3, 5.8, 3.13));
  }
}
