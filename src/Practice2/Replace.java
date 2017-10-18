package Practice2;

public class Replace {
    public static void main(String[] args) {
        System.out.print("Insert The last ball: ");

        String words = TextIO.getlnString();

        System.out.println("You inserted " + words);

        System.out.println("the last ball".replace('b', 'c'));
    }
}
