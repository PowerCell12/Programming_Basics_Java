import java.util.Scanner;

class MyClass{  
    public static void main(String[] args){  

        var scanner = new Scanner(System.in);

        double meters = Double.parseDouble(scanner.nextLine());

        double finalPrice = meters * 7.61;

        double discount = finalPrice * 0.18;

        double finalPriceWithDiscount = finalPrice - discount;

        System.out.println("The final price is: " + finalPriceWithDiscount + " lv.");
        System.out.println("The discount is: " + discount + " lv.");
        
       
         
    }  
}  
