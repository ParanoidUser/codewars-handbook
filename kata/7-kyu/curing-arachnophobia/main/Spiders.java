interface Spiders {
  static String drawSpider(int legSize, int bodySize, char mouth, char eye) {
    var bits = new String[]{"^_^", "/\\_/\\", "/╲_╱\\", "╱╲_╱╲", "(_)", "((_))", "(((_)))", "_", "__", "____"};
    String eyes = bits[bodySize + 6].replace("_", "" + eye);
    return bits[legSize - 1].replace("_", bits[bodySize + 3]).replace("_", eyes + mouth + eyes);
  }
}
