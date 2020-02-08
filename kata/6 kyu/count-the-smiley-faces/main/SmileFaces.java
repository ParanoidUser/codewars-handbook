import java.util.List;

class SmileFaces {
  static int countSmileys(List<String> arr) {
    return (int) arr.stream().filter(x -> x.matches("[:;][-~]?[)D]")).count();
  }
}
