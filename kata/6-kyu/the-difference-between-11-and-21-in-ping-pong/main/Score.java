import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
class Score {
  private final int me;
  private final int opponent;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    var score = (Score) o;
    return me == score.me && opponent == score.opponent;
  }

  @Override
  public int hashCode() {
    return Objects.hash(me, opponent);
  }
}
