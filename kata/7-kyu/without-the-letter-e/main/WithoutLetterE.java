interface WithoutLetterE {
  static String findE(String str) {
    return str == null || str.isEmpty() ? str :
        (str.length() - str.replaceAll("[Ee]", "").length() + "")
            .replaceAll("\\b0\\b", "There is no \"e\".");
  }
}
