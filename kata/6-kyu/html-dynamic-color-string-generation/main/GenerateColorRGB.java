import java.util.Random;

interface GenerateColorRGB {
  static String generateColor(Random r) {
    return String.format("#%06x", r.nextInt(0xffffff));
  }
}