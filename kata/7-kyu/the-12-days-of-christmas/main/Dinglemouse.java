import java.util.Comparator;

interface Dinglemouse {
  class HelpSaveChristmas implements Comparator<String> {
    @Override
    public int compare(String line1, String line2) {
      var l1 = Integer.parseInt("0" + line1.replaceAll("\\D", ""));
      var l2 = Integer.parseInt("0" + line2.replaceAll("\\D", ""));
      return l1 == l2 ? line2.length() - line1.length() : l2 - l1;
    }
  }
}
