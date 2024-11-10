import java.util.Scanner;
import java.util.zip.CheckedInputStream;

class MyClass{  
    public static void main(String[] args){  

        var scanner = new Scanner(System.in);

        Double budget = Double.parseDouble(scanner.nextLine());
        Double broi = Double.parseDouble(scanner.nextLine());
        Double PriceBroi = Double.parseDouble(scanner.nextLine());
  
        Double dekorPrice = budget * 0.1;
        Double oblekbloPrice = broi * PriceBroi;
        
        if (broi > 150){
            oblekbloPrice = oblekbloPrice - oblekbloPrice * 0.1;
        }

        Double finalPrice = dekorPrice + oblekbloPrice;

        if (budget >= finalPrice){
            System.out.printf("Action!%nWingard starts filming with %.2f leva left.", budget - finalPrice);
        }
        else{
            System.out.printf("Not enough money!%nWingard needs %.2f leva more.", finalPrice - budget);
        }


    }  
}  
