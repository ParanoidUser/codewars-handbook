class Primitive {
  String determineType(String number) {
    try {
      var n = Long.parseLong(number);
      if (n > -129 && n < 128) return "byte";
      if (n > -32769 && n < 32768) return "short";
      if (n > -2147483649L && n < 2147483648L) return "int";
      return "long";
    } catch (Exception ex) {
      return "none";
    }
  }
}
