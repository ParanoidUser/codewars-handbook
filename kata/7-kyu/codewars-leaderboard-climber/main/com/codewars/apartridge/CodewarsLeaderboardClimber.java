package com.codewars.apartridge;

interface CodewarsLeaderboardClimber {
  static String leaderBoard(String user, int userScore, int yourScore) {
    return userScore < yourScore ? "Winning!" :
           userScore == yourScore ? "Only need one!" :
           "To beat " + user + "'s score, I must complete " + (yourScore = (userScore -= yourScore) / 3) +
           " Beta kata and " + (userScore = userScore % 3) + " 8kyu kata." + (yourScore + userScore > 1000 ? " Dammit!" : "");
  }
}
