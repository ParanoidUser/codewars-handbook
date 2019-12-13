# [The Office II - Boredom Score](https://www.codewars.com/kata/the-office-ii-boredom-score "https://www.codewars.com/kata/57ed4cef7b45ef8774000014")

Every now and then people in the office moves teams or departments. Depending what people are doing with their time they can become more or less boring. Time to assess the current team.

You will be provided with an array of `Person` objects with each instance containing the name and department for a staff member.
```
public class Person {
  public final String name;        // name of the staff member
  public final String department;  // department they work in
}
```

Each department has a different boredom assessment score, as follows:

accounts = 1<br>
finance = 2 <br>
canteen = 10 <br>
regulation = 3 <br>
trading = 6 <br>
change = 6<br>
IS = 8<br>
retail = 5<br> 
cleaning = 4<br>
pissing about = 25<br>

Depending on the cumulative score of the team, return the appropriate sentiment:

<=80: 'kill me now'<br>
< 100 & > 80: 'i can handle this'<br>
100 or over: 'party time!!'