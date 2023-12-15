import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Arraylab {
    public static void main(String[] args) {
       // System.out.println(Arrays.toString(args));

        int[] a={1,2,3,4};
        int[] b={1,2,3,4};
        String[] s = {"red", "green", "blue" ,"yellow"};
        String[] s1 = {"red", "green", "blue" ,"yellow"};
        System.out.println(Arrays.equals(s,s1));
        System.out.println(s.equals(s1));
//        System.out.println(a.equals(b));  //false
//        System.out.println(a == b);  //false
//        System.out.println(Arrays.equals(a,b)); //true
//        System.out.println(Arrays.compare(a,b));
//        String x="abc";
//        String y="abc";
//        System.out.println(x.equals(y));  //true
        // Access Array Elements
//        int[] age = {2,3,5,56,4};
//        for(int item:age){
//            System.out.println( item);
//        }
        // Compute the Sum and Average of Array Elements
//        int[] nums = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
//        int sum=0;
//        for(int num:nums){
//            sum+=num;
//        }
//        System.out.println("sum = "+sum +"\n"+"average =" +((float)sum/nums.length));
//        int[] arr = new int[11];
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter 10 Elements: ");
//
//        for(int i=0;i<10;i++){
//            arr[i] = input.nextInt();
//        }
//        System.out.print("Enter an Element to Insert: ");
//        arr[arr.length-1] = input.nextInt();
//        System.out.println("\nNow the new array is: ");
//        for(int i=0; i<11; i++)
//            System.out.print(arr[i]+ " ");
//        String s="irfana";
//        System.out.println(s.length());

       // Task 1: Write a program that creates an array of integers with a length of 3.
        // Assign the values 1, 2, and 3 to the indexes. Print out each array element.
//        int[] arr = new int[3];
//        arr[0] = 1;
//        arr[1] = 2;
//        arr[2] = 3;
//        for(int num: arr){
//            System.out.println(num);
//        }
       // Task 2: Write a program that returns the middle element in an array. Give the following values to the integer array: {13, 5, 7, 68, 2} and produce the following output: 7
//        int[] arr = {13, 5, 7, 68, 2};
//        System.out.println(arr[arr.length/2]);
        //Task 3: Write a program that creates an array of String type and initializes it with the strings “red,” “green,” “blue,” and “yellow.” Print out the array length. Make a copy using the clone( ) method. Use the Arrays.toString( ) method on the new array to verify that the original array was copied.
//        String[] s = {"red", "green", "blue" ,"yellow"};
//        System.out.println("Array length = " + s.length);
//        String[] clonedArray = s.clone();
//        clonedArray[3] = "new color";
//        System.out.println("original Array "+Arrays.toString(s));
//        System.out.println("cloned Array "+Arrays.toString(clonedArray));
//Task 4: Write a program that creates an integer array with 5 elements (i.e., numbers). The numbers can be any integers.  Print out the value at the first index and the last index using length - 1 as the index. Now try printing the value at index = length (e.g., myArray[myArray.length] ).  Notice the type of exception which is produced. Now try to assign a value to the array index 5. You should get the same type of exception.
//            int[]  arr = new int[]{1,2,3,4,5};
//            System.out.println("value at the first index-" + arr[0]);
//            System.out.println("value at the last index-" + arr[arr.length-1]);
//            System.out.println("indexing at arr[5]-" + arr[arr.length]);

        //Task 5: Write a program where you create an integer array with a length of 5. Loop through the array and assign the value of the loop control variable (e.g., i) to the corresponding index in the array.
//        int[] arr = new int[5];
//        for(int i=0;i<arr.length;i++){
//            arr[i] = i;
//        }
//        //print the array
//        System.out.println(Arrays.toString(arr));
        //Task 6: Write a program where you create an integer array of 5 numbers. Loop through the array and assign the value of the loop control variable multiplied by 2 to the corresponding index in the array.
//        int[] arr = new int[5];
//        for(int i=0;i<arr.length;i++){
//            arr[i] = i *2;
//        }
//        //print the array
//        System.out.println(Arrays.toString(arr));
        //Task 7: Write a program where you create an array of 5 elements. Loop through the array and print the value of each element, except for the middle (index 2) element.
//        int[] arr = {1,2,3,4,5};
//        for(int i=0;i<arr.length;i++){
//            if (i==2){
//                continue;
//            }
//            System.out.println(arr[i]);
//        }
        //Task 8: Write a program that creates a String array of 5 elements and swaps the first element with the middle element without creating a new array.
//        int[] arr = {1,2,3,4,5};
//        System.out.println("Original Array =" + Arrays.toString(arr));
//        int temp = arr[arr.length/2];
//        arr[arr.length/2] = arr[0];
//        arr[0] = temp;
//        System.out.println("Array after swapping =" + Arrays.toString(arr));
        //Task 9:
        //Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1, 0}. Print the array in ascending order, and print the smallest and the largest element of the array. The output will look like the following:
        //Array in ascending order: 0, 1, 2, 4, 9, 13
        //The smallest number is 0
        //The biggest number is 13
//        int[] arr = {4, 2, 9, 13, 1, 0};
//        Arrays.sort(arr);
//        System.out.println("Array in ascending order: "+Arrays.toString(arr));
//        System.out.println("The smallest number is " +arr[0]);
//        System.out.println("The largest number is " +arr[arr.length-1]);

        //Task 10: Create an array that includes an integer, 3 strings, and 1 double. Print the array.
//        Object[] arr = {1,2,3,"abc","cde","efg",1.3f};
//
//        for(int i=0;i<arr.length;i++){
//            if (arr[i] instanceof String){
//                System.out.println("string");
//            }
//            if (arr[i] instanceof Float){
//                System.out.println("float");
//            }
           //System.out.println(arr[i]);
      // }
       // Task 11: Write some Java code that asks the user how many favorite things they have. Based on their answer, you should create a String array of the correct size. Then ask the user to enter the things and store them in the array you created. Finally, print out the contents of the array.
        //
        //
        //Example
        //How many favorite things do you have?
        //7
        //
        //Enter your thing: phone
        //Enter your thing: tv
        //Enter your thing: xbox
        //Enter your thing: wine
        //Enter your thing: beer
        //Enter your thing: sofa
        //Enter your thing: book
        //Your favorite  things are:
        //phone tv xbox wine beer sofa book
//        Scanner inp = new Scanner(System.in);
//        System.out.println("How many favorite things you have");
//        int n = inp.nextInt();
//        String[]  arr= new String[n];
//        for (int i=0;i<arr.length;i++){
//            System.out.print("Enter your thing:");
//            arr[i] = inp.next();
//        }
//        System.out.print("Your favorite  things are: ");
//        for(String item :arr){
//            System.out.print(item + " ");
 //       }
    }



}



