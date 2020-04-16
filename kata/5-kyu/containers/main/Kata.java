import java.util.ArrayList;

class Kata {
  static int containers(String input) {
    var stack = new ArrayList<Character>();
    for (char c : input.toCharArray()) {
      boolean found = false;
      for (int j = 0; j < stack.size() && !found; j++) {
        if (c <= stack.get(j)) {
          stack.set(j, c);
          found = true;
        }
      }
      if (!found) {
        stack.add(c);
      }
    }
    return stack.size();
  }
}
