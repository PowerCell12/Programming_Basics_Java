import java.io.Console;
import java.util.Scanner;
import java.util.zip.CheckedInputStream;

class MyClass{  
    public static void main(String[] args){  

        var scanner = new Scanner(System.in);

        Integer number = Integer.parseInt(scanner.nextLine());

        if ((number >= 100 && number <= 200) || number == 0){
        }
        else{
            System.out.println("invalid");
        }
   
    }  
}  
