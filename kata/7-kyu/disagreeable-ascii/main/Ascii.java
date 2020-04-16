class Ascii {
  static int getWeight(String name) {
    return name.chars().map(c -> c > '`' && c < '{' ? c - 32 : c > '@' && c < '[' ? c + 32 : 0).sum();
  }
}
