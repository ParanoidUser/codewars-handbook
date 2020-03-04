class Hist {
    static String hist(String s) {
      var report = new StringBuilder();
      for (String error : new String[] {"u", "w", "x", "z"}) {
        if (s.contains(error)) {
          int cnt = s.length() - s.replace(error, "").length();
          report.append(String.format("%s  %d%s%s\r", error, cnt, " ".repeat(6 - (cnt + "").length()), "*".repeat(cnt)));
        }
      }
      return report.toString().trim();
    }
}
