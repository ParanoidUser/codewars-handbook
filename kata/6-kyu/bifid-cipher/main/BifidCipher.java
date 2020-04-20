class BifidCipher {
  static String encodeBifid(String key, String message) {
    return bifid(key, message, true);
  }

  static String decodeBifid(String key, String message) {
    return bifid(key, message, false);
  }

  private static String bifid(String key, String message, boolean code) {
    key = key.replace(" ", "").replace("J", "I") + "ABCDEFGHIKLMNOPQRSTUVWXYZ";
    int[] n = new int[25];
    char[] s = new char[25];

    int k = 0;
    for (char c : key.toCharArray()) {
      int i = c - (c > 73 ? 1 : 0) - 65;
      if (n[i] == 0) {
        n[i] = k + 1;
        s[k++] = c;
      }
    }

    char[] c = message.replace("J", "I").replace(" ", "").toCharArray();
    return crypto(c, code, n, s);
  }

  private static String crypto(char[] c, boolean code, int[] n, char[] s) {
    int[] r = new int[c.length * 2];
    for (int i = 0; i < c.length; i++) {
      int t = n[c[i] - (c[i] > 73 ? 1 : 0) - 65] - 1;
      r[code ? i : 2 * i] = t / 5;
      r[code ? i + c.length : 2 * i + 1] = t % 5;
    }

    var result = new StringBuilder();
    for (int i = 0; i < c.length; i++) {
      result.append(s[r[code ? 2 * i : i] * 5 + r[code ? 2 * i + 1 : i + c.length]]);
    }
    return result.toString();
  }
}
