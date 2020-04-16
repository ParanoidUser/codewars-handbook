import java.util.Arrays;

class Kata {
  static String well(String[] ideas) {
    long count = Arrays.stream(ideas).filter(i -> i.equals("good")).count();
    return count > 2 ? "I smell a series!" : count > 0 ? "Publish!" : "Fail!";
  }
}
