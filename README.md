# Groovy 'return' in each Loop
This example demonstrates a common Groovy pitfall: using `return` inside an `each` loop to exit the method prematurely.  The `return` statement only exits the loop, not the method itself.

## Bug
The `myMethod` function intends to stop execution when the input list contains the string "quit". However, due to the `return` statement's behavior within the `each` loop, the code continues to execute after the loop, printing "This line is always executed after the loop".

## Solution
The solution involves using a more suitable control structure such as a `for` loop with a `break` statement or a conditional check before the `each` loop.