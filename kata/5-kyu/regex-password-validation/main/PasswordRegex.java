final class PasswordRegex {
  static final String REGEX = "(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{6,}";

  private PasswordRegex() {}
}