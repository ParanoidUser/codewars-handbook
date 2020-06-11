import static java.util.stream.IntStream.range;

interface Dinglemouse {
  static boolean child(String bird1, String bird2) {
    long diff = range(0, bird1.length()).filter(i -> bird1.charAt(i) != bird2.charAt(i)).count();
    return diff > 0 && diff < 3;
  }

  static boolean grandchild(String bird1, String bird2) {
    long diff = range(0, bird1.length()).filter(i -> bird1.charAt(i) != bird2.charAt(i)).count();
    return bird1.length() > 1 && diff < 5 || diff == 0;
  }
}
