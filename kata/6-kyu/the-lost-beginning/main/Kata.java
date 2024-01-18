interface Kata {
  static long beginning(String s) {
    for (int i = 1; i <= s.length(); i++) {
      var temp = new StringBuilder();
      int start = Integer.parseInt(s.substring(0, i));
      for (int j = start; temp.length() < s.length(); j++) {
        temp.append(j);
      }
      if (temp.toString().equals(s)) {
        return start;
      }
    }
    return -1;
  }
}