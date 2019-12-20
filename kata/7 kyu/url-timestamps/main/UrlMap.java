import java.net.URL;
import java.util.HashMap;

class UrlMap extends HashMap<String, Long> {

  void setTimestamp(URL url, long timestamp) {
    put(url.toString(), timestamp);
  }

  long getTimestamp(URL url) {
    return getOrDefault(url.toString(), -1L);
  }
}
