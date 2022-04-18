import java.util.List;

interface Kata {
  static List<Object> filterList(List<Object> list) {
    return list.stream().filter(Integer.class::isInstance).toList();
  }
}
