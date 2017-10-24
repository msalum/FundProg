package Practicum3;

public class OddorEven {

    public static void main(String[] args) {

    //Write a program that lets the user insert a number and prints out whether the number in odd or even.

        int number = TextIO.getlnInt();

        System.out.println("Insert your number:");

        if(0 == number % 2)
            System.out.println("Your number is even");
        else
            System.out.println("Yournumber is odd");

    }
}
