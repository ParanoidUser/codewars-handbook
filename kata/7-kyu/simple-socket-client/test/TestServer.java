import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;

class TestServer extends Thread {
  private final ServerSocket server;
  private boolean stopped;
  private boolean regular;

  TestServer(int port) throws IOException {
    server = new ServerSocket();
    server.setReuseAddress(true);
    server.bind(new InetSocketAddress(port));
  }

  public void setRegular(boolean enable) {
    regular = enable;
  }

  @Override
  public void run() {
    while (!stopped) {
      try (var client = server.accept()) {
        byte[] buffer = client.getInputStream().readNBytes(2);
        OutputStream outputStream = client.getOutputStream();
        outputStream.write(regular ? buffer[0] : buffer[1]);
        outputStream.flush();
      } catch (IOException ignore) { /* Ignore */ }
    }
  }

  public void halt() throws Exception {
    stopped = true;
    server.close();
  }
}