import java.util.Iterator;
import java.util.NoSuchElementException;

class SignalIterator implements Iterator<Double> {

  private final double a;
  private final double w;
  private final double phi;
  private final double delta;
  private double t;

  SignalIterator(double a, double w, double phi, double delta) {
    this.a = a;
    this.w = w;
    this.phi = phi;
    this.delta = delta;
  }

  @Override
  public boolean hasNext() {
    return true;
  }

  @Override
  public Double next() {
    if (!hasNext()) {
      throw new NoSuchElementException();
    }
    t += delta;
    return a * Math.sin(t * w + phi);
  }
}