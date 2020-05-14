interface FirstNonRepeated {
  static Character firstNonRepeated(String source) {
    return (char) source.chars().filter(c -> source.indexOf(c) == source.lastIndexOf(c)).findFirst().orElse(0);
  }
}
