# Balanced strings

A string containing grouping symbols `{}[]()` is said to be balanced if every open symbol `{[(` has a matching closed symbol `)]}` and the substrings before, after and between each pair of symbols is also balanced. The empty string is considered as balanced.

For example: `{[][]}({})` is balanced, while `][`, `([)]`, `{`, `{(}{}` are not.

Implement the following method:

```java
public static boolean isBalanced(String str) {
    ...
}
```

`isBalanced` returns `true` if `str` is balanced according to the rules explained above. Otherwise, it returns `false`.

Use the coverage criteria studied in classes as follows:

1. Use input space partitioning to design an initial set of inputs. Explain below the characteristics and partition blocks you identified.
2. Evaluate the statement coverage of the test cases designed in the previous step. If needed, add new test cases to increase the coverage. Describe below what you did in this step.
3. If you have in your code any predicate that uses more than two boolean operators, check if the test cases written so far satisfy *Base Choice Coverage*. If needed, add new test cases. Describe below how you evaluated the logic coverage and the new test cases you added.
4. Use PIT to evaluate the test suite you have so far. Describe below the mutation score and the live mutants. Add new test cases or refactor the existing ones to achieve a high mutation score.

Write below the actions you took on each step and the results you obtained.
Use the project in [tp3-balanced-strings](../code/tp3-balanced-strings) to complete this exercise.

## Answer
### Basic structure

1. `isBalanced` method in `StringUtils` class: checks whether a given string contains balanced grouping symbols {}, [], () according to the specified rules. 
2. test methods in `StringUtilsTest.java` class: validate the functionality of the `isBalanced` method by covering various scenarios and edge cases.
   - `testEmptyString`: Tests an empty string, which should return true as per the problem statement.
   - `testSimpleBalancedCases`: Tests simple cases with only one pair of balanced symbols.
   - `testComplexBalancedCases`: Tests more complex cases with multiple pairs of balanced symbols.
   - `testUnbalancedCases`: Tests cases with unbalanced symbols that should return false.
   - `testNestedCases`: Tests cases with nested symbols to ensure correct handling of nested structures.

### Questions

#### 1. Use input space partitioning to design an initial set of inputs. Explain below the characteristics and partition blocks you identified.

##### Characteristics
1. Empty string: Test if an empty string is considered balanced.
2. Single type of grouping symbols: Test strings containing only one type of grouping symbols {}, [], ().
3. Multiple types of grouping symbols: Test strings containing multiple types of grouping symbols.
4. Balanced strings: Test strings that follow the balanced pattern according to the defined rules.
5. Unbalanced strings: Test strings that break the balance by having mismatched or improperly nested grouping symbols.
6. Nested grouping symbols: Test strings with nested grouping symbols to check if the method handles nested structures correctly.

##### Partition Blocks
1. Empty String Partition:
   - "" - an empty string
2. Single Type of Symbols Partition:
   - "{}, (), []" - strings containing only one type of grouping symbols
3. Multiple Types of Symbols Partition:
   - "{}[]()"
   - "{[]}", "[{}]", "(){}[]", etc. - strings containing multiple types of grouping symbols
4. Balanced Strings Partition:
   - "{}()[]"
   - "{[()]}", "({})", "{[(){}]}", etc. - strings that follow the balanced pattern
5. Unbalanced Strings Partition:
   - "[]{", "()[)", "((())", etc. - strings with unmatched or improperly nested symbols
6. Nested Symbols Partition:
   - "{[()]}", "({[()]})", "{{[()]}}", etc. - strings with nested symbols

#### 2. Evaluate the statement coverage of the test cases designed in the previous step. If needed, add new test cases to increase the coverage. Describe below what you did in this step.

