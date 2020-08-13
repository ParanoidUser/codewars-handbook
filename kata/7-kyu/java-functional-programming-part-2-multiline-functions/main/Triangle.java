import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
class Triangle {
  final int height;
  final int base;
  @Getter
  @Setter
  private double area;
}
