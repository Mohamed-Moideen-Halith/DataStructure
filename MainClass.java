package Stack;


import com.sun.security.jgss.GSSUtil;

public class MainClass {
    public static void main(String[] args) {
        DStack data = new DStack();

        data.push(20);
        data.push(10);
        data.push(10);
        data.push(10);
        data.push(10);

        data.pop();
        data.pop();
        data.pop();

        data.show();
    }
}
