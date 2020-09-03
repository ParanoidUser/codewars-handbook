interface RegexValidation {
  static boolean validateTime(String time) {
    return time.matches("([01]?[0-9]|2[0-3]):[0-5][0-9]");
  }
}
