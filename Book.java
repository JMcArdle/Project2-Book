/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;
    private boolean courseText;
    
    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, String bookRefNumber, 
    boolean isCourseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = bookRefNumber;
        courseText = isCourseText;
    }
   
    public boolean isCourseText()
    {
        return courseText;
    }
    
    public void setRefNumber(String ref)
    {
        
        if(refNumber.length() >= 3) {
            refNumber = "";
        }
        else
            System.out.println("Enter a number with more than 3 characters.");
    }
    
    public String getRefNumber()
    {
        return refNumber;
    }
    
    public void printDetails()
    {
        System.out.println("Title:" + title + "Author:" + author + "Pages:" + pages);
        System.out.println(" This book has been borrowed" + borrowed + " times.");
        if(refNumber.length() > 1) {
            System.out.println("ZZZ");
        }
        else
            System.out.println(refNumber);
    }

    public String getAuthor()
    {
        return author;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public int getPages()
    {
        return pages;
    }
    
    public void printAuthor()
    {
        System.out.println(author);
    }
    
    public void printTitle()
    {
        System.out.println(title);
    }
    
    public void borrow()
    {
        borrowed = borrowed + 1;
    }
    
    public int getBorrow ()
    {
        return borrowed;
    }
}

