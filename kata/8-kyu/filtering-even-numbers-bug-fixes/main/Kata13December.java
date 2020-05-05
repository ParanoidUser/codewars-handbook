import static java.util.stream.Collectors.toList;

import java.util.List;

interface Kata13December {
  static List<Integer> filterOddNumber(List<Integer> listOfNumbers) {
    return listOfNumbers.stream().filter(l -> l % 2 != 0).collect(toList());
  }
}
