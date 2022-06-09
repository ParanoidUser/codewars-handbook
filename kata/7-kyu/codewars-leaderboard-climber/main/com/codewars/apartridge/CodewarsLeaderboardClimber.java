package com.codewars.apartridge;

interface CodewarsLeaderboardClimber {
  static String leaderBoard(String user, int userScore, int yourScore) {
    int diff = userScore - yourScore;
    if (diff < 0) {
      return "Winning!";
    }
    if (diff == 0) {
      return "Only need one!";
    }
    int beta = diff / 3;
    int kyu8 = diff % 3;
    return "To beat " + user + "'s score, I must complete " + beta + " Beta kata and " + kyu8 + " 8kyu kata." + (beta + kyu8 > 1000 ? " Dammit!" : "");
  }
}
