interface JomoPipi {
  static String numericals(String s) {
    var occurs = new int[1032];
    return s.chars().map(i -> ++occurs[i]).collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString();
  }
}
