import java.util.Iterator;
import java.util.NoSuchElementException;

class BaumSweet implements Iterator<Integer> {
  private int n;

  @Override
  public boolean hasNext() {
    return true;
  }

  @Override
  public Integer next() {
    if (!hasNext()) {
      throw new NoSuchElementException();
    }
    return Integer.toBinaryString(n++).matches("^0$|^(1|00)+$") ? 1 : 0;
  }
}