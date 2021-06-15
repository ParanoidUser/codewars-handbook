import java.util.LinkedList;

interface Solution {
  static String makeAWindow(int num) {
    var row = String.format("|%1$s|%1$s|", ".".repeat(num));
    var windows = new LinkedList<String>();
    for (var i = 0; i < num; i++) {
      windows.add(row);
      windows.add(row);
    }
    windows.add(num, String.format("|%1$s+%1$s|", "-".repeat(num)));
    windows.addFirst(String.format("-%1$s-%1$s-", "-".repeat(num)));
    windows.addLast(String.format("-%1$s-%1$s-", "-".repeat(num)));
    return String.join("\n", windows);
  }
}