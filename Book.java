import java.util.*;

class bookdet {

    String title;
    String author;
    float price;
    int quan;
    bookdet() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Book name");
        title = sc.next();
        System.out.println("Enter Author name");
        author = sc.next();
        System.out.println("Enter Price");
        price = sc.nextFloat();
        System.out.println("Enter Quantity");
        quan = sc.nextInt();
    }

    void disp() {
        System.out.println("Book Title: " + title + " Author name: " + author + " Price: " + price+" Quantity: "+quan);
    }
}

public class Book {
    public static void main(String args[]) {
        int i, j, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Books:");
        n = sc.nextInt();
        bookdet temp;
        bookdet p[] = new bookdet[n];
        for (i = 0; i < n; i++) {
            p[i] = new bookdet();
        }
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (p[i].price < p[j].price) {
                    temp = p[i];
                    p[i] = p[j];
                    p[j] = temp;
                }
            }
        }
        System.out.println("Enter the price");
        float pr=sc.nextFloat();
        for (i = 0; i < n; i++) {
            if(pr<p[i].price)
            p[i].disp();
        }
    }
}
