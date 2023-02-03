import static org.junit.jupiter.api.Assertions.assertEquals;

import java.net.Socket;
import java.util.LinkedList;
import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    Thread server = new Thread(Solution::runServer);
    server.start();

    List<String> request = List.of("there\n", "is\n", "a\n", "house\n", "in\n", "new\n", "orleans\n");
    List<String> response = createClient(request);
    try {
      server.join();
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    assertEquals(request, response);
  }

  private static List<String> createClient(List<String> requests) {
    List<String> response = new LinkedList<>();
    try (var socket = new Socket("127.0.0.1", 80)) {
      var out = socket.getOutputStream();
      for (String request : requests) {
        out.write(request.getBytes());
        byte[] buffer = new byte[1024];
        int length = socket.getInputStream().read(buffer);
        response.add(new String(buffer, 0, length));
      }
      out.write("exit".getBytes());
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
    return response;
  }
}