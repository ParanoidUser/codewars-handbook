class GameInput {
  float[] getVector(boolean[] wasd) {
    int x = wasd[3] && !wasd[1] ? 1 : !wasd[3] && wasd[1] ? -1 : 0;
    int y = wasd[0] && !wasd[2] ? 1 : !wasd[0] && wasd[2] ? -1 : 0;
    return x != 0 && y != 0 ? new float[] {x * .70710677f, y * .70710677f} : new float[] {x, y};
  }
}
