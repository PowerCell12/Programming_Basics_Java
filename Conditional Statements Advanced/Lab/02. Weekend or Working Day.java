import java.io.Console;
import java.util.Scanner;
import java.util.zip.CheckedInputStream;

class MyClass{  
    public static void main(String[] args){  

        var scanner = new Scanner(System.in);

        String day = scanner.nextLine();


        switch (day){

            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"  -> System.out.println("Working day");
            case "Saturday", "Sunday" -> System.out.println("Weekend");
            default -> System.out.println("Error");
        }

    }  
}  
