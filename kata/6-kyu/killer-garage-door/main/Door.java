interface Door {
  static String run(String events) {
    int position = 0;
    int direction = 1;
    boolean inMove = false;
    StringBuilder positions = new StringBuilder();
    for (char event : events.toCharArray()) {
      if (event == 'O') {
        direction *= -1;
      } else if (event == 'P') {
        inMove = !inMove;
      }
      if (inMove) {
        position += direction;
        if (position % 5 == 0) {
          inMove = false;
          direction = position == 0 ? 1 : -1;
        }
      }
      positions.append(position);
    }
    return positions.toString();
  }
}