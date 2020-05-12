interface RepeatIt {
  static String repeatString(Object toRepeat, int n) {
    return toRepeat instanceof String ? ((String) toRepeat).repeat(n) : "Not a string";
  }
}
