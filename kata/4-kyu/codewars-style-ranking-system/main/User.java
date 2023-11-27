class User {
  int rank = -8;
  int progress;

  public void incProgress(int activityRank) {
    if (activityRank < -8 || activityRank == 0 || activityRank > 8) {
      throw new IllegalArgumentException();
    }
    int diff = activityRank - rank + (activityRank * rank < 0 ? 1 : 0) * (rank > 0 ? 1 : -1);
    progress += diff > 0 ? 10 * diff * diff : diff == 0 ? 3 : 1;
    rank += progress / 100 + (progress / 100 == -rank ? 1 : 0);
    progress = rank > 7 ? 0 : progress % 100;
  }
}