import java.util.Scanner;
import java.util.zip.CheckedInputStream;

class MyClass{  
    public static void main(String[] args){  

        var scanner = new Scanner(System.in);

        Double runner1 = Double.parseDouble(scanner.nextLine());

        double boonus =  0;


        if (runner1 <= 100){
            boonus = 5;
         }
        else if (runner1 > 100 && runner1  < 1001){
            boonus = runner1 * 0.2;
        }
        else if (runner1 > 1000){
            boonus+= runner1 * 0.1;
        }

        
        if (runner1 % 2 == 0){
            boonus += 1;
        }

        if (runner1 % 10 == 5){
            boonus += 2;
        }


        System.out.println(boonus);
        System.out.println(boonus + runner1);


       
    }  
}  
