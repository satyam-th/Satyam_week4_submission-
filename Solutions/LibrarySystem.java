class library{
    private String title;
    private String author;
    private String id;

    public library(String title, String author, String id) {
        this.title = title;
        this.author = author;
        this.id = id;
    }
    public void getInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", ID: " + id);
    }
}
class Book extends library {
    private String publication;

    public Book(String title, String author, String id, String publicatiion) {
        super(title, author, id);
        this.publication = publicatiion;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Publication: " + publication);
    }
}
class Magazine extends library {
    private String issue;

    public Magazine(String title, String author, String id, String issue) {
        super(title, author, id);
        this.issue = issue;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Issue: " + issue);
    }
}
class Newspaper extends library {
    private String date;

    public Newspaper(String title, String author, String id, String date) {
        super(title, author, id);
        this.date = date;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Date: " + date);
    }
}


public class LibrarySystem {
    public static void main(String[] args) {
        library[] libraryItems = new library[3];
        libraryItems[0] = new Book("Java", "apna college", "Y001", "youtube");
        libraryItems[1] = new Magazine("abc", "xyz", "M001", "March 2023");
        libraryItems[2] = new Newspaper("kathamandu Post", "alot", "N001", "2023-10-01");

        libraryItems[0].getInfo();
        libraryItems[1].getInfo();
        libraryItems[2].getInfo();
    }   
    
}
