import java.util.Locale;
import java.util.Objects;

class RGB {
  final int r;
  final int g;
  final int b;

  RGB(int r, int g, int b) {
    this.r = r;
    this.g = g;
    this.b = b;
  }

  @Override
  public String toString() {
    return String.format(Locale.ENGLISH, "RGB(%3d,%3d,%3d)", r, g, b);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    var rgb = (RGB) o;
    return r == rgb.r && g == rgb.g && b == rgb.b;
  }

  @Override
  public int hashCode() {
    return Objects.hash(r, g, b);
  }
}
