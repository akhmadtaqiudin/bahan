package example.accounting;

import java.util.*;

public class BasicAccount {
  private String id; 
  private String name;
  private String accountnumber; 
  private Date setupdate; 
  private double balance;

  public BasicAccount() {
  }

  public void setId(String s) {
    id = s;
  }

  public String getId() {
    return id;
  }

  public void setName(String s) {
    name = s;
  }

  public String getName() {
    return name;
  }

  public void setAccountnumber(String s) {
    accountnumber = s;
  }

  public String getAccountnumber() {
    return accountnumber;
  }

  public void setSetupdate(Date d) {
    setupdate = d;
  }

  public Date getSetupdate() {
    return setupdate;
  }

  public void setBalance(double d) {
    balance = d;
  }

  public double getBalance() {
    return balance;
  }
  
}
