package example.products;

public class Book{ 
  private int id;  
  private String title; 
  private String author; 
  private String isbn; 
  private int pages; 
  private int copyright; 
  private float cost;

  public Book() {
  }

  public void setId(int i) {
    id = i;
  }

  public int getId() {
    return id;
  }

  public void setTitle(String s) {
    title = s;
  }

  public String getTitle() {
    return title;
  }

  public void setAuthor(String s) {
    author = s;
  }

  public String getAuthor() {
    return author;
  }

  public void setIsbn(String s) {
    isbn = s;
  }

  public String getIsbn() {
    return isbn;
  }

  public void setPages(int i) {
    pages = i;
  }

  public int getPages() {
    return pages;
  }

  public void setCopyright(int i) {
    copyright = i;
  }

  public int getCopyright() {
    return copyright;
  }

  public void setCost(float f) {
    cost = f;
  }

  public float getCost() {
    return cost;
  }
}
