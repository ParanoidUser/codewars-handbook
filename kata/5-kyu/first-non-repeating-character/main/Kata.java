interface Kata {
  static String firstNonRepeatingLetter(String s) {
    return s.chars().filter(
        c -> s.toLowerCase().indexOf(Character.toLowerCase(c)) == s.toLowerCase().lastIndexOf(Character.toLowerCase(c))
    ).mapToObj(c -> "" + (char) c).findFirst().orElse("");
  }
}