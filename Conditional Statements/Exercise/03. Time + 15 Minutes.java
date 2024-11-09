import java.util.Scanner;
import java.util.zip.CheckedInputStream;

class MyClass{  
    public static void main(String[] args){  

        var scanner = new Scanner(System.in);

        Integer hours = Integer.parseInt(scanner.nextLine());
        Integer minutes  = Integer.parseInt(scanner.nextLine());
        minutes += 15;

        if (minutes >= 60){
            hours += 1;
            minutes -= 60;
        }

        if (hours == 24){
            hours = 0;
        }

        System.out.printf("%d:%02d", hours, minutes);
       
    }  
}  
