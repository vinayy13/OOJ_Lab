import java.util.Scanner;
import java.lang.*;

class Book {
    String name, author;
    float price;
    int num_pages;

    Book(String name, String author, float price, int num_pages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.num_pages = num_pages;
    }

    Book(){}

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the book: ");
        name = sc.nextLine();
        System.out.println("Enter the author of the book: ");
        author = sc.nextLine();
        System.out.println("Enter the price of the book:");
        price = sc.nextFloat();
        System.out.println("Enter the number of pages in the book: ");
        num_pages = sc.nextInt();
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", num_pages=" + num_pages +
                '}';
    }
}
class BookObjects{
    public static void main(String args[]) {
        Book b1 = new Book("Java The Complete reference", "Herbert Schildt", 999, 1123);
        System.out.println("Constructor value is : \n" + b1);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of books: ");
        int n = sc.nextInt();
        Book b[] = new Book[n];
        for (int i = 0; i < n; i++) {
            b[i] = new Book();
            System.out.println("Enter book" + (i+1) + " Details :");
            b[i].accept();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Details of book"+(i+1)+" :");
            System.out.println(b[i]);
        }
    }
}
