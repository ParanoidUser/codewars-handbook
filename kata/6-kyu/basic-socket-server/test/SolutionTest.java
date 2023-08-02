import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;
import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    List<String> requests = List.of("there\n", "is\n", "a\n", "house\n", "in\n", "new\n", "orleans\n");
    List<String> responses = new LinkedList<>();

    Thread server = new Thread(Solution::runServer);
    Thread client = new Thread(() -> createClient(requests, responses));
    server.start();
    client.start();
    try {
      server.join(100);
      client.join(100);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    assertEquals(requests, responses);
  }

  @Test
  void serverUnavailable() throws Exception {
    try (var socket = new ServerSocket(1111)) {
      assertFalse(socket.isClosed());
      assertThrows(IllegalStateException.class, Solution::runServer);
    }
  }

  private static void createClient(List<String> requests, List<String> responses) {
    try (var socket = new Socket("127.0.0.1", 1111)) {
      var out = socket.getOutputStream();
      for (String request : requests) {
        out.write(request.getBytes());
        byte[] buffer = new byte[1024];
        int length = socket.getInputStream().read(buffer);
        responses.add(new String(buffer, 0, length));
      }
      out.write("exit".getBytes());
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}