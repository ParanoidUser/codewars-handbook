interface Converter {
  static long convert(String word) {
    int i = 0;
    for (int c : word.toLowerCase().chars().distinct().toArray()) {
      word = word.replaceAll("(?i)" + (char) c, "" + i++);
    }
    return word.isEmpty() ? 0 : Long.parseLong(word.replace('0', '_').replace('1', '0').replace('_', '1'));
  }
}