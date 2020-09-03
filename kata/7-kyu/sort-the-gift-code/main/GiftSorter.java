class GiftSorter {
  String sortGiftCode(String code) {
    return new String(code.chars().sorted().toArray(), 0, code.length());
  }
}
