import java.util.Scanner;
import java.util.zip.CheckedInputStream;

class MyClass{  
    public static void main(String[] args){  

        var scanner = new Scanner(System.in);

        int Chichen = Integer.parseInt(scanner.nextLine());
        int Fish = Integer.parseInt(scanner.nextLine());
        int Vegetable = Integer.parseInt(scanner.nextLine());
        
        double ChichenFinal = Chichen * 10.35;
        double FishFinal = Fish * 12.40;
        double VegetableFinal = Vegetable * 8.15;

        double final1 = ChichenFinal + FishFinal + VegetableFinal;

        double desert = final1 * 0.2;

        System.out.println(final1 + desert + 2.50);


    }  
}  
