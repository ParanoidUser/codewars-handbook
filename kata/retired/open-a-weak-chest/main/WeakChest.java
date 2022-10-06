import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
class WeakChest {

  private final int code;
  @Getter
  private boolean open;

  public void openChest(int inputCode) throws BadCodeException {
    if (inputCode != code) {
      throw new BadCodeException(String.format("The input code (%d) is wrong; retry.", inputCode));
    }
    open = true;
  }
}

