import java.net.Socket;

interface Solution {
  static boolean isRegularServer() {
    try (var socket = new Socket("127.0.0.1", 1111)) {
      socket.getOutputStream().write(new byte[]{0xF, 0xE});
      return 0xF == socket.getInputStream().read();
    } catch (Exception cause) {
      throw new IllegalStateException(cause);
    }
  }
}
