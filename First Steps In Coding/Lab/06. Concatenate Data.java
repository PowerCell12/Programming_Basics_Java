import java.util.Scanner;

class MyClass{  
    public static void main(String[] args){  

        var scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String lastName = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String town = scanner.nextLine();


        System.out.printf("You are %s %s, a %d-years old person from %s.", name, lastName, age, town);

    }  
}  
