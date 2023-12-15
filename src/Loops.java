import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
//    for (int i=1;i<=12;i++){
//        for (int j=1;j<=12;j++){
//            System.out.print( i * j  + "\t");
//        }
//        System.out.println();
//    }
        //Find the Greatest Common Divisor
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the 2 positive integers");
//        int n1 = input.nextInt();
//        int n2 = input.nextInt();
//        int k =2,gcd=1;
//        while (k<n1 || k<n2){
//            if (n1 % k ==0 && n2 % k ==0){
//                gcd = k;
//            }
//            k++;
//        }
//        System.out.println(gcd);
        //3: Predict Future Tuition
//        double tution = 10000;
//        int i=0;
//        do{
//            i++;
//            tution = tution *1.07;
//        }while (tution<20000);
//        System.out.println("It takes "+ i + " years to double the amount");

        //palindrome
//        String original,reverse = "";
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the string");
//        original = input.nextLine();
//        for (int i=original.length()-1;i>=0;i--){
//            reverse +=original.charAt(i);
//
//        }
//        if (original.equals(reverse)){
//            System.out.println("it is a palindrome");
//        }else {
//            System.out.println("it is not  a palindrome");
//        }
        //pyramid
//        for (int i=1;i<8;i++){
//            for(int j=1;j<i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//guess the game
        int number = (int)(Math.random() *101);
        Scanner input = new Scanner(System.in);
        System.out.println("Guess the number between 1 and 100");
        int guess = 0,guesNum;
        do{
            guesNum = input.nextInt();
            guess++;
            if (guesNum>number){
                System.out.println("too high");
            } else if (guesNum<number) {
                System.out.println("too low");
            }else{
                System.out.println("you got in "+ guess + " guesses");
            }

        }while(number !=guesNum);

    }


}
