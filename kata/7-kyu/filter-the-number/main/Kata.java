interface Kata {
  static long filterString(String value) {
    return Long.parseLong(value.replaceAll("\\D", ""));
  }
}