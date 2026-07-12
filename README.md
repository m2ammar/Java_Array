# Java Arrays Practice

A collection of Java practice files covering 1D arrays, 2D arrays (matrices), and ArrayList — built while learning array fundamentals and iteration patterns.

## Contents

### 1D Arrays

**`ArrayBLab3.java`**
Generates a random array of 10 integers (0–99) using `Random`, then prints all elements.

**`ArrayBLab4.java`**
Given a fixed array of 10 integers, computes:
- Sum and average
- Largest and smallest value
- Count of even vs odd numbers
- Array reversed and printed

**`ArrayBLab5.java`**
Takes user input for a week's daily temperatures (mapped to day names via a parallel `String[]` array), then computes the average, highest, and lowest temperature for the week.

### 2D Arrays (Matrices)

**`Practice2DBM.java`**
Sums all elements of a hardcoded 3x3 matrix.

**`Practice2DBM2.java`**
Takes a user-defined matrix (rows x columns) as input, then computes and prints the sum of each row and the sum of each column separately.

**`PracticeF.java`**
Takes a user-defined matrix as input, then computes:
- Total sum of all elements
- Highest element
- Lowest element

**`PracticeF2.java`**
Takes a user-defined matrix as input, then computes:
- Sum of each row
- Transpose of the matrix (rows and columns swapped)

**`PracticeF3.java`**
Takes a user-defined matrix as input, then searches for a user-given number and reports its row and column position if found (using nested loop `break` to exit early once a match is located).

**`Array2DPf.java`**
Work in progress — scaffold only.

### ArrayList

**`Arraylist.java`**
Demonstrates basic `ArrayList` operations: adding items, removing an item by index, and replacing an item by index.

## What I Learned

- Iterating and aggregating data (sum, average, max, min) over both 1D and 2D arrays
- Using parallel arrays to map indices to meaningful labels (e.g. days of the week)
- Reading user input dynamically to build arrays/matrices of variable size, instead of hardcoding data
- Row-wise vs column-wise iteration in 2D arrays, and how transpose logic differs from simple row/column sums
- Using `break` to exit nested loops early once a search condition is satisfied
- The difference between fixed-size arrays (`int[]`) and dynamic collections (`ArrayList`)

## Tech
Java, IntelliJ IDEA
