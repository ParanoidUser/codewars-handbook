# [Finding Neo (PG-13)](https://www.codewars.com/kata/finding-neo-pg-13 "https://www.codewars.com/kata/5522d19f20cc1c8330001218")

Neo is somewhere in the Matrix.
```
public interface Matrix {
  public int size();
  public int get(int x, int y);
}
```

You are Morpheus, and your job is to find him.
```
public class Morpheus {
  public int[] find(Matrix matrix, int neo) {
    // return Neo's x and y coordinates as a two-element array
  }
}
```

The matrix is controlled by machines, so it is very orderly. It is quadratic, and the following rules hold for all elements:
```
matrix[x,y] < matrix[x+1,y]
matrix[x,y] < matrix[x,y+1]
```

And of course, there will be no duplicates of Neo - he is *The One*.