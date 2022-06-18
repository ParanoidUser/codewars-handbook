# [Last Survivors Ep.2](https://www.codewars.com/kata/last-survivors-ep-dot-2 "https://www.codewars.com/kata/60a1aac7d5a5fc0046c89651")

Substitute two equal letters by the next letter of the alphabet (two letters convert to one):

    "aa" => "b", "bb" => "c", .. "zz" => "a".

The equal letters do _not_ have to be adjacent.  
Repeat this operation until there are no possible substitutions left.  
Return a string.

Example:

    let str = "zzzab"
        str = "azab"
        str = "bzb"
        str = "cz"
    return "cz"

#### Notes

* The order of letters in the result is not important.
* The letters `"zz"` transform into `"a"`.
* There will only be lowercase letters.