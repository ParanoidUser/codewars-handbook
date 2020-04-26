import static java.util.Collections.singletonList;

import java.util.LinkedList;

interface Calculator {
  static Double evaluate(String expression) {
    var args = expression.split(" ");
    var stack = new LinkedList<>(singletonList(Double.valueOf(args[0])));
    for (int i = 1; i < args.length; i += 2) {
      switch (args[i]) {
        case "*": stack.push(stack.pop() * Double.parseDouble(args[i + 1])); break;
        case "/": stack.push(stack.pop() / Double.parseDouble(args[i + 1])); break;
        default:  stack.push(Double.parseDouble(args[i + 1]) * ("+".equals(args[i]) ? 1 : -1)); break;
      }
    }
    return stack.stream().mapToDouble(d -> d).sum();
  }
}
