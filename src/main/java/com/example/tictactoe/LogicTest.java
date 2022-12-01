package com.example.tictactoe;

public class LogicTest {

    public static void runTests(){
        testGameNotFinished();
        testOWins();
    }

    private static void testGameNotFinished() {
        // must return NULL
        char[] cells = new char[] {
                'X','O','-',
                'X','O','X',
                'O','X','O'
        };
        String winner = Logic.checkWinner(cells);
        System.out.println("winner is "+ winner);
    }

    private static void testOWins() {
        // must return O
        char[] cells = new char[] {
                'X','O','O',
                'X','O','X',
                'O','X','O'
        };
        String winner = Logic.checkWinner(cells);
        System.out.println("winner is "+ winner);
    }

}
