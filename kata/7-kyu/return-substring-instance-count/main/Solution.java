interface Solution {
  static int substringCount(String fullText, String search) {
    return (fullText + "_").split(search).length - 1;
  }
}