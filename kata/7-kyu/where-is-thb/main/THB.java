class THB {
  String testing(String initial) {
    return initial != null ? initial.replaceAll("[^tThHbB]", "") : "";
  }
}
