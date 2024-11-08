import java.util.Scanner;
import java.util.zip.CheckedInputStream;

class MyClass{  
    public static void main(String[] args){  

        var scanner = new Scanner(System.in);

        int grade  = Integer.parseInt(scanner.nextLine());

        if (grade >= 5){
            System.out.println("Excellent!");
        }


    }  
}  
