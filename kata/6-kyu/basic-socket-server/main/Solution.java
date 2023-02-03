import java.net.ServerSocket;

interface Solution {
  static void runServer() {
    try (ServerSocket server = new ServerSocket(1111)) {
      var socket = server.accept();
      byte[] buffer = new byte[1024];
      while (true) {
        int length = socket.getInputStream().read(buffer);
        String message = new String(buffer, 0, length);
        if (message.equals("exit")) {
          socket.close();
          break;
        }
        socket.getOutputStream().write(buffer, 0, length);
      }
    } catch (Exception e) {
      throw new IllegalStateException(e);
    }
  }
}