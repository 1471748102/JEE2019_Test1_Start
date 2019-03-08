package LoginAction;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;


public class LoginAction extends ActionSupport {


    private static final long serialVersionUID = 1L;
    private String name;
    private String pass;

    public String execute() throws Exception {
        System.out.println("账号:" + getName());
        System.out.println("密码:"+ getPass());
        if (getName().equals("") || getName() == null) {
            return "error";
        } else {
            Map session = ActionContext.getContext().getSession();
            session.put("name", getName());
            session.put("pass", getPass());
            return "success";
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

}


