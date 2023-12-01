package org.example;

public class Main {
    public static void main(String[] args) {
        int boardSize = 6; // SET BOARD SIZE, 2 AND 3 WILL THROW EXCEPTION
        NQueenProblem nQueens = new NQueenProblem(boardSize);
        nQueens.solveNQ();
    }
}