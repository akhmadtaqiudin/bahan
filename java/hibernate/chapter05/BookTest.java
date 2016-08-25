import java.io.*;
import net. sf.hibernate.*; 
import net. sf.hibernate.cfg.*;

import example.products.Book;

public class BookTest {

  public static void main(String [] args) {

    try {
      Session session = HibernateSession.currentSession(); 

      Book book = new Book();
      book.setTitle("Mastering Hibernate");
      book.setIsbn("00-394849030-9");
      book.setAuthor("Hibernate Guys");
      book.setPages(300);
      book.setCost(29.99f);

      session.save(book);
      session.flush();
    
      session.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
