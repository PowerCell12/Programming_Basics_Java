import java.io.Console;
import java.util.Scanner;
import java.util.zip.CheckedInputStream;

class MyClass{  
    public static void main(String[] args){  
        var scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        String day = scanner.nextLine();
        Double amount = Double.parseDouble(scanner.nextLine());

        Double typePrice = 0.0;
        boolean display = true;

        switch (day){
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"  -> 
            {    

                switch (type) {
                    case "banana":
                        typePrice = 2.50;
                        break;
                    case "apple":
                        typePrice = 1.20;
                        break;
                    case "orange":
                        typePrice = 0.85;
                        break;
                    case "grapefruit":
                        typePrice = 1.45;
                        break;
                    case "kiwi":
                        typePrice = 2.70;
                        break;
                    case "pineapple":
                        typePrice = 5.50;
                        break;
                    case "grapes":
                        typePrice = 3.85;
                        break;
                    default: display = false; 
                }

            break; }             
            case "Saturday", "Sunday" -> {


                switch (type) {
                    case "banana":
                        typePrice = 2.70;
                        break;
                    case "apple":
                        typePrice = 1.25;
                        break;
                    case "orange":
                        typePrice = 0.90;
                        break;
                    case "grapefruit":
                        typePrice = 1.60;
                        break;
                    case "kiwi":
                        typePrice = 3.00;
                        break;
                    case "pineapple":
                        typePrice = 5.60;
                        break;
                    case "grapes":
                        typePrice = 4.20;
                        break;
                    default: display = false;
                }


                break;
            
            }
            default -> display = false;
        }

        if (display){
            Double final1 = typePrice  * amount;
            System.out.printf("%.2f", final1);
        }
        else{
            System.out.println("error");
        }

    }  
}  
