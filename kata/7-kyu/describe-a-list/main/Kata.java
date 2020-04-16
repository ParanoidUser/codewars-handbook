import java.util.List;

class Kata {
  static String describeList(List<Object> list) {
    return list.isEmpty() ? "empty" : list.size() > 1 ? "longer" : "singleton";
  }
}
