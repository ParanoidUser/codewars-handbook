import java.math.BigInteger;

class Funcij {
    static BigInteger sumin(int n) {
        return BigInteger.valueOf((long) n * (n + 1) * (2 * n + 1) / 6);
    }

    static BigInteger sumax(int n) {
        return BigInteger.valueOf((long) n * n * n - n * (n - 1) * (long) (2 * n - 1) / 6);
    }

    static BigInteger sumsum(int n) {
        return sumin(n).add(sumax(n));
    }
}
