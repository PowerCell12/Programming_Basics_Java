import java.util.Scanner;
import java.util.zip.CheckedInputStream;

class MyClass{  
    public static void main(String[] args){  

        var scanner = new Scanner(System.in);

        int YearlyTax = Integer.parseInt(scanner.nextLine());
   

        double kecove = YearlyTax - (YearlyTax * 0.4);
        double ekip = kecove - (kecove * 0.2);
        double topka = ekip / 4;
        double aksesoari  = topka  / 5;

        System.out.println(YearlyTax + kecove + ekip + topka  + aksesoari);


    }  
}  
