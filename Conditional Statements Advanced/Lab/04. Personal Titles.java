import java.io.Console;
import java.util.Scanner;
import java.util.zip.CheckedInputStream;

class MyClass{  
    public static void main(String[] args){  

        var scanner = new Scanner(System.in);

        Double age = Double.parseDouble(scanner.nextLine());
        String type = scanner.nextLine();

        if (age >= 16 && type.equals("m")){
            System.out.println("Mr.");
        }
        else if (age < 16 && type.equals("m")){
            System.out.println("Master");    
        }
        else if (age >= 16 && type.equals("f")){
            System.out.println("Ms.");
        }
        else if (age < 16 && type.equals("f")){
            System.out.println("Miss");
        }


    }  
}  
