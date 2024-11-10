import java.util.Scanner;

class MyClass {  
    public static void main(String[] args) {  
        var scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int episode = Integer.parseInt(scanner.nextLine());
        int breakTime = Integer.parseInt(scanner.nextLine());
        
        double lunch = breakTime * 0.125;
        double rest = breakTime * 0.25;
        double timeForRest = Math.ceil(episode + lunch + rest);
            
        if (timeForRest <= breakTime) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", 
                name, Math.ceil(breakTime - timeForRest));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", 
                name, Math.ceil(timeForRest - breakTime));
        }
    }  
}
