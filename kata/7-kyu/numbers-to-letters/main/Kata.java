import static java.util.stream.Stream.of;
import static java.util.stream.Collectors.joining;

interface Kata{
  static String switcher(String[] arr){
    return of(arr).map(n -> "_zyxwvutsrqponmlkjihgfedcba!? ".charAt(Integer.parseInt(n)) + "").collect(joining());
  }
}