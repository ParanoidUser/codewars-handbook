import static java.util.stream.Stream.of;

interface Kata {
  static String well(String[] ideas) {
    long count = of(ideas).filter(i -> i.equals("good")).count();
    return count > 2 ? "I smell a series!" : count > 0 ? "Publish!" : "Fail!";
  }
}
