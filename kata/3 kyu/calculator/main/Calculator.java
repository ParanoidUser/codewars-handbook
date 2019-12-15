import javax.script.ScriptEngineManager;

class Calculator {
  static Double evaluate(String expression) {
    try {
      var engine = new ScriptEngineManager().getEngineByName("JavaScript");
      return Double.parseDouble(String.valueOf(engine.eval(expression)));
    } catch (Exception cause) {
      return 0.0;
    }
  }
}
