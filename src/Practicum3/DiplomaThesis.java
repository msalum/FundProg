package Practicum3;

public class DiplomaThesis {
    //Write a program that asks the user for the average grade and the grade for diploma thesis.
    // Then it prints out whether a student with these results would be given Cum Laude.
    // Cum Laude is given only when average grade is greater than 4.5 and grade for diploma thesis is 5.
    public static void main(String[] args) {

        System.out.println("Insert your avarage grade:");
        double avgGrade = TextIO.getlnDouble();

        System.out.println("Insert your thesis grade:");
        int thesisGrade = TextIO.getlnInt();

        // 3.3 <== 4.5 - false /&&/ 4 !=5 -False : && False
        // 4.7 <== 4.5 - true /&&/ 4 ! =5 - True & True
        // 4.5 <== 4.5 -true /&&/ 5! = 5 - true && false
        // 4.8 <== .....  .....          - false && false


        {if (avgGrade <= 4.5 && thesisGrade != 5)
                System.out.println("Sorry your grade is not high enough");
            else
                System.out.println("YEAH! Cum Laude for you!");
        }

}
    }

