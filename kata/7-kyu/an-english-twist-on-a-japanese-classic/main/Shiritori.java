import java.util.*;

class Shiritori {
  static List<String> theGame(List<String> words) {
    if (words.isEmpty() || words.get(0).isEmpty()) {
      return List.of();
    }
    String ending = words.get(0).substring(words.get(0).length() - 1);
    for (int i = 1; i < words.size(); i++) {
      if (words.get(i).startsWith(ending)) {
        ending = words.get(i).substring(words.get(i).length() - 1);
      } else {
        return words.subList(0, i);
      }
    }
    return words;
  }
}
