class NotVisibleCubes {
  Long notVisibleCubes(long n) {
    return (n -= 2) * n * n;
  }
}