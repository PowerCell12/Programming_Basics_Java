import java.util.Scanner;
import java.util.zip.CheckedInputStream;

class MyClass{  
    public static void main(String[] args){  

        var scanner = new Scanner(System.in);

        Double finalPrice = Double.parseDouble(scanner.nextLine());
        Integer puzeli = Integer.parseInt(scanner.nextLine());
        Integer kukli = Integer.parseInt(scanner.nextLine());
        Integer mecheta = Integer.parseInt(scanner.nextLine());
        Integer minioni = Integer.parseInt(scanner.nextLine());
        Integer kamioncheta = Integer.parseInt(scanner.nextLine());

        double suma = puzeli * 2.60  + kukli * 3 + mecheta * 4.10 + minioni * 8.20 + kamioncheta * 2;
        Integer broi = puzeli + kukli + mecheta + minioni + kamioncheta;

        if (broi >= 50){
            suma = suma - suma * 0.25;
        }

        Double naem = suma * 0.1;
        Double pechalba = suma - naem;

        if (pechalba >= finalPrice){
            System.out.printf("Yes! %.2f lv left.", pechalba - finalPrice);
        }
        else{
            System.out.printf("Not enough money! %.2f lv needed.", finalPrice - pechalba);
        }



    }  
}  
