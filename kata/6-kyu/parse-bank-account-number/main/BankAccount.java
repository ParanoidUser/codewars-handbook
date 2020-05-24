import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.iterate;

interface BankAccount {
  static long parse(String acctNbr) {
    var segments = " _ | ||_|     |  | _  _||_  _  _| _|   |_|  | _ |_  _| _ |_ |_| _   |  | _ |_||_| _ |_| _|";
    int l = acctNbr.indexOf('\n') + 1;
    var nums = iterate(0, i -> i < l - 2, i -> i + 3)
        .mapToObj(i -> "" + segments.indexOf(
            acctNbr.substring(i, i + 3) +
            acctNbr.substring(l + i, l + i + 3) +
            acctNbr.substring(2 * l + i, 2 * l + i + 3)) / 9)
        .collect(joining());
    return Long.parseLong(nums);
  }
}