interface JomoPipi {
  static String numericals(String s) {
    int[] occurs = new int[1032];
    return s.chars().map(i -> ++occurs[i]).collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString();
  }
}
