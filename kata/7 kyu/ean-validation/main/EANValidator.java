class EANValidator {
  static boolean validate(String eanCode) {
    int sum = 0;
    for (int i = 0; i < 12; i++) {
      sum += (eanCode.charAt(i) - 48) * (i % 2 == 0 ? 1 : 3);
    }
    return eanCode.charAt(12) - 48 == (sum % 10 == 0 ? 0 : 10 - sum % 10);
  }
}
