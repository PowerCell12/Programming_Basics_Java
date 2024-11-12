import java.io.Console;
import java.util.Scanner;
import java.util.zip.CheckedInputStream;

class MyClass{  
    public static void main(String[] args){  

        var scanner = new Scanner(System.in);

        Double number = Double.parseDouble(scanner.nextLine());
        String day = scanner.nextLine();

        boolean closedOpen = true;

        if (number < 10 || number > 18){
            closedOpen = false;
        }


        if (day.equals("Sunday")){
            closedOpen = false;
        }

        if (closedOpen){
            System.out.println("open");
        }
        else{
            System.out.println("closed");
        }


    }  
}  
