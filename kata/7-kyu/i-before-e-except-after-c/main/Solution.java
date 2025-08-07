import static java.util.regex.Pattern.compile;

interface Solution {
  static String iBeforeE(String s) {
    return compile("c?([ie]+)").matcher(s).replaceAll(mr -> {
      String es = mr.group(1).replace("i", "");
      String is = mr.group(1).replace("e", "");
      return mr.group().charAt(0) == 'c' ? "c" + es + is : is + es;
    });
  }
}