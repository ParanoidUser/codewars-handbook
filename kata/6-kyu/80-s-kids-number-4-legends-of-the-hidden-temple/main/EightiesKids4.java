import java.util.ArrayList;

class EightiesKids4 {
  static String markSpot(float n) {
    if (n < 1 || n % 2 == 0 || n % (int) n != 0) {
      return "?";
    }

    var lines = new ArrayList<String>();
    for (int i = 0; i < (int) n / 2; i++) {
      lines.add(" ".repeat(i * 2) + "X" + " ".repeat((int) n * 2 - i * 4 - 3) + "X");
    }
    lines.add(" ".repeat((int) n - 1) + "X");
    for (int i = lines.size() - 2; i >= 0; i--) {
      lines.add(lines.get(i));
    }

    return String.join("\n", lines) + "\n";
  }
}
