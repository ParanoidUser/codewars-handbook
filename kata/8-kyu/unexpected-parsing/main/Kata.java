import java.util.Map;

interface Kata {
  static Map <String, String> getStatus(boolean isBusy) {
    return Map.of("status", isBusy ? "busy" : "available");
  }
}