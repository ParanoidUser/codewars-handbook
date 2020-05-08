interface GrassHopper {
  static char getGrade(int s1, int s2, int s3) {
    return (s1 = (s1 + s2 + s3) / 3) < 60 ? 'F' : s1 < 70 ? 'D' : s1 < 80 ? 'C' : s1 < 90 ? 'B' : 'A';
  }
}
