# [Will there be enough space?](https://www.codewars.com/kata/will-there-be-enough-space "https://www.codewars.com/kata/5875b200d520904a04000003")

<h1>The Story:</h1>
Bob is working as a bus driver. However, he has become extremely popular amongst the city's residents. With so many passengers wanting to get aboard his bus, he sometimes has to face the problem of not enough space left on the bus! He wants you to write a simple program telling him if he will be able to fit all the passengers.

<h1>Task Overview:</h1>

You have to write a function that accepts three parameters: 
* `cap` is the amount of people the bus can hold excluding the driver.
* `on` is the number of people on the bus.
* `wait` is the number of people waiting to get on to the bus. 

If there is enough space, return 0, and if there isn't, return the number of passengers he can't take.

<h1>Usage Examples:</h1>

```
enough(10, 5, 5);
// 0, He can fit all 5 passengers
enough(100, 60, 50);
// 10, He can't fit 10 out of 50 waiting
```