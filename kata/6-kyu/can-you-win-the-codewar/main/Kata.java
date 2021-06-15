import static java.util.Arrays.stream;

import java.util.LinkedList;

interface Kata {
  static String codewarResult(int[] codewarrior, int[] opponent) {
    LinkedList<Integer> army = stream(codewarrior).sorted().collect(LinkedList::new, LinkedList::addLast, LinkedList::addAll);
    LinkedList<Integer> enemy = stream(opponent).sorted().collect(LinkedList::new, LinkedList::addLast, LinkedList::addAll);
    LinkedList<Integer> draw = new LinkedList<>();

    var score = 0;
    while (!army.isEmpty()) {
      if (army.getLast() > enemy.getLast()) {
        army.removeLast();
        score++;
      } else if (!draw.isEmpty() && draw.getLast() > enemy.getLast()) {
        army.removeFirst();
        draw.remove();
      } else if (army.getLast().equals(enemy.getLast())) {
        draw.add(army.removeLast());
      } else {
        army.removeFirst();
        score--;
      }
      enemy.removeLast();
    }
    return score > 0 ? "Victory" : score < 0 ? "Defeat" : "Stalemate";
  }
}