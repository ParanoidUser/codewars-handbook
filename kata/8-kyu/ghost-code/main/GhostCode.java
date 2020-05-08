interface GhostCode {
  static String helloName(String name) {
    return "Hello " + (name == null || name.isEmpty() ? "world!" : "my name is " + name);
  }
}
