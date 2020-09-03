import java.util.LinkedList;

class Calc {
  double evaluate(String expr) {
    var stack = new LinkedList<Double>();
    for (var token : expr.split(" ")) {
      switch (token) {
        case "+": stack.push(stack.pop() + stack.pop()); break;
        case "-": stack.push(-stack.pop() + stack.pop()); break;
        case "*": stack.push(stack.pop() * stack.pop()); break;
        case "/": stack.push(1 / stack.pop() * stack.pop()); break;
        default: stack.push(token.isEmpty() ? 0 : Double.parseDouble(token));
      }
    }
    return stack.pop();
  }
}
