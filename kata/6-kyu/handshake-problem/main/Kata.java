interface Kata {
  static int GetParticipants(int handshakes) {
    return (int) Math.ceil(.5 + Math.sqrt(2 * handshakes + .25));
  }
}