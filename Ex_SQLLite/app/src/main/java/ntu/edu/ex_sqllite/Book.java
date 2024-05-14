package ntu.edu.ex_sqllite;

public class Book {
    int BookID;
    String BookName;
    int Page;
    float Price;
    String Desciption;

    public Book(){}

    public Book(int bookID, String bookName, int page, float price, String desciption) {
        BookID = bookID;
        BookName = bookName;
        Page = page;
        Price = price;
        Desciption = desciption;
    }

    public int getBookID() {
        return BookID;
    }

    public void setBookID(int bookID) {
        BookID = bookID;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public int getPage() {
        return Page;
    }

    public void setPage(int page) {
        Page = page;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float price) {
        Price = price;
    }

    public String getDesciption() {
        return Desciption;
    }

    public void setDesciption(String desciption) {
        Desciption = desciption;
    }
}
