import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Song {
  private final String title;
  private final String artist;
  private final Set<String> uniqueListeners = new TreeSet<>(String::compareToIgnoreCase);

  Song(String title, String artist) {
    this.title = title;
    this.artist = artist;
  }

  String getTitle() {
    return title;
  }

  String getArtist() {
    return artist;
  }

  int howMany(List<String> listeners) {
    return (int) listeners.stream().filter(uniqueListeners::add).count();
  }
}