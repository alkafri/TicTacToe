package com.example.tictactoe;

public class Logic {

    public static final char emptyCellChar = '-';

    public static String checkWinner(char[] cells)
    {
        for (int stateNo = 0; stateNo < 8; stateNo++) {
            String value = null;

            switch (stateNo) {
                case 0:
                    value = getAsString(cells[0], cells[1], cells[2]);
                    break;
                case 1:
                    value = getAsString(cells[3], cells[4], cells[5]);
                    break;
                case 2:
                    value = getAsString(cells[6], cells[7], cells[8]);
                    break;
                case 3:
                    value = getAsString(cells[0], cells[3], cells[6]);
                    break;
                case 4:
                    value = getAsString(cells[1] , cells[4] , cells[7]);
                    break;
                case 5:
                    value = getAsString(cells[2] , cells[5] , cells[8]);
                    break;
                case 6:
                    value = getAsString(cells[0] , cells[4] , cells[8]);
                    break;
                case 7:
                    value = getAsString(cells[2] , cells[4] , cells[6]);
                    break;
            }


            //For X winner
            if (value.equals("XXX")) {
                return "X";
            }

            // For O winner
            else if (value.equals("OOO")) {
                return "O";
            }
        }

        for (int i = 0; i < 9; i++) {
            if (cells[i] == emptyCellChar) {
                break;
            }
            else if (i == 8) {
                return "draw"; // if the board is full without any winner
            }
        }

        return null; // if there's still one '-' in any cell
    }


    private static String getAsString(char ch1, char ch2, char ch3) {
        return String.format("%c%c%c",ch1, ch2, ch3);
    }

}
