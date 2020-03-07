# [Triple Sorting - Sort & Stringify a list by 3 attributes](https://www.codewars.com/kata/triple-sorting-sort-and-stringify-a-list-by-3-attributes "https://www.codewars.com/kata/5829c2c8ef8d4474300000fa")

Tale University is a bit messy, and can't maintain an ordered list of their student. Tale's dean wants to print a sorted list of his students by the gpa, last name and age and post it on the walls so everybody can be impressed of his great students.

Given a list of students, sort them by (from most important to least important):

* GPA (descending)
* First letter of last name (ascending)
* Age (ascending)

And the class Student:

```
class Student {
	...
  int getGpa()
  int getAge();
  String getFullName();
}

```
```

Return the sorted result as full names string, comma separated.

For Example, given the list (name, age, gpa):

* David Goodman, 23, 88
* Mark Rose, 25, 82
* Jane Doe, 22, 90
* Jane Dane, 25, 90

sort(students) should return "Jane Doe,Jane Dane,David Goodman,Mark Rose"