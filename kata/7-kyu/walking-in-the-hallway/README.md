# [Walking in the hallway](https://www.codewars.com/kata/walking-in-the-hallway "https://www.codewars.com/kata/6368426ec94f16a1e7e137fc")

You are a security guard at a large company, your job is to look over the cameras. Finding yourself
bored you decide to make a game from the people walking in a hallway on one of the cameras. As many
people walk past the hallway you decide to figure out the minimum steps it will take before 2 people
cross or come into contact with each other (assuming every person takes a step at the same time).

People are represented as arrows, ``<`` for a person moving left and ``>`` for a person moving right
and ``-`` for an empty space

``A step represents a person moving forward one -, each person moves 1 step at the same time``

```
in this example the first people to come in contact with each other do it after 1 step
---><----
```

```
in this example the first people to come in contact with each other do it after 1 step
--->-<------->----<-
```

```
in the case that no people come in contact return -1
----<----->----
```