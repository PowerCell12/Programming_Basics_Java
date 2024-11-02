import java.util.Scanner;

class MyClass{  
    public static void main(String[] args){  

        var scanner = new Scanner(System.in);

        double radians = Double.parseDouble(scanner.nextLine());
        double gradius = radians * 180 / Math.PI;

        System.out.println(gradius);
         
    }  
}  
