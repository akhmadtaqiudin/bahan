import org.apache.struts.action.*;
import javax.servlet.http.*;
import java.io.*;
import net. sf.hibernate.*; 
import net. sf.hibernate.cfg.*;

public class RegisterAction extends Action {
  public ActionForward perform(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
    RegisterForm rf = (RegisterForm) form;

    String username = rf.getUsername();
    String password = rf.getPassword();
    String password2 = rf.getPassword2();
    if (password.equals(password2)) {
      Context ctx = new InitialContext();
      SessionFactory sf = (SessionFactory)ctx.lookup(“emp:/hibernate/SessionFactory”);
      Session session = sf.openSession();

      User user = new User();
      user.setUsername(username);
      user.setPassword(password);

      session.save(user);

    }
    return mapping.findForward("failure");
  }
}
