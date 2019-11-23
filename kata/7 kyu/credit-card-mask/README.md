# [Credit Card Mask](https://www.codewars.com/kata/credit-card-mask "https://www.codewars.com/kata/5412509bd436bd33920011bc")

Usually when you buy something, you're asked whether your credit card number, phone number or answer to your most secret question is still correct. However, since someone could look over your shoulder, you don't want that shown on your screen. Instead, we mask it.

Your task is to write a function `maskify`, which changes all but the last four characters into `'#'`.

## Examples
```
Maskify.Maskify("4556364607935616"); // should return "############5616"
Maskify.Maskify("64607935616");      // should return "#######5616"
Maskify.Maskify("1");                // should return "1"
Maskify.Maskify("");                 // should return ""

// "What was the name of your first pet?"
Maskify.Maskify("Skippy");                                   // should return "##ippy"
Maskify.Maskify("Nananananananananananananananana Batman!"); // should return "####################################man!"
```