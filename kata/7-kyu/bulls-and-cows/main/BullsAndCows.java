class BullsAndCows {
  private final String secret;
  private int turn;

  BullsAndCows(int secret) {
    this.secret = digits(secret);
  }

  String compareWith(int number) {
    if (turn == -1) return "You already won!";
    if (turn > 7) return "Sorry, you're out of turns!";

    String guess = digits(number);
    if (guess.equals(secret)) {
      turn = -1;
      return "You win!";
    }
    turn++;

    int c = 0;
    int b = 0;
    for (var i = 0; i < 4; i++) {
      if (guess.charAt(i) == secret.charAt(i)) b++;
      else if (guess.indexOf(secret.charAt(i)) != -1) c++;
    }
    return String.format("%d bull%s and %d cow%s", b, b != 1 ? "s" : "", c, c != 1 ? "s" : "");
  }

  private String digits(int n) {
    if (n < 1000 || n > 9999 || ("" + n).chars().distinct().count() != 4)
      throw new IllegalArgumentException();
    return "" + n;
  }
}
