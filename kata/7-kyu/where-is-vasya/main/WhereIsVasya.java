interface WhereIsVasya {
  static int whereIsHe(int p, int bef, int aft) {
    return Math.min(p - bef, ++aft);
  }
}
