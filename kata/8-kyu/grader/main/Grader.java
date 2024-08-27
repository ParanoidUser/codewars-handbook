interface Grader {
  static String grader(double score) {
    return "FFFFFFDCBAAF".charAt((int) (score > 1 ? 11 : 10 * score)) + "";
  }
}