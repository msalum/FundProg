package Practicum3;

public class Couplesage {

    /*Write a program that asks the user for ages of a couple (lets the user insert two ages).
    The program then replies with how a couple with these ages is looked at*/

    public static void main(String[] args) {

        System.out.println("Insert age of a man:");

        int avAgeman = TextIO.getlnInt();

        System.out.println("Insert age of a woman:");

        int avAgewoman = TextIO.getlnInt();

        int agediff = Math.abs (avAgeman - avAgewoman); // Done _ Math.abs (Method)

        if (5 < agediff && agediff <= 10)
            System.out.println("Quite OK");

        else if (11 < agediff && agediff <= 15)
            System.out.println("Not that OK");

        else if (agediff > 15)
            System.out.println("Not OK");

        else
            System.out.println("VERY OK");



    }
}
