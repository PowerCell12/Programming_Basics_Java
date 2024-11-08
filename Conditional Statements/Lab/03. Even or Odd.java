import java.util.Scanner;
import java.util.zip.CheckedInputStream;

class MyClass{  
    public static void main(String[] args){  

        var scanner = new Scanner(System.in);

        int firstNumber  = Integer.parseInt(scanner.nextLine());
        

        if (firstNumber % 2 == 0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }

    }  
}  
