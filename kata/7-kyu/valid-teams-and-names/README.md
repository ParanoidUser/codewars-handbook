# [Valid teams and names](https://www.codewars.com/kata/valid-teams-and-names "https://www.codewars.com/kata/588d01f0a98ea0d3b8000002")

You are in an IT company which has multiple teams. You will be given a string listing teams together with their members. Each entry starts with a capital letter, followed by a colon, and a comma-separated list of workers' names. The entries themselves are not separated by anything.

A valid team must include at least 2 workers. You have to calculate how many valid teams this company has, and list the names of their members in the format: `{N_OF_VALID_TEAMS}:{COMMA_SEPARATED_NAMES}`.

**Note**: there will always be at least 1 valid team.

## Examples:

```
s = "A:Stefan,Milica,Zvonimir,AndrewH:Richard"
mix(s) == "1:Stefan,Milica,Zvonimir,Andrew"

s = "W:John,John,John,JohnC:Danger,Man"
mix(s) == "2:John,John,John,John,Danger,Man"
```