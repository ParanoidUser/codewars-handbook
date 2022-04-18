import static java.util.stream.Stream.of;

class BrokenSequence {
  int findMissingNumber(String sequence) {
    var nums = of(sequence.split(" ")).filter(num -> num.matches("\\d+")).map(Integer::parseInt).toList();
    if (!sequence.replaceAll("[0-9 ]", "").isEmpty()) return 1;
    for (var i = 0; i < nums.size(); i++) {
      if (i + 1 != nums.get(i)) return ++i;
    }
    return 0;
  }
}
