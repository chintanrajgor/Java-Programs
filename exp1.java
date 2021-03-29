import java.util.*;

class prime {
	int prime(int n1, int n2) {
		int count, n = 0, i, j;
		for (i = n1; i <= n2; i++) {
			count = 0;
			for (j = 2; j < i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 0) {
				n++;
				System.out.print(i + " ");
			}
		}
		return n;
	}

	int fibonacci(int a, int b, int n) {
		System.out.print(a + " " + b);
		int i, c;
		for (i = 0; i <= n - 2; i++) {
			c = a + b;
			System.out.print(" " + c);
			a = b;
			b = c;
		}
		return b;
	}
}

public class exp1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, n, i, j, t = 0, count, a[], l;
		System.out.println("Enter n1 & n2");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		if (n1 >= 2) {
			if (n2 <= 100) {
				if (n2 - n1 > 35) {

					prime p = new prime();
					n = p.prime(n1, n2);
					a = new int[n];
					for (i = n1; i <= n2; i++) {
						count = 0;
						for (j = 2; j < i; j++) {
							if (i % j == 0) {
								count++;
							}
						}
						if (count == 0) {
							a[t] = i;
							t++;
						}
					}
					System.out.println("\nSmallest no:" + a[0]);
					System.out.println("largest  no:" + a[n - 1]);
					l = p.fibonacci(a[0], a[n - 1], n);
					System.out.println("\nlast number of fibonacci serues is" + l);
				}
			}
		} else {
			System.out.println("Invalid input");
		}
	}
}