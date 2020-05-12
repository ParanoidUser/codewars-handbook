class Swapper {
  final Object[] arguments;

  Swapper(Object[] args) {
    arguments = args;
  }

  void swapValues() {
    Object temp = arguments[0];
    arguments[0] = arguments[1];
    arguments[1] = temp;
  }
}
