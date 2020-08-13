interface Kata {
  static String dative(String word) {
    return word + (word.replaceAll("[^aáoóuúeéiíöőüű]", "")
                       .replaceAll("[aáoóuú]", ">")
                       .replaceAll("[eéiíöőüű]", "<")
                       .matches(".*>$") ? "nak" : "nek");
  }
}
