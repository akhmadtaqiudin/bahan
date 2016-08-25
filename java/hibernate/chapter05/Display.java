package example.enum;

import net.sf.hibernate.PersistentEnum;

public class Display implements PersistentEnum {

  private final int code;

  private Display(int code) {
    this.code = code;
  }

  public static final Display FULL = new Display(0);
  public static final Display SEMI = new Display(1);
  public static final Display NONE = new Display(2);

  public int toInt() {
    return code;
  }

  public static Display fromInt(int code) {
    switch(code) {
      case 0: return FULL;
      case 1: return SEMI;
      case 2: return NONE;
      default: throw new RuntimeException("Unknown display code");
    }
  }
}
