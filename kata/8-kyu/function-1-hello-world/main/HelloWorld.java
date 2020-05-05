interface HelloWorld {
  static String greet() {
    return HelloWorld.class.getSimpleName().replace('H', 'h').replace("W", " w") + "!";
  }
}
