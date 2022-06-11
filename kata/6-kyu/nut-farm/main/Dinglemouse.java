interface Dinglemouse {
  static int[] shakeTree(char[][] tree) {
    var nuts = new int[tree[0].length];
    int j = 0;
    for (int i = 0; i < tree[0].length; i++, j = i) {
      if (tree[0][i] != 'o') {
        continue;
      }
      for (char[] chars : tree) {
        if (chars[j] == '_') {
          j = -1;
          break;
        } else if (chars[j] == '\\') {
          j++;
        } else if (chars[j] == '/') {
          j--;
        }
      }
      if (j >= 0) {
        nuts[j]++;
      }
    }
    return nuts;
  }
}