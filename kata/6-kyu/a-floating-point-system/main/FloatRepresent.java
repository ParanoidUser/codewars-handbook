import static java.math.RoundingMode.DOWN;

import java.math.BigDecimal;

interface FloatRepresent {
  static String mantExp(BigDecimal aNumber, int digitsNumber) {
    var n = aNumber.setScale(digitsNumber + aNumber.scale() - aNumber.precision(), DOWN);
    return n.unscaledValue() + "P" + -n.scale();
  }
}
