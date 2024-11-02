import java.util.Scanner;

class MyClass{  
    public static void main(String[] args){  

        var scanner = new Scanner(System.in);

        double moneyDeposited = Double.parseDouble(scanner.nextLine());
        double srok = Double.parseDouble(scanner.nextLine());
        double YearlyPercentage = Double.parseDouble(scanner.nextLine());


        double sum = moneyDeposited + srok * ((moneyDeposited * YearlyPercentage / 100 ) / 12);
        
        System.out.println(sum);

        
    }  
}  
