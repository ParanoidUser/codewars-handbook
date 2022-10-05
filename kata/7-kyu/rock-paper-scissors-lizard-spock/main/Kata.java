interface Kata {
  static String rpsls(String p1, String p2) {
    var rules = "scissorspaperrocklizardspockscissorslizardpaperspockrockscissors";
    return p1.equals(p2) ? "Draw!" : "Player " + (rules.contains(p1 + p2) ? 1 : 2) + " Won!";
  }
}