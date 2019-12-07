class Dinglemouse {
  static double stackHeight2d(int layers) {
    return layers == 0 ? 0 : 1 + Math.sqrt(Math.pow(layers - 1., 2) - Math.pow(layers / 2. - .5, 2));
  }
}
