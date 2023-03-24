import java.util.LinkedList;
import java.util.stream.Collectors;

class SecretDetective {
  String recoverSecret(char[][] triplets) {
    LinkedList<Character> seq = new LinkedList<>();
    for (char[] triplet : triplets) {
      for (int i = 0; i < triplet.length; i++) {
        if (!seq.contains(triplet[i])) {
          seq.add(i > 0 ? seq.indexOf(triplet[i - 1]) : 0, triplet[i]);
        }
        if (i > 0 && seq.indexOf(triplet[i]) < seq.indexOf(triplet[i - 1])) {
          seq.remove((Character) triplet[i]);
          seq.add(seq.indexOf(triplet[i - 1]) + 1, triplet[i]);
        }
      }
    }
    return seq.stream().map(c -> c + "").collect(Collectors.joining());
  }
}