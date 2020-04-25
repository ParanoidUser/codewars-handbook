import static java.util.Map.of;

interface PhaseTransitions {
  static String getTransition(String phase1, String phase2) {
    return of("SL", "MELT", "LS", "FREEZE", "LG", "BOIL", "GL", "CONDENSE", "SG", "SUBLIME", "GS", "DEPOSIT").get(phase1.charAt(0) + "" + phase2.charAt(0));
  }
}
