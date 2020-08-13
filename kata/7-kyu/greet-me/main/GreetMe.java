interface GreetMe {
  static String greet(String name) {
    return "Hello " + name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase() + "!";
  }
}
