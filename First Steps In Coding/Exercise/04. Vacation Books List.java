import java.util.Scanner;

class MyClass{  
    public static void main(String[] args){  

        var scanner = new Scanner(System.in);

        int pages = Integer.parseInt(scanner.nextLine());
        int OneHourPages = Integer.parseInt(scanner.nextLine());
        int Days = Integer.parseInt(scanner.nextLine());

        int hoursNeeded = pages / OneHourPages;

        int final1  = hoursNeeded / Days;

        
        System.out.println(final1);

        
    }  
}  
