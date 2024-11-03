import java.util.Scanner;

class MyClass{  
    public static void main(String[] args){  

        var scanner = new Scanner(System.in);

        int nailon = Integer.parseInt(scanner.nextLine());
        int boq = Integer.parseInt(scanner.nextLine());
        int razdelitel = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double nailonFinal  = (nailon + 2) * 1.50;
        double boqFinal = (boq + (boq * 0.1)) * 14.50;
        double razdelitelFinal = razdelitel * 5.00;

        double final1 = nailonFinal + boqFinal + razdelitelFinal + 0.40;

        double HoursFinal = (final1  * 0.3) * hours;

        System.out.println(final1 + HoursFinal);

    }  
}  
