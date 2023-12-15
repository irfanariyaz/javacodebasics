import java.lang.reflect.Array;
import java.util.*;

public class StringManupilations {
    public static void main(String[] args) {
        String s = "Welcome to Java ";
        //Find the length of the string
        System.out.println("Length of thr string is " + s.length());

        //Check if the string is empty
        System.out.println("String Empty? " + s.isEmpty());

        //Trim
        String newStr = "   and Python   ";
        System.out.println("Without Trim  : " + s + newStr);
        System.out.println("Using Trim  : " + s + newStr.trim());

        // toLowerCase()  and  toUpper() method
        System.out.println("String to lowercase  : " + s.toLowerCase());
        System.out.println("String to Uppercase  : " + s.toUpperCase());

        //concat() method
        System.out.println("concatinate 2 string: " + s.concat(newStr.trim()));

        //split() method
        String vowels = "a::b::c::d:e";
        String[] res = vowels.split("::");
        System.out.println("Split the string a::b::c::d:e to  array: " + Arrays.toString(res));

        //charAt()
        System.out.println("character at position 2 is: " + s.charAt(1));

        //compareTo()
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "flag";
        String s4 = "";
        System.out.println("Compare 'hello' and 'hello: " + s1.compareTo(s2));
        System.out.println("Compare 'hello' and 'flag: " + s1.compareTo(s3));
        System.out.println("Compare 'flag' and 'hello: " + s3.compareTo(s2));
        System.out.println("Compare 'flag' and '': " + s3.compareTo(s4));

        //Substrings() method:
        System.out.println("substring : " + s.substring(0, 7));

        // indexOf() method:
        System.out.println("Index of 'e' is " + s.indexOf('e'));

        //contains() method:
        System.out.println("String contains 'Java'? " + s.contains("Java"));

        //replace() method
        System.out.println("Replace 'java' with 'python :" + s.replace("Java", "Python"));

        //Java String replaceAll()
        System.out.println("Replace all 'e' with 'a' :" + s.replaceAll("e", "a"));

        //equals() or "=="
        String s11 = "PerScholas";//  creates a string literal in the string pool
        String s12 = "perScholas";
        String s13 = new String("PerScholas");
        String s14 = "PerScholas";//checks the  string pool and reerences to the same address space as s11
        System.out.println(s11 + " == " + s12 + "? " + s11.equals(s12)); //checks the content inside the object
        System.out.println(s11 + " == " + s13 + "? " + (s11 == s13));
        System.out.println(s11 + " == " + s13 + "? " + (s11 == s14));// check if both points to the same reference

        //ReadingStringFromConsole
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter three words separated by spaces: ");
//        String s31 = input.next();
//        String s32 = input.next();
//        String s33 = input.next();
//        System.out.println("s1 is " + s31);
//        System.out.println("s2 is " + s32);
//        System.out.println("s3 is " + s33);
//        System.out.println("Enter the string: ");
//        input.next();
//        String fullString = input.nextLine();
//        System.out.println("Entered string is :" +fullString);

        //capitalize
        String a = "rfana";
        String capitalizedString = a.substring(0, 1).toUpperCase() + a.substring(1);
        System.out.println(capitalizedString);
        String st = "ASDFHDSFHsdlfhsdlfLDFHSDLFHsdlfhsdlhkfsdlfLHDFLSDKFHsdfhsdlkfhsdlfhsLFDLSFHSDLFHsdkfhsdkfhsdkfhsdfhsdfjeaDFHSDLFHDFlajfsdlfhsdlfhDSLFHSDLFHdlfhs";
        String smallest = "";
        String largest = "";
        int k = 30;
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        String sub = st.substring(0,k);
        smallest = sub;
        largest = sub;

        for(int i=0;i< st.length()-(k-1);i++){
            String subS = st.substring(i,i+3);

            if (subS.compareTo(smallest)< 0){
                smallest = subS;

            }else if (subS.compareTo(largest)>0){
                largest = subS;
            }
            else{
                continue;
            }
        }
        System.out.println(smallest + " " + largest);

        //palindrome
        String str="malayalam";
        StringBuffer rev  = new StringBuffer(str).reverse();
        System.out.println((rev));
        System.out.println(str.compareTo(String.valueOf(rev)) == 0);

        //regular expression
        String input = "";
        input = input.trim();
        if (input.isEmpty()){
            System.out.println(0);
        }
        String[] tokens = input.split("[^A-Za-z]+");
        System.out.println(Arrays.toString(tokens) + tokens.length);
        for (String token : tokens) {
            System.out.println(token);
        }




    }


}
