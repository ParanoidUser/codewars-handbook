public class Guesser {
  private int guesses = 0;
  private Integer num;

  protected final String guess(final int x) {
    if (num == null) {
      throw new GameException("Game has not been set up properly.");
    }

    if (guesses >= 10) {
      throw new GameException("You have run out of guesses!");
    }

    ++guesses;

    String answer;
    if (num.equals(x)) {
      answer = "Correct!";
    } else if (guesses >= 10) {
      throw new GameException("You failed! Answer is " + num + ".");
    } else {
      answer = (x > num) ? "Too high!" : "Too low!";
    }
    return answer;
  }

  final void setAnswer(int answer) {

    if (num != null) {
      throw new GameException("Game is already set up!");
    }
    num = answer;
  }

  @SuppressWarnings("serial")
  public static class GameException extends RuntimeException {
    public GameException(String msg) {
      super(msg);
    }
  }
}
