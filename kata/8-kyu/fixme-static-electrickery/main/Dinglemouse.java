class Dinglemouse {
  private static int ONE_HUNDRED = 100;
  static final Dinglemouse INST = new Dinglemouse();

  private final int value;

  private Dinglemouse() {
    value = ONE_HUNDRED;
  }

  public int plus100(int n) {
    return value + n;
  }
}