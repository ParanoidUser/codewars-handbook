interface Cookie {
  static String cookie(Object x) {
    return "Who ate the last cookie? It was %s!".formatted(x instanceof String ? "Zach" : x instanceof Number ? "Monica" : "the dog");
  }
}