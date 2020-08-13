import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;

final class System {
  private System() {}

  static PipedInputStream in;
  static PrintStream out;

  private static PipedInputStream pipe;

  static void write(String s) throws IOException {
    try (var target = new PrintStream(new PipedOutputStream(in))) {
      target.print(s);
    }
  }

  static String read() throws IOException {
    var text = new StringBuilder();
    try (var source = new BufferedReader(new InputStreamReader(pipe))) {
      while (source.ready()) {
        text.append(source.readLine()).append("\n");
      }
    }
    return text.toString();
  }

  static void reset() throws IOException {
    in = new PipedInputStream();
    var output = new PipedOutputStream();
    out = new PrintStream(output);
    pipe = new PipedInputStream(output);
  }
}