# [Open a weak chest.](https://www.codewars.com/kata/open-a-weak-chest "https://www.codewars.com/kata/612b6b8b1fece800212bca22")

Lock picking is one of the fundamentals for a burglar. Show us how it is possible to open a WeakChest
without knowing its secret code.

This is the interface of WeakChest:

```
public final class WeakChest {
  // Returns true if the chest is open
  public boolean isOpen()
  
  // Creates a chest
  public WeakChest()
  
  // Opens the chest with an int code between 0 and 999
  public void openChest(int inputCode)
    throws BadCodeException
  
```

As you see, a WeakChest can be opened with a specific integer code between 0 and 999. Once open, the
chest will stay open.

Your task is to complete the Burglar's `lockpick()` function:

- open the chest passed in input
- return it


