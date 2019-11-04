# [Find the force of gravity between two objects](https://www.codewars.com/kata/find-the-force-of-gravity-between-two-objects "https://www.codewars.com/kata/5b609ebc8f47bd595e000627")

Your job is to find the gravitational force between two spherical objects (obj1 , obj2).

input
====

Two arrays are give : 

- arr_val (value array), consists of 3 elements
    - 1st element : mass of obj 1
    - 2nd element : mass of obj 2
    - 3rd element : distance between their centers
- arr_unit (unit array), consists of 3 elements
    - 1st element : unit for mass of obj 1
    - 2nd element : unit for mass of obj 2
    - 3rd element : unit for distance between their centers

mass units are : 
    
- kilogram (kg)
- gram (g)
- milligram (mg)
- microgram (?g)
- pound (lb)

distance units are : 

- meter (m)
- centimeter (cm)
- millimeter (mm)
- micrometer (?m)
- feet (ft)

Note
====


value of G = 6.67 x 10<sup>-11</sup>N.kg<sup>�2</sup>.m<sup>2<sup> 

1ft = 0.3048m

1lb = 0.453592kg

return value must be Newton for force (obviously)

`μ` copy this from here to use it in your solution 
