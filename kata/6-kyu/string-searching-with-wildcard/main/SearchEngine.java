import static java.util.regex.Pattern.compile;

interface SearchEngine {
  static int find(String needle, String haystack) {
    var m = compile("\\Q" + needle.replace("_", "\\E.\\Q") + "\\E").matcher(haystack);
    return m.find() ? m.start() : -1;
  }
}
