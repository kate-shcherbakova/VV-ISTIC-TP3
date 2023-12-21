# On assertions

Answer the following questions:

1. The following assertion fails `assertTrue(3 * .4 == 1.2)`. Explain why and describe how this type of check should be done.

2. What is the difference between `assertEquals` and `assertSame`? Show scenarios where they produce the same result and scenarios where they do not produce the same result.

3. In classes we saw that `fail` is useful to mark code that should not be executed because an exception was expected before. Find other uses for `fail`. Explain the use case and add an example.

4. In JUnit 4, an exception was expected using the `@Test` annotation, while in JUnit 5 there is a special assertion method `assertThrows`. In your opinion, what are the advantages of this new way of checking expected exceptions?

## Answer

The assertion assertTrue(3 * .4 == 1.2) in Java is meant to check if the product of 3 multiplied by 0.4 is equal to 1.2. However, due to **floating-point precision issues** in computer arithmetic, the result might not be exactly equal to 1.2.

Floating-point numbers in computers can sometimes result in rounding errors, leading to imprecise calculations. In this case, the multiplication of 3 by 0.4 may not yield the exact value of 1.2 due to these inherent precision issues.

To perform this type of check correctly when dealing with floating-point numbers, you should use an assertion that accounts for a certain level of tolerance or acceptable difference, considering the precision limitations of floating-point arithmetic. 

```java
double result = 3 * 0.4;
double expected = 1.2;
double delta = 0.0001; // Tolerance level

assertEquals(expected, result, delta);
```
