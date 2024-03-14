import static java.util.stream.IntStream.range;

interface SignLanguage {
  static boolean gaslighting(String shirtWord, String yourWord, char[] friendsLetters) {
    var known = new String(friendsLetters).chars().mapToObj(i -> (char) i).toList();
    return range(0, shirtWord.length()).anyMatch(i -> shirtWord.charAt(i) != yourWord.charAt(i) &&
        (known.contains(shirtWord.charAt(i)) || known.contains(yourWord.charAt(i))));
  }
}