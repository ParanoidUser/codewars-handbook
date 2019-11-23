import java.util.List;

class Kata {
  static String describeList(List list) {
    return list.isEmpty() ? "empty" : list.size() > 1 ? "longer" : "singleton";
  }
}
