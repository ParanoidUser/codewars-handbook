import static java.util.stream.IntStream.of;

import java.util.function.Predicate;
import java.util.stream.Stream;

interface CarMileage {
  static int isInteresting(int number, int[] awesomePhrases) {
    Predicate<Integer> interest = n -> Stream.<Predicate<String>>of(
        s -> s.matches("\\d0+"),
        s -> s.contentEquals(new StringBuilder(s).reverse()),
        "1234567890"::contains,
        "9876543210"::contains,
        s -> of(awesomePhrases).anyMatch(i -> s.equals(i + ""))
    ).anyMatch(p -> n > 99 && p.test(n + ""));
    return interest.test(number++) ? 2 : interest.test(number++) || interest.test(number) ? 1 : 0;
  }
}