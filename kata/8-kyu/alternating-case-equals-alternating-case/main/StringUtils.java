import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;

interface StringUtils {
  static String toAlternativeString(String string) {
    return string.chars()
                 .map(c -> c + (isLowerCase(c) ? -32 : isUpperCase(c) ? 32 : 0))
                 .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                 .toString();
  }
}
