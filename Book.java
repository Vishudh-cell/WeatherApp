import java.util.ArrayList;

public class Book{
    String title;
    String author;
    int ISBN;

    public Book(String title, String author, int ISBN){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public static void main(String[] args){
        Book book1 = new Book("Hello", "Vishudh", 1);
        Book book2 = new Book("World", "Tapash", 2);
        Book book3 = new Book("By", "Parag", 3);

        ArrayList<Book> books = new ArrayList<>();

        books.add(book1);
        books.add(book2);
        books.add(book3);

       for(int i=0; i<books.size(); i++){
            System.out.println("This book "+ books.get(i).title + " is written by " + books.get(i).author);
       }

       books.remove(book2);

       for(int i=0; i<books.size(); i++){
        System.out.println("This book "+ books.get(i).title + " is written by " + books.get(i).author);
        }

        
    }
}