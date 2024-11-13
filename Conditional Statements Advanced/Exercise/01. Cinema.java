import java.io.Console;
import java.util.Scanner;
import java.util.zip.CheckedInputStream;

class MyClass{  
    public static void main(String[] args){  
        var scanner = new Scanner(System.in);

        String type = scanner.nextLine();

        Integer rows = Integer.parseInt(scanner.nextLine());

        Integer columns = Integer.parseInt(scanner.nextLine());

        if (type.equals("Premiere")){
            System.out.printf("%.2f leva", rows * columns * 12.00);
        }
        else if (type.equals("Normal")){
            System.out.printf("%.2f leva", rows * columns * 7.50);
        }
        else if (type.equals("Discount")){
            System.out.printf("%.2f leva", rows * columns * 5.00);
        }

    }  
}  
