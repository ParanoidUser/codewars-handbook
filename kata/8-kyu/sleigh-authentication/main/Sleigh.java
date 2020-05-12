interface Sleigh {
  static boolean authenticate(String name, String secret) {
    return name.equals("Santa Claus") && secret.equals("Ho Ho Ho!");
  }
}
