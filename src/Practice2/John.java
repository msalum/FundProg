package Practice2;

public class John {
    public static void main(String[] args){

        System.out.print("Insert a name: ");

        String name = TextIO.getlnString();

        System.out.println("The users name seems to be " + name);



        int nameLength = name.length();

        System.out.println(nameLength);

        System.out.println("four".length());
    }
}
