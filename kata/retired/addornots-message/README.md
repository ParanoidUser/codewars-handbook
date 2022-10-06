# [Addornot's message](https://www.codewars.com/kata/addornots-message "https://www.codewars.com/kata/60d847e93cbec4003e0e4164")

While exploring the jungle, you have found an ancient broken robot, called Addornot. Addornot can
only communicate in multidimensional string arrays (`String[][]`). However, due to age, his messages
get corrupted with extra Strings. But Addornot is able to flag which strings are part of his message
and should be read, and which are not and should be ignored.

Inner arrays will contain two strings. First string will be the string that is/isn't part of
Addornot's message. The second one will be either `"1"` or `"0"`. 1 meaning the first String is part
of the message, 0 - meaning string should be ignored.

It is your task to write a function that receives `String[][]` and figures out which strings should
be added to form a message and return a String - Addornot's message.

`{{"h", "1"}, {"a", "0"}, {"i", "1"}}` should return `"hi"`. 