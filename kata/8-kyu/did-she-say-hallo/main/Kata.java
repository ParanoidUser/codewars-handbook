interface Kata {
  static boolean validateHello(String greetings) {
    return greetings.matches("(?i).*(hello|ciao|salut|hallo|hola|ahoj|czesc).*");
  }
}