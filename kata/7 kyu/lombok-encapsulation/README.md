# [Lombok Encapsulation](https://www.codewars.com/kata/lombok-encapsulation "https://www.codewars.com/kata/5a03295680171ffd7b0000c7")

In Java, we have a very powerful library named Lombok. It helps to reduce the boilerplate code.

This Kata is a challenge created for you to learn how to use [lombok](https://projectlombok.org/).

Giving the following class:

    public class EncapsulationDemo{
      public int number;
      public String stringValue;
      public Object anObject;
    }

We have to do the following modifications to properly encapsulate info:

* make fields private
* provide accessors to the internal fields ( setters/getters )
* provide an empty constructor to support Java Beans specification
* Add a constructor that can receive parameters for all of the fields

Note: make sure if you don't use Lombok to enforce proper naming conventions.