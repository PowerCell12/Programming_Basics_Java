import java.util.Scanner;
import java.util.zip.CheckedInputStream;

class MyClass{  
    public static void main(String[] args){  

        var scanner = new Scanner(System.in);

        String type  = scanner.nextLine();


        if (type.equals("square")){
            Double final1 = Double.parseDouble(scanner.nextLine());
            Double final2 = final1 * final1;
            System.out.printf("%.2f", final2);
        }
        else if (type.equals("rectangle")){
            Double final1 = Double.parseDouble(scanner.nextLine());
            Double final2 = Double.parseDouble(scanner.nextLine());
            Double final3 = final1 * final2;
            System.out.printf("%.3f", final3);
        }
        else if (type.equals("circle")){
            Double final1 = Double.parseDouble(scanner.nextLine());
            Double final2 = final1  * final1 * Math.PI; 
            System.out.printf("%.3f", final2);
        }  
        else if (type.equals("triangle")){
            Double final1 = Double.parseDouble(scanner.nextLine());
            Double final2 = Double.parseDouble(scanner.nextLine());
            Double final4 =  (final1 * final2) / 2;
            System.out.printf("%.3f", final4);
        }
   

       
    }  
}  
