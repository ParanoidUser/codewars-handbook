import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
class EncapsulationDemo {
  private int number;
  private String stringValue;
  private Object anObject;
}