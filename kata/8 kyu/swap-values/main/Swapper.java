class Swapper {
  private Object[] arguments;

  public Swapper(Object[] args) {
    arguments = args;
  }

  public void swapValues() {
    Object temp = arguments[0];
    arguments[0] = arguments[1];
    arguments[1] = temp;
  }
}
