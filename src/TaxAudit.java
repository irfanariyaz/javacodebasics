import java.util.Scanner;

public class TaxAudit {
    public static void main(String[] args) {
        // Select the  filing status from input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the  filing status");
        System.out.println("1.Single\n2.Married Filing Jointly \n3. Married Filing Separately \n4. Head of Household. ");
        int x = input.nextInt();
        double taxRate=0;
        System.out.println("Enter your income");
        double income = input.nextDouble();
        switch (x){
            //calculate tax for Single
            case 1:
                     if (income > 0 && income <=8350){
                         taxRate = 0.1;
                     }else if (income >=8351 && income <=33950) {
                         taxRate = 0.15;
                     }else if (income >=33951 && income <=82250) {
                         taxRate = 0.25;
                     }else if (income >=82251 && income <=171550) {
                         taxRate = 0.28;
                     }else if (income >=171550 && income <=372950) {
                         taxRate = 0.33;
                     }else{
                         taxRate = 0.35;
                     }
                     break;
            //calculate tax for Married Filing Jointly
            case 2:

                if (income > 0 && income <=16700){
                    taxRate = 0.1;
                }else if (income >=16701 && income <=67900) {
                    taxRate = 0.15;
                }else if (income >=67900 && income <=137050) {
                    taxRate = 0.25;
                }else if (income >=137051 && income <=208850) {
                    taxRate = 0.28;
                }else if (income >=208851 && income <=372950) {
                    taxRate = 0.33;
                }else{
                    taxRate = 0.35;
                }
                break;
                //calculate tax for Married Filing Separately
            case 3:

                if (income > 0 && income <=8350){
                    taxRate = 0.1;
                }else if (income >=8351 && income <=33950) {
                    taxRate = 0.15;
                }else if (income >=33951 && income <=68525) {
                    taxRate = 0.25;
                }else if (income >=68526 && income <=104425) {
                    taxRate = 0.28;
                }else if (income >=104425 && income <=186475) {
                    taxRate = 0.33;
                }
                else{
                    taxRate = 0.35;
                }
                break;
                // calculate tax forHead of House
            case 4:

                if (income > 0 && income <=11950){
                    taxRate = 0.1;
                }else if (income >=11951 && income <=45500) {
                    taxRate = 0.15;
                }else if (income >=45501 && income <=117450) {
                    taxRate = 0.25;
                }else if (income >=117451 && income <=190200) {
                    taxRate = 0.28;
                }else if (income >=190201 && income <=372950) {
                    taxRate = 0.33;
                }else{
                    taxRate = 0.35;
                }
                break;
            default:
                System.out.println("Enter a valid entry");
        }
        double taxAmt = income * taxRate;

        System.out.println("Tax Amount to be paid is :$" + String.format("%.2f",taxAmt));


    }
}
