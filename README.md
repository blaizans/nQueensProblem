# nQueens Puzzle Solver

The nQueens puzzle involves placing n queens on an n-by-n chessboard so that no queen can attack another queen. This implementation solves the nQueens puzzle using a backtracking algorithm in Java.

## Problem Description

The challenge is to place n queens on an n-by-n chessboard in such a way that no two queens threaten each other. In chess, a queen can move horizontally, vertically, and diagonally. Therefore, no two queens can share the same row, column, or diagonal.
<img src="https://github.com/blaizans/nQueensProblem/assets/99187215/30dc415e-c4d2-4ee8-8177-5152070caeb0" alt="Untitled design" width="400"/>



### Solution Approach

The backtracking algorithm works by systematically placing queens column by column, backtracking whenever a queen cannot be placed without threatening another queen. The algorithm explores all possible configurations until it finds a valid arrangement or exhausts all possibilities.

## Implementation

The implementation utilizes Java to solve the nQueens puzzle using a recursive backtracking approach. It consists of the following main components:

- **NQueenProblem.java**: Contains the main logic for solving the nQueens puzzle.
- **Main.java**: Provides an example usage of the `NQueenProblem` class, allowing users to input the board size and find a solution for the nQueens puzzle.

### Usage

To use the nQueens puzzle solver:

1. Clone or download the repository.
2. Compile the Java files.
3. Run the `Main` class, providing the desired board size as input.
