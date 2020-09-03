# [Merging Phone Numbers](https://www.codewars.com/kata/merging-phone-numbers "https://www.codewars.com/kata/59565018bf41d39dc5000043")

Assume you have an application handling customers of your company 'ACME Incorporated'. In order for 'ACME Incorporated' to stay in contact with customers, they may give you their phone numbers. Your application has worked fine and dandy so far. However, you noticed that your customers might change their phone numbers from time to time. You need to implement a way for the customers to add (and modify) phone numbers.

You anticipated that a customer might have more than one phone number, for example his land line and his mobile. In your application, each phone number consists of its type (a String, e.g. "land line" or "business") and the actual number (a String).

## Task

You need to merge a given list of phone numbers with a list of new phone numbers in a specific way.

The merged list should contain both the phone numbers from the old list, als well as those from the new list, with the following limitations:

- The merged list must not contain more than one number of a given type.
- If phone numbers with the same type exist in both lists, the merged list must only contain the phone number from the list of new phone numbers. For example, if a customer changes their mobile phone number, merged list must not contain the old mobile phone number, but rather the new one.

## Details

- The given lists will never be null
- No given list will contain duplicate phone numbers with regard to type
- The order of elements in the merged list does not matter