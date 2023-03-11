interface Matrix {
  static <T extends Throwable> void enter() throws T {
    throw (T) new Neo();
  }
}