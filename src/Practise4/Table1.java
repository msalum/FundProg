package Practise4;

import Practicum3.TextIO;

public class Table1 {

    /* add table using two loops,

        1 0 0 0 0 0 0
        0 1 0 0 0 0 0
        0 0 1 0 0 0 0
        0 0 0 1 0 0 0
        0 0 0 0 1 0 0
        0 0 0 0 0 1 0
        0 0 0 0 0 0 1

        Let the size of the table be easily changeable - you could even ask user to input the size.

     */

    public static void main(String[] args) {


         // System.out.println("Please input the size of the table");

        // int input = TextIO.getlnInt();

        int input = 10;
        for (int row = 0; row <= input; row++) {

            for (int column = 0; column <= input; column++) {

                if(row == column)
                    System.out.print(1 + " ");

                else
                System.out.print(0+ " ");

            }

            System.out.println();
        }

    }
}
