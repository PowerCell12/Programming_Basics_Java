import java.util.Scanner;
import java.util.zip.CheckedInputStream;

class MyClass{  
    public static void main(String[] args){  

        var scanner = new Scanner(System.in);

        Integer password  = Integer.parseInt(scanner.nextLine());


        if (password < 100){
            System.out.println("Less than 100");
        }
        else if  (password > 99 && password < 201){
            System.out.println("Between 100 and 200");
        }
        else if (password > 200){
            System.out.println("Greater than 200");    
        }

   

       
    }  
}  
