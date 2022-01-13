# [Driving School Series #2](https://www.codewars.com/kata/driving-school-series-number-2 "https://www.codewars.com/kata/589b1c15081bcbfe6700017a")

Fast & Furious Driving School's (F&F) charges for lessons are as below:

<p><table>
  <tr>
    <th>Time</th>
    <th>Cost</th>
  </tr>
  <tr>
    <td>Up to 1st hour</td>
    <td>$30</td>
  </tr>
  <tr>
    <td>Every subsequent half hour**</td>
    <td>$10</td>
  </tr>
  <tr>
  <td><h6>** Subsequent charges are calculated by rounding up to nearest half hour.</h6></td>
  </tr>
</table>


<p>For example, if student X has a lesson for 1hr 20 minutes, he will be charged $40 (30+10) for 1 hr 30 mins and if he has a lesson for 5 minutes, he will be charged $30 for the full hour. 

Out of the kindness of its heart, F&F also provides a 5 minutes grace period. So, if student X were
to have a lesson for 65 minutes or 1 hr 35 mins, he will only have to pay for an hour or 1hr 30
minutes respectively.

For a given lesson time in minutes (min) , write a function <i>cost</i> to calculate how much the
lesson costs. Input is always > 0.
