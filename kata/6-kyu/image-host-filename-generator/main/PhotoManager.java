import java.util.HashSet;
import java.util.Set;

class PhotoManager {
  private final Set<String> names = new HashSet<>();

  boolean nameExists(String name) {
    return names.contains(name);
  }

  boolean nameWasUnique(String name) {
    return names.add(name);
  }
}