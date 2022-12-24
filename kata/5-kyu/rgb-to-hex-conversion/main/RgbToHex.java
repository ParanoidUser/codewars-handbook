import java.util.function.IntUnaryOperator;

interface RgbToHex {
  static String rgb(int r, int g, int b) {
    IntUnaryOperator f = i -> i > 0 ? Math.min(i, 255) : 0;
    return String.format("%02X%02X%02X", f.applyAsInt(r), f.applyAsInt(g), f.applyAsInt(b));
  }
}