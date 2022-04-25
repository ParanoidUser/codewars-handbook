import static java.util.regex.Pattern.compile;

interface Dinglemouse {
  static String pingPong(String s) {
    long r = compile("(?<!pong-)(ping-pong-?)++(?!ping)").matcher(s).results().count() - compile("(?<!ping-)(pong-ping-?)++(?!pong)").matcher(s).results().count();
    return r > 0 || r == 0 && s.lastIndexOf("ping") < s.lastIndexOf("pong") ? "ping" : "pong";
  }
}