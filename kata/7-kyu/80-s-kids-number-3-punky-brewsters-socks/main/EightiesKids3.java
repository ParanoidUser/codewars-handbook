import java.util.HashSet;

interface EightiesKids3 {
  static String[] getSocks(String name, String[] socks) {
    HashSet<String> set = new HashSet<>();
    for (String sock : socks) {
      if (!set.add(sock) && "Henry".equals(name)) {
        return new String[] {sock, sock};
      } else if (set.size() == 2 && "Punky".equals(name)) {
        return set.toArray(new String[2]);
      }
    }
    return new String[0];
  }
}
