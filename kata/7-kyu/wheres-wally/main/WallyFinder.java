import static java.util.regex.Pattern.compile;

interface WallyFinder {
  static int wheresWally(String str) {
    var matcher = compile("(?<=^| )Wally(?!\\w)").matcher(str);
    return matcher.find() ? matcher.start() : -1;
  }
}
