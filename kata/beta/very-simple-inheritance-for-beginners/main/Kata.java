class Add extends Operation {
  void execute(double variable1, double variable2) {
    result = variable1 + variable2;
  }
}

class Subtract extends Add {
  @Override
  void execute(double variable1, double variable2) {
    super.execute(variable1, -variable2);
  }
}

class Multiply extends Add {
  @Override
  void execute(double variable1, double variable2) {
    super.execute(0, variable1 * variable2);
  }
}

class Divide extends Multiply {
  @Override
  void execute(double variable1, double variable2) {
    super.execute(variable1, 1 / variable2);
  }
}