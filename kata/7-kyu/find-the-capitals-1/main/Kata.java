import static java.util.stream.IntStream.range;

interface Kata {
  static int[] capitals(String s){
    return range(0, s.length()).filter(i -> s.charAt(i) < 91).toArray();
  }
}