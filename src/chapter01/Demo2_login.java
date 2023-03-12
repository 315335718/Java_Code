package chapter01;

import java.util.HashMap;
import java.util.Map;

public class Demo2_login {
    public static void main(String[] args) {
        User user1 = new User();
        user1.regester("ABC","123");
        user1.regester("ABC","345");
        user1.login("ABC","123");
        user1.login("ABC","345");
        user1.login("ABCD","1234");
    }
}

class User{
    Map<String,String> user = new HashMap<>();
    void regester(String username, String password){
        if(user.containsKey(username)){
            System.out.println("已存在该用户:"+username+"！");
        }else {
            user.put(username,password);
            System.out.println(username+"注册成功！");
        }
    }
    void login(String username, String password){
        if (user.containsKey(username)){
            if (user.get(username).equals(password)){
                System.out.println(username+"登陆成功！");
            }else {
                System.out.println(username+"密码错误！");
            }
        }else {
            System.out.println("查无此用户:"+username+"！");
        }
    }
}