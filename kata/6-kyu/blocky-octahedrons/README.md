# [Blocky Octahedrons](https://www.codewars.com/kata/blocky-octahedrons "https://www.codewars.com/kata/5bfb0d9b392c5bf79a00015a")

An [octahedron](https://en.wikipedia.org/wiki/Octahedron) is an 8-sided polyhedron whose faces are triangles. 

Create a method that outputs a 3-dimensional array of an octahedron in which the height, width, and depth are equal to the provided integer `size`, which is equal to the length from one vertex to the opposite vertex on the octahedron.

## Example

```
createOctahedron(7)

{{
{ 0, 0, 0, 0, 0, 0, 0 },
{ 0, 0, 0, 0, 0, 0, 0 },
{ 0, 0, 0, 0, 0, 0, 0 },
{ 0, 0, 0, 1, 0, 0, 0 },
{ 0, 0, 0, 0, 0, 0, 0 },
{ 0, 0, 0, 0, 0, 0, 0 },
{ 0, 0, 0, 0, 0, 0, 0 }
}, {
{ 0, 0, 0, 0, 0, 0, 0 },
{ 0, 0, 0, 0, 0, 0, 0 },
{ 0, 0, 0, 1, 0, 0, 0 },
{ 0, 0, 1, 1, 1, 0, 0 },
{ 0, 0, 0, 1, 0, 0, 0 },
{ 0, 0, 0, 0, 0, 0, 0 },
{ 0, 0, 0, 0, 0, 0, 0 }
}, {
{ 0, 0, 0, 0, 0, 0, 0 },
{ 0, 0, 0, 1, 0, 0, 0 },
{ 0, 0, 1, 1, 1, 0, 0 },
{ 0, 1, 1, 1, 1, 1, 0 },
{ 0, 0, 1, 1, 1, 0, 0 },
{ 0, 0, 0, 1, 0, 0, 0 },
{ 0, 0, 0, 0, 0, 0, 0 }
}, {
{ 0, 0, 0, 1, 0, 0, 0 },
{ 0, 0, 1, 1, 1, 0, 0 },
{ 0, 1, 1, 1, 1, 1, 0 },
{ 1, 1, 1, 1, 1, 1, 1 },
{ 0, 1, 1, 1, 1, 1, 0 },
{ 0, 0, 1, 1, 1, 0, 0 },
{ 0, 0, 0, 1, 0, 0, 0 }
}, {
{ 0, 0, 0, 0, 0, 0, 0 },
{ 0, 0, 0, 1, 0, 0, 0 },
{ 0, 0, 1, 1, 1, 0, 0 },
{ 0, 1, 1, 1, 1, 1, 0 },
{ 0, 0, 1, 1, 1, 0, 0 },
{ 0, 0, 0, 1, 0, 0, 0 },
{ 0, 0, 0, 0, 0, 0, 0 }
}, {
{ 0, 0, 0, 0, 0, 0, 0 },
{ 0, 0, 0, 0, 0, 0, 0 },
{ 0, 0, 0, 1, 0, 0, 0 },
{ 0, 0, 1, 1, 1, 0, 0 },
{ 0, 0, 0, 1, 0, 0, 0 },
{ 0, 0, 0, 0, 0, 0, 0 },
{ 0, 0, 0, 0, 0, 0, 0 }
}, {
{ 0, 0, 0, 0, 0, 0, 0 },
{ 0, 0, 0, 0, 0, 0, 0 },
{ 0, 0, 0, 0, 0, 0, 0 },
{ 0, 0, 0, 1, 0, 0, 0 },
{ 0, 0, 0, 0, 0, 0, 0 },
{ 0, 0, 0, 0, 0, 0, 0 },
{ 0, 0, 0, 0, 0, 0, 0 }
}}
```
where each 1 represents a cubic unit that the octahedron takes up and where 0 is a cubic unit of empty space.

## Notes

 - The method should return an empty array/list if either 
 - The input size is even (because then it wouldn't be an octahedron. It'd be an irregular polyhedron with 26 sides)
 - if the input size is 0 or less
 - if input size is 1 (that's called a cube).