import java.util.*;
import java.lang.*;

public class MakeaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter yotur first Number");
        double a = sc.nextDouble();
        System.out.println("Enter your second Number");
        double b = sc.nextDouble();
        System.out.println("----Message for a user----");
        System.out.println("Choice 1 for Addition\n");
        System.out.println("Choice 2 for Substracrtion\n");
        System.out.println("Choice 3 for Multiplication\n");
        System.out.println("Choice 4 for Division\n");
        System.out.println("Choice 5 for Reminder\n");
        System.out.println("Enter your Choice");
        double ch;
        ch=sc.nextDouble();
        double cal;
        

        

        if (ch==1) {
            cal=a+b;
            System.out.println("Summ:"+ cal);
        }
        else if (ch==2) {
            cal=a-b;
            System.out.println("Substraction:"+ cal);
        }
        else if (ch==3) {
            cal=a*b;
            System.out.println("Multipltcation:"+ cal);
        }
        else if (ch==4) {
            cal=a/b;
            System.out.println("Devision:"+ cal);
        }
        else{
            cal=a%b;
            System.out.println("Reminder:"+cal);
        }
        
    }
}
