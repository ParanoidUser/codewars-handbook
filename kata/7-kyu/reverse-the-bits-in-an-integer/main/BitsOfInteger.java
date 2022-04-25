import static java.lang.Integer.*;

interface BitsOfInteger {
  static int reverseBits(int n) {
    return parseInt(new StringBuilder(toBinaryString(n)).reverse() + "", 2);
  }
}