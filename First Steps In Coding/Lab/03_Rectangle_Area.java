import java.util.Scanner;

class MyClass{  
    public static void main(String[] args){  

        var scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());

        int secondNum = Integer.parseInt(scanner.nextLine());

        System.out.println(firstNum * secondNum);

    }  
}  
