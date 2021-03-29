/*
 * JPA Entity class that represents a Book
 * containing default no parameter constructor and get-set methods 
 * 
 */

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import java.util.concurrent.atomic; 

@Entity
@Table(name = "Library")
public class aBook implements Serializable {
    
    private static final long serialVersionUID = 1L;
    private static final AtomicInteger  count = new AtomicInteger(1); //Need a counter for bookID 
    
    @Id 
    @Column (name = "bookID")
    private int bookID;
    @Column (name = "Title")
    private String bookTitle; 
    @Column (name = "Publisher")
    private String bookPublisher;
    @Column (name = "Genre")
    private String bookGenre; 
    
    //no parameter Constructor
    public aBook()
    {
        bookID = count.getAndIncrement(); 
    }
    
    //Get-Set methods 
   public final int getBookID()
   {
       return bookID;
   }
   public final void setBookID(int bookID)
   {
       this.bookID = bookID; 
   }
   
   public String getTitle()
   {
       return bookTitle;
   }
   public void setBookTitle(String bookTitle)
   {
       this.bookTitle = bookTitle; 
   }
    
   public String getPublisher()
   {
       return bookPublisher;
   }
   public void setBookPublisher(String bookPublisher)
   {
       this.bookPublisher = bookPublisher; 
   }
   
   public String getGenre()
   {
       return bookGenre;
   }
   public void setBookGenre(String bookGenre)
   {
       this.bookGenre = bookGenre; 
   }
}


