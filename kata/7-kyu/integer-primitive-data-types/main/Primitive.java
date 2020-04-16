class Primitive {
  static String determineType(String number) {
    try {
      long n = Long.parseLong(number);
      if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) return "byte";
      if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) return "short";
      if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) return "int";
      return "long";
    } catch (Exception ex) {
      return "none";
    }
  }
}
