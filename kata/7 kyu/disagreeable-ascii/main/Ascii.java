class Ascii {
  static int getWeight(String name) {
    return name.chars().map(с -> с > '`' && с < '{' ? с - 32 : с > '@' && с < '[' ? с + 32 : 0).sum();
  }
}
