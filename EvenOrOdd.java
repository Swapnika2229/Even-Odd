import java.util.*;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int a = sc.nextInt();
        String r = a%2==0?"even":"odd";
        System.out.println(r);
        sc.close();
    }
}