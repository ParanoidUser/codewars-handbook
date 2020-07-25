interface Kata {
  static boolean validPhoneNumber(String phoneNumber) {
    return phoneNumber.matches("\\(\\d{3}\\) \\d{3}-\\d{4}");
  }
}
