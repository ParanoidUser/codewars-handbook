import lombok.AllArgsConstructor;

@AllArgsConstructor
class VirusDB {
  private final String[] intensity1Signatures;
  private final String[] intensity2Signatures;
  private final String[] intensity3Signatures;

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
