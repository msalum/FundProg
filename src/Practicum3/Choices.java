package Practicum3;

public class Choices {
    public static void main(String[] args) {

        System.out.println("Which do you prefer?");
        System.out.println("1. chocolate");
        System.out.println("2. jam");
        System.out.println("3. cookie");
        System.out.println("4. ice-cream");

        int input = TextIO.getlnInt();

        System.out.print("Sorry, I only have ");
        if (input == 1) {
            System.out.print("cookies");
        }
        else if (input == 2) {
            System.out.print("chocolate");
        }
        else if (input == 3) {
            System.out.print("ice-cream");
        }
        else if (input == 4) {
            System.out.print("jam");
        }
        else {
            System.out.print("sweets that are marked with 1..4");
        }
        System.out.println(".");
    }
}
