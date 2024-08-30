package oops;

import java.util.ArrayList;
import java.util.List;

class Book 
{
    private String title;
    private String author;

    public Book(String title, String author)
    {
        this.title = title;
        this.author = author;
    }

    public String getTitle() 
    {
        return title;
    }

    public String getAuthor()
    {
        return author;
    }

    @Override
    public String toString() 
    {
        return "Title : " + title + ", Author : " + author;
    }
}

class Library
{
    protected List<Book> books;

    public Library()
    {
        books = new ArrayList<>();
    }

    public void addBook(Book book)
    {
        books.add(book);
        System.out.println("Book added : " + book);
    }

    public void removeBook(Book book) 
    {
        if (books.remove(book)) 
        {
            System.out.println("Book removed : " + book);
        } 
        else
        {
            System.out.println("Book not found : " + book);
        }
    }

    public void displayBooks()
    {
        System.out.println("Library Collection :");
        for (Book book : books) 
        {
            System.out.println(book);
        }
    }
}

class DigitalLibrary extends Library
{
    private List<Book> eBooks;

    public DigitalLibrary()
    {
        super(); 
        eBooks = new ArrayList<>();
    }

    public void addEBook(Book book)
    {
        eBooks.add(book);
        System.out.println("E-Book added : " + book);
    }

    public void removeEBook(Book book) 
    {
        if (eBooks.remove(book))
        {
            System.out.println("E-Book removed : " + book);
        }
        else
        {
            System.out.println("E-Book not found : " + book);
        }
    }

    public void displayEBooks()
    {
        System.out.println("Digital Library Collection :");
        for (Book book : eBooks) 
        {
            System.out.println(book);
        }
    }
}
public class Main7
{

	public static void main(String[] args) 
	{
		Library ob = new Library();

        Book ob1 = new Book("The Catcher in the Rye", "J.D. Salinger");
        Book ob2 = new Book("To Kill a Mockingbird", "Harper Lee");

        ob.addBook(ob1);
        ob.addBook(ob2);
        ob.displayBooks();
        ob.removeBook(ob1);
        ob.displayBooks();

        System.out.println();

        DigitalLibrary dl = new DigitalLibrary();

        Book eBook1 = new Book("Digital Fortress", "Dan Brown");
        Book eBook2 = new Book("The Martian", "Andy Weir");

        dl.addEBook(eBook1);
        dl.addEBook(eBook2);
        dl.displayEBooks();
        dl.removeEBook(eBook1);
        dl.displayEBooks();

	}

}