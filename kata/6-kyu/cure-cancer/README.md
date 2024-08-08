# [Cure Cancer](https://www.codewars.com/kata/cure-cancer "https://www.codewars.com/kata/5b4accacbdd07498aa000041")

Now you are a doctor.

You are working with a patient's **body** which has many cells.

The patient's body is a matrix where every row represents a cell.

Each cell contains just uppercase and lowercase letters,

and every cell in the body should be the same.

Oh, no! It seems that one of the cells have mutated!

It is your job to locate the mutation so that the chemo specialists can fix it!

return the location [i,j] within the matrix...

before it's too late! :(

example:

    cellscellscellscodecodecells
    cellscellscellscodecodecells
    cellscellscellscodecodecells
    cellscellscellscodecodecells
    cellscellscellscodecodecells
    cellscellscellscodecodecells
    cellscellscellscodecodecells
    cellscellscellscodecodecells
    cellscellscellscodecodecells
    cellscellscellscodecadecells <- here it is! [20, 9]
    cellscellscellscodecodecells
    cellscellscellscodecodecells
    cellscellscellscodecodecells
    cellscellscellscodecodecells
    
no bodies will have less than 3 cells.

if the diagnosis was a false alarm, return an empty array.