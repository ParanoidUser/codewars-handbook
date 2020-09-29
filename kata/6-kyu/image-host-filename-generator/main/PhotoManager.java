import java.util.HashSet;
import java.util.Set;

public class PhotoManager {
  private final Set<String> names = new HashSet<>();

  boolean nameExists(String name) {
    return names.contains(name);
  }

  void addName(String name) {
    names.add(name);
  }

  boolean nameWasUnique(String name) {
    if (!nameExists(name)) {
      addName(name);
      return true;
    }
    return false;
  }
}