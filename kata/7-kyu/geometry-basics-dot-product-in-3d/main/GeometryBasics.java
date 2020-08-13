interface GeometryBasics {
  static double dotProduct(Vector3D a, Vector3D b) {
    return a.x * b.x + a.y * b.y + a.z * b.z;
  }
}
