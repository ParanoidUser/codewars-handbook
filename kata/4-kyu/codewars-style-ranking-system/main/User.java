class User {

  int rank = -8;
  int progress;

  User incProgress(int rank) {

    if (rank == 0 || rank < -8 || rank > 8) {
      throw new IllegalArgumentException("Invalid rank supplied");
    }

    if (rank == 8) {
      progress = 0;
    } else {
      // negative diff means that user completed a higher rank
      // positive diff means that user completed a lower rank
       int diff = this.rank - rank;

      // same level - 3 progress points
      if (diff == 0) {
        this.progress += 3;
      }

      // completed lower rank
      // 2 levels or more lower are ignored
      if (diff == 1) {
        this.progress += 1;
      }

      // completed a lower rank while at rank 1
      if (diff == 2 && this.rank == 1 && rank == -1) {
        this.progress += 1;
      }

      // completed a higher rank
      if (diff < 0) {
        if (this.rank < 0 && rank > 0) {
          // there is no zero level
          this.progress += (10 * (diff + 1) * (diff + 1));
        } else {
          this.progress += (10 * diff * diff);
        }
      }

      checkProgress();
    }
    return this;
  }


  void checkProgress() {
    while (progress >= 100) {
      progress -= 100;
      rank++;

      if (rank == 0) {
        rank = 1;
      }

      if (rank >= 8) {
        rank = 8;
        progress = 0;
      }
    }
  }
}