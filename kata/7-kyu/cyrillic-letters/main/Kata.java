import static java.lang.Character.UnicodeBlock.*;

interface Kata {
  static boolean isCyrillic(char letter) {
    return of(letter).equals(CYRILLIC);
  }
}