# [Address Book by State](https://www.codewars.com/kata/address-book-by-state "https://www.codewars.com/kata/59d0ee709f0cbcf65400003b")

Given a string with friends to visit in different states:
```
ad3="John Daggett, 341 King Road, Plymouth MA
Alice Ford, 22 East Broadway, Richmond VA
Sal Carpenter, 73 6th Street, Boston MA"
```
we want to produce a result that sorts the names by state and lists the name of the state followed by the name of each person residing in that state (people's names sorted). When the result is printed we get:
```
Massachusetts
.....^John Daggett 341 King Road Plymouth Massachusetts
.....^Sal Carpenter 73 6th Street Boston Massachusetts
^Virginia
.....^Alice Ford 22 East Broadway Richmond Virginia
```
Spaces not being always well seen, in the above result `^` means a white space.


The resulting string (when not printed) will be:
```
"Massachusetts\n..... John Daggett 341 King Road Plymouth Massachusetts\n..... Sal Carpenter 73 6th Street Boston Massachusetts\n Virginia\n..... Alice Ford 22 East Broadway Richmond Virginia"
```
or (the separator is `\n` or `\r\n` depending on the language)
```
"Massachusetts\r\n..... John Daggett 341 King Road Plymouth Massachusetts\r\n..... Sal Carpenter 73 6th Street Boston Massachusetts\r\n Virginia\r\n..... Alice Ford 22 East Broadway Richmond Virginia"
```

## Notes
- There can be a blank last line in the given string of addresses.
- The tests only contains CA, MA, OK, PA, VA, AZ, ID, IN for states.
- You can see another example in the "Sample tests".

## States
For the lazy ones:

	'AZ': 'Arizona',
	'CA': 'California',
	'ID': 'Idaho',
	'IN': 'Indiana',
	'MA': 'Massachusetts',
	'OK': 'Oklahoma',
	'PA': 'Pennsylvania',
	'VA': 'Virginia'
