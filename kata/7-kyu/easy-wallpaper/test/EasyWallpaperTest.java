import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class EasyWallpaperTest {
  @Test
  void sample() {
    assertEquals("zero", EasyWallpaper.wallpaper(0, 2, 3));
    assertEquals("zero", EasyWallpaper.wallpaper(1, 0, 3));
    assertEquals("zero", EasyWallpaper.wallpaper(1, 2, 0));
    assertEquals("ten", EasyWallpaper.wallpaper(4, 3.5, 3));
    assertEquals("sixteen", EasyWallpaper.wallpaper(6.3, 4.5, 3.29));
    assertEquals("seventeen", EasyWallpaper.wallpaper(6.3, 5.8, 3.13));
  }
}
