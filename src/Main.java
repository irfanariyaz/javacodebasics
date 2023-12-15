public class Main {
    public static void main(String[] args) {
    //1. Integer
    int a=10;
    int b=20;
    int sum = a +b;
    System.out.println("Sum of 2 integers variables: "+ sum);
    //2.Double
    double c = 10.223;
    double d = 333.22;
    double dsum = c + d;
    System.out.println("Sum of 2 double variables: "+ dsum);
    //3.Integer + Double
    int e = 10;
    double f = 333.22;
    double res = e + f;
    System.out.println("Sum: " +res +" and the type of sum is double"  );
        // Write a program that declares two integer variables, assigns an
        // integer to each, and divides the larger number by the smaller number.
        // Assign the result to a variable. Print out the result.
        // Now change the larger number to a decimal. What happens? What corrections are needed?
    double ans = a/(float)b ;//10/20
    System.out.println("Division of 2 int variables: "+ ans  );
    /*Write a program that declares two double variables, assigns a number to each, and divides the larger by the smaller number.
    Assign the result to a variable. Print out the result. Now, cast the result to an integer. Print out the result again.
    c = 10.223;
    d = 333.22;*/
    double ans1 = d/b ;// 333.22/10.223
    System.out.println("Division of 2 double variables: "+ ans1 +" cast to int-->"+ (int)ans1);

    /*Write a program that declares two integer variables, x and y, and assigns the number 5 to x and the number 6 to y.
     Declare a variable q and assign y/x to it and print q. Now, cast y to a double and assign it to q. Print q again.
     */
     int x = 5;
     int y = 6;
     double q = (double)y/x;
     System.out.println("q = " + q);

     //Write a program that declares a named constant and uses it in a calculation. Print the result.
     final  double PI = 3.14;
     System.out.println("Constant PI =" + PI);


      /*  Write a program where you create three variables that represent products at a cafe.
        The products could be beverages like coffee, cappuccino, espresso, green tea, etc.
         Assign prices to each product. Create two more variables called subtotal and totalSale and
        complete an “order” for three items of the first product, four items of the second product, and
        two items of the third product. Add them all together to calculate the subtotal.
        Create a constant called SALES_TAX and add sales tax to the subtotal to obtain the totalSale amount.
                Be sure to format the results to two decimal places.*/
        double coffee = 20;
        double cappuccino = 22.3;
        double espresso = 10.9;
        double green_tea = 8.92;
        double subtotal ,totalSale;
        totalSale = (3 * coffee) + (4 * cappuccino) + (2 * espresso);
        System.out.println(" totalSale = " + totalSale);
        final float SALES_TAX = 0.05f;
        subtotal =totalSale+(totalSale * SALES_TAX);
        System.out.println("total amount to the order = " + String.format("%.2f", subtotal));



    }
}