package cw;

public interface Reflections {
  static int[] reflectPoint(int[] p, int[] q) {
    return new int[]{2 * q[0] - p[0], 2 * q[1] - p[1]};
  }
}