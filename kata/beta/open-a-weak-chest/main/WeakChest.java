import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
class WeakChest {

  private final int code;
  private boolean open;

  public void openChest(int inputCode) throws BadCodeException {
    if (inputCode != code) {
      throw new BadCodeException(String.format("The input code (%d) is wrong; retry.", inputCode));
    }
    open = true;
  }
}

class BadCodeException extends RuntimeException {

  public BadCodeException(String errorMessage) {
    super(errorMessage);
  }
}