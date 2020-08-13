class Generator {
  private int value;

  int next(Integer... init) {
    return init.length > 0 ? value = init[0] : ++value;
  }
}
