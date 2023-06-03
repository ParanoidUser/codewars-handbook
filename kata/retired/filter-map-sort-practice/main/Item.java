import java.time.Instant;
import lombok.AllArgsConstructor;

@AllArgsConstructor
class Item {
  String color;
  Instant created;
  Category category;
}