class Generator {
  private int value;

  int next(Integer... init) {
    if (init.length > 0) {
      value = init[0];
    } else {
      value++;
    }
    return value;
  }
}
