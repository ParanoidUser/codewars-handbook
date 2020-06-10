# [Array Cropper](https://www.codewars.com/kata/array-cropper "https://www.codewars.com/kata/57035ec8e55d30a4390008cb")

You need to crop an array of ints, such as if it is an image and you want to crop a specific segment from it in the graphics editor to remove the maximum amount of the `background` and leave only the `object` you interested in.

The `background` consists of 0.   
The `object` consists of 1.  

For example the Array: 
```
  {0,1,0,0},
  {0,0,1,0},
  {1,1,1,0},
  {0,0,0,0}
```
After the cropping will look like: 
```
  {0,1,0},
  {0,0,1},
  {1,1,1}
```