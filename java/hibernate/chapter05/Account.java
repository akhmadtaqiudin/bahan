package example.accounting;

import java.io.*;

public class Account { 
  private String id; 
  private String accountnum;
  private double balance;
  private String firstname;
  private String lastname;
  private String fullname;

  public Account() {
  }


  public void setId(String s) {
    id = s;
  }

  public String getId() {
    return id;
  }

  public void setAccountnum(String s) {
    accountnum = s;
  }

  public String getAccountnum() {
    return accountnum;
  }  

  public void setBalance(double b) {
    balance = b;
  }

  public double getBalance() {
    return balance;
  }

  public void setFirstname(String s) {
    firstname = s;
  }

  public String getFirstname() {
    return firstname;
  }

  public void setLastname(String s) {
    lastname = s;
  }

  public String getLastname() {
    return lastname;
  }

  public void setFullname(String s) {
    fullname = s;
  }

  public String getFullname() {
    return fullname;
  }
}
