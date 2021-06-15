interface Kata {
  static String[] capMe(String[] strings) {
    for (var i = 0; i < strings.length; i++) {
      strings[i] = strings[i].substring(0, 1).toUpperCase() + strings[i].substring(1).toLowerCase();
    }
    return strings;
  }
}