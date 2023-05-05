# [Page replacement algorithms: LRU](https://www.codewars.com/kata/page-replacement-algorithms-lru "https://www.codewars.com/kata/6329d94bf18e5d0e56bfca77")

In a computer operating system that uses paging for virtual memory management, page replacement algorithms decide which
memory pages to page out when a page of memory needs to be allocated. Page replacement happens when a requested page is
not in memory (page fault) and a free page cannot be used to satisfy the allocation, either because there are none, or
because the number of free pages is lower than some threshold.

## The LRU page replacement algorithm

The least recently used (LRU) page replacement algorithm works on the idea that pages that have been most heavily used
in the past few instructions are most likely to be used heavily in the next few instructions too. If not all the slots
in memory are occupied, the requested page is inserted in the first available slot when a page fault happens. If the
memory is full and a page fault happens, the least recently used page in memory gets replaced by the requested page. To
explain it in a clearer way: the least recently used page is the page that is currently in memory and has been
referenced further in the past.<br>

Your task is to implement this algorithm. The ```lru``` function will take two parameters as input: the number of
maximum pages that can be kept in memory at the same time ```n``` and a ```reference list``` containing numbers. Every
number represents a page request for a specific page (you can see this number as the unique ID of a page). The expected
output is the status of the memory after the application of the algorithm. Note that when a page is inserted in the
memory, it stays at the same position until it is removed from the memory by a page fault.

## Example:

Given:

* N = 3,
* REFERENCE LIST = \[1, 2, 3, 4, 3, 2, 5\],

```
  * 1 is read, page fault --> free memory available, memory = [1];
  * 2 is read, page fault --> free memory available, memory = [1, 2];
  * 3 is read, page fault --> free memory available, memory = [1, 2, 3];
  * 4 is read, page fault --> LRU = 1, memory = [4, 2, 3];
  * 3 is read, already in memory, nothing happens;
  * 2 is read, already in memory, nothing happens;
  * 5 is read, page fault --> LRU = 4, memory = [5, 2, 3].
```

So, at the end we have the list ```[5, 2, 3]```, which is what you have to return. If not all the slots in the memory
get occupied after applying the algorithm, fill the remaining slots (at the end of the list) with ```-1``` to represent
emptiness (note that the IDs will always be >= 1).
