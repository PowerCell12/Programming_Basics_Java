import java.util.Scanner;
import java.util.zip.CheckedInputStream;

class MyClass{  
    public static void main(String[] args){  

        var scanner = new Scanner(System.in);

        Double recordSeconds = Double.parseDouble(scanner.nextLine());
        Double meters = Double.parseDouble(scanner.nextLine());
        Double sekunds1meteres = Double.parseDouble(scanner.nextLine());


        Double needeSek = meters * sekunds1meteres;

        Double intem = meters / 15;
        Double addedSek = Math.floor(intem) * 12.5;

        Double finalTime = needeSek + addedSek;

        if (finalTime < recordSeconds){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", finalTime);
        }   
        else{
            System.out.printf("No, he failed! He was %.2f seconds slower.", Math.abs(recordSeconds - finalTime));
        }


    }  
}  
