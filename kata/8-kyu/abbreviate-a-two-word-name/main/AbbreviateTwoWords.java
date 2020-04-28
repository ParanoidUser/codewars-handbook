interface AbbreviateTwoWords {
  static String abbrevName(String name) {
    return name.toUpperCase().replaceAll("(.).*\\s(.).*", "$1.$2");
  }
}
