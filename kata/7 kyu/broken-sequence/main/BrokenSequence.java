import static java.util.stream.Collectors.toList;
import static java.util.stream.Stream.of;

class BrokenSequence {
  int findMissingNumber(String sequence) {
    var nums = of(sequence.split(" ")).filter(num -> num.matches("\\d+")).map(Integer::parseInt).collect(toList());
    if (!sequence.isEmpty() && nums.isEmpty()) return 1;
    for (int i = 0; i < nums.size(); i++) {
      if (i + 1 != nums.get(i)) return ++i;
    }
    return 0;
  }
}
