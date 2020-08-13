# [Hide password from jdbc url](https://www.codewars.com/kata/hide-password-from-jdbc-url "https://www.codewars.com/kata/5a726f16373c2ee6c60000db")

We have to create a function that receives a connection string with password included and you have to mask the password i.e. change password by asterisks.

Preconditions:
 * non empty valid url
 * password always next to string section `password=`
 * assume password will not contain ampersand sign for sake of simplicity
 * to make it more real it has non ASCII characters
 * "password=" and "user" will occur only once


> empty passwords are not validated but best solutions take empty passwords into account

## Example:

```
Input:  jdbc:mysql://sdasdasdasd:szdasdasd:dfsdfsdfsdf/sdfsdfsdf?user=root&password=12345
Output: jdbc:mysql://sdasdasdasd:szdasdasd:dfsdfsdfsdf/sdfsdfsdf?user=root&password=*****
```