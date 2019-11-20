public class Block {
  int w, l, h;

  Block(int[] sides) {
    w = sides[0];
    l = sides[1];
    h = sides[2];
  }

  int getWidth() { return w; }

  int getLength() { return l; }

  int getHeight() { return h; }

  int getVolume() { return w * h * l; }

  int getSurfaceArea() { return 2 * (w * h + w * l + h * l); }
}
