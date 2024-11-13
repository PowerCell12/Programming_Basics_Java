import java.io.Console;
import java.util.Scanner;
import java.util.zip.CheckedInputStream;

class MyClass{  
    public static void main(String[] args){  
        var scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        Double amount = Double.parseDouble(scanner.nextLine());

        Double percentage = 0.0;
        boolean display = true;

        if (city.equals("Sofia")){

            if (amount >= 0 && amount <= 500){
                percentage = 0.05;
            }
            else if (amount > 500 && amount <= 1000){
                percentage = 0.07;
            }
            else if (amount > 1000 && amount <= 10000){
                percentage = 0.08;
            }
            else if (amount > 10000){
                percentage = 0.12;
            }
            else{
                display = false;
            }

        }
        else if (city.equals("Varna")){

            if (amount >= 0 && amount <= 500){
                percentage = 0.045;
            }
            else if (amount > 500 && amount <= 1000){
                percentage = 0.075;
            }
            else if (amount > 1000 && amount <= 10000){
                percentage = 0.10;
            }
            else if (amount > 10000){
                percentage = 0.13;
            }
            else{
                display = false;
            }
        }
        else if (city.equals("Plovdiv")){

            if (amount >= 0 && amount <= 500){
                percentage = 0.055;
            }
            else if (amount > 500 && amount <= 1000){
                percentage = 0.08;
            }
            else if (amount > 1000 && amount <= 10000){
                percentage = 0.12;
            }
            else if (amount > 10000){
                percentage = 0.145;
            }
            else {
                display = false;
            }
        }
        else{
            display = false;
        }

        if (display){
            Double finalAmount = percentage * amount;
            System.out.printf("%.2f", finalAmount);
        }
        else{
            System.out.println("error");
        }
    }  
}  
