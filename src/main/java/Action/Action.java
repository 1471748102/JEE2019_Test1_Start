package Action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;

public class Action extends ActionSupport {
    float a;
    float b;
    float cc;
    String add;


    public String execute(){

        if (add.equals("+"))
            cc = a + b;
        if (add.equals("-"))
            cc = a - b;
        if (add.equals("*"))
            cc = a * b;
        if (add.equals("/"))
        {
            if(b!=0)
            {
                cc = a / b;
            }
            else
                return "fail";
        }







        System.out.println(cc);
        System.out.println(a);
        System.out.println(b);


        Map session = ActionContext.getContext().getSession();
        session.put("a", a);
        session.put("b", b);
        session.put("cc", cc);
        return "rest";

    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public void setB(float b) {
        this.b = b;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public String getAdd() {
        return add;
    }

    public float getB() {
        return b;
    }


}