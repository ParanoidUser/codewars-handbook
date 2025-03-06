class Pong {
  private final int[] scores = new int[2];
  private final int maxScore;
  private int player;

  Pong(int maxScore) {
    this.maxScore = maxScore;
  }

  String play(int ballPos, int playerPos) {
    if (scores[0] == maxScore || scores[1] == maxScore) {
      return "Game Over!";
    }
    player ^= 1;
    boolean hit = Math.abs(ballPos - playerPos) < 4;
    if (hit || ++scores[player] < maxScore) {
      return String.format("Player %d has %s the ball!", 2 - player, hit ? "hit" : "missed");
    }
    return String.format("Player %d has won the game!", player + 1);
  }
}