interface FindOccurrence {
  static int findNthOccurrence(String subStr, String str, int occurrence) {
    for (int i = 0; i < str.length(); i++) {
      if (str.startsWith(subStr, i) && occurrence-- == 1) {
        return i;
      }
    }
    return -1;
  }
}