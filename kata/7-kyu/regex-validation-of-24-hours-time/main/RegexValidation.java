interface RegexValidation {
  static boolean validateTime(String time) {
    return time.matches("([01]?\\d|2[0-3]):[0-5]\\d");
  }
}
