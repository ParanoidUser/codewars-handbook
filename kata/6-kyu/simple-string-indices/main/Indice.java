interface Indice {
  static int solve(String str, int i) {
    int ob;
    for (ob = str.charAt(i) == '(' ? 0 : -1; ob >= 0 && i < str.length(); i++) {
      if ((ob = ob + (str.charAt(i) == '(' ? 1 : str.charAt(i) == ')' ? -1 : 0)) == 0) {
        return i;
      }
    }
    return -1;
  }
}
