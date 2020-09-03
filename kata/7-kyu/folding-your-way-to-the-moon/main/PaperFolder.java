interface PaperFolder {
  static Long fold(Double distance) {
    return distance < 0 ? null : distance > 10e-5 ? fold(distance / 2) + 1 : 0;
  }
}