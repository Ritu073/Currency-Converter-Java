//Making currency converter using java

import java.util.Scanner;
public class currencyConverter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //conversion rates (can be updated with live API)
        double usdToInr=84.10;
        double eurToInr=90.82;
        double gbpToInr=109.02;
        double cadToInr=60.52;
        double audToInr=55.63;

        System.out.println("Welcome to Currency Converter");
        System.out.println("Select the currency to convert from: ");
        System.out.println("1. USD");
        System.out.println("2. EUR");
        System.out.println("3. GBP");
        System.out.println("4. CAD");
        System.out.println("5. AUD");
        System.out.println("6. INR");

        System.out.println("Enter your choice: ");
        int fromCurrency=sc.nextInt();

        System.out.println("Select the currency to convert to: ");
        System.out.println("1. USD");
        System.out.println("2. EUR");
        System.out.println("3. GBP");
        System.out.println("4. CAD");
        System.out.println("5. AUD");
        System.out.println("6. INR");  

        System.out.println("Enter your choice: ");
        int toCurrency=sc.nextInt();

        System.out.println("Enter the amount to convert: ");
        double amount=sc.nextDouble();
        double amountInInr=0;
        double convertedAmount=0;

        //Convert the source currency to INR

        switch (fromCurrency) {
            case 1:
                amountInInr=amount*usdToInr; //USD to INR
                break;
            case 2:
                amountInInr=amount* eurToInr; //EUR to INR
                break;

            case 3:
                amountInInr=amount* gbpToInr; //GBP to INR
                break;

            case 4:
                amountInInr=amount* cadToInr; //CAD to INR
                break;

            case 5:
                amountInInr= amount* audToInr; //AUD to INR
                break;

            case 6: 
                amountInInr=amount;
                break;
        
            default:
                System.out.println("Invalid source currency selected.");
                sc.close();
                return;
        }


        // Conert from INR to the Target currency
        switch (toCurrency) {
            case 1:
            convertedAmount=amountInInr/usdToInr; //INR to USD
            break;
        case 2:
            convertedAmount=amountInInr/ eurToInr; //INR to EUR
            break;

        case 3:
            convertedAmount=amountInInr/ gbpToInr; //INR to GBP
            break;

        case 4:
            convertedAmount=amountInInr/ cadToInr; //INR to CAD
            break;

        case 5:
            convertedAmount= amountInInr/ audToInr; //INR to AUD
            break;

        case 6: 
            convertedAmount=amountInInr;
            break;

        default:
            System.out.println("Invalid target currency selected.");
            sc.close();
        }
    
        System.out.printf("Converted anomut: %.2f%n", convertedAmount);
    }

}
