import java.util.Scanner;

public class GCD_LCM {
    static int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        int a, b;
        System.out.println("Enter two no. to find their GCD and LCM");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("LCM of " + a + " and " + b + " is " + lcm(a, b));
        System.out.println("GCD of " +a+ " and " +b+ " is " + gcd(a, b));
    }
}
