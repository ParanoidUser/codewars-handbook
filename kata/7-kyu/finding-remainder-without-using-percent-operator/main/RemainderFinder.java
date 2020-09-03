interface RemainderFinder {
  static SimpleInteger remainder(SimpleInteger a, SimpleInteger b) {
    return b.compareTo(new SimpleInteger(0)) > 0 ? a.subtract((a.divide(b)).multiply(b)) : null;
  }
}
