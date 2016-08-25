// default package

import java.io.Serializable;
import org.apache.commons.lang.builder.ToStringBuilder;


/** @author Hibernate CodeGenerator */
public class Account extends 
    Loggable 
   implements Serializable {

    /** nullable persistent field */
    private String name;

    /** nullable persistent field */
    private String acctnum;

    /** nullable persistent field */
    private int zipcode;

    /** full constructor */
    public Account(String name, String acctnum, int zipcode) {
        this.name = name;
        this.acctnum = acctnum;
        this.zipcode = zipcode;
    }

    /** default constructor */
    public Account() {
    }

    /** 
     *     The name of the account - should be full name
     *     @see StudentName 
     *   
     */
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /** 
     *     The account number of the account 
     */
    public String getAcctnum() {
        return this.acctnum;
    }

    public void setAcctnum(String acctnum) {
        this.acctnum = acctnum;
    }

    /** 
     *     The zipcode of the account
     *     @see FullZipcode 
     *   
     */
    public int getZipcode() {
        return this.zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .toString();
    }

}
