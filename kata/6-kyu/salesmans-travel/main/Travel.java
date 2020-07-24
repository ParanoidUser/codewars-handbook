import static java.util.stream.Stream.of;

import java.util.ArrayList;

interface Travel {
  static String travel(String r, String zipcode) {
    var streets = new ArrayList<String>();
    var apartments = new ArrayList<String>();
    of(r.split(",")).filter(s -> zipcode.equals(s.substring(s.length() - 8))).forEach(
            address -> {
              streets.add(address.substring(address.indexOf(' ') + 1, address.length() - 9));
              apartments.add(address.substring(0, address.indexOf(' ')));
            });
    return zipcode + ":" + String.join(",", streets) + "/" + String.join(",", apartments);
  }
}
