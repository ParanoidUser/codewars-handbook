interface Kata {
  static String createPhoneNumber(int[] numbers) {
    var phone = "(xxx) xxx-xxxx";
    for (int n : numbers) {
      phone = phone.replaceFirst("x", n + "");
    }
    return phone;
  }
}
