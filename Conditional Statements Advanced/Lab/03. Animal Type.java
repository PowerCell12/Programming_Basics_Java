import java.io.Console;
import java.util.Scanner;
import java.util.zip.CheckedInputStream;

class MyClass{  
    public static void main(String[] args){  

        var scanner = new Scanner(System.in);

        String animalType = scanner.nextLine();


        switch (animalType){

            case "dog" -> System.out.println("mammal");
            case "crocodile", "tortoise", "snake" -> System.out.println("reptile");
            default -> System.out.println("unknown");
        }

    }  
}  
