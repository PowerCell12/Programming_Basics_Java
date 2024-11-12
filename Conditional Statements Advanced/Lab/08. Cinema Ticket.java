import java.io.Console;
import java.util.Scanner;
import java.util.zip.CheckedInputStream;

class MyClass{  
    public static void main(String[] args){  

        var scanner = new Scanner(System.in);

        String number = scanner.nextLine();


        switch (number){
            case "Monday" -> System.out.println(12);
            case "Tuesday" -> System.out.println(12);
            case "Wednesday" -> System.out.println(14);
            case "Thursday" -> System.out.println(14);
            case "Friday" -> System.out.println(12);
            case "Saturday" -> System.out.println(16);
            case "Sunday" -> System.out.println(16);
        }

    }  
}  
