interface RegexTicTacToeWinChecker {
  static boolean regexTicTacToeWinChecker(String board) {
    return board.matches(".*(\\w)(..(\\1|.\\1.)..\\1.*|.\\1.\\1..|\\1\\1(...)*)");
  }
}
