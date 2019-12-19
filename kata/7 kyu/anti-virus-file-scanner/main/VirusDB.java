class VirusDB {
  private String[] intensity1Signatures;
  private String[] intensity2Signatures;
  private String[] intensity3Signatures;

  VirusDB(String[] intensity1Signatures, String[] intensity2Signatures, String[] intensity3Signatures) {
    this.intensity1Signatures = intensity1Signatures;
    this.intensity2Signatures = intensity2Signatures;
    this.intensity3Signatures = intensity3Signatures;
  }

  String[] getSignatures(int arrayNum) {
    switch (arrayNum) {
      case 1:
        return this.intensity1Signatures;
      case 2:
        return this.intensity2Signatures;
      case 3:
        return this.intensity3Signatures;
      default:
        return new String[0];
    }
  }
}
