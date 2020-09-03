interface EmailObfuscator {
  static String obfuscate(String email) {
    return email.replace("@", " [at] ").replace(".", " [dot] ");
  }
}
