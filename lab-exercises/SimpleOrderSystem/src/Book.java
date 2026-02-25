import java.util.Date;

public class Book extends Product {

    private String title;
    private String author;
    private Date publicationDate;
    private int pageCount;
    
    public Book(String title, String author, Date publicationDate, int pageCount, int code, int price) {
        super(code, price);
        
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
        this.pageCount = pageCount;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public int getPageCount() {
        return pageCount;
    }

    @Override
    public String getDescription() {
        return "Book title: " + title + "\n"
            +  "Author: " + author + "\n"
            +  "Publication Date: " + publicationDate.toString() + "\n"
            +  "Page Count: " + pageCount + "\n"
            +  "Price: " + super.getCode() + "\n"
            +  "Product Code: " + super.getCode();
    }
}
