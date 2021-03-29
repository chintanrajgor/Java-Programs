import java.util.*;

class Complex {
    float rl, ig;

    Complex() {
        {
            float i, r;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter real part of complex no: ");
            r = sc.nextFloat();
            System.out.println("Enter img part of complex no:");
            i = sc.nextFloat();
            rl = r;
            ig = i;
        }
    }

    Complex(float i, float r) {
        rl = r;
        ig = i;
    }

    Complex(float r) {
        rl = r;
        ig = r;
    }

    void display() {
        System.out.println(rl + "+" + ig + "i\n");
    }

    Complex add(Complex c2, Complex c3) {
        c3.rl = rl + c2.rl;
        c3.ig = ig + c2.ig;
        return c3;
    }
}

public class complexnum {
    public static void main(String args[]) {
        float i;
        Scanner sc = new Scanner(System.in);
        Complex c1 = new Complex();
        System.out.println("\nComplex no c1");
        c1.display();
        /*System.out.println("Enter real and img part of complex no:");
        i = sc.nextFloat();*/
        Complex c2 = new Complex();
        System.out.println("\nComplex no c2");
        c2.display();
        Complex c3 = new Complex(0, 0);
        c3 = c1.add(c2, c3);
        System.out.println("\nAddition of both complex no:");
        c3.display();
    }
}