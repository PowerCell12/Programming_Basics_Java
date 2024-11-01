import java.util.Scanner;

class MyClass{  
    public static void main(String[] args){  

        var scanner = new Scanner(System.in);

        int Dogsamount = Integer.parseInt(scanner.nextLine());
        int Catsamount = Integer.parseInt(scanner.nextLine());

        double final1 = Dogsamount * 2.5 + Catsamount * 4;

        System.out.println(final1 + " lv.");
         
    }  
}  
