package finalterm;

import java.util.Arrays;

class Book {
    int price;

    Book(int price) {
        this.price = price;
    }

    void BookPrice() {
        System.out.printf("Book [price = %d]\n", price);
    }

    int bookPricesort() {
        return price;
    }
}

public class chap7_3 {
    public static void main(String[] args) {
        Book[] booksPrice = { new Book(15000), new Book(50000), new Book(20000) };
        int[] books = new int[3];
        int count = 0;

        System.out.println("정렬 전");
        for (Book i : booksPrice) {
            i.BookPrice();
            for (int j = count; j < books.length; j++) {
                books[j] = i.bookPricesort();
            }
            count++;
        }

        Arrays.sort(books);
        System.out.println("정렬 후");
        for (int j = 0; j < books.length; j++) {
            booksPrice[j] = new Book(books[j]);
            booksPrice[j].BookPrice();
            // System.out.println("Book [price=" + books[j] + "]");
        }
    }
}