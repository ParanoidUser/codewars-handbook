interface RepeatIt {
  static String repeatString(Object toRepeat, int n) {
    return toRepeat instanceof String s ? s.repeat(n) : "Not a string";
  }
}
