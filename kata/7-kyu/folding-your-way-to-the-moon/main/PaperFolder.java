public class PaperFolder {
  public static Long fold(Double distance) {
    return distance > 0.0001 ? fold(distance / 2.) + 1 : 0;
  }
}