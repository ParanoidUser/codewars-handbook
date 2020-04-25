import java.math.BigDecimal;

interface Power {
  static long digit(long exp) {
    return new BigDecimal(".301029995663981195").multiply(new BigDecimal(exp)).longValue() + 1;
  }
}  