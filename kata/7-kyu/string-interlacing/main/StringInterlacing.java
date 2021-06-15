interface StringInterlacing {
  static String interlace(String first, String second) {
    if (first.length() < second.length()) {
      var temp = first;
      first = second;
      second = temp;
    }

    first = first.replace(" ", "");
    second = second.replace(" ", "");

    var result = new StringBuilder();
    for (var i = 0; i < first.length(); i++) {
      result.append(first.charAt(i)).append(second.charAt(i % second.length()));
    }
    return result.toString();
  }
}
