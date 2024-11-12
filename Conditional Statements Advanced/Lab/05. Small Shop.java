import java.io.Console;
import java.util.Scanner;
import java.util.zip.CheckedInputStream;

class MyClass{  
    public static void main(String[] args){  

        var scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        String place = scanner.nextLine();
        Double count = Double.parseDouble(scanner.nextLine());

        Double moneyType = 0.0;

        if (place.equals("Sofia")){

            switch (type) {
                case "coffee":
                    moneyType = 0.50;
                    break;
            
                case "water":
                    moneyType  = 0.80;
                    break;

                case "beer":
                    moneyType = 1.20;
                    break;

                case "sweets":
                    moneyType = 1.45;
                    break;

                case "peanuts":
                    moneyType = 1.60;
                    break;
            }
        }
        else if (place.equals("Plovdiv")){
            
            switch (type) {
                case "coffee":
                    moneyType = 0.40;
                    break;
            
                case "water":
                    moneyType  = 0.70;
                    break;

                case "beer":
                    moneyType = 1.15;
                    break;

                case "sweets":
                    moneyType = 1.30;
                    break;

                case "peanuts":
                    moneyType = 1.50;
                    break;
            }
        
        }
        else if (place.equals("Varna")){

            switch (type) {
                case "coffee":
                    moneyType = 0.45;
                    break;
            
                case "water":
                    moneyType  = 0.70;
                    break;

                case "beer":
                    moneyType = 1.10;
                    break;

                case "sweets":
                    moneyType = 1.35;
                    break;

                case "peanuts":
                    moneyType = 1.55;
                    break;
            }
        
        }

        System.out.println(moneyType * count);

    }  
}  
