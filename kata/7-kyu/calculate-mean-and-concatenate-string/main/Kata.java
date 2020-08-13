interface Kata {
  static Object[] mean(char[] chars) {
    return new Object[] {
      new String(chars).chars().filter(Character::isDigit).map(c -> c - '0').average().orElse(0.),
      new String(chars).replaceAll("\\d", "")
    };
  }
}
