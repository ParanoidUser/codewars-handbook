class Plugboard {
  private final String pairs;

  Plugboard(String wires) throws InvalidPlugboardWiresException {
    if (wires.length() > 20 || wires.length() % 2 > 0 || wires.chars().distinct().count() != wires.length()) {
      throw new InvalidPlugboardWiresException();
    }
    pairs = wires;
  }

  String process(String wire) {
    int i = pairs.indexOf(wire);
    return i < 0 ? wire : pairs.charAt(i % 2 > 0 ? --i : ++i) + "";
  }
}
