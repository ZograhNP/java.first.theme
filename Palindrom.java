import java.util.Scanner;

public class Palindrom {

    public static void main(String arg[]){
        int num,res;
        int frs,sec;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        num = scanner.nextInt();

        frs = num;
        for(sec = 0;num > 0;num /= 10) {
            res = num % 10;
            sec = (sec * 10) + res;
        }
        if (sec == frs)
            System.out.println (frs + " is a palindrome");
        else
            System.out.println(frs + " is not a palindrome");
    }
}