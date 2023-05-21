import java.util.ArrayList;
import java.util.List;

interface CardDraw {
  static List<String> draw(List<String> deck) {
    var drawn = new ArrayList<String>();
    var copy = new ArrayList<>(deck);
    boolean take = true;
    while (!copy.isEmpty()) {
      (take ? drawn : copy).add(copy.remove(0));
      take = !take;
    }
    return drawn;
  }
}