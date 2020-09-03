interface Dinglemouse {
  static double stackHeight3d(int layers) {
    return layers > 0 ? .8165 * --layers + 1 : 0;
  }
}
