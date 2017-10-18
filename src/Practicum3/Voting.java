package Practicum3;

public class Voting {
    public static void main(String[] args) {

        System.out.println("There was a voting held.");

        System.out.println("How many were in favor?");
        int inFavor = TextIO.getlnInt();
        System.out.println("How many were against?");
        int against = TextIO.getlnInt();

        System.out.println("How many vetoed?");
        int veto = TextIO.getlnInt();

        if (inFavor > against && veto == 0) {
            System.out.println("The voting was successful");
        }
        else {
            System.out.println("The voting was not successful.");
        }

    }
}
