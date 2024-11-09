import java.util.Scanner;
import java.util.zip.CheckedInputStream;

class MyClass{  
    public static void main(String[] args){  

        var scanner = new Scanner(System.in);

        Integer runner1 = Integer.parseInt(scanner.nextLine());
        Integer runner2 = Integer.parseInt(scanner.nextLine());
        Integer runner3 = Integer.parseInt(scanner.nextLine());
        Integer all = runner1 + runner2 + runner3;

        Integer minutes = all / 60;
        Integer seconds = all % 60;
       

        System.out.printf("%d:%02d", minutes, seconds);

       
    }  
}  
