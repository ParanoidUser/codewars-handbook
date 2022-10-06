# [Convert your name to Japanese! (Game)](https://www.codewars.com/kata/convert-your-name-to-japanese-game "https://www.codewars.com/kata/5707fb3f3f100894170006ae")

You receive an name in the ASCII set of characters and translate it with a provided table in wich you should transform character by character.
This is no real japanese but the idea is to make it sound like a Japanese name.

# Input
    "Jhon Cena"

# Output
    "Zusumorito Mikutoka"

# Input
    "a"

# Output
    "ka"

# Input
    "j"

# Output
    "zusu"

# Input
    "é"

# Output
    "Only ASCII"

# Input
    null 

# Output
    "" 

# Input
    "" 

# Output

    ""

**Notes:** 

* The i-th letter in the latin alphabet maps to the i-th (assuming 1-based indexing) element in the table.
* Upper-case letters are to be transformed too in a way that "Jhon Cena" gives exactly the same as "jhon cena".