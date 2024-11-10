import java.util.Scanner;
import java.util.zip.CheckedInputStream;

class MyClass{  
    public static void main(String[] args){  

        var scanner = new Scanner(System.in);

        Double budget = Double.parseDouble(scanner.nextLine());
        Integer videocards = Integer.parseInt(scanner.nextLine());
        Integer processors = Integer.parseInt(scanner.nextLine());
        Integer rams = Integer.parseInt(scanner.nextLine());

        Double videocardsMoney = videocards * 250.0;

        Double processPrice = videocardsMoney * 0.35;
        Double processesPrice = processPrice  * processors;

        Double ramPrice = videocardsMoney * 0.1;
        Double ramsPrice = ramPrice * rams;
        
        Double finalprice = ramsPrice + processesPrice + videocardsMoney;

        if (videocards > processors){
            finalprice -= finalprice * 0.15;
        }

        if (budget >= finalprice){
            System.out.printf("You have %.2f leva left!", budget - finalprice);
        }
        else{
            System.out.printf("Not enough money! You need %.2f leva more!", finalprice - budget);    
        }



    }  
}  
