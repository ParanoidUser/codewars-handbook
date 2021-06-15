class AntiVirus {
  private int scanIntensity = 0;

  void setScanIntensity(int level) {
    scanIntensity = level;
  }

  String scanFile(File file, VirusDB database) {
    String data = file.getData().toLowerCase();
    for (var i = scanIntensity; i > 0; i--) {
      for (String virus : database.getSignatures(i)) {
        if (data.contains(virus)) return file.getName() + " is not safe";
      }
    }
    return file.getName() + " is safe";
  }
}
