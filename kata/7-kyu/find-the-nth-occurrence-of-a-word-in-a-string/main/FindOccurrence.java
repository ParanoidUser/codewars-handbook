interface FindOccurrence {
  static int findNthOccurrence(String subStr, String str, int occurrence) {
    return occurrence > 0 ? str.indexOf(subStr, findNthOccurrence(subStr, str, --occurrence) + occurrence) : 0;
  }
}