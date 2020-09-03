import static java.util.function.Predicate.not;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Stream.of;

class Dubstep {
  String SongDecoder(String song) {
    return of(song.split("WUB")).filter(not(String::isEmpty)).collect(joining(" "));
  }
}
