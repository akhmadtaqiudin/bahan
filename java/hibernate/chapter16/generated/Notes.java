// default package

import java.io.Serializable;
import org.apache.commons.lang.builder.ToStringBuilder;


/** @author Hibernate CodeGenerator */
public class Notes implements Serializable {

    /** nullable persistent field */
    private String owner;

    /** nullable persistent field */
    private String info;

    /** nullable persistent field */
    private int count;

    /** full constructor */
    public Notes(String owner, String info, int count) {
        this.owner = owner;
        this.info = info;
        this.count = count;
    }

    /** default constructor */
    public Notes() {
    }

    public String getOwner() {
        return this.owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getInfo() {
        return this.info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getCount() {
        return this.count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .toString();
    }

}
