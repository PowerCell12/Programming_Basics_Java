import java.util.Scanner;
import java.util.zip.CheckedInputStream;

class MyClass{  
    public static void main(String[] args){  

        var scanner = new Scanner(System.in);

        Double speed  = Double.parseDouble(scanner.nextLine());


        if (speed <= 10){
            System.out.println("slow");
        }
        else if  (speed > 10 && speed <= 50){
            System.out.println("average");
        }
        else if  (speed > 50 && speed <= 150){
            System.out.println("fast");
        }
        else if  (speed > 150 && speed <= 1000){
            System.out.println("ultra fast");
        }
        else if (speed > 1000){
            System.out.printf("extremely fast");
        }
        
        
   

       
    }  
}  
