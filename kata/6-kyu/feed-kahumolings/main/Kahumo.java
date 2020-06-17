import static java.util.stream.DoubleStream.iterate;

interface Kahumo {
  static double[] serve(double food, double flavour, int mouths) {
    var s0 = flavour > 1 ? food * (flavour - 1) / (Math.pow(flavour, mouths) - 1) : food / mouths;
    return iterate(s0, i -> i * flavour).limit(mouths).toArray();
  }
}