import static java.util.regex.Pattern.compile;
import java.util.function.ToIntFunction;

interface ArrowSearch {
  static int searchArrows(String string) {
    ToIntFunction<String> length = re -> compile(re).matcher(string).results()
        .mapToInt(r -> r.group().length() * (r.group().contains("=") ? 2 : 1)).sum();
    return length.applyAsInt("(-+|=+)>|>") - length.applyAsInt("<(-+|=+)|<");
  }
}
