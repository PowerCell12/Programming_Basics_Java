import java.util.Scanner;

class MyClass{  
    public static void main(String[] args){  

        var scanner = new Scanner(System.in);

        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int preparat= Integer.parseInt(scanner.nextLine());
        int percentageDiscount= Integer.parseInt(scanner.nextLine());

        double pernsPrice = pens * 5.80;
        double markersPrice = markers * 7.20;
        double preparatPrice = preparat * 1.20;

        double all = pernsPrice + markersPrice + preparatPrice;

        double allWithDiscount = all * (percentageDiscount / 100.0);

        System.out.println(all  - allWithDiscount);


    }  
}  
