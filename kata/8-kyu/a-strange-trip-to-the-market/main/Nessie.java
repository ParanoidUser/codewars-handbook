interface Nessie {
  static boolean isLockNessMonster(String s) {
    return s.matches(".*(fid|3).*");
  }
}
