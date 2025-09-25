import java.util.Scanner;
public class Experiments{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String number="12345";
        String reversedNumber="";
        int i;
        System.out.print("Enter a sequence of numbers(do not space them out):");
        number=scanner.nextLine();
        int count=number.length();
        for (i=(count-1);(i>-1);i--){
            reversedNumber= reversedNumber+number.charAt(i);
        
        }
        System.out.println(reversedNumber);
    }
}

