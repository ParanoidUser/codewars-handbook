import static java.util.stream.IntStream.rangeClosed;

interface FactorialBaseConverter {
  static int intoFactorial(String s) {
    int f;
    int n = Integer.parseInt(s.trim());
    int i = 0;
    do {
      f = rangeClosed(1, ++i).reduce(1, (a, b) -> a * b);
    }
    while (n > f);

    var fact = 0;
    for (; i >= 0; n %= f, f = rangeClosed(1, --i).reduce(1, (a, b) -> a * b)) {
      fact = fact * 10 + n / f;
    }
    return fact;
  }

  static int outOfFactorial(String s) {
    var num = 0;
    for (var i = 0; i < s.length(); i++) {
      int d = s.charAt(s.length() - i - 1) - 48;
      if (d > i) {
        throw new IllegalArgumentException();
      }
      num += d * rangeClosed(1, i).reduce(1, (a, b) -> a * b);
    }
    return num;
  }
} 