interface BouncingBall {
  static int bouncingBall(double h, double bounce, double window) {
    return window < h && bounce > 0 && bounce < 1 ? bouncingBall(h * bounce, bounce, window) + 2 : -1;
  }
}
