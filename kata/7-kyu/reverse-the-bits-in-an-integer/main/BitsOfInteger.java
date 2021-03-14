import static java.lang.Integer.*;

interface BitsOfInteger {
  static int reverse_bits(int n) {
    return parseInt(new StringBuilder(toBinaryString(n)).reverse() + "", 2);
  }
}