import java.util.LinkedList;

class VersionManager {
  private final LinkedList<Version> stack = new LinkedList<>();

  VersionManager() {
    this("0.0.1");
  }

  VersionManager(String version) {
    try {
      var chunks = version.split("\\.");
      int major = chunks[0].isEmpty() ? 0 : Integer.parseInt(chunks[0]);
      int minor = chunks.length > 1 ? Integer.parseInt(chunks[1]) : 0;
      int patch = chunks.length > 2 ? Integer.parseInt(chunks[2]) : major + minor > 0 ? 0 : 1;
      stack.push(new Version(major, minor, patch));
    } catch (Exception cause) {
      throw new IllegalArgumentException("Error occured while parsing version!");
    }
  }

  VersionManager major() {
    stack.push(new Version(stack.element().major() + 1, 0, 0));
    return this;
  }

  VersionManager minor() {
    stack.push(new Version(stack.element().major(), stack.element().minor() + 1, 0));
    return this;
  }

  VersionManager patch() {
    stack.push(new Version(stack.element().major(), stack.element().minor(), stack.element().patch() + 1));
    return this;
  }

  VersionManager rollback() {
    if (stack.size() == 1) {
      throw new IllegalArgumentException("Cannot rollback!");
    }
    stack.pop();
    return this;
  }

  String release() {
    return stack.pop().toString();
  }

  private record Version(int major, int minor, int patch) {
    public String toString() {
      return major + "." + minor + "." + patch;
    }
  }
}