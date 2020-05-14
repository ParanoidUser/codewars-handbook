interface Ascii {
  static int getWeight(String name) {
    return name.chars().map(c -> c > 96 && c < 123 ? c - 32 : c > 64 && c < 91 ? c + 32 : 0).sum();
  }
}
