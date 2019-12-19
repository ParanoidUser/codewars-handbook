import java.util.HashMap;

class Dictionary extends HashMap<String, String> {
  void newEntry(String key, String value) {
    put(key, value);
  }

  String look(String key) {
    return getOrDefault(key, "Cant find entry for " + key);
  }
}
