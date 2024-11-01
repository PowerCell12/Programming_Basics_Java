import java.util.Scanner;

class MyClass{  
    public static void main(String[] args){  

        var scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int amount = Integer.parseInt(scanner.nextLine());

        
        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, amount * 3, amount);

    }  
}  
