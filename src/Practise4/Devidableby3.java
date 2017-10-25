package Practise4;

public class Devidableby3 {

    // all numbers from 0 to 30 that are devidable by 3

    public static void main(String[] args) {

        for (int i = 30; i >= 0; i--) {

            if (i % 3 == 0)

            System.out.print(i + " ");

        }
    }
}
