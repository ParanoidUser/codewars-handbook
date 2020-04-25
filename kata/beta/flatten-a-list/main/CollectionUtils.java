import static java.util.Objects.requireNonNullElse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

interface CollectionUtils {
  static List<Object> flattenList(List<?> list) {
    var flat = new ArrayList<>();
    for (var item : requireNonNullElse(list, flat)) {
      if (item instanceof Collection) {
        flat.addAll(flattenList(new ArrayList<>((Collection<?>) item)));
      } else {
        flat.add(item);
      }
    }
    return flat;
  }
}