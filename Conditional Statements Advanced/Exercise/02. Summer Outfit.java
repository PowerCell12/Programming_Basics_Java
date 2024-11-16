import java.io.Console;
import java.util.Scanner;
import java.util.zip.CheckedInputStream;

class MyClass{  
    public static void main(String[] args){  
        var scanner = new Scanner(System.in);

        Integer degrees = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();

        switch(type){

            case "Morning":
                if(degrees >= 10 && degrees <= 18){
                    System.out.printf("It's %s degrees, get your %s and %s.", degrees, "Sweatshirt", "Sneakers");
                }else if (degrees > 18 && degrees <= 24){
                    System.out.printf("It's %s degrees, get your %s and %s.", degrees, "Shirt", "Moccasins");
                } else if (degrees > 24){
                    System.out.printf("It's %s degrees, get your %s and %s.", degrees, "T-Shirt", "Sandals");
                }
                break;
            case "Afternoon":
                if(degrees >= 10 && degrees <= 18){
                    System.out.printf("It's %s degrees, get your %s and %s.", degrees, "Shirt", "Moccasins");
                }else if (degrees > 18 && degrees <= 24){
                    System.out.printf("It's %s degrees, get your %s and %s.", degrees, "T-Shirt", "Sandals");
                } else if (degrees > 24){
                    System.out.printf("It's %s degrees, get your %s and %s.", degrees, "Swim Suit", "Barefoot");
                }
                break;
            case "Evening":
                if (degrees >= 10 && degrees <= 18){
                    System.out.printf("It's %s degrees, get your %s and %s.", degrees, "Shirt", "Moccasins");
                }else if (degrees > 18 && degrees <= 24){
                    System.out.printf("It's %s degrees, get your %s and %s.", degrees, "Shirt", "Moccasins");
                } else if (degrees > 24){
                    System.out.printf("It's %s degrees, get your %s and %s.", degrees, "Shirt", "Moccasins");
                }
                break;
                
        }

    }  
}  
