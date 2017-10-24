package Practicum3;


/*Write a program that asks user to insert a password.
The program checks if the password is right and responds accordingly.
Keep in mind that double equation marks (==) cannot be used when checking the equality of Strings in Java,
you must use String's "equals"-method.
 */
public class Password {
    public static void main(String[] args){
        System.out.println("Insert a PASSWORD:");
        String password = TextIO.getlnString();

        if (password.equals("PASSWORD"))
            System.out.println("TRUE");
        else
            System.out.println("FALSE");

    }
}
