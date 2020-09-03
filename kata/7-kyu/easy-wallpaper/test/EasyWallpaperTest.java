import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class EasyWallpaperTest {
  @Test
  void sample() {
    assertEquals("zero", new EasyWallpaper().wallpaper(0, 2, 3));
    assertEquals("zero", new EasyWallpaper().wallpaper(1, 0, 3));
    assertEquals("zero", new EasyWallpaper().wallpaper(1, 2, 0));
    assertEquals("ten", new EasyWallpaper().wallpaper(4, 3.5, 3));
    assertEquals("sixteen", new EasyWallpaper().wallpaper(6.3, 4.5, 3.29));
    assertEquals("seventeen", new EasyWallpaper().wallpaper(6.3, 5.8, 3.13));
  }
}
