import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import lombok.SneakyThrows;

class System {
  static PipedInputStream in;
  static PrintStream out;

  private static PipedInputStream input;

  @SneakyThrows
  public static void write(String s) {
    in = new PipedInputStream();
    try (var in = new PrintStream(new PipedOutputStream(System.in))) {
      in.print(s);
    }

    var output = new PipedOutputStream();
    out = new PrintStream(output);
    input = new PipedInputStream(output);
  }

  @SneakyThrows
  public static String read() {
    var text = new StringBuilder();
    try (var in = new BufferedReader(new InputStreamReader(input))) {
      String line;
      while (in.ready() && (line = in.readLine()) != null) {
        text.append(line).append("\n");
      }
    }
    return text.toString();
  }
}