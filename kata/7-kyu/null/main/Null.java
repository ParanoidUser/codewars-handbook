class Null {
  @Override
  public String toString() {
    return "null";
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public boolean equals(Object obj) {
    return obj == null || obj instanceof Null;
  }
}
