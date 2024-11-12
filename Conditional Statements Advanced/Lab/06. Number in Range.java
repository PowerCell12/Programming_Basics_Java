import java.io.Console;
import java.util.Scanner;
import java.util.zip.CheckedInputStream;

class MyClass{  
    public static void main(String[] args){  

        var scanner = new Scanner(System.in);

        Double number = Double.parseDouble(scanner.nextLine());

        if (number >= -100 && number <= 100 && number != 0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }  
}  
