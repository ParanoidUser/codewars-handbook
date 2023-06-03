# [Filter Map Sort Practice](https://www.codewars.com/kata/filter-map-sort-practice "https://www.codewars.com/kata/60ff692fd80e47002818137e")

Given a list of Item instances, keep only the items that have a color of "Red" that are LESS than 7 days old. 

Once you have the matching items, return the items sorted by Category name (alphabetically, ascending).

```
class Item {
    String name;
    String color;
    Instant created;
    Integer categoryID;
    Category category; // will be null until you set it
}

enum Category {
  HAZARDOUS, OVERSIZED, FRAGILE, OBLONG, HEAVY
}
```

Example Input:

```
// Today is: 2021-07-27T01:32:07.199Z

[
 {
   id: "a1",
   color: "Red",
   created: "2021-07-26T01:32:07.199Z",
   categoryID: 3
 },
 {
   id: "a2",
   color: "Green",
   created: "2021-07-23T01:32:07.199Z",
   categoryID: 1
 },
 {
   id: "a3",
   color: "Red",
   created: "2021-07-25T01:32:07.199Z",
   categoryID: 1
 },
 {
   id: "a4",
   color: "Red",
   created: "2021-07-25T01:32:07.199Z",
   categoryID: 2
 }
]
```

Expected Output:

```
[
 {
   id: "a4",
   color: "Red",
   created: "2021-07-01T01:32:07.199Z",
   categoryID: 2 // FRAGILE
 },
 {
   id: "a1",
   color: "Red",
   created: "2021-06-27T01:32:07.199Z",
   categoryID: 3 // OBLONG
 },
 {
   id: "a3",
   color: "Red",
   created: "2021-04-27T01:32:07.199Z",
   categoryID: 1 // OVERSIZED
 },
]
```