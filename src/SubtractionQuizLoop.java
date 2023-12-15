import java.util.Scanner;

public class SubtractionQuizLoop {
    public static void main(String[] args) {
    //set no of questions
//        int NO_OF_QUESTIONS = 5,ans,correctAns =0;
//        Scanner input = new Scanner(System.in);
//        while ( NO_OF_QUESTIONS >0){
//            int n1 = (int) (Math.random() *10);
//            int n2 = (int) (Math.random() *10);
//            if (n1 < n2) {
//                int temp = n1;
//                n1 = n2;
//                n2 = temp;
//            }
//            System.out.println( n1 +" - "+ n2 +" =");
//            ans = input.nextInt();
//            if(ans == (n1 - n2)){
//                correctAns++;
//            }
//            NO_OF_QUESTIONS--;
//
//        }
//        System.out.println("you got "+ correctAns +"/5 correct answers");
        //Controlling a Loop with a Sentinel Value
        int sum =0,num;
        Scanner input = new Scanner(System.in);

        do{
            System.out.println("Enter an int value (the program exits if the input is 0): ");
            num = input.nextInt();
            sum+=num;

        }while (num!=0);
        System.out.println("Sum = "+ sum);
    }
}
