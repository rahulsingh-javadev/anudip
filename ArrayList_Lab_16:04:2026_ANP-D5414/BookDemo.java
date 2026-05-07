import java.util.ArrayList;


class Book {
    int bookId;
    String bookName;
    String authorName;


    Book(int bookId, String bookName, String authorName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
    }


    void display() {
        System.out.println("Book ID : " + bookId);
        System.out.println("Book Name : " + bookName);
        System.out.println("Author Name : " + authorName);
        System.out.println("---------------------------");
    }
}


public class BookDemo {
    public static void main(String[] args) {


        ArrayList<Book> books = new ArrayList<>();


        books.add(new Book(101, "Java Programming", "James Gosling"));
        books.add(new Book(102, "Python Basics", "Guido van Rossum"));
        books.add(new Book(103, "C++ Fundamentals", "Bjarne Stroustrup"));


        System.out.println("Book Details:");
        System.out.println("===================");

        for (Book b : books) {
            b.display();
        }
    }
}