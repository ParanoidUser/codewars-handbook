class THB {
  static String testing(String initial) {
    return initial != null ? initial.replaceAll("[^tThHbB]", "") : "";
  }
}