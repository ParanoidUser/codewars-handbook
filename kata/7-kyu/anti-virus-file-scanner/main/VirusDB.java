import lombok.AllArgsConstructor;

@AllArgsConstructor
class VirusDB {
  private final String[] intensity1Signatures;
  private final String[] intensity2Signatures;
  private final String[] intensity3Signatures;

  String[] getSignatures(int arrayNum) {
    return switch (arrayNum) {
      case 1 -> this.intensity1Signatures;
      case 2 -> this.intensity2Signatures;
      case 3 -> this.intensity3Signatures;
      default -> new String[0];
    };
  }
}
