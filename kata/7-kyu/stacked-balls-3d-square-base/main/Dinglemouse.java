interface Dinglemouse {
  static double stackHeight3d(int layers) {
    return layers > 0 ? --layers / 1.41421356 + 1 : 0;
  }
}
