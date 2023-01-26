interface ProgrammersMacher {
  static void rateProfile(Profile profile, Action swipeLeft, Action swipeRight) {
    (profile.getBio().contains("Java") ? swipeRight : swipeLeft).execute();
  }
}