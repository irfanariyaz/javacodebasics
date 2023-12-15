import java.util.Scanner;

public class conditionals {
    public static void main(String[] args){
      //Write a program that accepts an integer between 1 and 7 from the user. Use a switch statement to print out the corresponding weekday. Print “Out of range” if the number is less than 1 or greater than 7. Do not forget to include “break” statements in each of your cases.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the  integer between 1 and 7");
        int x = input.nextInt();
        switch (x){
            case 1: System.out.println("Monday");
                    break;
            case 2: System.out.println("Tuesday");
                break;
            case 3: System.out.println("Wednesday");
                break;
            case 4: System.out.println("Thursday");
                break;
            case 5: System.out.println("Friday");
                break;
            case 6: System.out.println("Saturday");
                break;
            case 7: System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter a valid digit");
        }

        //Write a program that uses if-else-if statements to print out grades A, B, C, D, F, according to the following criteria:
        //A: 90-100
        //B: 80-89
        //C: 70-79
        //D: 60-69
        //F: <60
    }
}
