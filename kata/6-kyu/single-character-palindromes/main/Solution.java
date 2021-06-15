import java.util.function.Predicate;

interface Solution {
  static String solve(String s) {
    Predicate<String> palindrome = p -> new StringBuilder(p).reverse().toString().equals(p);
    for (var i = 0; i < s.length() && !palindrome.test(s); i++) {
      if (palindrome.test(s.substring(0, i) + s.substring(i + 1))) {
        return "remove one";
      }
    }
    return palindrome.test(s) ? "OK" : "not possible";
  }
}