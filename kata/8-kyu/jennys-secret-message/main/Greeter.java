interface Greeter {
  static String greet(String name) {
    return "Hello, " + ("Johnny".equals(name) ? "my love" : name) + "!";
  }
}
