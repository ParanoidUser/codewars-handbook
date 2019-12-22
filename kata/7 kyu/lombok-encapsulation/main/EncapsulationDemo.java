import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
class EncapsulationDemo {
  private int number;
  private String stringValue;
  private Object anObject;
}
