interface Solution {
  static String shortenToDate(String longDate) {
    return longDate.substring(0, longDate.indexOf(','));
  }
}