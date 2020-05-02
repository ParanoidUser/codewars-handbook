interface Kata {
  static int[] digitize(long n) {
    return new StringBuilder(String.valueOf(n))
        .reverse()
        .chars()
        .map(Character::getNumericValue)
        .toArray();
  }
}
