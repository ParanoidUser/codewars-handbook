# [Lombok Builder](https://www.codewars.com/kata/lombok-builder "https://www.codewars.com/kata/5a04863f06d5b6387c0000a5")

Having this class:

    public class People{
       public int age;
       public String name;
       public String lastName;
       String GREET="hello";
       
       public String greet(){
         return GREET+" my name is "+name;
       }
     }
     
We want to:

* Encapsulate properly the class by providing read accessors (setters are not required for this Kata).
* Implement the Builder design Pattern.
* Additionally we have allegedly a JIT compiler and we want to do some micro-optimization by marking constants in the code.

## Constants

In Java, constants are creating by adding the final keyword, but only primitives are true constants if we have objects that are not primitives marked as constants they actually have their memory location constant, not the values. It's pretty useful to optimize memory in JIT compilers since they can actually reserve memory before we use the variables and having the confidence in that their memory locations will not be changed through the scope.

## Builder Design Pattern

This design pattern help us create instances of the object by specifying all of the data in (Dementor) chain of calls style in any order.
The object creation is optimized by creating the instance only when the build method is called.
If we call a method twice in the builder the value of the field will be the second set.

Note: If you don't use Lombok for this Kata ensure proper naming conventions are followed.