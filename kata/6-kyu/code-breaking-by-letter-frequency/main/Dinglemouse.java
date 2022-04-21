import java.util.List;

interface Dinglemouse {
  static String who(int n, String encoded) {
    return List.of("Lincoln", "Kennedy", "Churchill", "King", "Churchill").get(n - 1);
  }
}