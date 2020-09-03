interface SimpleFun {
  static int growingPlant(int upSpeed, int downSpeed, double desiredHeight) {
    return desiredHeight < upSpeed ? 1 : (int) Math.ceil((desiredHeight - downSpeed) / (upSpeed - downSpeed));
  }
}
