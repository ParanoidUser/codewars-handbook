import java.util.LinkedHashSet;
import java.util.List;

interface Permutations {
  static List<String> singlePermutations(String s) {
    var perms = new LinkedHashSet<String>();
    for (int i = 0; s.length() > 1 && i < s.length(); i++) {
      for (String p : singlePermutations(s.substring(0, i) + s.substring(i + 1))) {
        perms.add(s.charAt(i) + p);
      }
    }
    return perms.isEmpty() ? List.of(s) : perms.stream().toList();
  }
}