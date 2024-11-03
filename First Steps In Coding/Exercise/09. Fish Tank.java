import java.util.Scanner;
import java.util.zip.CheckedInputStream;

class MyClass{  
    public static void main(String[] args){  

        var scanner = new Scanner(System.in);

        int Dulshina = Integer.parseInt(scanner.nextLine());
        int Shirochina = Integer.parseInt(scanner.nextLine());
        int Visochina = Integer.parseInt(scanner.nextLine());
        double Procent = Double.parseDouble(scanner.nextLine());

        double obekt = Dulshina * Shirochina * Visochina;

        double obektLitri = obekt * 0.001;

        System.out.println(obektLitri * (1 - (Procent / 100.0)));

    }  
}  
