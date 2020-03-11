class Dinglemouse {
  static int howManyBees(char[][] hive) {
    int bees = 0;
    for (int i = 0; hive != null && i < hive.length; i++) {
      for (int j = 0; j < hive[i].length; j++) {
        if (hive[i][j] == 'b') {
          if (i > 1 && hive[i - 1][j] == 'e' && hive[i - 2][j] == 'e') bees++;
          if (j > 1 && hive[i][j - 1] == 'e' && hive[i][j - 2] == 'e') bees++;
          if (j < hive[i].length - 2 && hive[i][j + 1] == 'e' && hive[i][j + 2] == 'e') bees++;
          if (i < hive.length - 2 && hive[i + 1][j] == 'e' && hive[i + 2][j] == 'e') bees++;
        }
      }
    }
    return bees;
  }
}
