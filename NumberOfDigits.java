import java.util.Scanner;
public class NumberOfDigits {
    public static void main (String []args)
    {
        Scanner scanner = new Scanner( System.in);
        System.out.print("Enter the Number to check the length : ");
        int Num = scanner.nextInt();
        String NumStr = String.valueOf(Num);
        int length = NumStr.length();
        System.out.println(length);


    }
    
}
