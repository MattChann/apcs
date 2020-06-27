# wrapBinarySearch
#### What is meant by y = log2x ? Express its meaning in a .
2^y = x

#### What does its graph look like?
It looks similar to the graph of y=sqrt(x) and is the reflection of y=2^x over the line y=x.

## Recursive Solution
### 0. Problem
Find the index of a value in an ordered list.
### 1. Recursive Abstraction
When I am asked to **find the index of a value in an ordered list (of length n)**, the recursive abstraction can **find the index of that value in half of the ordered list (length n/2)**.
### 2. Parts of This Solution that Correspond to the Six Parts of a Generalized Recursive Solution
#### Decision(s) Between Base Case and Recursive Cases
Is the low limit greater than the high limit?
Is the comparison between the value and the page to check's value equal to 0?
#### Solution to the Base Case(s)
The index is -2.
The index is the arithmetic mean of the limits.
#### Solution to the Recursive Cases
##### - Combining
Is the current comparison negative?
##### - Process Leftovers
Determine the page to check.
Compare the value with the page to check's value.
##### - Recursive Abstraction
The index is the output of finding the index of the value in the ordered list with the same low limit and high limit equal to one less than the arithmetic mean of the original limits.
The index is the output of finding the index of the value in the ordered list with the low limit equal to one more than the arithmetic mean of the original limits and the same high limit.
