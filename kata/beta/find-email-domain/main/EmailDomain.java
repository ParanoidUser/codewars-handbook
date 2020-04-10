class EmailDomain {
  static String findEmailDomain(String address) {
    return address.substring(address.lastIndexOf('@') + 1);
  }
}