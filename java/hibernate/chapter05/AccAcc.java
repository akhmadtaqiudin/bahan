package example.accounting;

import java.io.*;

public class AccAcc implements Serializable { 
  private String id; 
  private int accountnum; 
  private String acctype; 
  private String name;

  public AccAcc() {
  }

  public AccAcc(int i, String t, String n) {
    accountnum = i;
    acctype = t;
    name = n;
  }

  public void setId(String s) {
    id = s;
  }

  public String getId() {
    return id;
  }

  public void setAccountnum(int i) {
    accountnum = i;
  }

  public int getAccountnum() {
    return accountnum;
  }  

  public void setAcctype(String s) {
    acctype = s;
  }

  public String getAcctype() {
    return acctype;
  }

  public void setname(String s) {
    name = s;
  }

  public String getName() {
    return name;
  }

    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!this.getClass().equals(obj.getClass())) return false;
        
        AccAcc obj2 = (AccAcc)obj;

        if (this.id.equals(obj2.getId()) &&
            this.accountnum == obj2.getAccountnum() &&
            this.acctype.equals(obj2.getAcctype()) &&
            this.name.equals(obj2.getName())) {
            return true;
        }
        
	  return false;
    }

    public int hashCode() {      
        int tmp = 0;
        // Method 1-Concatenate the strings
        tmp = (id + accountnum + name + acctype).hashCode();

        return tmp;
    }
}
