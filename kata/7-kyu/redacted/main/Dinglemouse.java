interface Dinglemouse {
  static boolean redacted(String doc1, String doc2) {
    if (doc1.length() != doc2.length()) {
      return false;
    }
    for (var i = 0; i < doc1.length(); i++) {
      if (doc1.charAt(i) != 'X' && doc1.charAt(i) != doc2.charAt(i) || doc1.charAt(i) == 'X' && doc2.charAt(i) == '\n') {
        return false;
      }
    }
    return true;
  }
}
