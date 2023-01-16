import java.util.Objects;
import lombok.AllArgsConstructor;

@AllArgsConstructor
class PawnDistance {
  final String color;
  final long distance;

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof PawnDistance pawn)) {
      return false;
    }
    return pawn.distance == distance && Objects.equals(pawn.color, color);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, distance);
  }
}