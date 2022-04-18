public final class SimpleInteger implements Comparable<SimpleInteger> {
  private final int value;

  public SimpleInteger(int val) {
    value = val;
  }

  public SimpleInteger subtract(SimpleInteger val) {
    return new SimpleInteger(this.value - val.value);
  }

  public SimpleInteger multiply(SimpleInteger val) {
    return new SimpleInteger(this.value * val.value);
  }

  public SimpleInteger divide(SimpleInteger val) {
    return new SimpleInteger(this.value / val.value);
  }

  @Override
  public int compareTo(SimpleInteger other) {
    return Integer.compare(this.value, other.value);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (!(obj instanceof SimpleInteger sint)) {
      return false;
    } else {
      return this.value == sint.value;
    }
  }

  @Override
  public int hashCode() {
    return value ^ ((value + 1) * 31) * 31;
  }
}
