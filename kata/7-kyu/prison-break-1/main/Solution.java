interface Solution {
  static int freedPrisoners(Boolean[] prison) {
    if (Boolean.FALSE.equals(prison[0])) {
      return 0;
    }
    int prisoners = 0;
    for (Boolean cell : prison) {
      if (cell.equals(prison[0])) {
        prisoners++;
        prison[0] = !prison[0];
      }
    }
    return prisoners;
  }
}