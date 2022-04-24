interface Kata {
  static int getParticipants(int handshakes) {
    return (int) Math.ceil(Math.sqrt(2 * handshakes + .25) + .5);
  }
}