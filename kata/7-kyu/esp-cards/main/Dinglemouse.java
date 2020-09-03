interface Dinglemouse {
  static String nameTheShape(char[][] card) {
    return card[2][10] != ' ' ? "diamond" : card[3][5] != ' ' ? "square" : "circle";
  }
}
