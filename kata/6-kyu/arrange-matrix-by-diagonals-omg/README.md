# [Arrange Matrix by Diagonals -- OMG](https://www.codewars.com/kata/arrange-matrix-by-diagonals-omg "https://www.codewars.com/kata/5ab1f8d38d28f67410000090")

You will be given a 2d char array <strong>data.



The task is to rearrange the elements in the SAME order, diagonally, like this:

        c h a         c a c 
        r a c   ==>   h a e
        t e r         r t r
      
here's another example
      
        j a v a         j v o t 
        c o d e    ==>  a c e c
        t a c o         a d a o 
        
      
another one!
      
        T h i s A r r a y       T i r y s r Y s y
        i S s O c r a z Y  ==>  h A a S c z t L a
        I t s R l y B a d       s r i O a I R B d
      


In other words, consider the order in which you read books (from left to right then down a line).

Take the characters in that order, and place them back in so that you can read them diagonally.

The diagonals run from bottom left to top right.

The first diagonal starts at `element[0][0]`.


## Note: 

the ascii value of chars is does not affect the ordering.

All array dimensions will be greater than 0.