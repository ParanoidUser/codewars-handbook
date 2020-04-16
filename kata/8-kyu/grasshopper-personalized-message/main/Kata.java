class Kata {
  static String greet(String name, String owner) {
    return "Hello " + (name.equals(owner) ? "boss" : "guest");
  }
}
