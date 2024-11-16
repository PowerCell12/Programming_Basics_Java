import java.io.Console;
import java.util.Scanner;
import java.util.zip.CheckedInputStream;

class MyClass{  
    public static void main(String[] args){  
        var scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        Integer amount = Integer.parseInt(scanner.nextLine());
        Double price = 0.0;
        Integer budget = Integer.parseInt(scanner.nextLine());

        if (type.equals("Roses")){
            price = 5.0;
        }
        else if (type.equals("Dahlias")){
            price = 3.80;
        }
        else if (type.equals("Tulips")){
            price = 2.80;
        }
        else if (type.equals("Narcissus")){
            price = 3.00;
        }
        else if (type.equals("Gladiolus")){
            price = 2.50;
        }

        Double finalAmount  = amount * price;

        if (type.equals("Roses") && amount > 80){
            finalAmount *= 0.9;
        }
        else if (type.equals("Dahlias") && amount > 90){
            finalAmount *= 0.85;
        }
        else if (type.equals("Tulips") && amount > 80){
            finalAmount *= 0.85;
        }
        else if (type.equals("Narcissus") && amount < 120){
            finalAmount *= 1.15;
        }
        else if (type.equals("Gladiolus") && amount < 80){
            finalAmount *= 1.20;
        }

        if (budget >= finalAmount){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", amount, type, budget - finalAmount);
        }
        else{
            System.out.printf("Not enough money, you need %.2f leva more.", finalAmount - budget);
        }



    }  
}  
