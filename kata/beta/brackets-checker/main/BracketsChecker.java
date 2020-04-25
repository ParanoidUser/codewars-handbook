import java.util.LinkedList;

interface BracketsChecker {
  static boolean bracketsChecker(String str) {
    var stack = new LinkedList<Integer>();
    return str.chars().allMatch(c -> c == 40 || c == 91 || c == 123 ? stack.add(c) :
        c != 41 && c != 93 && c != 125 || !stack.isEmpty() && c - stack.removeLast() < 3
    ) && stack.isEmpty();
  }
}