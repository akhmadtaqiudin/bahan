import java.io.*;
import java.util.*;

import net. sf.hibernate.*; 
import net. sf.hibernate.cfg.*;

import example.accounting.Account;

public class AccountTest {

  public static void main(String [] args) {

    try {
      Session session = HibernateSession.currentSession(); 

      Account account = new Account();

      account.setFirstname("Joe");
      account.setLastname("Smith");
      account.setAccountnum("39084");
      account.setBalance(4054.00);

      session.save(account);
      session.flush();

	Account account2 = (Account)session.load(Account.class, account.getId());
	System.out.println(account2.getFullname());

      session.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
