class Reverse {
  String reverse(String str) {
    return str.length() > 1 ? reverse(str.substring(1)) + str.charAt(0) : str;
  }
}
